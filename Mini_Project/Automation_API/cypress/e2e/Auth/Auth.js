import {And, Given, Then, When} from "cypress-cucumber-preprocessor/steps";

//Barengan
And ('with reasonable time', () =>{
    const time = Cypress.env('time')
    cy.wrap(time).should('be.lessThan', 1500)
});
And ('return success status', () =>{
    const codeStatus = Cypress.env('status')
    cy.wrap(codeStatus).should('deep.equal', 200)
});

//POST REGISTER


Given ("user input email password and fullname", () =>{
    //GANTI GANTI GANTI
    const pass = Cypress.env('pass')
    const email = Cypress.env('email')
    cy.log("Email is "+email)
    cy.log("Password is "+pass)
    Then ("server should return userID, email, password, and fullname", () =>{

        cy.api("POST", "/auth/register",
            {
                "email":`${email}`,
                "password":`${pass}`,
                "fullname":"Firstname Lastname"
            }
        ).then((response) => {
            expect(response.body.data.Email).to.eq(email)

                const duration = response.duration
                const statusCode = response.status

                Cypress.env('time', duration)
                Cypress.env('status', statusCode)
        })
    })
});


//POST LOGIN
Given ("user already registered", () =>{
    const email = Cypress.env('email')
    const pass = Cypress.env('pass')
    cy.log("Email is "+email)
    cy.log("Password is "+pass)

    Then ("user should be able to login", () =>{

        cy.api("POST", "/auth/login",
            {
                "email":`${email}`,
                "password":`${pass}`,
                "fullname":"Firstname Lastname"
            }
        ).then((response) => {
            expect(response.body.data).not.empty
            const token = response.body.data
            const duration = response.duration
            const statusCode = response.status
            Cypress.env('time', duration)
            Cypress.env('status', statusCode)
            Cypress.env('token', token)

        })
    })
});



//GET AUTH INFO
Given ("user already logged in", () =>{
    const token = Cypress.env('token');
    const authorization = `Bearer ${token}`;
    cy.api({
        method: 'GET',
        url: '/auth/info',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': authorization
        },

    }).then((response) => {
        Then ("user should be able to see their information", () =>{
            expect(response.status).to.eq(200)
            const statusCode = response.status
            Cypress.env('status', statusCode)
            const duration = response.duration
            Cypress.env('time', duration)
            expect(response.body.data.Email).to.eq(Cypress.env('email'))
        })
    })
});


//
//


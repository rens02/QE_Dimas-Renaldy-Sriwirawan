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

//TC001 Students can register with valid data
Given ("user try to register", () =>{
    //GANTI GANTI GANTI
    const pass = Cypress.env('pass')
    const email = Cypress.env('email')
    cy.log("Email is "+email)
    cy.log("Password is "+pass)
    Then ("server should return userID, email, password, and fullname", () =>{

        cy.api("POST", "/registrasi",
            //GANTI GANTI GANTI GANTI
            {
                "name": "Muhammad Nur Firdaus",
                "email": "aaaaaaa",
                "phone_number": "+6281218446131",
                "username": "daus123",
                "password": "12345678",
                "user_type": "students",
                "school_name": "SMK Bakti",
                "gender": "male"
            }
        ).then((response) => {
            expect(response.body.data.users.email).to.eq(email)

                const duration = response.duration
                const statusCode = response.status

                Cypress.env('time', duration)
                Cypress.env('status', statusCode)
        })
    })
});


//TC021 Students can login with valid data
Given ("after user register and verify", () =>{
    const email = Cypress.env('email')
    const pass = Cypress.env('pass')
    cy.log("Email is "+email)
    cy.log("Password is "+pass)

    Then ("user should be able to login", () =>{

        cy.api("POST", "/login",
            {
                "email":`${email}`,
                "password":`${pass}`,
            }
        ).then((response) => {
            expect(response.body.data).not.empty
            const token = response.body.data.token
            const duration = response.duration
            const statusCode = response.status
            Cypress.env('time', duration)
            Cypress.env('status', statusCode)
            Cypress.env('token', token)

        })
    })
});


//TC051 Students can take course
Given ("user already logged in", () =>{
    const token = Cypress.env('token');
    const authorization = `Bearer ${token}`;
    cy.log(authorization)
    And ('user wants to buy course', () =>{
        cy.api({
            method: 'GET',
            url: '/students/transaction',
            headers: {
                'Content-Type': 'application/json',
                'Authorization': authorization
            },
            body:{
                "price": 1000,
                //ganti course id
                "course_id": "" ,
                "total_payment": 100000,
                "admin_fees": 1000
            }

        }).then((response) => {
            const statusCode = response.status
            Cypress.env('status', statusCode)
            const duration = response.duration
            Cypress.env('time', duration)
            Then ("user should be able to see their information", () =>{
                expect(response.body.transaction.item_details[0].id).to.eq() //COURSE JADI COURSE ID
            })

        });

    })
});



// Scenario: TC029 Students can change the password using valid data
Given ('user send forgot password request', () =>{
    cy.api("POST", "/forgot-password",
        //GANTI GANTI GANTI GANTI
        {
            "email": "jono@gmail.com"
        }
    ).then((response) => {
        Then ('server should send OTP to email', () =>{
            expect(response.body.message).to.eq("OTP sent successfully")
        });
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
    })
});

//GET AUTH INFO
// Given ("user already logged in", () =>{
//     const token = Cypress.env('token');
//     const authorization = `Bearer ${token}`;
//     cy.api({
//         method: 'GET',
//         url: '/auth/info',
//         headers: {
//             'Content-Type': 'application/json',
//             'Authorization': authorization
//         },
//
//     }).then((response) => {
//         Then ("user should be able to see their information", () =>{
//             expect(response.status).to.eq(200)
//             const statusCode = response.status
//             Cypress.env('status', statusCode)
//             const duration = response.duration
//             Cypress.env('time', duration)
//             expect(response.body.data.Email).to.eq(Cypress.env('email'))
//         })
//     })
// });
//

//
//


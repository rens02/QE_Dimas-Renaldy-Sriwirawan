//LOGIN LOGIN LOGIN
Given ("", () =>{
    const email = Cypress.env('email')
    const pass = Cypress.env('pass')
    cy.log("Email is "+email)
    cy.log("Password is "+pass)

    Then ("", () =>{

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


Given ("admin input mentor data", () =>{
    //GANTI GANTI GANTI
    const pass = Cypress.env('pass')
    const email = Cypress.env('email')
    cy.log("Email is "+email)
    cy.log("Password is "+pass)
    Then ("server should return mentor data", () =>{

        cy.api("POST", "/registrasi-mentor",
            //GANTI GANTI GANTI GANTI
            {
                "name": "Muhammad Nur Firdaus",
                "email": "daus@gomail.com",
                "phone_number": "08281218446131",
                "username": "daus123",
                "password": "12345678",
                "user_type": "mentors",

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
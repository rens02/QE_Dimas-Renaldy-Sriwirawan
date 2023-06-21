// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })
Cypress.Commands.add('login', (username, password) =>
{
    cy.request({
        method:'POST',
        url:'/auth/login',
        body: {
            "email":"someone@mail.com",
            "password":"123123"
        }
    })
        .as('loginResponse')
        .then((response) => {
            Cypress.env('token', response.body.data); // either this or some global var but remember that this will only work in one test case
            return response;
        })
        .its('status')
        .should('eq', 200);

})
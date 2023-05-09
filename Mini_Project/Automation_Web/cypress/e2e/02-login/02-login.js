import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
Then("i am get an error", () =>{
    cy.get('.v-alert').should('be.visible')
});

And("I click login", () =>{
    cy.get('.text-center > .v-btn').click();
});

// this is the positive login scenario
Given("i am on the login page", () =>{
    cy.visit("https://alta-shop.vercel.app/auth/login")
});
When("i input my registered email", () =>{
    const email = Cypress.env('regEmail')
    cy.get("#input-18").type(email);
});

And("i input my registered password", () =>{
    const password = Cypress.env('pass')
    cy.get("#input-21").type(password);
});

Then("i am on the shop front", () =>{
    cy.url().should('eq', 'https://alta-shop.vercel.app/')
});



// LG-04
When("i didnt input anything", () =>{
    cy.log("did nothing")
});
// LG05
And("i input wrong password", () =>{
    cy.get("#input-21").type("aneh");
});


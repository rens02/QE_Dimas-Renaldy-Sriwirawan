import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
//Barengan
And("I input my password", () =>{
    const password = Cypress.env('pass')
    cy.get("#input-24").type(password);
});
Then("I am on the login page", () =>{
    cy.get(".v-card__title").should('contain', 'Login')
});
Then("I am get an error", () =>{
    // cy.get(".v-card__title").should('contain', 'Login')
    cy.get('.v-alert').should('be.visible')
    console.log("Berhasil4")
});
Given("i am on the register page", () =>{
    cy.visit("https://alta-shop.vercel.app/auth/register")
});
And("I click register", () =>{
    cy.get("main span").click();

});




//
//
//this positive regular
When("I input my full name", () =>{
    const fname = Cypress.env('fname')
    cy.get("#input-18").type(fname);
});
And("I input my email", () =>{
    const email = Cypress.env('regEmail')
    cy.get("#input-21").type(email);
});

//
//
//
//
//
//
//this is the negative register using already registered
When("I input my registered full name", () =>{
    const fname = Cypress.env('fname')
    cy.get("#input-18").type(fname);
});
And("I input my registered email", () =>{
    const email = Cypress.env('regEmail')
    cy.get("#input-21").type(email);
    console.log("Berhasil2")

});
And("I input my registered password", () =>{
    const password = Cypress.env('pass')
    cy.get("#input-24").type(password);
});




import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
//
//
//
//
//
//Positive Test add to cart
Given ("I already Logged in", () =>{
    cy.login('andrea@mail.com', 'pandre123')
    cy.visit("https://alta-shop.vercel.app/")
});
When ('i click buy', () =>{
    cy.get('#31 4482 > .v-card > .v-card__actions > .mt-3 > .ml-3 > .v-btn__content').click()

});
Then ('item is added to my cart', () =>{
    cy.get('.v-badge__badge').should('be.visible')
    cy.get('.v-toolbar__content > :nth-child(3)').click()
});
//
//
//
//
//
// Positive case add more quanitty, this should've worked in the automation
Given ('i have single item on my cart', () =>{
    cy.login('andrea@mail.com', 'pandre123')
    cy.visit("https://alta-shop.vercel.app/")
    cy.get('#11027 > .v-card > .v-card__actions > .mt-3 > .ml-3 > .v-btn__content', {timeout:10000}).click()
    cy.get('.v-badge__badge').should('be.visible')
    cy.get('.v-toolbar__content > :nth-child(3)').click()
});
When ('i click + sign on my item', () =>{
    cy.get('.v-list-item__icon > :nth-child(3) > .v-btn__content').click()
});
Then ('The item quantity is added', () =>{
    cy.get('.v-list-item__icon > .mx-3').should('eql', '2')
});
//
//
//
//
//
//Positive case decrease quantity
When ('i click - sign on my item', () =>{
    cy.get('.v-list-item__icon > :nth-child(1) > .v-btn__content').click()
});
Then ('no item', () =>{
    cy.get('.v-alert').should('be.visible')
});

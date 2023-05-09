import {And, Given, Then, When} from "cypress-cucumber-preprocessor/steps";

And ('With reasonable time', () =>{
    const time = Cypress.env('time')
    cy.wrap(time).should('be.lessThan', 1500)
});
And ('return success status', () =>{
    const codeStatus = Cypress.env('status')
    cy.wrap(codeStatus).should('deep.equal', 200)
});
Then ('server will show an error', () =>{
    const status = Cypress.env('status')
    expect(status).to.be.oneOf([404, 500, 400])
    const msg = Cypress.env('msg')
    cy.log(msg)
});


//case 1
Given ("user ask for all category", () =>{
    cy.api("GET", "/categories").then((response) => {
        const postID = response.body.data[1].ID
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)

    })
});
Then ('show all category', () =>{
    cy.api("GET", "/categories").then((response) => {
        expect(response.body.data.length).is.greaterThan(5)
    })
});


//case2
Given('User ask a category by id', () =>{
    const postID = Cypress.env('postID')
    cy.api("GET", "/categories/"+postID).then((response) => {
        const msg = response.body.data.Name
        Cypress.env('msg', msg)
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
    })
});
Then ('user get the category', () =>{
    const postID = Cypress.env('postID')
    const msg = Cypress.env('msg')
    cy.api("GET", "/categories/"+postID).then((response) => {
        expect(response.body.data.Name).is.eq(msg)
    })
});



//case3

Given ("user create a new category", () =>{
    cy.api("POST", "/categories",{
        "name":"PaloLala",
        "description":"for gaming purposes"
    }).then((response) => {
        const postID = response.body.data.ID
        const duration = response.duration
        const statusCode = response.status
        const msg = response.body.data.Name
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
        Cypress.env('msg', msg)
    })

});
Then ("server created new category", () =>{
    cy.api("GET", "/categories/" + Cypress.env('postID')).then((response) => {
        expect(response.body.data.ID).to.be.eq(Cypress.env('postID'))
        expect(response.body.data.Name).to.be.eq(Cypress.env('msg'))
    })

});

//case4

Given ("user request to delete a valid category", () =>{
    const iD = Cypress.env('postID')
    cy.api("DELETE", "/categories/"+iD).then((response) => {
        expect(response.body.data).to.eq(null)

    })
});
Then ("confirmed delete on the category", () =>{
    const iD = Cypress.env('postID')
    cy.api({
        method: "GET",
        url: "/categories/"+iD,
        failOnStatusCode: false})
        .then((response) => {
            expect(response.status).to.eq(404)

        })

});

//
//
//
//NEGATIVe

//case2
Given('User ask a category by invalid id', () =>{
    const postID = 151
    cy.api({method: "GET", url: "/categories/"+postID,failOnStatusCode: false}).then((response) => {
        const msg = response.body
        Cypress.env('msg', msg)
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
    })
});


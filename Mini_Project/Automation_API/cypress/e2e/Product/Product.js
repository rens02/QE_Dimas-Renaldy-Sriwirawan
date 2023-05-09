import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
///
///
///
//dipakai berulang kali
And ('With reasonable time', () =>{
    const time = Cypress.env('time')
    cy.wrap(time).should('be.lessThan', 1500)
});
And ('return success status', () =>{
    const codeStatus = Cypress.env('status')
    cy.wrap(codeStatus).should('deep.equal', 200)
});
And ("user already logged in", () =>{
    cy.login()
});
Then ('server will show an error', () =>{
    const status = Cypress.env('status')
    expect(status).to.be.oneOf([404, 500, 400])
    const msg = Cypress.env('msg')
    cy.log(msg)
});



//
//
//
//
//
//Positive Test GET ALL PRODUCT

Given ("i request GET all product", () =>{
    cy.api("GET", "/products").then((response) => {
        const postID = response.body.data[1].ID
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)

    })
});
Then ('i will get the product list', () =>{
    cy.api("GET", "/products").then((response) => {
        expect(response.body).not.null

    })
});

//
//
//
// POSITIVE GET BY ID
Given ("User ask proudct by id", () =>{
    const postID = Cypress.env('postID')
    cy.api("GET", "/products/"+postID).then((response) => {
    })
});
Then ('the user will get the product', () =>{
    const prodId = Cypress.env('postID')
    cy.api("GET", "/products/"+prodId).then((response) => {
        expect(response.body.data.ID).is.eq(prodId)
        const postID = response.body.data.ID
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
    })
});

//
//
//
//
// POSITIVE POST
Given ("user input new product", () =>{
    cy.api("POST", "/products",{
        "name":"PalaLoLa",
        "description":"play has limits",
        "price":29933,
        "categories":[
            1
        ]
    }).then((response) => {
        const postID = response.body.data.ID
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('postID', postID)
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
    })

});
Then ("server will create the product", () =>{
    cy.api("GET", "/products/" + Cypress.env('postID')).then((response) => {
        expect(response.body.data.ID).to.be.eq(Cypress.env('postID'))
    })

});

//
//
//
//
// POSITIVE DELETE
Given ("product id is valid", () =>{
    const iD = Cypress.env('postID')
    cy.api("GET", "/products/"+iD).then((response) => {
        expect(response.body.data.ID).to.eq(iD)

    })
});
When ("user delete product with certain id", () =>{
    const iD = Cypress.env('postID')
    cy.api("DELETE", "/products/"+iD).then((response) => {
        expect(response.body.data).to.eq(null)
    })
});
Then ("product is gone", () =>{
    const iD = Cypress.env('postID')
    cy.api({
        method: "GET",
        url: "/products/"+iD,
        failOnStatusCode: false})
        .then((response) => {
        expect(response.status).to.eq(404)

    })

});

//
//
//
//
// case 5
//POSITIVE RATING
Given ("user post new item", () =>{
    cy.api("POST", "/products",{
        "name":"PalaLoLa",
        "description":"play has limits",
        "price":29933,
        "categories":[1]
    }).then((response) => {
        const postID = response.body.data.ID
        Cypress.env('postID', postID)
    })
});
When ("user input product rate", () =>{
    cy.login();
    const token = Cypress.env('token');
    const authorization = `Bearer ${token}`;
    const postID = Cypress.env('postID')
    cy.api({
        method: 'POST',
        url: '/products/'+postID+'/ratings',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Bearer '+token
        },
        body:{
            "count": 4
        }
    }).then((response) => {
        expect(response.status).to.eq(200)
        expect(response.body.data.ID).to.eq(postID)
        const statusCode = response.status
        Cypress.env('status', statusCode)
        const duration = response.duration
        Cypress.env('time', duration)

    })
});
Then ("the product ratings is updated", () =>{
    const prodId = Cypress.env('postID')
    cy.api("GET", "/products/"+prodId).then((response) => {
        expect(response.body.data.ID).is.eq(prodId)
        expect(response.body.data.Ratings).is.eq(4)

    })

});

//
//
//
// NEGATIVE

//NEGATIVE BY ID
//case1 DONE
Given ("User request negative id product", () =>{
    cy.api({method:"GET", url:"/products/-45", failOnStatusCode: false}).then((response) => {
        const msg = response.body.error
        const status = response.status
        const time = response.duration
        Cypress.env('status', status)
        Cypress.env('msg', msg)
        Cypress.env('time', time)
    })
});
//case1.2 DONE
Given ("User request invalid product id", () =>{
    cy.api({method:"GET", url:"/products/455", failOnStatusCode: false}).then((response) => {
        const msg = response.body.error
        const status = response.status
        const time = response.duration
        Cypress.env('status', status)
        Cypress.env('msg', msg)
        Cypress.env('time', time)
    })
});


//NEGATIVE POST
//case2 DONE
Given ("User input new product with negative categories", () =>{
    cy.api({method: "POST", url: "/products",failOnStatusCode: false,
        body:{
            "name":"PalaLoLa",
            "description":"play has limits",
            "price":29933,
            "categories":[
                -4
            ]
        }}).then((response) => {
        const duration = response.duration
        const statusCode = response.status
        Cypress.env('time', duration)
        Cypress.env('status', statusCode)
    })
});
//case2.2 DONE
Given ("User input new product with negative price", () =>{
    cy.api({method: "POST", url: "/products",failOnStatusCode: false,
        body:{
            "name":"PalaLoLa",
            "description":"play has limits",
            "price":-29933,
            "categories":[
                1
            ]
        }}).then((response) => {const msg = response.body.error
        const status = response.status
        const time = response.duration
        Cypress.env('status', status)
        Cypress.env('msg', msg)
        Cypress.env('time', time)
    })
});

//NEGATIVE DELETE
//case3
Given ("user delete product with negative id", () =>{
    cy.api({method:"DELETE", url:"/products/-54544", failOnStatusCode:false}).then((response) => {
        const status = response.status
        const time = response.duration
        Cypress.env('status', status)
        Cypress.env('time', time)
    })
});




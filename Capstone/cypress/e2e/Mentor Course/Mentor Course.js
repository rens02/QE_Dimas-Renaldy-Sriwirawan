Given ("MAU BIKIN COURSE BARU", () =>{
    const token = Cypress.env('token');
    cy.api({
        method: 'POST',
        url: '',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Bearer '+token
        },
        body:{
            "course_name" : "" ,
            "live_session_week" : "",
            "thumbnail":""

        }
    }).then((response) => {
        expect(response.body.data.course_name) // TO BE APA HAYOOOOO
        const statusCode = response.status
        Cypress.env('status', statusCode)
        const duration = response.duration
        Cypress.env('time', duration)
    })
});

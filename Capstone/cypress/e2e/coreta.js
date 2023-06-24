

{
    "course_name" : "ips 3" ,
    "live_session_week" : "senin selasa kami 12.00-15.00",
    "thumbnail":"https://github.com/Kelompok-2-Capstone-Alterra-Academy/golang-repo/tree/staging"
}

//
Given ("user already logged in", () =>{
    const token = Cypress.env('tokenMentor');
    const authorization = `Bearer ${token}`;
    cy.log(authorization)
    And ('mentor wants to add course', () =>{
        cy.api({
            method: 'POST',
            url: '/mentors/courses',
            headers: {
                'Content-Type': 'application/json',
                'Authorization': authorization
            },
            body:{
                "course_name" : "ips 3" ,
                "live_session_week" : "senin selasa kami 12.00-15.00",
                "thumbnail":"https://github.com/Kelompok-2-Capstone-Alterra-Academy/golang-repo/tree/staging"
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
Feature: Mentor
  Scenario: Post Mentor Login
    Given Mentor input email and password
    Then server should return bearer token
    And with reasonable time
    And return created status

  Scenario: Register new mentor
    Given admin input mentor data
    Then server should return mentor data
    And with reasonable time
    And return created status


  Scenario: CreateCourse
    Given mentor input create new course
    Then server should return course info
    And with reasonable time
    And return created status

  Scenario: See all course
    Given user want to see every course made
    Then server should return every course
    And with reasonable time
    And return created status

  Scenario: Update course
    Given mentor wants to update course
    Then server should return updated course
    And with reasonable time
    And return created status

  Scenario: Delete Course
    Given Mentor wants to delete course
    Then server will return the course is deleted
    And with reasonable time
    And return created status

  Scenario: See course by ID
    Given mentor wants to see specific course
    Then server will return only the course specified
    And with reasonable time
    And return created status

  Scenario: Post Mentor Logout
    Given Mentor wants to logout
    Then server will return logout success
    And with reasonable time
    And return success status




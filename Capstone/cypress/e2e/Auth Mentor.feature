Feature: Auth STUDENT
  Scenario: Post Mentor Login
    Given Mentor input email and password
    Then server should return bearer token
    And with reasonable time
    And return created status

  Scenario: Post Mentor Logout
    Given Mentor wants to logout
    Then server will return logout success
    And with reasonable time
    And return success status




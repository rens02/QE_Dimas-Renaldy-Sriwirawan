Feature: Auth
  Scenario: AUT-01 POST Register
    Given user input email password and fullname
    Then server should return userID, email, password, and fullname
    And with reasonable time
    And return success status

  Scenario: AUT-02 POST Login
    Given user already registered
    Then user should be able to login
    And with reasonable time
    And return success status

  Scenario: AUT-03 GET User information
    Given user already logged in
    Then user should be able to see their information
    And with reasonable time
    And return success status




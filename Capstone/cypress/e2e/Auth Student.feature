Feature: Auth STUDENT
  Scenario: AUT-01 POST Register
    Given user try to register
    Then server should return register data
    And with reasonable time
    And return created status

  Scenario: AUT-02 POST Verify
    Given after user try to register
    Then user should be able to verify with OTP
    And with reasonable time
    And return success status

  Scenario: AUT-03 POST Login
    Given after user register and verify
    Then user should be able to login
    And with reasonable time
    And return success status




Feature: Login
   # Positive case (Login)
  Scenario: LG-01 Login using valid credentials
    Given i am on the login page
    When i input my registered email
    And i input my registered password
    And I click login
    Then i am on the shop front

  Scenario: LG-04 Login without entering email or password
    Given i am on the login page
    When i didnt input anything
    And I click login
    Then i am get an error

  Scenario: LG-05 Login using registered email with invalid password
    Given i am on the login page
    When i input my registered email
    And i input wrong password
    And I click login
    Then i am get an error



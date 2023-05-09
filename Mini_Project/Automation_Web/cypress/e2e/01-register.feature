Feature: Register

    As a user
    I want to register to the site
    and login using my credentials
# Positive Case (Register)
    Scenario: As a user i have to register
    Given i am on the register page
    When I input my full name
    And I input my email
    And I input my password
    And I click register
    Then I am on the login page


    # Negative case (Register)
    Scenario: As a registered user i should not be able to register using the same email
        Given i am on the register page
        When I input my registered full name
        And I input my registered email
        And I input my registered password
        And I click register
        Then I am get an error





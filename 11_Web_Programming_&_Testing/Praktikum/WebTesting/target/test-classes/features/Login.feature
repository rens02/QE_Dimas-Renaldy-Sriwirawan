@login
Feature: login
  As a user
  I want to see my home page
  So that I can update my profile

  @userA
  Scenario: As user i have be able to success login
    Given I am on the login page
    When I enter valid username
    And I enter invalid password
    And I click login button
    Then I comeback to login page
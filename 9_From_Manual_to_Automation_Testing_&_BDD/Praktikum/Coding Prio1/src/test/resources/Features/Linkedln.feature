Feature: Testing Linkedln Features

  As a user of Linkedln
  I want to verify the functionality of the homepage features
  So that I can ensure that the site is working correctly

  Scenario: Verify user can create a new account
    Given I am in the Linkedln homepage
    When I am click the Join now button
    And I am enter my first name
    And I am enter my last name
    And I am enter my email address
    And I am enter my password
    And I am click the Agree & Join button
    Then I am should have a new account on Linkedln

  Scenario: Verify user login
    Given I am on the Linkedln homepage
    When I am click the Sign in button
    And I am enter email address
    And I am input my password
    And I am click the button Sign in
    Then I am should be logged in to my account

  Scenario: Verify user search functionality
    Given I am logged in to my Linkedln account
    When I am enter Quality Engineer in the search bar
    And I am click the Search button
    Then I am should see a list of results related to Quality Engineer

  Scenario: Verify user profile page
    Given I am login into my Linkedln account
    When I am click on my profile picture
    And I am click the View profile button
    Then I am should be taken to my profile page
    And I am should see my name, headline, and summary information

  Scenario: Verify user network page
    Given I am logged in my Linkedln account
    When I am click on the My Network tab
    Then I am should be taken to the network page
    And I am should see suggestions for people to connect with

  Scenario: Verify that the user can create a new post
    Given I am accessed my LinkedIn account
    When I am click on the Start a post button
    And I am type text in the post text field
    And I am click on the Post button
    Then I am should see my new post on my feed

  Scenario: Verify that the user can react to a post by liking, commenting, or sharing
    Given I am signed into my Linkedln account
    And there is a post on my feed
    When I am click on the Like button on the post
    And I am type Great post in the comment text field
    And I am click on the Comment button
    And I am click on the Share button
    Then I am should see the post on my activity feed

  Scenario: Verify that the user can edit their profile information
    Given I am access login My profile in to Linkedln
    When I am click picture on profile
    And I am select the View profile button
    And I am click on the Edit button on the About section
    And I am update my Headline to Quality Engineer
    And I am click on the Save button
    Then I am should see my updated profile information

  Scenario: Verify that the user can upload a new profile picture
    Given I am login in Linkedln account
    When I am click on my profile picture
    And I am click on the Change photo button
    And I am select a new profile picture to upload
    And I am selected the Save button
    Then I am should see my new profile picture on my profile page

  Scenario: Verify that the user can search for jobs and apply to job postings
    Given I am accessed my LinkedIn profile by sign in
    When I am click on the Jobs tab
    And I am input Quality Engineer in the search box
    And I am select a job posting to view
    And I am click on the Apply button
    And I am fill out the job application form
    And I am click on the Submit button
    Then I am should see a confirmation message that my job application was submitted
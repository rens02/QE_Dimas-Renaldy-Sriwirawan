Feature: Categories


  Scenario: CTR_01 GET all category
    Given user ask for all category
    Then show all category
    And With reasonable time
    And return success status

  Scenario: CTR_02 Get category by ID
    Given User ask a category by id
    Then user get the category
    And With reasonable time
    And return success status
  Scenario: CTR_03 POST new category
    Given user create a new category
    Then server created new category
    And With reasonable time
    And return success status
  Scenario: CTR_04 DELETE category by id
    Given user request to delete a valid category
    Then confirmed delete on the category
    And With reasonable time
    And return success status

  Scenario: CTR_05 Get category by ID Negative
    Given User ask a category by invalid id
    Then server will show an error
    And With reasonable time





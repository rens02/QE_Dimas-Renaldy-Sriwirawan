Feature: Products


  Scenario: PRD_01 GET All Product
    Given i request GET all product
    Then i will get the product list
    And With reasonable time
    And return success status

  Scenario: PRD_02 GET Product by ID
    Given User ask proudct by id
    Then the user will get the product
    And With reasonable time
    And return success status

  Scenario: PRD_03 POST Product
    Given user input new product
    Then server will create the product
    And With reasonable time
    And return success status

  Scenario: PRD_04 POST rate Product
    Given user post new item
    And user already logged in
    When user input product rate
    Then the product ratings is updated
    And With reasonable time
    And return success status


  Scenario: PRD_05 DELETE Product
    Given product id is valid
    When user delete product with certain id
    Then product is gone
    And With reasonable time
    And return success status
  Scenario: PRD_06 Delete Product Negative
    Given user delete product with negative id
    Then server will show an error
    And With reasonable time

  Scenario: PRD_08 GET Product by id Negative
    Given User request negative id product
    Then server will show an error
    And With reasonable time
  Scenario: PRD_09 GET Product by invalid id
    Given User request invalid product id
    Then server will show an error
    And With reasonable time

  Scenario: PRD_10 POST Product Negative
    Given User input new product with negative categories
    Then server will show an error
    And With reasonable time
  Scenario: PRD_11 POST Product Negative 2
    Given User input new product with negative price
    Then server will show an error
    And With reasonable time


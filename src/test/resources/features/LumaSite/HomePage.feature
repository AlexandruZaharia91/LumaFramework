Feature: Home Page content

  Background:
    Given I navigate to main page

@Test
  Scenario: Check Home Page content
    Given I am in Luma page
    And   I check the toolbar Menu
    And   I choose an option
    And   I check the new page
    Then  I go to seach box and I search a product
    And   I check the list from search
    And   I choose an option from the list
    And   I check the new page





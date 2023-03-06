Feature: Home Page content

@Test
  Scenario: Check Home Page content
    Given I enter in Luma site
    And   I start to check the toolbar
    Then  I can view all the options from toolbar
    And   I can access an option from toolbar
    Then  A New page is opened for each option
    And   Go to Search box
    And   Try to find a cloth with search box
    And   List the content from Search box for a specific cloth
    Then  Check the content with what you searched




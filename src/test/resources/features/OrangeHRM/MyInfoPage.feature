Feature: My Info Page

  Background:
    Given I navigate to login page from Orange HRM
    And I login with user "Admin" and password "admin123"
    And I press Login button
    Then I check the new page
@Run
    Scenario: My Info
      Given I go to My Info
      And I started to complete the fields

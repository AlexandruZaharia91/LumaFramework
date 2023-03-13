Feature: Login Page Orange HRM

  Background: Login Page
    Given I navigate to login page from Orange HRM

  @Run
  Scenario Outline: Login
    Given I login with user "Admin" and password "admin123"
    And I press Login button
    Then I check the new page
    Examples:
      | popescu | gigi
      | costel  | sonia


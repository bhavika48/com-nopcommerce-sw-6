Feature: HomePage Test
  As user I want to verify page navigation

  @smoke
  Scenario: User should navigate to Login page successfully
    Given I am on HomePage page
    When I click on login link
    Then I should navigate to login page successfully


  Scenario: User should navigate to Register page successfully
    Given I am on HomePage page
    When I click on Register link
    Then I should navigate to Register page successfully

  Scenario: User should navigate to Electronics page successfully
    Given I am on HomePage page
    When I click on Electronics link
    Then I should navigate to Electronics page successfully

  Scenario: User should navigate to Desktops page successfully
    Given I am on HomePage page
    When  I mouse hover on Computers link
    And I click on Desktops link
    Then I should navigate to Desktops page successfully


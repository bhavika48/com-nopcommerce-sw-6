
Feature: Login Test
  As user I want to login into nop commerce website
  As user I want to login into nop commerce website
   @sanity
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primetesting@gmail.com"
    And I enter password "Test123"
    And I click on login button
    Then I should login successfully


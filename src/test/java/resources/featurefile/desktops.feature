Feature: Desktops Test
  As user I want to verify page navigation
@smoke
  Scenario: verify Product Arrange In AlphaBatical Order
    When I mouse hover on Computers menu
    And I click on Desktops sub menu
    And  I select 'Name: A to Z' from drop down
    Then  Product should  arrange In alphaBatical order
@smoke
  Scenario: verify product arrange in descending Order
    When I mouse hover on Computers menu
    And I click on Desktops sub menu
    And  I select 'Name: Z to A' from drop down
    Then  Product should arrange In descending order




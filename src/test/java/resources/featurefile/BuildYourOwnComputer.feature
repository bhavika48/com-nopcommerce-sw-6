Feature: Build your own computer Test
  As a user I want to verify Computers Page

@Regression @ Sanity
  Scenario: Verify products added to shopping cart successFully
    Given I am on Home Page
    And I click on Computer Menu.
    And I Click on Desktop
    And I select Sort By position "Name: A to Z"
    When I click on "Add To Cart"
    Then I verify the Text "Build your own computer"
    And I select "2.2 GHz Intel Pentium Dual-Core E2200"
    And I select 8GB [+$60.00] ram
    And I select HDD radio "400 GB [+$100.00]"
    When I select OS radio "Vista Premium [+$60.00]"
    And I check two Check boxes "Microsoft Office [+$50.00]" and "Total Commander  [+$5.00]"
    Then I verify the price "$1,475.00"
    And I click on "ADD TO CARD" Button.
    And I verify the Message "The product has been added to your shopping cart" on Topgreen Bar
    And I close the bar clicking on the cross button.
    And I MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    And I verify the message "Shopping cart"
    When I change the Qty to "2" and Click on "Update shopping cart"
    Then I verify the Total"$2,950.00"
    And I click on checkbox “I agree with the terms of service”
    And I Click on “CHECKOUT”
    And I Verify the Text “Welcome, Please Sign In!”
    And I Click on “CHECKOUT AS GUEST” Tab
    And I Fill the all mandatory field
    And I  Click on billing “CONTINUE”
    And I Click on Radio Button “Next Day Air($0.00)”
    And I Click on shipping “CONTINUE”
    And I Select Radio Button “Credit Card”
    And I Select “Master card” From Select credit card dropdown
    And I Fill all the details
    When I Click on payment “CONTINUE”
    Then I Verify “Payment Method” is “Credit Card”
    And I Verify “Shipping Method” is “Next Day Air”
    And I Verify Total is "$2,950.00" And I Click on CONFIRM
    And I Verify the Text “Thank You”
    And I Verify the message “Your order has been successfully processed!”
    And I Click on checkout “CONTINUE”
    Then Verify the text “Welcome to our store”
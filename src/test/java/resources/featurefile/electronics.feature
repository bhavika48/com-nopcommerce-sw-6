Feature: Electronics Test

  As user I want to verify Electronics page
  @ Sanity @ Regression
  Scenario:  Verify User Should Navigate To Cell Phones Page Successfully
    When I mouse Hover on Electronics Tab
    And   I mouse Hover on Cell phones and click
    Then  I verify the text Cell phones

  Scenario: Verify that the products added successfully
    When  I mouse Hover on Electronics Tab
    And I mouse Hover on Cell phones and click
    And I verify the text Cell phones
    And I click on List View Tab on page
    And I click on product name Nokia Lumia 1020 link
    And I verify the text Nokia Lumia 1020
    And  I verify the price $349.00
    And I Change quantity to 2 of product
    And I click on ADD TO CART tab
    And  I verify the text "The product has been added to your shopping cart" on Top green Bar

    And I click on the cross button
    And I MouseHover on Shopping cart and
    And I Click on "GO TO CART" button.
    And I should verify the message Shopping cart
    And I should verify the quantity is "2"
    And I should verify the Total "$698.00"
    And I click on checkbox I agree with the terms of service
    And I Click on checkout
    And  I should verify the Text Welcome, Please Sign In!
    And I click on register tab
    And I verify the text Register
    And I Fill all the mandatory fields on register page
    And I Click on REGISTER Button
    And I should verify the message Your registration completed
    And I Click on continue tab
    And I should verify the text shopping card
    And I click on checkbox I agree with the terms of service
    And I click on CHECKOUT in checkout page
    And I fill the Mandatory fields on page
    And I click on CONTINUE on checkout page
    And  I click on Radio Button 2nd Day Air ($0.00)
    And I click on CONTINUE on register page
    And I select Radio Button Credit Card
    And I select Visa From Select credit card dropdown
    And I fill all the detail
    And I click on continue
    And I should verify Payment Method is Credit Card
    And I should verify Shipping Method is 2nd Day Air
    And I should verify Total is $698.00
    And I click on CONFIRM
    And I should verify  "Thank You"
    And I verify the text "Your order has been successfully processed!"
    And I click on "CONTINUE
    And  I should verify the text Welcome to our store
    And I click on Logout link
    Then I  should verify the URL is "https://demo.nopcommerce.com/"
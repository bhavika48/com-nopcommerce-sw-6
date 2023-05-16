package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicsSteps {
    @When("^I mouse Hover on Electronics Tab$")
    public void iMouseHoverOnElectronicsTab() {
        new HomePage().mouseHoverOnElectronicsMenu();
    }

    @And("^I mouse Hover on Cell phones and click$")
    public void iMouseHoverOnCellPhonesAndClick() {
        new HomePage().mouseHoverAndClickOnCellPhonesMenu();

    }

    @Then("^I verify the text Cell phones$")
    public void iVerifyTheTextCellPhones() {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonesPage().getTitle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^I click on List View Tab on page$")
    public void iClickOnListViewTabOnPage() {
        new CellPhonesPage().checkListViewOfCellPhones();
    }

    @And("^I click on product name Nokia Lumia (\\d+) link$")
    public void iClickOnProductNameNokiaLumiaLink(int arg0) {
        new CellPhonesPage().selectproductNameByNokiaLumia1020();
    }

    @And("^I verify the text Nokia Lumia (\\d+)$")
    public void iVerifyTheTextNokiaLumia(int arg0) {
        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = new NokiaLumiaPage().getTitleNokiaLumia();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }

    @And("^I verify the price \\$(\\d+)\\.(\\d+)$")
    public void iVerifyThePrice$(int arg0, int arg1) {
        String expectedMessage2 = "$349.00";
        String actualMessage2 = new NokiaLumiaPage().getPriceOfNokiaLumia();
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }

    @And("^I Change quantity to (\\d+) of product$")
    public void iChangeQuantityToOfProduct(int arg0) {
        new NokiaLumiaPage().addQuantity();
    }

    @And("^I click on ADD TO CART tab$")
    public void iClickOnADDTOCARTTab() {
        new NokiaLumiaPage().selectAddToCart();
    }

    @And("^I verify the text \"([^\"]*)\" on Top green Bar$")
    public void iVerifyTheTextOnTopGreenBar(String arg0) {
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = new NokiaLumiaPage().getTitleMessageOfNokiaLumia();
        Assert.assertEquals(actualMessage3, expectedMessage3);
    }

    @And("^I click on the cross button$")
    public void iClickOnTheCrossButton() {
        new NokiaLumiaPage().closeTab();
    }

    @And("^I MouseHover on Shopping cart and$")
    public void iMouseHoverOnShoppingCartAnd() {
        new NokiaLumiaPage().mouseHoverToShoppingCartAnd();
    }

    @And("^I Click on GO TO CART\" button\\.$")
    public void iClickOnGOTOCARTButton() {
        new NokiaLumiaPage().selectAddToCart();

    }

    @And("^I should verify the message Shopping cart$")
    public void iShouldVerifyTheMessageShoppingCart() {
        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = new NokiaLumiaPage().getTitleMessageOfNokiaLumia();
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }

    @And("^I should verify the quantity is \"([^\"]*)\"$")
    public void iShouldVerifyTheQuantityIs(String quantity) {
        new ShoppingCartPage().updateQuantity();
    }

    @And("^I should verify the Total \"([^\"]*)\"$")
    public void iShouldVerifyTheTotal(String total) {
        String expectedMessage5 = "total";
        String actualMessage5 = new ShoppingCartPage().getTotalPrice();
        Assert.assertEquals(actualMessage5, expectedMessage5);
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().acceptTermsAndCondition();
    }

    @And("^I Click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
        new ShoppingCartPage().checkOut();
    }

    @And("^I should verify the Text Welcome, Please Sign In!$")
    public void iShouldVerifyTheTextWelcomePleaseSignIn() {
        String expectedMessage6 = "Welcome, Please Sign In!";
        String actualMessage6 = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage6, expectedMessage6);
    }

    @And("^I click on REGISTER tab$")
    public void iClickOnREGISTERTab() {
        new LoginPage().selectRegister();
    }

    @And("^I verify the text Register$")
    public void iVerifyTheTextRegister() {
        String expectedMessage7 = "Register";
        String actualMessage7 = new RegisterPage().getTitle();
        Assert.assertEquals(actualMessage7, expectedMessage7);
    }

    @And("^I Fill all the mandatory fields on register page$")
    public void iFillAllTheMandatoryFieldsOnRegisterPage() {
        new RegisterPage().enterRegistrationDetails();
    }

    @And("^I Click on REGISTER Button$")
    public void iClickOnREGISTERButton() {
        new RegisterPage().registerButton();
    }


    @And("^I should verify the message Your registration completed$")
    public void iShouldVerifyTheMessageYourRegistrationCompleted() {
        String expectedMessage8 = "Your registration completed";
        String actualMessage8 = new RegisterPage().getRegistrationMessage();
        Assert.assertEquals(actualMessage8, expectedMessage8);
    }

    @And("^I Click on continue tab$")
    public void iClickOnContinueTab() {
        new RegisterPage().selectRegisterSaveAndContinue();
    }

    @And("^I should verify the text shopping card$")
    public void iShouldVerifyTheTextShoppingCard() {
        String expectedMessage9 = "Shopping cart";
        String actualMessage9 = new ShoppingCartPage().getTitle();
        Assert.assertEquals(actualMessage9, expectedMessage9);
    }


    @And("^I fill the Mandatory fields on page$")
    public void iFillTheMandatoryFieldsOnPage() {
        new CheckoutPage().enterFirstNameAndLastName();
        new CheckoutPage().enterEmail();
        new CheckoutPage().enterBillingAddress();
    }

    @And("^I click on CONTINUE on checkout page$")
    public void iClickOnCONTINUEOnCheckoutPage() {
        new CheckoutPage().billingSaveAndContinue();
    }

    @And("^I click on Radio Button (\\d+)nd Day Air \\(\\$(\\d+)\\.(\\d+)\\)$")
    public void iClickOnRadioButtonNdDayAir$(int arg0, int arg1, int arg2) {
        new CheckoutPage().selectShippingByNextDayAir();
    }

    @And("^I click on CONTINUE on register page$")
    public void iClickOnCONTINUEOnRegisterPage() {
        new CheckoutPage().shippingSaveAndContinue();
    }

    @And("^I select Radio Button Credit Card$")
    public void iSelectRadioButtonCreditCard() {
        new CheckoutPage().selectPaymentMethodByCreditCard();
    }

    @And("^I select Visa From Select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new CheckoutPage().selectCreditCardByVisa();
    }

    @And("^I fill all the detail$")
    public void iFillAllTheDetail() {
        new CheckoutPage().enterCreditCardDetails();
    }

    @And("^I should verify Payment Method is Credit Card$")
    public void iShouldVerifyPaymentMethodIsCreditCard() {
        String expectedMessage10 = "Credit Card";
        String actualMessage10 = new CheckoutPage().getPaymentMethod();
        Assert.assertEquals(actualMessage10, expectedMessage10);
    }

    @And("^I should verify Shipping Method is (\\d+)nd Day Air$")
    public void iShouldVerifyShippingMethodIsNdDayAir(int arg0) {
        String expectedMessage11 = "2nd Day Air";
        String actualMessage11 = new CheckoutPage().get2ndDayAirText();
        Assert.assertEquals(actualMessage11, expectedMessage11);
    }

    @And("^I should verify Total is \\$(\\d+)\\.(\\d+)$")
    public void iShouldVerifyTotalIs$(int arg0, int arg1) {
        String expectedMessage12 = "$698.00";
        String actualMessage12 = new CheckoutPage().getTotalPrice();
        Assert.assertEquals(actualMessage12, expectedMessage12);
    }

    @And("^I click on CONFIRM$")
    public void iClickOnCONFIRM() {
        new CheckoutPage().selectConfirm();
    }

    @And("^I should verify  \"([^\"]*)\"$")
    public void iShouldVerify(String message) {
        String expectedMessage13 = "Thank You";
        String actualMessage13 = new CheckoutPage().getThankYouMessage();
        Assert.assertEquals(actualMessage13, expectedMessage13);
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) {
        String expectedMessage14 = "Your order has been successfully processed!";
        String actualMessage14 = new CheckoutPage().getOrderMessage();
        Assert.assertEquals(actualMessage14, expectedMessage14);
    }

    @And("^I click on \"CONTINUE$")
    public void iClickOnCONTINUE() {
        new CheckoutPage().selectContinue();

    }

    @And("^I should verify the text Welcome to our store$")
    public void iShouldVerifyTheTextWelcomeToOurStore() {
        String expectedMessage15 = "Welcome to our store";
        String actualMessage15 = new CheckoutPage().getWellComeToOurStore();
        Assert.assertEquals(actualMessage15, expectedMessage15);
    }

    @And("^I click on Logout link$")
    public void iClickOnLogoutLink() {
        new CheckoutPage().selectLogOut();
    }

    @Then("^I  should verify the URL is \"([^\"]*)\"$")
    public void iShouldVerifyTheURLIs(String arg0) {

    }


    @And("^I Click on checkout$")
    public void iClickOnCheckout() {

    }

    @And("^I click on register tab$")
    public void iClickOnRegisterTab() {
    }

}







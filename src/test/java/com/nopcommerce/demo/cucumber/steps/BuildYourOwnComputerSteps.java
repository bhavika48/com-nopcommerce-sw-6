package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuildYourOwnComputerSteps {


    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {


    }

    @And("^I click on Computer Menu\\.$")
    public void iClickOnComputerMenu() {
        new HomePage().clickOnComputersMenu();
    }

    @And("^I Click on Desktop$")
    public void iClickOnDesktop() {
        new HomePage().clickOnDesktopsSubMenu();
    }

    @And("^I select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String ascending) {
        new DesktopsSteps().iSelectNameAToZFromDropDown();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) {
        new DesktopsPage().clickOnBuildYourOwnComputer();

    }

    @Then("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) {
        new BuildOwnComputerPage().getPageTitle();
    }

    @And("^I select \"([^\"]*)\" using Select class$")
    public void iSelectUsingSelectClass(String arg0) {
        new BuildOwnComputerPage().selectProcessorBy2_2();
    }

    @And("^I select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String arg0) {
        new BuildOwnComputerPage().selectHddBy400GB();
    }

    @And("^I select (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\] ram$")
    public void iSelectGB$Ram(int arg0, int arg1, int arg2) {
        new BuildOwnComputerPage().selectRamBy8GB();
    }

    @When("^I select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String arg0) {
        new BuildOwnComputerPage().selectOSByVistaPremium();
    }

    @And("^I check two Check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckTwoCheckBoxesAnd(String arg0, String arg1) {
        new BuildOwnComputerPage().selectSoftwareByTotalCommander();
    }

    @Then("^I verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String arg0) {
        new BuildOwnComputerPage().getPrice();
    }

    @And("^I click on \"([^\"]*)\" Button\\.$")
    public void iClickOnButton(String arg0) {
        new BuildOwnComputerPage().clickOnAddToCart();
    }

    @And("^I verify the Message \"([^\"]*)\" on Topgreen Bar$")
    public void iVerifyTheMessageOnTopgreenBar(String arg0) {
        new BuildOwnComputerPage().getTextProductBeenAddedToYourCart();
    }

    @And("^I close the bar clicking on the cross button\\.$")
    public void iCloseTheBarClickingOnTheCrossButton() {
        new BuildOwnComputerPage().clickOnCloseMessage();
    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String arg0) {


    }

    @When("^I change the Qty to \"([^\"]*)\" and Click on \"([^\"]*)\"$")
    public void iChangeTheQtyToAndClickOn(String arg0, String arg1) {
        new ShoppingCartPage().addQuantityBy2();
        new ShoppingCartPage().updateShoppingCart();

    }

    @Then("^I verify the Total\"([^\"]*)\"$")
    public void iVerifyTheTotal(String totalPrice) {
        new ShoppingCartPage().getTotalPrice();
    }

    @And("^I Verify the Text “Welcome, Please Sign In!”$")
    public void iVerifyTheTextWelcomePleaseSignIn() {
        String expMessage5 = "Welcome, Please Sign In!";
        String actMessage5 = new LoginPage().getWelcomeText();
        Assert.assertEquals(actMessage5, expMessage5);

    }

    @And("^I Click on “CHECKOUT AS GUEST” Tab$")
    public void iClickOnCHECKOUTASGUESTTab() {
        new LoginPage().checkOutAsGuest();
    }


    @And("^I Fill the all mandatory field$")
    public void iFillTheAllMandatoryField() {
        new RegisterPage().enterRegistrationDetails();
    }

    @And("^I  Click on billing “CONTINUE”$")
    public void iClickOnBillingCONTINUE() {
        new CheckoutPage().enterBillingAddress();
    }

    @And("^I Click on Radio Button “Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iClickOnRadioButtonNextDayAir$(int arg0, int arg1) {
        new CheckoutPage().selectShippingByNextDayAir();

    }

    @And("^I Click on shipping “CONTINUE”$")
    public void iClickOnShippingCONTINUE() {
        new CheckoutPage().shippingSaveAndContinue();
    }

    @And("^I Select Radio Button “Credit Card”$")
    public void iSelectRadioButtonCreditCard() {
        new CheckoutPage().selectCreditCardByVisa();
    }

    @And("^I Select “Master card” From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {
        new CheckoutPage().selectCreditCardByMasterCard();
    }

    @And("^I Fill all the details$")
    public void iFillAllTheDetails() {
    }

    @When("^I Click on payment “CONTINUE”$")
    public void iClickOnPaymentCONTINUE() {
        new CheckoutPage().enterCreditCardDetails();
    }

    @Then("^I Verify “Payment Method” is “Credit Card”$")
    public void iVerifyPaymentMethodIsCreditCard() {
        String expMessage6 = "Credit Card";
        String actMessage6 = new CheckoutPage().getPaymentMethod();
        Assert.assertEquals(actMessage6, expMessage6);
    }

    @And("^I Verify “Shipping Method” is “Next Day Air”$")
    public void iVerifyShippingMethodIsNextDayAir() {
        String expMessage7 = "Next Day Air";
        String actMessage7 = new CheckoutPage().getShippingMethod();
        Assert.assertEquals(actMessage7, expMessage7);
    }


    @And("^I Verify the Text “Thank You”$")
    public void iVerifyTheTextThankYou() {
        String expectedMessage9 = "Thank you";
        String actualMessage9 = new CheckoutPage().getThankYouMessage();
        Assert.assertEquals(actualMessage9, expectedMessage9);
    }

    @And("^I Verify the message “Your order has been successfully processed!”$")
    public void iVerifyTheMessageYourOrderHasBeenSuccessfullyProcessed() {
        String expectedMessage11 = "Your order has been successfully processed!";
        String actualMessage11 = new CheckoutPage().getOrderMessage();
        Assert.assertEquals(actualMessage11, expectedMessage11);
    }

    @And("^I Click on checkout “CONTINUE”$")
    public void iClickOnCheckoutCONTINUE() {
        new CheckoutPage().selectContinue();
    }

    @Then("^Verify the text “Welcome to our store”$")
    public void verifyTheTextWelcomeToOurStore() {
        String expectedMessage12 = "Welcome to our store";
        String actualMessage12 = new CheckoutPage().getWellComeToOurStore();
        Assert.assertEquals(actualMessage12, expectedMessage12);

    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String arg0) {


    }

    @And("^I Verify Total is \"([^\"]*)\" And I Click on CONFIRM$")
    public void iVerifyTotalIsAndIClickOnCONFIRM(String expTotal) {
        String actualPrice2 = new CheckoutPage().getTotalPrice();
        Assert.assertEquals(actualPrice2, expTotal);
        new CheckoutPage().selectConfirm();

    }


}

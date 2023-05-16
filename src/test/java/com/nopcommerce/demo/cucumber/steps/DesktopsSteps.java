package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {

    @Then("^I should navigate to Desktops page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        new DesktopsPage().getDesktopsTitle();
        String expectedMessage = "Desktops";
        String actualMessage = new RegisterPage().getTitle();
        Assert.assertEquals(actualMessage,expectedMessage,"Desktops page not displayed");

    }

    @When("^I mouse hover on Computers menu$")
    public void iMouseHoverOnComputersMenu() {
        new HomePage().mouseHoverOnComputersMenu();
    }

    @And("^I click on Desktops sub menu$")
    public void iClickOnDesktopsSubMenu() {
        new HomePage().clickOnDesktopsSubMenu();
    }

    @And("^I select 'Name: A to Z' from drop down$")
    public void iSelectNameAToZFromDropDown() {
        new DesktopsPage().selectProductsByAscendingOrder();
    }

    @Then("^Product should  arrange In alphaBatical order$")
    public void productShouldArrangeInAlphaBaticalOrder() {
        new DesktopsPage().getProductsNameByAscendingOrder();
    }

    @And("^I select 'Name: Z to A' from drop down$")
    public void iSelectNameZToAFromDropDown() {
        new DesktopsPage().selectProductsByDescendingOrder();
    }

    @Then("^Product should arrange In descending order$")
    public void productShouldArrangeInDescendingOrder() {
            new DesktopsPage().selectProductsByDescendingOrder();
    }
}

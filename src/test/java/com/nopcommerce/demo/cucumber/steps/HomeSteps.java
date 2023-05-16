package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeSteps {


    @Given("^I am on HomePage page$")
    public void i_am_on_HomePage_page(){

    }

    @When("^I click on login link$")
    public void i_click_on_login_link() {

    }

    @When("^I click on Register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to Register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().getTitle();
        Assert.assertEquals(actualMessage,expectedMessage, "Register page not displayed");
    }

    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }

    @When("^I click on Electronics link$")
    public void iClickOnElectronicsLink() {
        new HomePage().clickOnElectronicsMenu();
    }

    @Then("^I should navigate to Electronics page successfully$")
    public void iShouldNavigateToElectronicsPageSuccessfully() {
    }

    @When("^I click on computers link$")
    public void iClickOnComputersLink() {
        new HomePage().clickOnComputersMenu();
    }

    @Then("^I should navigate to computers page successfully$")
    public void iShouldNavigateToComputersPageSuccessfully() {
    }

    @Given("^I am on TopMenu page$")
    public void iAmOnTopMenuPage() {
    }

    @When("^I click on Desktops link$")
    public void iClickOnDesktopsLink() {
        new HomePage().clickOnDesktopsSubMenu();
    }

    @When("^I mouse hover on Computers link$")
    public void iMouseHoverOnComputersLink() {
        new HomePage().mouseHoverOnComputersMenu();
    }

}

package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Jay Vaghani
 */
public class LoginSteps {

    @Then("^I should navigate to login page successfully$")
    public void i_should_navigate_to_login_page_successfully(){
        String expectedMessage = "Welcome, Please Sign In";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage,expectedMessage, "Login page not displayed");
    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {

    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage)  {
        Assert.assertEquals( errorMessage, new LoginPage().getErrorMessage(),"Error message not displayed");
    }

}
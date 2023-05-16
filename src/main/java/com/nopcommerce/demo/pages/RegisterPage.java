package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement titleText;


    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationText;

    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement registerSaveAndContinueButton;


    public String getTitle() {
        log.info("Get Products added successfully message  " + titleText.toString());
        String message = getTextFromElement(titleText);
        return message;
    }


    public void enterRegistrationDetails() {
        sendTextToElement(firstNameField, "Ann");
        sendTextToElement(lastNameField, "Martin");
        sendTextToElement(emailField, "ann456@gmail.com");
        sendTextToElement(passwordField, "ann123");
        sendTextToElement(confirmPasswordField, "ann123");
    }

    public void registerButton() {
        log.info("Clicking on register link " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public String getRegistrationMessage() {
        log.info("Get Products added successfully message  " + registrationText.toString());
        String message = getTextFromElement(registrationText);
        return message;
    }


    public void selectRegisterSaveAndContinue() {
        log.info("Clicking on save and continue " + registrationText.toString());
        clickOnElement(registrationText);

    }
}

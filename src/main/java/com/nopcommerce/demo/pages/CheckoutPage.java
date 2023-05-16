package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityDropdown;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement billingContinueButton;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Next Day Air ($0.00)']")
    WebElement shippingNextDayAir;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='2nd Day Air ($0.00)']")
    WebElement shippingBySecondDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingSaveAndContinueButton;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Credit Card']")
    WebElement paymentMethodByCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodSaveAndContinue;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoSaveAndContinue;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardByMasterCard;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardByVisa;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expireYearField;


    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']//span[@class='value']")
    WebElement paymentText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[@class='value']")
    WebElement shippingMethodText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page checkout-page order-completed-page']")
    WebElement orderMessageText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement wellComeToOurStoreText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[@class='value']")
    WebElement secondDayAirText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;


    public void enterFirstNameAndLastName() {
        sendTextToElement(firstNameField, "Tom");
        sendTextToElement(lastNameField, "Olins");
    }

    public void enterEmail() {
        log.info("Enter email " + " to email field " + emailField.toString());
        sendTextToElement(emailField, "tom123@gmail.com");

    }

    public void enterBillingAddress() {
        selectByVisibleTextFromDropDown(countryDropdown, "American Samoa");
        sendTextToElement(cityDropdown, "Texas");
        sendTextToElement(addressDropdown, "50 Cecli Road");
        sendTextToElement(postCodeDropdown, "Tw3 4QP");
        sendTextToElement(phoneNumberDropdown, "04562341345");

    }

    public void billingSaveAndContinue() {
        log.info("Clicking on update Button " + billingContinueButton.toString());
        clickOnElement(billingContinueButton);

    }

    public void selectShippingByNextDayAir() {
        log.info("Clicking on update Button " + shippingNextDayAir.toString());
        clickOnElement(shippingNextDayAir);


    }

    public void selectShippingBySecondDayAir() {
        log.info("Clicking on update Button " + shippingBySecondDayAir.toString());
        clickOnElement(shippingBySecondDayAir);

    }

    public void shippingSaveAndContinue() {
        log.info("Clicking on update Button " + shippingSaveAndContinueButton.toString());
        clickOnElement(shippingSaveAndContinueButton);
    }

    public void selectPaymentMethodByCreditCard() {
        log.info("Clicking on update Button " + paymentMethodByCreditCard.toString());
        clickOnElement(paymentMethodByCreditCard);


    }

    public void paymentMethodSaveAndContinue() {
        log.info("Clicking on update Button " + paymentMethodSaveAndContinue.toString());
        clickOnElement(paymentMethodSaveAndContinue);
    }

    public void selectCreditCardByMasterCard() {
        log.info("select card" + creditCardByMasterCard.toString());
        selectByVisibleTextFromDropDown(creditCardByMasterCard, "Master card");

    }

    public void selectCreditCardByVisa() {
        log.info("select card " + creditCardByVisa.toString());
        selectByVisibleTextFromDropDown(creditCardByVisa, "Visa");
    }

    public void enterCreditCardDetails() {
        sendTextToElement(cardHolderNameField, "Tom");
        sendTextToElement(cardNumberField, "5105105105105100");
        selectByVisibleTextFromDropDown(expireMonthField, "02");
        selectByVisibleTextFromDropDown(expireYearField, "2025");
        sendTextToElement(cardCodeField, "123");
    }

    public void paymentInfoSaveAndContinue() {
        clickOnElement(paymentInfoSaveAndContinue);
        log.info("click on save ans continue button" + paymentInfoSaveAndContinue.toString());
    }

    public String getPaymentMethod() {
        log.info("Get Success Modified Message  " + paymentText.toString());
        String message = getTextFromElement(paymentText);
        return message;
    }

    public String getShippingMethod() {
        log.info("Get Success Modified Message  " + shippingMethodText.toString());
        String message = getTextFromElement(shippingMethodText);
        return message;
    }

    public String getTotalPrice() {
        log.info("Get Success Modified Message  " + totalPriceText.toString());
        String message = getTextFromElement(totalPriceText);
        return message;
    }

    public void selectConfirm() {
        log.info("Clicking on update Button " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String getThankYouMessage() {
        log.info("Get Success Modified Message  " + thankYouText.toString());
        String message = getTextFromElement(thankYouText);
        return message;
    }

    public String getOrderMessage() {
        log.info("Get Success Modified Message  " + orderMessageText.toString());
        String message = getTextFromElement(orderMessageText);
        return message;
    }

    public void selectContinue() {
        log.info("Clicking on update Button " + continueButton.toString());
        clickOnElement(continueButton);

    }

    public String getWellComeToOurStore() {
        log.info("Get Wellcome to our store Message  " + orderMessageText.toString());
        String message = getTextFromElement(wellComeToOurStoreText);
        return message;
    }

    public String get2ndDayAirText() {
        String message = getTextFromElement(secondDayAirText);
        log.info("Get 2nd day Air text " + secondDayAirText.toString());
        return message;
    }

    public void selectLogOut() {
        log.info("Clicking on update Button " + logOutButton.toString());
        clickOnElement(logOutButton);
    }

}

package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement titleText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityButton;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement shoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'I agree with the terms of service and I adhere to ')]")
    WebElement termsAndConditionButton;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement updateQuantityButton;

    public String getTitle() {
        Reporter.log("Get Products added successfully message  " + titleText.toString());
        return getTextFromElement(titleText);
    }


    public void addQuantityBy2() {
        sendTextToElement(quantityButton, "2");
    }


    public void updateShoppingCart() {
        log.info("Clicking  cart button " + shoppingCartButton.toString());
        clickOnElement(shoppingCartButton);
    }


    public void acceptTermsAndCondition() {
        log.info("Clicking  cart button " + termsAndConditionButton.toString());
        clickOnElement(termsAndConditionButton);

    }

    public void checkOut() {
        log.info("Clicking  cart button " + checkOutButton.toString());
        clickOnElement(checkOutButton);

    }

    public String getTotalPrice() {
        log.info("Get Products added successfully message  " + titleText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void updateQuantity() {
        log.info("Update quantity " + updateQuantityButton.toString());
        sendTextToElement(updateQuantityButton, "2");
    }
}



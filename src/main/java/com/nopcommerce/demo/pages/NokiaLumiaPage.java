package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {
    private static final Logger log = LogManager.getLogger(NokiaLumiaPage.class.getName());

    public NokiaLumiaPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumiaPrice;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement nokiaLumiaTitleText;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartMouseHover;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCartButton;


    public String getTitleNokiaLumia() {
        log.info("Get Products added successfully message  " + nokiaLumiaText.toString());
        String message = getTextFromElement(nokiaLumiaText);
        return message;
    }


    public String getPriceOfNokiaLumia() {
      log.info("Get Products added successfully message  " + nokiaLumiaPrice.toString());
        String message = getTextFromElement(nokiaLumiaPrice);
        return message;
    }

    public void addQuantity() {
       log.info(" Add quantity " + quantityButton.toString());
        sendTextToElement(quantityButton, "2");
    }


    public void selectAddToCart() {
        log.info("Clicking on Add to cart button " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }


    public String getTitleMessageOfNokiaLumia() {
       log.info("Get Products added successfully message  " + nokiaLumiaPrice.toString());
        String message = getTextFromElement(nokiaLumiaPrice);
        return message;
    }


    public void closeTab() {
        log.info("Clicking on close button " + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void mouseHoverToShoppingCartAnd() {
        log.info("mouseHover to cart button " + shoppingCartMouseHover.toString());
        mouseHoverToElement(shoppingCartMouseHover);

    }

    public void selectGoToCart() {
        log.info("Clicking  cart button " + goToCartButton.toString());
        clickOnElement(goToCartButton);

    }

}

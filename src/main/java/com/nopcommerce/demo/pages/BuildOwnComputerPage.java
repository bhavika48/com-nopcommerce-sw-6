package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildOwnComputerPage extends Utility {


    private static final Logger log = LogManager.getLogger(BuildOwnComputerPage.class.getName());

    public BuildOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement pageTitleText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor2;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement Ram8gb;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'400 GB [+$100.00]')]")
    WebElement hddBy400GbRadioButton;

    @CacheLookup
    @FindBy(xpath = " //label[contains(text(),'Vista Premium [+$60.00]')]")
    WebElement vistaPremiumRadioButton;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Total Commander [+$5.00]')]")
    WebElement softwareByTotalCommanderButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceText;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productBeenAddedToYourCartText;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartMouse;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCartButton;


    public String getPageTitle() {
        Reporter.log("Get page title  " + pageTitleText.toString());
        String message = getTextFromElement(pageTitleText);
        log.info("Get page title " + pageTitleText.toString());
        return message;
    }

    public void selectProcessorBy2_2() {

        selectByVisibleTextFromDropDown(processor2, "2.2 GHz Intel Pentium Dual-Core E2200");
        log.info("Clicking on update Button " + processor2.toString());
    }


    public void selectRamBy8GB() {
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"), "8GB [+$60.00]");
    }


    public void selectHddBy400GB() {
        log.info("Clicking on hddBy400GbRadio Button " + hddBy400GbRadioButton.toString());
        clickOnElement(hddBy400GbRadioButton);

    }

    public void selectOSByVistaHome() {

    }

    public void selectOSByVistaPremium() {
        log.info("Clicking on VistaPremium " + vistaPremiumRadioButton.toString());
        clickOnElement(vistaPremiumRadioButton);
    }

    public void selectSoftwareByTotalCommander() {
        log.info("Clicking on SoftwareByTotalCommander " + softwareByTotalCommanderButton.toString());
        clickOnElement(softwareByTotalCommanderButton);

    }


    public String getPrice() {
        log.info("Get Total  " + priceText.toString());
        String message = getTextFromElement(priceText);
        return message;
    }


    public void clickOnAddToCart() {
        log.info("Clicking on update Button " + addToCartButton.toString());
        clickOnElement(addToCartButton);

    }


    public String getTextProductBeenAddedToYourCart() {
        log.info("Get Success Modified Message  " + productBeenAddedToYourCartText.toString());
        String message = getTextFromElement(productBeenAddedToYourCartText);
        return message;
    }


    public void clickOnCloseMessage() {
        log.info("Clicking on close button " + closeMessage.toString());
        clickOnElement(closeMessage);

    }

    public void mouseHoverShoppingCart() {
        log.info("mouseHover on shopping cart " + shoppingCartMouse.toString());
        mouseHoverToElement(shoppingCartMouse);
    }


    public void clickOnGoToCart() {
        log.info("Clicking on go to cart " + goToCartButton.toString());
        clickOnElement(goToCartButton);

    }


}

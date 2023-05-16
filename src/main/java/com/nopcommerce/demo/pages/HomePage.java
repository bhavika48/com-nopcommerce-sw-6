package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Cell phones")
    WebElement cellPhoneLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickOnComputersMenu() {
        log.info("Clicking on ComputersMenu " + computersLink.toString());
        clickOnElement(computersLink);

    }

    public void clickOnElectronicsMenu() {
        log.info("Clicking on ElectronicsMenu " + electronicsLink.toString());
        clickOnElement(electronicsLink);
    }

    public void mouseHoverOnComputersMenu() {
        log.info("MouseHover on ComputersMenu " + computersLink.toString());
        mouseHoverToElement(computersLink);
    }

    public void clickOnDesktopsSubMenu() {
        log.info("Clicking on DesktopsSubMenu" + desktopsLink.toString());
        clickOnElement(desktopsLink);
    }


    public void mouseHoverOnElectronicsMenu() {
        log.info(" MouseHover On ElectronicsMenu" + electronicsLink.toString());
        mouseHoverToElement(electronicsLink);
    }

    public void mouseHoverAndClickOnCellPhonesMenu() {
        log.info(" MouseHover And Click On CellPhonesMenu" + cellPhoneLink.toString());
        mouseHoverToElementAndClick(cellPhoneLink);

    }


}

package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement descendingProductsOrder;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement ascendingProductsOrder;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktposTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCartButton;


    public String getDesktopsTitle(){
        log.info("Get Desktop Title" + desktposTitle.toString());
      return  getTextFromElement(desktposTitle);
    }

    public void selectProductsByDescendingOrder() {
        //Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(descendingProductsOrder, "Name Z to A");
        log.info("descending order" + descendingProductsOrder.toString());
    }

    public void selectProductsByAscendingOrder() {
        //Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(ascendingProductsOrder, "Name: A to Z");
        log.info("ascending order" + ascendingProductsOrder.toString());
    }

    public ArrayList<String> getProductsNameByDescendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        Collections.reverse(products);
        return products;
    }

    public ArrayList<String> getProductsNameByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        Collections.sort(products);
        return products;
    }

    public ArrayList<String> getProductsNameByOriginalOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        return products;
    }

    public ArrayList<String> getActualProductsNameByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        return products;
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        log.info("Click on build your computer" + buildYourOwnComputer.toString());
    }

    public void clickOnBuildYourOwnComputerAddCart() {
        clickOnElement(addToCartButton);
        log.info("Click on build your computer add to cart" + addToCartButton.toString());
    }


}

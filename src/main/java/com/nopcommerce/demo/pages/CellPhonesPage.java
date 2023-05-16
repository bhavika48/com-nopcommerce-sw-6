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

public class CellPhonesPage extends Utility {


    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement title;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement cellPhonesListView;

    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement nokiaLumia1020Product;


    public String getTitle() {
        log.info("Get title  " + title.toString());
        String message = getTextFromElement(title);
        return message;
    }

    public void checkListViewOfCellPhones() {
       log.info("Clicking on List View Of CellPhones" + cellPhonesListView.toString());
        clickOnElement(cellPhonesListView);

    }


    public void selectproductNameByNokiaLumia1020() {
        log.info("Clicking on NokiaLumia1020 " + nokiaLumia1020Product.toString());
        clickOnElement(nokiaLumia1020Product);

    }

}




package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LiveCasinoPage extends Utility {

    // Declaring constructor to initialize page factory class
    public LiveCasinoPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    // Locating X-path of text to verify the page navigation
    @FindBy(xpath = "//h1[contains(text(),'Try Live Casino - Live Action Dealers & Selection ')]")
    WebElement liveCasinoText;

    // This method will verify the page
    public void verifyUserIsOnLiveCasinoPage(String expected){
        // Assert method is used to verify the page navigation
        Assert.assertEquals(getTextFromElement(liveCasinoText),expected,"Not Navigated to page");
    }

}

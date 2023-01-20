package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OnlineSlotsPage extends Utility {
    public OnlineSlotsPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Slots at Virgin Games')]")
    WebElement pageText;

    public void verifyUserIsOnOnlineSlotsPage(String expected){
        Assert.assertEquals(getTextFromElement(pageText),expected,"Not Navigated to page");
    }
}

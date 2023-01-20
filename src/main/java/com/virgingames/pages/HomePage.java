package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    // CacheLookup annotation is provided by open qa selenium
    @CacheLookup
    @FindBy(xpath = "//label[@data-qa = 'accept-cookie-policy']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement liveCasino;
    // This method will click on manage cookies
    public void manageCookies(){
        clickOnElement(acceptCookies);
    }

    // This method will click on online slots tab
    public void clickOnOnlineSlotsTab(){
        clickOnElement(onlineSlots);
    }

    // This method will click on live casino tab
    public void clickOnLiveCasinoTab(){
        clickOnElement(liveCasino);
    }

}

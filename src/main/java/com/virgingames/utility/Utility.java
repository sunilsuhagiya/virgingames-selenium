package com.virgingames.utility;

import com.virgingames.browserfactory.ManageBrowser;
import org.openqa.selenium.*;


public class Utility extends ManageBrowser {
    /*Utility Class extends to ManageDriver for the driver to finding locators

    /**
     * This method will click on element
     */

    public void clickOnElement(WebElement element) {
        element.click();
    }


    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

}

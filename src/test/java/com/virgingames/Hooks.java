package com.virgingames;

import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends Utility {
    // Make sure @Before is selected for cucumber.api.java
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    // Make sure @After is selected for cucumber.api.java
    @After
    public void tearDown(){
         closeBrowser();
    }
}

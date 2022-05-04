package com.oranghrmlive.demo_opensource.testbase;

import com.oranghrmlive.demo_opensource.propertyreader.PropertyReader;
import com.oranghrmlive.demo_opensource.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}

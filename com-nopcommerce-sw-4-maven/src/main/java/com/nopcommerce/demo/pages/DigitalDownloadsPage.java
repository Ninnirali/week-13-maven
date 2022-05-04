package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {

    By digitalDownloadsPageTitle = By.xpath("//h1[contains(text(),'Digital downloads')]");

    public String getDigitalDownloadsPageTitle(){
        return getTextFromElement(digitalDownloadsPageTitle);
    }

}

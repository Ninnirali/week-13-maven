package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {

    By apparelTitle = By.xpath("//h1[contains(text(),'Apparel')]");

    public String getApparelPageTitle(){
        return getTextFromElement(apparelTitle);

    }


}

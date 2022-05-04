package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By desktopTitle = By.xpath("//h1[contains(text(),'Desktops')]");
    By sortByDropDown = By.id("products-orderby");
    By buildYourOwnComputer = By.xpath("//a[contains(text(),'Build your own computer')]");





    public String getDesktopTitle(){
        return getTextFromElement(desktopTitle);
    }
    public void selectFromDropDownMenu(String visibleText){
        selectByContainsTextFromDropDown(sortByDropDown, visibleText);
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }


}

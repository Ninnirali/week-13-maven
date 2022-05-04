package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {

    By clickLogOutLink = By.xpath("//a[@class='ico-logout']");
    By verifyWelcomeMessage = By.xpath("//h2[text()='Welcome to our store']");

    public void clickLogOutLink(){
        clickOnElement(clickLogOutLink);
    }

    public String verifyWelcomeMessage(){
        return getTextFromElement(verifyWelcomeMessage);
    }
}

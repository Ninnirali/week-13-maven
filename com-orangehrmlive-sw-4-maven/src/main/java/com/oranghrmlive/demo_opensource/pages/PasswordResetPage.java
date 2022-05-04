package com.oranghrmlive.demo_opensource.pages;

import com.oranghrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class PasswordResetPage extends Utility {

    By forgotYourPasswordText = By.xpath("//div[@id='wrapper']/div/div/div[2]/h1");

    public String getForgotPasswordText(){
        return getTextFromElement(forgotYourPasswordText);
    }
}

package com.oranghrmlive.demo_opensource.pages;

import com.oranghrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By userField = By.xpath("//input[@id='txtUsername']");
    By passwordField = By.xpath("//input[@id='txtPassword']");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By forgotYourPasswordLink = By.xpath("//div[@id='forgotPasswordLink']/a");


    public void enterUserNameToUserField(String username){
        sendTextToElement(userField,username);
    }
    public void enterPasswordToPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnForgotYourPasswordLink(){
        clickOnElement(forgotYourPasswordLink);
    }

}

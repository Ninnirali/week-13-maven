package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeBackTextDisplay = By.xpath("//h1[@class='page__heading']");
    By emailTextField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By logInButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By errorMessage = By.xpath("//li[@class='form-error__list-item']");


    public String getWelcomeBackText(){
        return getTextFromElement(welcomeBackTextDisplay);
    }
    public void enterUsernameToEmailField(String username){
        sendTextToElement(emailTextField, username);
    }
    public void enterPasswordToPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLogInButton(){
        clickOnElement(logInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }




}

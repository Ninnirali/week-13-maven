package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerTitle = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationConfirmationText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");


    public String getRegisterTitle(){
        return getTextFromElement(registerTitle);
    }
    public void enterFirstname (String text){
        sendTextToElement(firstName, text);
    }
    public void enterLastname (String text){
        sendTextToElement(lastName, text);
    }
    public void enterEmail (String text){
        sendTextToElement(email, text);
    }
    public void enterPassword (String text){
        sendTextToElement(password, text);
    }
    public void enterConfirmPassword (String text){
        sendTextToElement(confirmPassword, text);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegistrationConfirmationText(String text){
        return getTextFromElement(registrationConfirmationText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}

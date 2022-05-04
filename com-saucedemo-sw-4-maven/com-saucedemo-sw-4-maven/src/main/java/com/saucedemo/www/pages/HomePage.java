package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By logInButton = By.id("login-button");


    public void enterUsernameToUsernameField(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPasswordToPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLogInButton() {
        clickOnElement(logInButton);
    }


}

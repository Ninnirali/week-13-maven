package com.oranghrmlive.demo_opensource.testsuite;

import com.oranghrmlive.demo_opensource.pages.HomePage;
import com.oranghrmlive.demo_opensource.pages.WelcomePage;
import com.oranghrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    WelcomePage welcomePage = new WelcomePage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.enterUserNameToUserField("Admin");
        homePage.enterPasswordToPasswordField("admin123");
        homePage.clickOnLoginButton();
        String expectedText = "Welcome";
        String actualText = welcomePage.getWelcomeText();
        Assert.assertEquals(actualText,expectedText,"You have not Logged in successfully.");
    }

}

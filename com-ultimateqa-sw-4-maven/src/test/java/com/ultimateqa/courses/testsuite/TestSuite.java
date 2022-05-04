package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSignInLink();
        String expectedText = "Welcome Back!";
       String actualText = signInPage.getWelcomeBackText();
        Assert.assertEquals(expectedText, actualText, "You are not on SignIn Page.");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignInLink();
        signInPage.enterUsernameToEmailField("prime123@gmail.com");
        signInPage.enterPasswordToPasswordField("Password123");
        signInPage.clickOnLogInButton();
        String expectedErrorMessage = "Invalid email or password.";
        String actualErrorMessage = signInPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error occurred");
    }
}

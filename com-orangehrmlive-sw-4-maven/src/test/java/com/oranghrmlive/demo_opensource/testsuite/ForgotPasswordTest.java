package com.oranghrmlive.demo_opensource.testsuite;

import com.oranghrmlive.demo_opensource.pages.HomePage;
import com.oranghrmlive.demo_opensource.pages.PasswordResetPage;
import com.oranghrmlive.demo_opensource.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    HomePage homepage = new HomePage();
    PasswordResetPage passwordResetPage = new PasswordResetPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        homepage.clickOnForgotYourPasswordLink();
        String expectedText = "Forgot Your Password?";
        String actualText = passwordResetPage.getForgotPasswordText();
        Assert.assertEquals("You are not on password reset page.",expectedText,actualText );
    }
}

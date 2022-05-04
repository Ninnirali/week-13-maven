package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedResult = "Welcome, Please Sign In!";
        String actualResult = loginPage.getWelcomeText();
        Assert.assertEquals(expectedResult,actualResult,"Not navigate to login page");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("stellabrown@gmail.com");
        loginPage.enterPassword("password123");
        loginPage.clickOnLoginButton();

        String expectedResult = "Log out";
        String actualResult = loginPage.getLogOutText();
        Assert.assertEquals(expectedResult,actualResult,"'Log out' Text is not Displayed");
    }

    @Test
    public void verifyTheErrorMessage()
    {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abc@gmail.com");
        loginPage.enterPassword("Abcd1234");
        loginPage.clickOnLoginButton();

        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualResult = loginPage.getErrorMessage();
        Assert.assertEquals(expectedResult,actualResult,"Error occurred");
    }


}

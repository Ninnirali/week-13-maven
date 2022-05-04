package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedResult = "Register";
        String actualResult = registerPage.getRegisterText();
        Assert.assertEquals(expectedResult, actualResult, "No navigate to 'Register'Page");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.selectFemaleRadioButton();
        registerPage.enterFirsrtName("A");
        registerPage.enterLastName("X");
        registerPage.selectDateOfBirth("1");
        registerPage.selectMonthOfBirth("January");
        registerPage.selectYearOfBirth("2000");
        registerPage.enterEmail("xyz78999@gmail.com");
        registerPage.enterPassword("Abcd123");
        registerPage.enterConfirmPassword("Abcd123");
        registerPage.clickOnRegisterButton();

        String expectedResult = "Your registration completed";
        String actualResult = registrationPage.getRegistrationCompleteText();
        Assert.assertEquals(expectedResult,actualResult,"Can't navigate to registration confirmation page");

    }

}

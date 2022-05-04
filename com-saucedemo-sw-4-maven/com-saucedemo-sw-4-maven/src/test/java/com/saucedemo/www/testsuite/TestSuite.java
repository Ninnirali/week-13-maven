package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.HomePage;
import com.saucedemo.www.pages.ProductsPage;
import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.enterUsernameToUsernameField("standard_user");
        homePage.enterPasswordToPasswordField("secret_sauce");
        homePage.clickOnLogInButton();
        String expectedText = "PRODUCTS";
        String actualText = productsPage.getProductTextDisplay();
        Assert.assertEquals(expectedText,actualText, "You are not on ProductsPage.");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        homePage.enterUsernameToUsernameField("standard_user");
        homePage.enterPasswordToPasswordField("secret_sauce");
        homePage.clickOnLogInButton();
        int expectedResult = 6;
        int actualResult = productsPage.getVerifyProducts();
        Assert.assertEquals(expectedResult,actualResult,"6No.Products are not displayed here.");

    }

}

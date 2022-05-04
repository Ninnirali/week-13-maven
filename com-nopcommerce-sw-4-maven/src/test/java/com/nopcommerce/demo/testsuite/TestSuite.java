package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void testName() {
        homePage.clickOnComputerLink();
        computerPage.clickOnDesktopsLink();
        desktopPage.selectFromDropDownMenu("Price: Low to High");
        // 1.4 Verify the Product will arrange in Descending order.

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //Thread.sleep(2000);
        homePage.clickOnComputerLink();
        computerPage.clickOnDesktopsLink();
        desktopPage.selectFromDropDownMenu("Name: A to Z");
        Thread.sleep(2000);
        desktopPage.clickOnBuildYourOwnComputer();
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(expectedText, actualText, "You are not on Build your own Computer Page.");
        buildYourOwnComputerPage.selectProcessorFromDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRamFromDropDown("5");
        buildYourOwnComputerPage.clickOnHddRadioButton();
        buildYourOwnComputerPage.clickOnOsRadioButton();
        //buildYourOwnComputerPage.clickOnSoftwareMSOffice();
        buildYourOwnComputerPage.clickOnSoftwareTotalCommander();
        Thread.sleep(2000);
        String expectedAmount = "$1,475.00";
        String actualAmount = buildYourOwnComputerPage.getTotalAmountText();
        Assert.assertEquals(expectedAmount, actualAmount, "Amount doesn't match");
        buildYourOwnComputerPage.clickAddToCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputerPage.getAddToCartText();
        Assert.assertEquals(expectedMessage,actualMessage,"Error occurred");
        buildYourOwnComputerPage.clickOnCloseButton();
        buildYourOwnComputerPage.clickAddToCartButton();
        String expectedTitle = "Shopping cart";
        //String actualTitle = shoppingCartPage.getShoppingCartTitleText();
        //Assert.assertEquals(expectedTitle,actualTitle,"Shopping cart text is not displayed.");


    }


}

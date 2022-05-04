package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void verifyClickOnComputer(){
        homePage.clickOnComputerLink();
        String expectedText = "Computers";
        String actualText = computerPage.getComputerTitle();
        Assert.assertEquals(actualText, expectedText, "You are not on Computer Page.");
    }
    @Test
    public void verifyClickOnElectronics(){
        homePage.clickOnElecronicsLink();
        String expectedText = "Electronics";
        String actualText = electronicsPage.getElectronicsPageTitle();
        Assert.assertEquals(actualText,expectedText,"You are not on Electronics Page.");
    }
    @Test
    public void verifyClickOnApparel(){
        homePage.clickOnApparelLink();
        String expectedTest = "Apparel";
        String actualTest = apparelPage.getApparelPageTitle();
        Assert.assertEquals(actualTest,expectedTest,"You are not on Apparel Page.");
    }
    @Test
    public void verifyClickOnDigitalDownloads(){
        homePage.clickOnDigitalDownloadsLink();
        String expectedTest = "Digital downloads";
        String actualTest = digitalDownloadsPage.getDigitalDownloadsPageTitle();
        Assert.assertEquals(actualTest,expectedTest,"You are not on Digital downloads Page.");
    }
    @Test
    public void verifyClickOnBooks(){
        homePage.clickOnBooksLink();
        String expectedText = "Books";
        String actualText = booksPage.getBooksPageTitle();
        Assert.assertEquals(expectedText,actualText,"You are not on Books Page.");
    }
    @Test
    public void verifyClickOnJewelryPage(){
        homePage.clickOnJewelryLink();
        String expectedText = "Jewelry";
        String actualText = jewelryPage.getJewelryPageTitleText();
        Assert.assertEquals(expectedText, actualText, "You are not on Jewelry Page.");
    }
    @Test
    public void verifyClickOnGiftCards(){
        homePage.clickOnGiftCardsLink();
        String expectedText = "Gift Cards";
        String actualText = giftCardsPage.getGiftCardsPageTitle();
        Assert.assertEquals(expectedText,actualText,"You are not on Gift Cards Page.");
    }

}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computerLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By giftCardsLink = By.linkText("Gift Cards");
    By desktopLink = By.linkText("Desktops");
    By cellPhoneDropDownList = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnComputerLink() {
        clickOnElement(computerLink);
    }

    public void clickOnElecronicsLink() {
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink() {
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadsLink() {
        clickOnElement(digitalDownloadsLink);
    }

    public void clickOnBooksLink() {
        clickOnElement(booksLink);
    }

    public void clickOnJewelryLink() {
        clickOnElement(jewelryLink);
    }

    public void clickOnGiftCardsLink() {
        clickOnElement(giftCardsLink);
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
    }

    public void clickOnCellPhoneDropDownLink() {
        clickOnElement(cellPhoneDropDownList);
    }


}

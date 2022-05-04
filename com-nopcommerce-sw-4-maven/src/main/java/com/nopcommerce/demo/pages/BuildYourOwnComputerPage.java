package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputerTitle = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcessorDropDown = By.xpath("//select[@name='product_attribute_1']");
    By selectRamFromDropDown = By.id("product_attribute_2");
    //By selectRamFromDropDown = By.xpath("//select[@name='product_attribute_2']");
    By selectHDD = By.id("product_attribute_3_7");
    //By selectHDD = By.xpath("//label[contains(text(),'400')]");
    By selectOs = By.id("product_attribute_4_9");
    //By selectOs = By.xpath("//label[contains(text(),'Vista Premium')]");
    By selectSoftwareMSOffice = By.id("product_attribute_5_10");
    //By selectSoftwareMSOffice = By.xpath("//label[@for='product_attribute_5_10']");
    By selectSoftwareTotalCommander = By.id("product_attribute_5_12");
    //By selectSoftwareTotalCommander = By.xpath("//label[@for='product_attribute_5_12']");
    By totalAmountText = By.id("price-value-1");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By addToCartText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton = By.xpath("//span[@class='close']");
    By cartButton = By.xpath("//span[@class='cart-label']");
    By addToCartButton1 = By.xpath("//button[contains(text(),'Go to cart')]");

    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerTitle);
    }

    public void selectProcessorFromDropDown(String visibleText) {
        selectByVisibleTextFromDropDown(selectProcessorDropDown, visibleText);
    }

    public void selectRamFromDropDown(String value) {
        selectByValueFromDropDown(selectRamFromDropDown, value);
    }

    public void clickOnHddRadioButton() {
        clickOnElement(selectHDD);
    }

    public void clickOnOsRadioButton() {
        clickOnElement(selectOs);
    }

    public void clickOnSoftwareMSOffice() {
        clickOnElement(selectSoftwareMSOffice);
    }

    public void clickOnSoftwareTotalCommander() {
        clickOnElement(selectSoftwareTotalCommander);
    }

    public String getTotalAmountText() {
        return getTextFromElement(totalAmountText);
    }

    public void clickAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getAddToCartText() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
    }

    public void mouseHoverAndClickOnCart() {
        mouseHoverToElement(cartButton);
        mouseHoverToElementAndClick(addToCartButton1);
    }

}

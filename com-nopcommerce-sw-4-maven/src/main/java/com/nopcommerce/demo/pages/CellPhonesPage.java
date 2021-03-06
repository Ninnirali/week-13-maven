package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

    By getCellPhonePageTitle= By.xpath("//h1[normalize-space()='Cell phones']");
    By clickOnListView =By.xpath("//a[normalize-space()='List']");
    By clickOnNokiaLumia1020= By.xpath("//a[normalize-space()='Nokia Lumia 1020']");
    By verifyNokiaLumia1020Text =By.xpath("//h1[text()='Nokia Lumia 1020']");
    By verifyNokiaLumia1020Price =By.xpath("//span[@id='price-value-20']");
    By cellPhoneQuantity = By.id("product_enteredQuantity_20");
    By clickOnAddToCart =By.id("add-to-cart-button-20");
    By verifyTopMessage =By.xpath("//p[@class='content']");
    By closeTopMessage =By.xpath("//span[@class='close']");
    By shoppingCartLink =By.xpath("//span[text()='Shopping cart']");
    By goCartButton =By.xpath("//button[@class='button-1 cart-button']");

    public String getCellPhonePageTitle(){
        return getTextFromElement(getCellPhonePageTitle);
    }
    public void setClickOnListView(){
        clickOnElement(clickOnListView);
    }
    public void setClickOnNokiaLumia1020(){
        clickOnElement(clickOnNokiaLumia1020);
    }
    public String setVerifyNokiaLumia1020Text(){
        return getTextFromElement(verifyNokiaLumia1020Text);
    }
    public String setVerifyNokiaLumia1020Price(){
        return getTextFromElement(verifyNokiaLumia1020Price);
    }
    public void setCellPhoneQuantity(String value){
        doubleClickAndSendKeysOnElement(cellPhoneQuantity,value);
    }
    public void setClickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
    }
    public String setVerifyTopMessage(){
        return getTextFromElement(verifyTopMessage);
    }
    public void closeTopMessage(){
        clickOnElement(closeTopMessage);
    }
    public void mouseHoverShoppingCart(){
        mouseHoverToElement(shoppingCartLink);
    }
    public void setGoCartButton(){
        mouseHoverToElementAndClick(goCartButton);
    }

}

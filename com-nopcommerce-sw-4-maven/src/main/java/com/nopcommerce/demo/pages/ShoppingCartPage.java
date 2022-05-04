package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ShoppingCartPage extends Utility {

    By shoppingCartTitle = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityUpdate =By.xpath("//input[@class='qty-input']");
    By updateCart  =By.xpath("//button[normalize-space()='Update shopping cart']");
    By verifyValue =By.xpath("//span[@class='product-subtotal']");
    By termsCondition =By.id("termsofservice");
    By checkOutButton =By.id("checkout");
    By checkOutAsGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
//    By verifyQuantiy = By.xpath("//tbody/tr[1]/td[5]/input[1]");
//    By verifyCreditCardText= By.xpath("//span[contains(text(),'Credit Card')]");
//    By verify2ndDayAir = By.xpath("//span[normalize-space()='2nd Day Air']");


    public String getShoppingCartTitleText(){
        return getTextFromElement(shoppingCartTitle);
    }
    public void quantityUpdate(String qty){
        doubleClickAndSendKeysOnElement(quantityUpdate,qty);
    }
    public void updateCart(){
        clickOnElement(updateCart);
    }
    public String getValueOfAmount(){
        return getTextFromElement(verifyValue);
    }
    public void termsCondition(){
        clickOnElement(termsCondition);
    }
    public void checkOutButton(){
        clickOnElement(checkOutButton);
    }
    public void setCheckOutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }
//    public String getQuantityVerify(String value){
//        return getTextFromAttribute(verifyQuantiy, value);
//    }
//    public String setVerifyCreditCardText(){
//        return getTextFromElement(verifyCreditCardText);
//    }
//    public String setVerify2ndDayAir(){
//        return getTextFromElement(verify2ndDayAir);
//    }
}

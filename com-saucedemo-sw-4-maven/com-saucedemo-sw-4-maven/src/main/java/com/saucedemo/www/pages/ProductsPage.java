package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {

    By productTextDisplay = By.xpath("//span[@class='title']");
    By inventoryItems = By.xpath("//div[@class='inventory_item']");


    public String getProductTextDisplay(){
        return getTextFromElement(productTextDisplay);
    }


    public int getVerifyProducts() {
        List<WebElement> itemList = driver.findElements(inventoryItems);
        int actualItemlistSize = itemList.size();
        return actualItemlistSize;

    }


}

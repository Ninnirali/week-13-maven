package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By getComputerTitle = By.xpath("//h1[normalize-space()='Computers']");
    By getGetComputerTab = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers ')]");
//  By getGetDesktopTab = By.xpath("//li//ul[contains(@class,'sublist')]//a[contains(text(),'Desktops ')and @xpath = '1']");
    By desktopsLink = By.xpath("//h2//a[contains(text(),' Desktops ')]");

    public String getComputerTitle() {
        return getTextFromElement(getComputerTitle);
    }

//    public void mouseHoverOnComputerTabToClickOnDesktopTab() {
//        mouseHoverToElement(getGetComputerTab);
//        clickOnElement(getGetDesktopTab);
//    }

    public void mouseHoverOnComputerTab() {
        mouseHoverToElement(getGetComputerTab);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
    }
}

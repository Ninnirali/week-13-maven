package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class SecureAreaPage extends Utility {

    By secureAreaText = By.tagName("h2");


    public String getSecureAreaText(){
        return getTextFromElement(secureAreaText);
    }



}

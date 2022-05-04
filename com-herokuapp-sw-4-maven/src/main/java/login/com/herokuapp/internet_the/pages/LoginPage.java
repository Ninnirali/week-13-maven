package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    By errorMessage1 = By.xpath("//div[contains(text(),'Your username is invalid!')]");
    By errorMessage2 = By.xpath("//div[@id='flash']");

    public void enterUsernameToUsernameField(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPasswordToPasswordField(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessageForInvalidUsername(){
        String actualMsg = getTextFromElement(errorMessage1);
        String realMsg = actualMsg.substring(0,25);
        return realMsg;
    }  public String getErrorMessageForInvalidPassword(){
        String actualMsg = getTextFromElement(errorMessage2);
        String realMsg = actualMsg.substring(0,25);
        return realMsg;
    }

}

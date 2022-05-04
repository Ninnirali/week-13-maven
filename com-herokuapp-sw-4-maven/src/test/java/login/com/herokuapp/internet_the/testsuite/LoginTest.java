package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.pages.SecureAreaPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsernameToUsernameField("tomsmith");
        loginPage.enterPasswordToPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        String actualText = secureAreaPage.getSecureAreaText();
        Assert.assertEquals(expectedText,actualText,"You are not on secure area page.");

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUsernameToUsernameField("tomsmith1");
        loginPage.enterPasswordToPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your username is invalid!";
        String actualMessage = loginPage.getErrorMessageForInvalidUsername();
        Assert.assertEquals(expectedMessage,actualMessage,"error occurred");
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUsernameToUsernameField("tomsmith");
        loginPage.enterPasswordToPasswordField("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedText = "Your password is invalid!";
        String actualText = loginPage.getErrorMessageForInvalidPassword();
        Assert.assertEquals(expectedText,actualText,"error occurred");

    }




}

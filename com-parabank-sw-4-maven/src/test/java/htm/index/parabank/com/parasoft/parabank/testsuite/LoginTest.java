package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.AccountOverviewPage;
import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage=new HomePage();
    AccountOverviewPage accountOverviewPage=new AccountOverviewPage();
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {
        homePage.sendEmailToEmailIdFieldOnHomePage("A1234");
        homePage.sendPasswordOnHomePage("password@1");
        homePage.clickOnLoginLink();
        String actualTitle=homePage.validateAccountOverView();
        String expectedTitle="Accounts Overview";
        Assert.assertEquals(actualTitle,expectedTitle,"Account overview Title Validation");
    }
    @Test
    public void verifyTheErrorMessage() {
        homePage.sendEmailToEmailIdFieldOnHomePage("AAAA");
        homePage.clickOnLoginLink();
        String actualMessage=homePage.validateErrorMessage();
        String expectedMessage="Please enter a username and password.";
        Assert.assertEquals(actualMessage,expectedMessage,"Login Error message Validation");
    }
    @Test
    public void userShouldLogOutSuccessfully() {
        homePage.sendEmailToEmailIdFieldOnHomePage("A1234");
        homePage.sendPasswordOnHomePage("password@1");
        homePage.clickOnLoginLink();
        accountOverviewPage.clickOnLogOutBtn();
        homePage.validateCustomerLoginText();
    }

}

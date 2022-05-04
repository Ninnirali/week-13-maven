package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.SignUpPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homPage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homPage.clickOnRegisterLink();
        String actualText = signUpPage.VerifySignUpText();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals(actualText, expectedText, "Verify SignUp Text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        homPage.clickOnRegisterLink();
        signUpPage.enterFirstName("Alexa");
        signUpPage.enterLastname("Smith");
        signUpPage.enterAddress("13, London road");
        signUpPage.enterCityName("London");
        signUpPage.enterStateName("Greater London");
        signUpPage.enterZipCode("W13EC");
        signUpPage.enterPhoneNumber("07888996756");
        signUpPage.enterSnnNumber("QQ 123456 C");
        signUpPage.enterEmail("ABC1234");
        signUpPage.enterPassword("password@1");
        signUpPage.enterConfirmedPassword("password@1");
        signUpPage.clickOnRegisterButton();
        String actualText=signUpPage.verifyAccountCreatedSuccessfully();
        String expectedText="Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualText,expectedText,"Expected Text can't be found");
    }
}

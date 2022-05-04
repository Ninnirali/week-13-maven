package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By inputFirstName = By.id("BillingNewAddress_FirstName");
    By inputLastName = By.id("BillingNewAddress_LastName");
    By inputEmailAddress = By.id("BillingNewAddress_Email");
    By inputCountyName = By.id("BillingNewAddress_CountryId");
    By inputCityName = By.id("BillingNewAddress_City");
    By inputAddressLineOne = By.id("BillingNewAddress_Address1");
    By inputZipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By inputPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By clickSaveButton = By.xpath("//button[@onclick='Billing.save()']");
    By shippingMethodSelect = By.xpath("//input[@id='shippingoption_1']");
    By clickOnContinueButton = By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
    By selectCreditCardOption = By.id("paymentmethod_1");
    By clickOnCreditCardContinueButton = By.xpath("(//button[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardDropDownList = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By cardCVVCode = By.id("CardCode");
    By cardHolderExpYearDropDown = By.id("ExpireYear");
    By cardHolderExpMonthDropDown = By.id("ExpireMonth");
    By confirmCreditCardButton = By.xpath("//button[@onclick='PaymentInfo.save()']");
    By verifyPaymentMethodIsCreditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyAirShippingMethod = By.xpath("//span[contains(text(),'Next Day Air')]");
    By verifyTotalAmount = By.xpath("//span[contains(text(),'$2,950.00')]");
    By verifyTotalAmount1 = By.xpath("//span[contains(text(),'$698.00')]");
    By clickOnConfirmOrder = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderSuccessfulMessage = By.xpath("//div[@class='page checkout-page order-completed-page']//div/strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnFinalContinueButton = By.xpath("//button[contains(text(),'Continue')]");
    By verifyWelcomeMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By verify2ndDayAirShippingMethod = By.id("shippingoption_2");
    By verify2ndDayAir = By.xpath("//span[normalize-space()='2nd Day Air']");


    public void setInputFirstName(String name) {
        sendTextToElement(inputFirstName, name);
    }

    public void setInputLastName(String name) {
        sendTextToElement(inputLastName, name);
    }

    public void setInputEmailAddress(String name) {
        sendTextToElement(inputEmailAddress, name);
    }

    public void setInputCountyName(String name) {
        sendTextToElement(inputCountyName, name);
    }

    public void setInputCityName(String name) {
        sendTextToElement(inputCityName, name);
    }

    public void setInputAddressLineOne(String name) {
        sendTextToElement(inputAddressLineOne, name);
    }

    public void setInputZipPostalCode(String name) {
        sendTextToElement(inputZipPostalCode, name);
    }

    public void setInputPhoneNumber(String name) {
        sendTextToElement(inputPhoneNumber, name);
    }

    public void clickOnSaveButton() {
        clickOnElement(clickSaveButton);
    }

    public void setShippingMethodNextDay() {
        clickOnElement(shippingMethodSelect);
    }

    public void setClickOnContinueButton() {
        clickOnElement(clickOnContinueButton);
    }

    public void setSelectCreditCardOption() {
        clickOnElement(selectCreditCardOption);
    }

    public void setClickOnCreditCardContinueButton() {
        clickOnElement(clickOnCreditCardContinueButton);
    }

    public void selectCreditCardTypeFromDropDownList(String text) {
        selectByVisibleTextFromDropDown(creditCardDropDownList, text);
    }

    public void setCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    public void setCardNumber(String name) {
        sendTextToElement(cardNumber, name);
    }

    public void setCardCVVCode(String name) {
        sendTextToElement(cardCVVCode, name);
    }

    public void selectExpYearFromDropDown(String text) {
        selectByVisibleTextFromDropDown(cardHolderExpYearDropDown, text);
    }

    public void selectExpDateFromDropDown(String text) {
        selectByVisibleTextFromDropDown(cardHolderExpMonthDropDown, text);
    }

    public void setConfirmCreditCardButton() {
        clickOnElement(confirmCreditCardButton);
    }

    public String verifyPaymentMethodIsCreditCard() {
        return getTextFromElement(verifyPaymentMethodIsCreditCard);
    }

    public String verifyShippingMethodIsNextDayAir() {
        return getTextFromElement(verifyAirShippingMethod);
    }

    public String verifyTotalAmount() {
        return getTextFromElement(verifyTotalAmount);
    }

    public String verifyTotalAmount1() {
        return getTextFromElement(verifyTotalAmount1);
    }

    public void setClickOnConfirmOrder() {
        clickOnElement(clickOnConfirmOrder);
    }

    public String verifyThankYouText() {
        return getTextFromElement(verifyThankYou);
    }

    public String verifyOrderSuccessfulMessage() {
        return getTextFromElement(verifyOrderSuccessfulMessage);
    }

    public void setClickOnFinalContinueButton() {
        clickOnElement(clickOnFinalContinueButton);
    }

    public String verifyWelcomeMessage() {
        return getTextFromElement(verifyWelcomeMessage);
    }

    public String verify2ndDayAirShippingMethod() {
        return getTextFromElement(verify2ndDayAirShippingMethod);
    }

    public String verify2ndDayAir() {
        return getTextFromElement(verify2ndDayAir);
    }


}


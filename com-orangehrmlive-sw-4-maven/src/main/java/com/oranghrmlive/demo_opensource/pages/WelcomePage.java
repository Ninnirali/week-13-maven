package com.oranghrmlive.demo_opensource.pages;

import com.oranghrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {

    By welcomeText = By.id("welcome");


    public String getWelcomeText(){
       String entireText =getTextFromElement(welcomeText);
       String requiredText = entireText.substring(0,7);
       return requiredText;
    }
}

package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class AccountOverviewPage extends Utility {

    By logOut=By.xpath("//div[@id='leftPanel']/ul/li[8]/a");

    public void clickOnLogOutBtn(){
        clickOnElement(logOut);
    }
}

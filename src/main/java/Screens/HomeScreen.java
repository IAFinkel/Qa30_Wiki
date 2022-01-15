package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement accountName;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/menu_overflow_button']")
    MobileElement flowButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement logOutButton;


    public boolean isAccountPresent(){
        should(flowButton,20);
        flowButton.click();
        return accountName.isDisplayed();
    }
    public HomeScreen isAccountPresentAssert(){
        Assert.assertTrue(accountName.isDisplayed());
        return this;
    }

    public HomeScreen logOut(){
        should(flowButton,20);
        flowButton.click();
        logOutButton.click();
        return this;
    }

}

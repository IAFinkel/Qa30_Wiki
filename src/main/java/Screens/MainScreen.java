package Screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen extends BaseScreen {

    public MainScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
    MobileElement dataView;
    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    MobileElement searchButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/menu_overflow_button']")
    MobileElement flowButton;

    public String getDetail() {
        return dataView.getText();

    }

    public SearchScreen clickOnSearchFormMainPage(){
        searchButton.click();
        return new SearchScreen(driver);
    }
    public TultipLoginScreen clickOnFlowBtn(){
        flowButton.click();
        return new TultipLoginScreen(driver);
    }

}

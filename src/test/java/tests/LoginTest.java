package tests;

import Screens.MainScreen;
import config.ConfigWiki;
import model.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ConfigWiki {

    @Test
    public void loginTest(){
        boolean isAccountPresent = new MainScreen(driver)
                .clickOnFlowBtn()
                .clickOnLogWikiBtn()
                .fillLogForm(Auth.builder().username("korona.rona").password("Ww123456!").build())
                .isAccountPresent();
        Assert.assertTrue(isAccountPresent);
    }

    @Test
    public void logOutTest(){
        boolean accountPresent = new MainScreen(driver)
                .clickOnFlowBtn()
                .clickOnLogWikiBtn()
                .fillLogForm(Auth.builder().username("korona.rona").password("Ww123456!").build())
                .logOut()
                .isAccountPresent();

        Assert.assertFalse(accountPresent);//??????

    }
}

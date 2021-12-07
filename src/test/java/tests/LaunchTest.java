package tests;

import Screens.MainScreen;
import config.ConfigWiki;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchTest extends ConfigWiki {

    @Test
    public void launch(){
        String detail = new MainScreen(driver).getDetail();
        Assert.assertEquals(detail,"In the news");
    }

}

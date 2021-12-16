package tests;

import Screens.MainScreen;
import Screens.SearchScreen;
import config.ConfigWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchArticle extends ConfigWiki {

    @BeforeMethod
    public void preconditionSearch() {
        new MainScreen(driver).clickOnSearchFormMainPage();
    }

    @Test
    public void searchArticleTest() {
        boolean isLinePresent = new SearchScreen(driver)
                .fillInText("dog").closeBoard().isLinePresent();
        Assert.assertTrue(isLinePresent);
    }
}

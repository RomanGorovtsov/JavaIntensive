package Lesson_12.Tests;

import Lesson_12.Pages.SignInPage;
import Lesson_12.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInAccount extends BaseTest{

    @Test
    public void authorizeToSite() {
        StartPage startPage = new StartPage();
        SignInPage signPage = startPage.clickSignButton();
        signPage.enterLogin("autotestlogin@mail.ru");
        signPage.enterPassword("autotestPassword123");
        signPage.clickLoginButton();
        boolean isUserLoggedIn = startPage.IsUserLoggedIn();
        Assert.assertTrue(isUserLoggedIn);
    }
}

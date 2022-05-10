package Lesson_12.Tests;

import Lesson_12.Pages.SignInPage;
import Lesson_12.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithInvalidPassword extends BaseTest {

    @Test
    public void autoriseWhitBadPassword(){
        StartPage startPage = new StartPage();
        startPage.clickSignButton();
        SignInPage signInPage = new SignInPage();
        signInPage.enterLogin("autotestlogin@mail.ru");
        signInPage.enterPassword("f2345678");
        signInPage.clickLoginButton();
        signInPage.checkTheBadPassword();
        boolean isErrorAppear = signInPage.checkTheBadPassword();
        Assert.assertTrue(isErrorAppear);
    }
}

package Lesson_14.Tests;

import Lesson_14.Pages.Main_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhoneIconIsDisplayedCheck extends BaseTest_14 {

    @Test
    public void isPhoneIconDisplay() {
        Main_Page mainPage = new Main_Page();
        Assert.assertTrue(mainPage.checkThatPhoneIconIsDisplayed());
    }
}

package Lesson_14.Tests;

import Lesson_14.Pages.Main_Page;
import Lesson_14.Pages.PricingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchOnPricingPageTest extends BaseTest_14 {

    @Test
    public void isPricingPageDisplayed() {
        Main_Page mainPage = new Main_Page();
        mainPage.switchOnPricingPage();
        PricingPage pricingPage = new PricingPage();
        Assert.assertTrue(pricingPage.isPricingHeaderIconDisplayed());
    }
}

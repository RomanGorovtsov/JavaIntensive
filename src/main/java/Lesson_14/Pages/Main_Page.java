package Lesson_14.Pages;

import Lesson_12.DriverProvider;
import Lesson_14.DriverProvider;
import org.openqa.selenium.By;
import Lesson_12.Waiters.Wait;
import org.openqa.selenium.support.ui.Wait;


public class Main_Page {
    private static final By PHONE_ICON_LOCATOR = By.xpath("//div[@class=\"Header-module--botlineInside--Hb7XB\"]");
    private static final By PRICING_BUTTON_ICON_LOCATOR = By.xpath("//div[@class=\"Header-module--navigation--rLyZT\"]//a[@href=\"/pricing\"]");

    public boolean checkThatPhoneIconIsDisplayed() {
        Wait.forPresent(PHONE_ICON_LOCATOR);
        return DriverProvider.driver.findElement(PHONE_ICON_LOCATOR).isDisplayed();
    }

    public void switchOnPricingPage() {
        Wait.forPresent(PRICING_BUTTON_ICON_LOCATOR);
        DriverProvider.driver.findElement(PRICING_BUTTON_ICON_LOCATOR).click();
    }

}

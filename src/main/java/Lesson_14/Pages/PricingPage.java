package Lesson_14.Pages;

import Lesson_12.DriverProvider;
import Lesson_12.Waiters.Wait;
import org.openqa.selenium.By;

public class PricingPage {

    private static final By PRICING_HEADER_ICON_LOCATOR = By.xpath("//div[@class=\"Header-module--navigation--rLyZT\"]//a[@href=\"/pricing\"]");

    public boolean isPricingHeaderIconDisplayed() {
        Wait.forPresent(PRICING_HEADER_ICON_LOCATOR);
        return DriverProvider.driver.findElement(PRICING_HEADER_ICON_LOCATOR).isDisplayed();
    }
}

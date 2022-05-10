package Lesson_12.Pages;

import Lesson_12.DriverProvider;
import Lesson_12.Waiters.Wait;
import org.openqa.selenium.By;

public class SignInPage {

    public static final By EMAIL_LOCATOR = By.xpath("//div//input[@type='email']");
    public static final By PASSWORD_LOCATOR = By.xpath("//div//input[@type='password']");
    public static final By LOGIN_BUTTON_LOCATOR = By.xpath("//div//button");
    public static final By BAD_PASSWORD_FIELD_LOCATOR = By.xpath("//div[@aria-live='assertive']");

    public void enterLogin(String login) {
        Wait.forPresent(EMAIL_LOCATOR);
        DriverProvider.driver.findElement(EMAIL_LOCATOR).sendKeys(login);
    }

    public void enterPassword(String password) {
        Wait.forPresent(PASSWORD_LOCATOR);
        DriverProvider.driver.findElement(PASSWORD_LOCATOR).sendKeys(password);
    }

    public void clickLoginButton() {
        Wait.forPresent(LOGIN_BUTTON_LOCATOR);
        DriverProvider.driver.findElement(LOGIN_BUTTON_LOCATOR).click();
    }

    public boolean checkTheBadPassword() {
        Wait.forPresent(BAD_PASSWORD_FIELD_LOCATOR);
        return  DriverProvider.driver.findElement(BAD_PASSWORD_FIELD_LOCATOR).isDisplayed();
    }
}

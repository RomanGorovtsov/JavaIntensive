package Lesson_12.Pages;

import Lesson_12.DriverProvider;
import Lesson_12.Waiters.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage {

    public static final By SIGN_BUTTON_LOCATOR = By.xpath("//header//div//a[@id='idcta-link']");
    public static final By YOUR_ACCOUNT_FIELD = By.xpath("//span[@id='idcta-username']");

    public SignInPage clickSignButton() {
        Wait.forPresent(SIGN_BUTTON_LOCATOR);
        DriverProvider.driver.findElement(SIGN_BUTTON_LOCATOR).click();
        return new SignInPage();
    }

    public boolean IsUserLoggedIn(){
        Wait.forPresent(YOUR_ACCOUNT_FIELD);
        String currentText = DriverProvider.driver.findElement(YOUR_ACCOUNT_FIELD).getText();
        return currentText.equals("Your account");
    }
}

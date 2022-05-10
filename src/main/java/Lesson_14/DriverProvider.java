package Lesson_14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverProvider {
    public static WebDriver driver = new ChromeDriver();

    public static void initBrowser() {
        if (driver == null) ;
    }

    public static void destroy() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    public static void loadApplication(String URL) {
        driver.get(URL);
        driver.manage().window().maximize();
    }
}
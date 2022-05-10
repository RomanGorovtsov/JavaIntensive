package Lesson_14.Tests;

import Lesson_12.DriverProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest_14 {

    @BeforeMethod
    public static void setup() {
        DriverProvider.initBrowser();
        DriverProvider.loadApplication("https://andersenlab.com/");
    }

    @AfterMethod
    public static void teardown() {
        DriverProvider.destroy();
    }
}
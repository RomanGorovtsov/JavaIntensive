package Lesson_12.Tests;

import Lesson_12.DriverProvider;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeMethod
    public static void setup() {
        DriverProvider.initBrowser();
        DriverProvider.loadApplication("https://www.bbc.com");
    }

    @AfterMethod
    public static void teardown() {
        DriverProvider.destroy();
    }
}


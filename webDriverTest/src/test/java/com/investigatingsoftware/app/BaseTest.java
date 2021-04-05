package com.investigatingsoftware.app;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Map;


public class BaseTest {
    WebDriver driver;
    String baseUrl;

    @Parameters({"defaultBaseURL", "driverPath"})
    @BeforeMethod
    public void openWebDriver(String defaultBaseURL, String driverPath) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        Map<String, String> env = System.getenv();
        if (env.containsKey("BASE_URL")) {            
            baseUrl = env.get("BASE_URL");
        } else {
            baseUrl = defaultBaseURL;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}

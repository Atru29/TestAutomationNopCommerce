package com.nopcommerce.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks extends Base {
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT));

    }


    @After
    public void tearDown() {
        if (driver != null) {
           // driver.quit();
        }
    }
    public WebDriver getDriver() {
        return driver;

    }
}

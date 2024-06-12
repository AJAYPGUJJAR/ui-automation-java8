package com.apsg.uitests.stepdefs;

import com.apsg.uitests.utils.WebdriverSelector;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new WebdriverSelector().selectWebDriver();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}

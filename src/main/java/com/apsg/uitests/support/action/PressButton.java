package com.apsg.uitests.support.action;

import com.apsg.uitests.stepdefs.StepDefinitions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class PressButton {

    public PressButton(String key) {
        new Actions(StepDefinitions.driver).sendKeys(Keys.valueOf(key.toUpperCase())).perform();
    }

}

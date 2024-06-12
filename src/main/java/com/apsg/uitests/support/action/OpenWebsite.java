package com.apsg.uitests.support.action;

import com.apsg.uitests.stepdefs.StepDefinitions;

public class OpenWebsite {

    public OpenWebsite(String url) {
        StepDefinitions.driver.navigate().to(url);
    }

}

package com.apsg.uitests.stepdefs.steps;

import com.apsg.uitests.support.action.OpenWebsite;
import io.cucumber.java.en.Given;

public class GivenSteps {

    @Given("I open the url {string}")
    @Given("I open the site {string}")
    public void iOpenTheUrl(String url) {
        new OpenWebsite(url);
    }

}

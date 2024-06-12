package com.apsg.uitests.stepdefs.steps;

import com.apsg.uitests.support.check.CheckTitle;
import io.cucumber.java.en.Then;

public class ThenSteps {

    @Then("I expect that the title is {string}")
    public void iExpectThatTheTitleIs(String value) {
        new CheckTitle(value);
    }

}

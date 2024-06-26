package com.apsg.uitests.stepdefs.steps;

import com.apsg.uitests.support.action.PressButton;
import com.apsg.uitests.support.action.SetInputField;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WhenSteps {

    @When("I add {string} to the inputfield {string}")
    public void iAddToTheInputfield(String value, String selector) {
        new SetInputField().addInput(value, selector);
    }

    @When("I set {string} to the inputfield {string}")
    public void iSetToTheInputfield(String value, String selector) {
        new SetInputField().setInput(value, selector);
    }

    @And("I press {string}")
    public void iPress(String key) {
        new PressButton(key);
    }

}

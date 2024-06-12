# UI Test Automation Framework
###### _Inspired By WebdriverIO [Boilerplate](https://github.com/webdriverio/cucumber-boilerplate) Project_

***

## Tech Stack Required

- Java 8
- Maven
- Selenium 4.13.0
- Cucumber
- Chrome Browser Driver
- IDE - IntelliJ or Eclipse

## Quick Start


## How to write a test

Tests are written in [Gherkin syntax](https://cucumber.io/docs/gherkin/)
that means that you write down what's supposed to happen in a real language. All test files are located in
`./src/test/resources/features*` and have the file ending `.feature`. You will already find some test files in that
directory. They should demonstrate, how tests could look like. Just create a new file and write your first
test.

__sample.feature__
```gherkin
Feature:
    In order to keep my product stable
    As a developer or product manager
    I want to make sure that everything works as expected

Scenario: Check title of website after search
    Given I open the url "http://google.com"
    When I set "WebdriverIO" to the inputfield "#lst-ib"
    And I press "Enter"
    Then I expect that the title is "WebdriverIO - Google Search"

Scenario: Another test
    Given 

```

This test opens the browser and navigates them to google.com to check if the title contains the search
query after doing a search. As you can see, it is pretty simple and understandable for everyone.

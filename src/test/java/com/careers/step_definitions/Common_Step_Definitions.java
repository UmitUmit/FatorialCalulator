package com.careers.step_definitions;

import com.careers.utility.ConfigurationReader;
import com.careers.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Common_Step_Definitions {

    @Given("the user is on calculator page")
    public void the_user_is_on_calculator_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

}

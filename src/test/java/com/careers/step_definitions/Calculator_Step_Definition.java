package com.careers.step_definitions;

import com.careers.pages.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calculator_Step_Definition {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("the user enter the {int}")
    public void the_user_enter_the(int number) {

        calculatorPage.enterTheNumber(number);
    }

    @When("the user click the calculator button")
    public void the_user_click_the_calculator_button() {

        calculatorPage.click();
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String string) {

        Assert.assertEquals(string, calculatorPage.getResult());
    }


    @Then("the user should see error message")
    public void the_user_should_see_error_message() {

        Assert.assertEquals("Please enter an integer", calculatorPage.getErrorMessage());

    }

}

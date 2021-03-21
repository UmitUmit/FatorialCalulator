package com.careers.step_definitions;

import com.careers.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before()
    public void setUp(Scenario scenario) {
        System.out.println("scenario = " + scenario.getSourceTagNames());
        System.out.println("scenario = " + scenario.getName());

    }


    @After()
    public void tearDown(Scenario scenario) {
        System.out.println("Reporting with @After method from Hooks class");
        //I want to take screenshot when current scenario fails.
        //scenario.isFailed() --> tels if the scenario failed or not.
        if (scenario.isFailed()) {

            //this is for taking screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("Closing driver with After method");
        Driver.closeDriver();
    }
}
package com.careers.pages;

import com.careers.utilities.BrowserUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage {

    @FindBy(id = "number")
    private WebElement inputBox;

    @FindBy(xpath = "//p//button[@id='getFactorial']")
    private WebElement calculateBotton;

    @FindBy(id = "resultDiv")
    private WebElement calculateResult;


    public void enterTheNumber(int number) {
        inputBox.sendKeys("" + number);
    }

    public void click() {
        BrowserUtility.waitForVisibility(calculateBotton);
        calculateBotton.click();
    }

    public String getResult() {
        BrowserUtility.waitForVisibility(calculateResult);
        String resultTest = calculateResult.getText();

        int index = resultTest.indexOf(':');

        return resultTest.substring(index + 2);
    }

    public String getErrorMessage() {
        BrowserUtility.waitForVisibility(calculateResult);
        return calculateResult.getText();
    }


}

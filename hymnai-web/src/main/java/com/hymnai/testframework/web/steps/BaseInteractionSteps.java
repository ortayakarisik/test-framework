package com.hymnai.testframework.web.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseInteractionSteps extends UIInteractionSteps {

    @Step("Enter term {0}")
    public void enterTerm(By inputField, String term) {
        element(inputField).clear();
        element(inputField).type(term);
    }

    @Step("Click button")
    public void clickButton(By button) {
        waitForClickable(button);
        element(button).click();
    }

    @Step("Click element")
    public void clickElement(By element) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element(element)).click().build().perform();
    }

    @Step("Click element")
    public void clickElementTriggerJS(By element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click()", element(element));
    }

    @Step("Check element is exist")
    public boolean isElementExist(By element) {
        return element(element).isPresent();
    }

    private void waitForClickable(By by) {
        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.elementToBeClickable(by));
    }


}

package com.hymnai.testframework.web.stepdefinitions;

import com.hymnai.testframework.web.elements.LoginPageElements;
import com.hymnai.testframework.web.steps.BaseInteractionSteps;
import com.hymnai.testframework.web.steps.BaseSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    BaseSteps baseSteps;

    @Steps
    BaseInteractionSteps baseInteractionSteps;

    @Given("^(?:.*) is on the login page")
    public void onTheLoginPage() {
        baseSteps.goLoginPage();
    }

    @When("^s?he enter email field in login page for \"(.*)\"")
    public void enterEmail(String email) {
        baseInteractionSteps.enterTerm(LoginPageElements.EMAIL_FIELD, email);
    }

    @When("enter password field in login page for \"(.*)\"")
    public void enterPassword(String password) {
        baseInteractionSteps.enterTerm(LoginPageElements.PASSWORD_FIELD, password);
    }

    @When("click the login button")
    public void clickLogin() {
        baseInteractionSteps.clickButton(LoginPageElements.LOGIN_BUTTON);
    }

}

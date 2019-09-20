package com.hymnai.testframework.web.stepdefinitions;

import com.hymnai.testframework.web.elements.RegisterPageElements;
import com.hymnai.testframework.web.steps.BaseInteractionSteps;
import com.hymnai.testframework.web.steps.BaseSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinitions {

    @Steps
    BaseSteps baseSteps;

    @Steps
    BaseInteractionSteps baseInteractionSteps;

    @Given("^(?:.*) is on the register page")
    public void onTheRegisterPage() {
        baseSteps.goRegisterPage();
    }

    @When("^s?he enter name field in register page for \"(.*)\"")
    public void enterName(String name) {
        baseInteractionSteps.enterTerm(RegisterPageElements.NAME_FIELD, name);
    }

    @When("email field in register page for \"(.*)\"")
    public void enterEmail(String email) {
        if (email.equals("generate random email")) {
            final String randomUserEmail = "no-such-user" + Math.random() + "@no-such-domain.com";
            baseInteractionSteps.enterTerm(RegisterPageElements.EMAIL_FIELD, randomUserEmail);
        } else {
            baseInteractionSteps.enterTerm(RegisterPageElements.EMAIL_FIELD, email);
        }
    }

    @When("enter password field in register page for \"(.*)\"")
    public void enterPassword(String password) {
        baseInteractionSteps.enterTerm(RegisterPageElements.PASSWORD_FIELD, password);
    }

    @When("click the privacy check box")
    public void clickPrivacyCheckBox() {
        baseInteractionSteps.clickElement(RegisterPageElements.PRIVACY_CHECK_BOX);
    }

    @When("click the register button")
    public void clickRegister() {
        baseInteractionSteps.clickButton(RegisterPageElements.REGISTER_BUTTON);
    }

}

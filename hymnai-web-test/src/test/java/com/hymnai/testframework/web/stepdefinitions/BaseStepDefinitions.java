package com.hymnai.testframework.web.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import com.hymnai.testframework.web.elements.HomePageElements;
import com.hymnai.testframework.web.pages.HomePage;
import com.hymnai.testframework.web.pages.LoginPage;
import com.hymnai.testframework.web.pages.RegisterPage;
import com.hymnai.testframework.web.steps.BaseInteractionSteps;
import com.hymnai.testframework.web.steps.BaseSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BaseStepDefinitions {

    @Steps
    BaseSteps baseSteps;

    @Steps
    BaseInteractionSteps baseInteractionSteps;

    @Then("^s?he logged in")
    public void loggedIn() {
        assertThat(baseInteractionSteps.isElementExist(HomePageElements.LOGGED_IN_USER_AVATAR));
    }

    @Then("should be on the home page")
    public void shouldBeOnTheHomePage() {
        assertThat(baseSteps.checkCurrentPage(HomePage.class));
    }

    @Then("^s?he stay on the login page")
    public void shouldBeOnTheLoginPage() {
        assertThat(baseSteps.checkCurrentPage(LoginPage.class));
    }

    @Then("^s?he stay on the register page")
    public void shouldBeOnTheRegisterPage() {
        assertThat(baseSteps.checkCurrentPage(RegisterPage.class));
    }

}

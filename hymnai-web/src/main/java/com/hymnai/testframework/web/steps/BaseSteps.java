package com.hymnai.testframework.web.steps;

import com.hymnai.testframework.web.pages.HomePage;
import com.hymnai.testframework.web.pages.LoginPage;
import com.hymnai.testframework.web.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps  extends ScenarioSteps {

    HomePage homePage;
    RegisterPage registerPage;
    LoginPage loginPage;

    @Step("Open home page")
    public void goHomePage() {
        homePage.open();
    }

    @Step("Open register page")
    public void goRegisterPage() {
        registerPage.open();
    }

    @Step("Open login page")
    public void goLoginPage() {
        loginPage.open();
    }

    @Step("Check current page")
    public boolean checkCurrentPage(Class clazz) {
        return getPages().isCurrentPageAt(clazz);
    }

}

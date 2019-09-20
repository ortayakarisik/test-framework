package com.hymnai.testframework.web.elements;

import org.openqa.selenium.By;

public class LoginPageElements {

    public static final By EMAIL_FIELD = By
            .xpath("/html/body/app-root/app-login/div[2]/div[2]/div/mat-card/mat-card-content/div/form/p[1]/"
                    + "mat-form-field/div/div[1]/div[3]/input");
    public static final By PASSWORD_FIELD = By
            .xpath("/html/body/app-root/app-login/div[2]/div[2]/div/mat-card/mat-card-content/div/form/p[2]"
                    + "/mat-form-field/div/div[1]/div[3]/input");
    public static final By LOGIN_BUTTON = By
            .xpath("/html/body/app-root/app-login/div[2]/div[2]/div/mat-card/mat-card-actions/div/button[1]");
}

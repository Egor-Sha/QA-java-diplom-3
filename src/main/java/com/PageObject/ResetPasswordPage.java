package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class ResetPasswordPage {

        public static final String URL = "https://stellarburgers.nomoreparties.site/reset-password";

        @FindBy(how = How.LINK_TEXT,using = "Войти")
        public SelenideElement toLoginButton;

        public LoginPage clickToLogin() {
                toLoginButton.click();
                return page(LoginPage.class);}
}

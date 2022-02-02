package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

        public static final String URL = "https://stellarburgers.nomoreparties.site/login";

        @FindBy(how = How.NAME,using = "name")
        public SelenideElement userEmailField;

        public LoginPage inputEmail(String email) {
                userEmailField.shouldBe(enabled).setValue(email);return this;}

        @FindBy(how = How.NAME,using = "Пароль")
        public SelenideElement userPasswordField;

        public LoginPage inputPassword(String password) {
                userPasswordField.shouldBe(visible).setValue(password);return this;}

        @FindBy(how = How.XPATH,using = "//button[text()='Войти']")
        public SelenideElement loginButton;

        public MainPage clickLoginButton() {
                loginButton.shouldBe(visible).click();
                return page(MainPage.class);}

        public boolean isLoginButtonAvailable() {
                return loginButton.shouldBe(visible).getText().contains("Войти");}

}

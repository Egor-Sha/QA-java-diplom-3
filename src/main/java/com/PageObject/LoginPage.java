package com.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {     //https://stellarburgers.nomoreparties.site/login

        public static final String URL = "https://stellarburgers.nomoreparties.site/login";

        @FindBy(how = How.CLASS_NAME,using = "Auth_link__1fOlj")
        public SelenideElement registerButton;

        public RegisterPage clickRegisterButton() {
                registerButton.click();
                return page(RegisterPage.class) ;
        }


        @FindBy(how = How.XPATH,using = "/html/body/div[1]/div/main/div/form/fieldset[1]/div/div/input")
        public SelenideElement userEmailField;

        public LoginPage enterEmail(String email) {
                userEmailField.should(enabled).shouldBe(visible).setValue(email);return this;}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/form/fieldset[2]/div/div/input")
        public SelenideElement userPasswordField;

        public LoginPage enterPassword(String password) {
                userPasswordField.shouldBe(visible).setValue(password);return this;}

        @FindBy(how = How.XPATH,using = "//button")
        public SelenideElement LoginButton;  // создать заказ

        public MainPage clickLoginButton() {
                LoginButton.shouldBe(visible).click();
                return page(MainPage.class) ;
        }


}

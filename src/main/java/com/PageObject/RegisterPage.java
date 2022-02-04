package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class RegisterPage {

        public static final String URL = "https://stellarburgers.nomoreparties.site/register";

        @FindBy(how = How.XPATH, using = "//input[@type='text']")
        public SelenideElement userNameField;

        @FindBy(how = How.XPATH,using = "//fieldset[2]/div/div/input")
        public SelenideElement userEmailField;

        @FindBy(how = How.XPATH,using = "//input[@type='password']")
        public SelenideElement userPasswordField;

        @FindBy(how = How.TAG_NAME,using = "button")
        public SelenideElement registerButton;

        @FindBy(how = How.XPATH,using = "//p[text()='Некорректный пароль']")
        public SelenideElement incorrectPasswordMessage;

        @FindBy(how = How.CSS,using = "a[href='/login']")
        public SelenideElement toLoginButton;


        public RegisterPage setCustomerName(String name) {
                userNameField.setValue(name);return this;}

        public RegisterPage setCustomerEmail(String email) {
                userEmailField.setValue(email);return this;}

        public RegisterPage setCustomerPassword(String password) {
                userPasswordField.setValue(password);return this;}

        public LoginPage clickConfirmButton() {
                registerButton.click();
                return page(LoginPage.class);}

        public RegisterPage clickConfirmButtonSamePage() {
                registerButton.click();
                return page(RegisterPage.class);}

        public boolean isPasswordIncorrect() {
                return incorrectPasswordMessage.shouldBe(visible).getText().contains("Некорректный пароль");}

        public LoginPage clickToLoginButton() {
                toLoginButton.click();
                return page(LoginPage.class);}
}

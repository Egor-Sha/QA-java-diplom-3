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

        public RegisterPage setCustomerName(String name) {
                userNameField.setValue(name);return this;}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/form/fieldset[2]/div/div/input")
        public SelenideElement userEmailField;

        public RegisterPage setCustomerEmail(String email) {
                userEmailField.setValue(email);return this;}

        @FindBy(how = How.XPATH,using = "//input[@type='password']")
        public SelenideElement userPasswordField;

        public RegisterPage setCustomerPassword(String password) {
                userPasswordField.setValue(password);return this;}

        @FindBy(how = How.TAG_NAME,using = "button")
        public SelenideElement registerButton;

        public LoginPage clickConfirmButton() {
                registerButton.click();
                return page(LoginPage.class);}

        public RegisterPage clickConfirmButtonSamePage() {
                registerButton.click();
                return page(RegisterPage.class);}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/form/fieldset[3]/div/p")
        public SelenideElement incorrectPasswordMessage;

        public boolean isPasswordIncorrect() {
                return incorrectPasswordMessage.shouldBe(visible).getText().contains("Некорректный пароль");}

        @FindBy(how = How.CSS,using = "a[href='/login']")
        public SelenideElement toLoginButton;

        public LoginPage clickToLoginButton() {
                toLoginButton.click();
                return page(LoginPage.class);}
}

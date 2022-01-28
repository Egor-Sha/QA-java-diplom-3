package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class RegisterPage {     //https://stellarburgers.nomoreparties.site/register

        public static final String URL = "https://qa-scooter.praktikum-services.ru/";

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

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/form/button")
        public SelenideElement RegisterButton;  // создать заказ

        public LoginPage clickConfirmButton() {
                RegisterButton.click();
                return page(LoginPage.class);
        }

        public RegisterPage clickConfirmButtonSamePage() {
                RegisterButton.click();
                return page(RegisterPage.class);
        }

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/form/fieldset[3]/div/p")
        public SelenideElement IncorrectPasswordMessage; // сообщение о создании заказа

        public boolean isPasswordIncorrect() {
                return IncorrectPasswordMessage.shouldBe(visible).getText().contains("Некорректный пароль");}

}

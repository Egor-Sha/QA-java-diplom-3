package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

        public static final String URL = "https://stellarburgers.nomoreparties.site/";

        @FindBy(how = How.XPATH,using = "//button[text()='Оформить заказ']")
        public SelenideElement PersonalAccount;

        @FindBy(how = How.CSS,using = "a[href='/account']")
        public SelenideElement accountButton;

        @FindBy(how = How.XPATH,using = "//button[text()='Войти в аккаунт']")
        public SelenideElement loginAccountButton;

        @FindBy(how = How.XPATH,using = "//span[text()='Булки']")
        public SelenideElement bunButton;

        @FindBy(how = How.XPATH,using = "//span[text()='Соусы']")
        public SelenideElement sauceButton;

        @FindBy(how = How.XPATH,using = "//span[text()='Начинки']")
        public SelenideElement fillingButton;

        @FindBy(how = How.XPATH,using = "//div[@class='tab_tab_type_current__2BEPc'>span]")
        public SelenideElement currentSection;


        public boolean isUserLogin() {
                return PersonalAccount.shouldBe(enabled).getText().contains("Оформить заказ");}

        public AccountPage clickAccountButton() {
                accountButton.click();
                return page(AccountPage.class);}

        public LoginPage clickAccountButtonToLogin() {
                accountButton.click();
                return page(LoginPage.class);}

        public LoginPage clickLoginAccountButtonToLogin() {
                loginAccountButton.click();
                return page(LoginPage.class);}

        public MainPage clickBunButton() {
                bunButton.shouldBe(enabled).doubleClick();return this;}

        public boolean isBunActive() {
                return currentSection.getText().contains("Булки");}

        public MainPage clickSauceButton() {
                sauceButton.shouldBe(enabled).click();return this;}

        public boolean isSauceActive() {
                return currentSection.getText().contains("Соусы");}

        public MainPage clickFillingButton() {
                fillingButton.shouldBe(enabled).doubleClick();
                return this;}

        public boolean isFillingActive() {
                return currentSection.getText().contains("Начинки");}

}

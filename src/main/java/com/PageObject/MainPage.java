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

        public boolean isUserLogin() {
                return PersonalAccount.shouldBe(enabled).getText().contains("Оформить заказ");}

        @FindBy(how = How.CSS,using = "a[href='/account']")
        public SelenideElement accountButton;

        public AccountPage clickAccountButton() {
                accountButton.click();
                return page(AccountPage.class);}

        public LoginPage clickAccountButtonToLogin() {          //!!!
                accountButton.click();
                return page(LoginPage.class);}

        @FindBy(how = How.XPATH,using = "//button[text()='Войти в аккаунт']")
        public SelenideElement loginAccountButton;

        public LoginPage clickLoginAccountButtonToLogin() {     //!!!
                loginAccountButton.click();
                return page(LoginPage.class);}



        @FindBy(how = How.CSS,using = "div:nth-child(2)>div:nth-child(1)")
        public SelenideElement bunButton;

        public MainPage clickBunButton() {
                bunButton.shouldBe(enabled).click();return this;}


        @FindBy(how = How.CSS,using = "h2:nth-child(1)")
        public SelenideElement bunSection;

        public boolean isBunActive() {
                return bunSection.shouldBe(visible).isDisplayed();}




        @FindBy(how = How.CSS,using = "div:nth-child(2)>div:nth-child(2)")
        public SelenideElement sauceButton;

        public MainPage clickSauceButton() {
                sauceButton.shouldBe(enabled).click();return this;}


        @FindBy(how = How.CSS,using = "h2:nth-child(3)")
        public SelenideElement sauceSection;

        public boolean isSauceActive() {
                return sauceSection.shouldBe(visible).isDisplayed();}



        @FindBy(how = How.CSS,using = "div:nth-child(2)>div:nth-child(3)")
        public SelenideElement fillingButton;

        public MainPage clickFillingButton() {
                fillingButton.shouldBe(enabled).click();return this;}


        @FindBy(how = How.CSS,using = "h2:nth-child(5)")
        public SelenideElement fillingSection;

        public boolean isFillingActive() {
                return fillingSection.shouldBe(visible).isDisplayed();}
}

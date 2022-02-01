package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

        public static final String URL = "https://stellarburgers.nomoreparties.site/";

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[2]/div/button")
        public SelenideElement PersonalAccount;

        public boolean isUserLogin() {
                return PersonalAccount.shouldBe(enabled).getText().contains("Оформить заказ");}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/header/nav/a")
        public SelenideElement accountButton;

        public AccountPage clickAccountButton() {
                accountButton.click();
                return page(AccountPage.class);}

        public LoginPage clickAccountButtonToLogin() {
                accountButton.click();
                return page(LoginPage.class);}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[2]/div/button")
        public SelenideElement loginAccountButton;

        public LoginPage clickLoginAccountButtonToLogin() {
                loginAccountButton.click();
                return page(LoginPage.class);}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[1]/div[1]/div[1]")
        public SelenideElement bunButton;

        public MainPage clickBunButton() {
                bunButton.shouldBe(enabled).click();return this;}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[1]/div[2]/h2[1]")
        public SelenideElement bunSection;

        public boolean isBunActive() {
                return bunSection.shouldBe(visible).isDisplayed();}


        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[1]/div[1]/div[2]")
        public SelenideElement sauceButton;

        public MainPage clickSauceButton() {
                sauceButton.click();return this;}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[1]/div[2]/h2[2]")
        public SelenideElement sauceSection;

        public boolean isSauceActive() {
                return sauceSection.shouldBe(visible).isEnabled();}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[1]/div[1]/div[3]")
        public SelenideElement fillingButton;

        public MainPage clickFillingButton() {
                fillingButton.click();return this;}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/section[1]/div[2]/h2[3]")
        public SelenideElement fillingSection;

        public boolean isFillingActive() {
                return fillingSection.shouldBe(enabled).isDisplayed();}
}

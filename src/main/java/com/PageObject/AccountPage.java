package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class AccountPage {

        public static final String URL = "https://stellarburgers.nomoreparties.site/account/profile";

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/nav/ul/li[3]/button")
        public SelenideElement logoutItem;

        @Step
        public LoginPage clickToLogoutItem() {
                logoutItem.shouldBe(visible).click();
                return page(LoginPage.class);}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/main/div/nav/p")
        public SelenideElement accountDescription;

        @Step
        public boolean isAccountSection() {
                return accountDescription.shouldBe(visible).getText().contains("В этом разделе вы можете изменить свои персональные данные");}


        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/header/nav/ul/li[1]/a")
        public SelenideElement constructorLink;

        @Step
        public MainPage clickToConstructorButton() {
                constructorLink.shouldBe(enabled).click();
                return page(MainPage.class);}

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/header/nav/div/a")
        public SelenideElement logoItem;

        @Step
        public MainPage clickToLogo() {
                logoItem.shouldBe(visible).click();
                return page(MainPage.class);}

}

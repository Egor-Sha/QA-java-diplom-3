package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.visible;

public class MainPage {     //https://stellarburgers.nomoreparties.site/

        public static final String URL = "https://qa-scooter.praktikum-services.ru/";

        @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
        public SelenideElement yandexLogo;

        @FindBy(how = How.XPATH,using = "//html/body/div[1]/div/header/nav/a/p")
        public SelenideElement PersonalAccount; // сообщение о создании заказа

        public boolean isNewUserLogin() {
                return PersonalAccount.shouldBe(visible).getText().contains("Личный Кабинет");}

        /*    @FindBy(how = How.ID,using = "rcc-confirm-button")
    public SelenideElement cookieButton;

    public MainPage clickCookieButton() {
        cookieButton.click();return this;}*/


}

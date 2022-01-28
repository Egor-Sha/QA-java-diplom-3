package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPassPage {       //https://stellarburgers.nomoreparties.site/forgot-password

        public static final String URL = "https://qa-scooter.praktikum-services.ru/";

        @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
        public SelenideElement yandexLogo;
}

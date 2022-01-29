package com;

import com.PageObject.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest extends AppTest {

    String name = RandomStringUtils.randomAlphabetic(8);
    String email = RandomStringUtils.randomAlphabetic(5)+"@"+RandomStringUtils.randomAlphabetic(5)+".ru";
    String pass = RandomStringUtils.randomAlphabetic(6);

    final boolean isLoginButtonAvailable = open(RegisterPage.URL, RegisterPage.class)
            .setCustomerName(name)
            .setCustomerEmail(email)
            .setCustomerPassword(pass)
            .clickConfirmButton()
            .isLoginButtonAvailable();

    @Test
    public void SwitchToAccountTest() {
        final boolean isAccountSection = open(LoginPage.URL, LoginPage.class)
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .clickAccountButton()
                .isAccountSection();

        assertTrue(isAccountSection, "Problem with account details access");
        closeWebDriver();
    }

    @Test
    public void SwitchToMainViaConstructorButtonTest() {
        final boolean isUserLogin = open(LoginPage.URL, LoginPage.class)
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .clickAccountButton()
                .clickToConstructorButton()
                .isUserLogin();

        assertTrue(isUserLogin, "Problem with the link in Constructor button");
        closeWebDriver();
    }

    @Test
    public void SwitchToMainViaLogoButtonTest() {
        final boolean isUserLogin = open(LoginPage.URL, LoginPage.class)
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .clickAccountButton()
                .clickToLogo()
                .isUserLogin();

        assertTrue(isUserLogin, "Problem with the link in Logo");
        closeWebDriver();
    }

}

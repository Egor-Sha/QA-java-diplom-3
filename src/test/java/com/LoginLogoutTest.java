package com;

import com.PageObject.LoginPage;
import com.PageObject.MainPage;
import com.PageObject.RegisterPage;
import com.PageObject.ResetPasswordPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginLogoutTest extends AppTest {

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
    public void RedirectToLoginViaPrivateAccountButtonTest() {

        final boolean isUserLogin = open(MainPage.URL, MainPage.class)
                .clickAccountButtonToLogin()
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .isUserLogin();
        assertTrue(isUserLogin, "Problem with registry");
    }

    @Test
    public void RedirectToLoginViaEnterAccountButtonTest() {

        final boolean isUserLogin = open(MainPage.URL, MainPage.class)
                .clickLoginAccountButtonToLogin()
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .isUserLogin();
        assertTrue(isUserLogin, "Problem with registry");
    }

    @Test
    public void RedirectToLoginViaRegisterPageTest() {

        final boolean isUserLogin = open(RegisterPage.URL, RegisterPage.class)
                .clickToLoginButton()
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .isUserLogin();
        assertTrue(isUserLogin, "Problem with registry");
    }

    @Test
    public void RedirectToLoginViaResetPassPageTest() {

        final boolean isUserLogin = open(ResetPasswordPage.URL, ResetPasswordPage.class)
                .clickToLogin()
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .isUserLogin();
        assertTrue(isUserLogin, "Problem with registry");
    }

    @Test
    public void LogoutButtonTest() {

        final boolean isLoginButtonAvailable = open(LoginPage.URL, LoginPage.class)
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .clickAccountButton()
                .clickToLogoutItem()
                .isLoginButtonAvailable();
        assertTrue(isLoginButtonAvailable, "Problem with logout");
    }
}

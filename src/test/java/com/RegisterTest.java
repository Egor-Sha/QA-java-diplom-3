package com;

import com.PageObject.RegisterPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterTest extends AppTest {

    @Test
    public void PositiveRegisterTest() {

        String name = RandomStringUtils.randomAlphabetic(8);
        String email = RandomStringUtils.randomAlphabetic(5)+"@"+RandomStringUtils.randomAlphabetic(5)+".ru";
        String pass = RandomStringUtils.randomAlphabetic(6);

        final boolean isUserLogin = open(RegisterPage.URL, RegisterPage.class)
                .setCustomerName(name)
                .setCustomerEmail(email)
                .setCustomerPassword(pass)
                .clickConfirmButton()
                .clickRegisterButton()
                .clickToLoginButton()
                .inputEmail(email)
                .inputPassword(pass)
                .clickLoginButton()
                .isUserLogin();

        assertTrue(isUserLogin, "Problem with registry");
        closeWebDriver();
    }

    @Test
    public void NegativeRegisterTest() {

        String pass = RandomStringUtils.randomAlphabetic(3);

        final boolean isPasswordIncorrect = open(RegisterPage.URL, RegisterPage.class)
                .setCustomerPassword(pass)
                .clickConfirmButtonSamePage()
                .isPasswordIncorrect();

        assertTrue(isPasswordIncorrect, "Incorrect registry passed");
        closeWebDriver();
    }
}

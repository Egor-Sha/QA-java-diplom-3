package com;

import com.PageObject.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RedirectTest  extends AppTest {

    @Test
    public void PositiveRegisterTest() {


        String email = "49351sd@yks0247.com";
        String pass = "123456";
        final boolean isNewUserLogin = open(LoginPage.URL, LoginPage.class)
                .clickRegisterButton()
                .setCustomerName("egorr")
                .setCustomerEmail(email)
                .setCustomerPassword(pass)
                .clickConfirmButton()
                .enterEmail(email)
                .enterPassword(pass)
                .clickLoginButton()
                .isNewUserLogin();

        System.out.println("1");
        assertTrue(isNewUserLogin, "hi");
        System.out.println("2");

    }
}

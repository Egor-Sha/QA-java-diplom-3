package com;

import com.PageObject.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterBadTest extends AppTest {

        @Test
        public void NegativeRegisterTest() {

            String email = "dofw0icesowdwh49351sd@yks0247.com";
            String pass = "1234";
            final boolean isPasswordIncorrect = open(LoginPage.URL, LoginPage.class)
                    .clickRegisterButton()
                    .setCustomerName("egorr")
                    .setCustomerEmail(email)
                    .setCustomerPassword(pass)
                    .clickConfirmButtonSamePage()
                    .isPasswordIncorrect();

            System.out.println("1");
            assertTrue(isPasswordIncorrect, "hi");
            System.out.println("2");

        }
    }

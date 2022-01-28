package com;

import com.PageObject.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterGoodTest extends AppTest {

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
    /*extends AppTest {

    @Test   //Test 2-1. Positive business logic test
    public void positiveOrderTestGetOrderNumberSet1() {

        final boolean isOrderCreated = open(MainPage.URL, MainPage.class)
                .clickCookieButton()
                .clickOrderButton1()
                .setCustomerFirstName("Егор")
                .setCustomerLastName("Шалаев")
                .setCustomerAddress("Москва")
                .customerStationOptions()
                .setCustomerStation("Сокол")
                .setCustomerPhoneNumber("84951324567")
                .clickNextButton()
                .setArrivalDateList()
                .setArrivalDate()
                .howManyDaysOptions()
                .clickHowManyDays("сутки")
                .chooseColor1()
                .commentFromCustomer("спасибо!!!")
                .clickConfirmButton()
                .clickFinalButton()
                .isOrderCreated();
    assertTrue(isOrderCreated, "The order was not created");
    }*/

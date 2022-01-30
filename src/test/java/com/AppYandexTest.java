package com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class AppYandexTest {
    @BeforeEach
    public void startUp() {

        System.setProperty("webdriver.Chrome(binary_yandex_driver_file, options=options)", "src/test/resources/yandexdriver.exe");
        System.out.println("Test starts.......");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}


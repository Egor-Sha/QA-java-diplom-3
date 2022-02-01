package com;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class AppYandexTest {
    @BeforeEach
    public void startUp() {
        Configuration.browserSize = "1900x1200";
        System.setProperty("webdriver.Chrome(binary_yandex_driver_file, options=options)", "src/test/resources/yandexdriver.exe");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}


package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AppTest {
    @BeforeEach
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Test starts.......");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}


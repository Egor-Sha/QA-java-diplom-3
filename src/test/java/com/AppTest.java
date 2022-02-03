package com;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AppTest {

    @BeforeEach
    public void startUp() {
        Configuration.browserSize = "1900x1200";
        WebDriverManager.chromedriver().setup();
    }

    @AfterEach
    public void tearDown() {closeWebDriver();    }
}


package com;

import com.PageObject.MainPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConstructorTest {

    @Test
    public void FillingSectionSwitchTest() {

        final boolean isFillingActive = open(MainPage.URL, MainPage.class)
                .clickSauceButton()
                .clickBunButton()
                .clickFillingButton()
                .isFillingActive();
        assertTrue(isFillingActive, "The fault of Filling section switching");
        closeWebDriver();
    }

    @Test
    public void SauceSectionSwitchTest() {

        final boolean isSauceActive = open(MainPage.URL, MainPage.class)
                .clickFillingButton()
                .clickBunButton()
                .clickSauceButton()
                .isSauceActive();
        assertTrue(isSauceActive, "The fault of Sauce section switching");
        closeWebDriver();
    }

        @Test
        public void BunSectionSwitchTest() {

        final boolean isBunActive = open(MainPage.URL, MainPage.class)
                .clickSauceButton()
                .clickFillingButton()
                .clickBunButton()
                .isBunActive();
        assertTrue(isBunActive, "The fault of Bun section switching");
        closeWebDriver();
        }

}

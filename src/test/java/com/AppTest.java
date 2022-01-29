package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {
    @BeforeEach
    public void startUp() {
        WebDriverManager.chromedriver().setup();

        System.out.println("Tests start.......");
    }

}


/*Из этих двух вариантов я бы взял первый — который выше.
На практике этот момент решается немного по другому: надо как-то дать возможность конфигурировать запуск тестов и давать возможность указывать в каком браузере их запустить.
Запускать их и там и там одной командой не очень гибко — это может быть проблемой.
Это выходит за рамки программы и для диплома такого требования нет, но я советую поиграться с этим и попробовать сделать следующее:
Вместо этого:
public static void openInDifferentBrowsers(String browser) {
        if (browser.equals("yandex")){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/yandexdriver.exe");
        } else if(browser.equals("chrome"){
            System.setProperty("selenide.browser", "chrome");
        }
    }
В Before методе:
 0. Убрать параметр
Брать из pom название браузера
Устанавливать драйвер на основании названия из пункта 1
В pom добавить system property variable browser с дефолтным значением chrome
В итоге ты получишь:
не будет дублирования тестов
будет гибкость при запуске тестов
запускать тесты будешь командой mvn clean test -Dbrowser=тут нужный браузер*/
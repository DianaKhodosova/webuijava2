package org.example.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;



public class PageObjectTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new dari(new AdditionalLogger()).decorate(new ChromeDriver());
        driver.get("https://diary.ru/");
        void putTShirtToCartTest () throws InterruptedException {

            new MainPage(driver).clickSingInButton()
                    .login("gagaga1", "12345")
                    .clickTShirtsButton();


        }

    }
}



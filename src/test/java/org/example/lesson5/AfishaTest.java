package org.example.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class AfishaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    private final static String AFISHA_Base_URL = "https://www.afisha.ru/spb/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(AFISHA_Base_URL);
    }

        @Test
        void testTest() {
            WebDriverWait.until()
            driver.findElement(By.xpath("//button[text()='Пушкинская карта']")).click();
            Assertions.assertEquals

            public static ExpectedCondition<Boolean> titleIs(final String title) {
                return new ExpectedCondition<Boolean>() {
                    private String currentTitle = "";
        }

    }


    @AfterEach
    void quitBrowser(){
        driver.quit();
    }
}

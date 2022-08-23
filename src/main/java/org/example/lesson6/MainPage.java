package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {
    @FindBy(xpath = "//a[@href='https://diary.ru/user/login'] ")
    private WebElement signInButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }
}

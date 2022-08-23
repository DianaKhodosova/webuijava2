package org.example.lesson6;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final String emailIdLocator = "loginform-username";

    @FindBy(id = emailIdLocator)
    private WebElement emailField;

    @FindBy(id = "loginform-password")
    private WebElement passwordField;

    @FindBy(id = "login_btn")
    private WebElement signInButton;


    public void login(String login, String password) {
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();

    }
}

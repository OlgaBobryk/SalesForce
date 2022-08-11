package pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesforce() {
        driver.get(Urls.SALES_FORCE_LOGIN);
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.USERNAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();

    }
}

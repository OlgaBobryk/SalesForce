package pages;

import constants.Credentials;
import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.CreateAccountTest;


public class LoginPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());


    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesforce() {
        LOGGER.debug(String.format("Attempt to open URL:%s", Urls.SALES_FORCE_LOGIN));
        driver.get(Urls.SALES_FORCE_LOGIN);
        LOGGER.debug(String.format("Atempt to enter username:%s into the field find %s", Credentials.USERNAME, USERNAME_INPUT));
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Attempt to enter password: %s into the field  find  %s", Credentials.PASSWORD, PASSWORD_INPUT));
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
        LOGGER.debug(String.format("Attempt to click Login button find %s", LOGIN_BUTTON));
        driver.findElement(LOGIN_BUTTON).click();

    }
}

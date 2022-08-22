package pages;

import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());

    private By NEW_BUTTON = By.xpath("//ul[contains(@class, 'branding-actions')]//a[@title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }


    public AccountsPage openAccountsPage() {
        LOGGER.debug(String.format("Page %s is open", Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNT_URL)));
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNT_URL));
        return this;
    }

    public NewAccountModalPage openNewAccountModal() {
        LOGGER.debug(String.format("Attempt to click New button find  %s", NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountModalPage(driver);
    }
}


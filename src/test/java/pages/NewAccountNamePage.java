package pages;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountNamePage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(NewAccountNamePage.class.getName());
    private By NEW_ACCOUNT_NAME = By.xpath("//button[@title='Edit Account Name']//preceding::lightning-formatted-text[@slot='outputField']");


    public NewAccountNamePage(WebDriver driver) {
        super(driver);
    }

    @Step("Expected Account Name")
    public String findAccountName() {
        LOGGER.debug(String.format("Check if AccountName %s is displayed", NEW_ACCOUNT_NAME));
        return driver.findElement(NEW_ACCOUNT_NAME).getText();

    }
}

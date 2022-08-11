package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountNamePage extends BasePage{
    private By NEW_ACCOUNT_NAME = By.xpath("//button[@title='Edit Account Name']//preceding::lightning-formatted-text[@slot='outputField']");


    public NewAccountNamePage(WebDriver driver) {
        super(driver);
    }
    public String findAccountName(){
        return driver.findElement(NEW_ACCOUNT_NAME).getText();

    }
}

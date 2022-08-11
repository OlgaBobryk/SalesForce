package pages;

import elements.DropdownList;
import elements.TextArea;
import elements.TextInput;
import models.NewAccountModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {
    private By ACCOUNT_NAME_INPUT = By.xpath("//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@title='Save']");


    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountNamePage fillInAccountForm(NewAccountModel newAccount) {
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new TextArea(driver, "Description").inputTextArea(newAccount.getDescription());
        new TextArea(driver, "Billing Street").inputTextArea(newAccount.getBillingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingState());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipCode());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextArea(driver, "Shipping Street").inputTextArea(newAccount.getShippingStreet());
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingState());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipCode());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());

        driver.findElement(SAVE_BUTTON).click();

        return new NewAccountNamePage(driver);
    }
}

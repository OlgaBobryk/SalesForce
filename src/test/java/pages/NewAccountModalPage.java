package pages;

import elements.DropdownList;
import elements.TextArea;
import elements.TextInput;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());
    private By ACCOUNT_NAME_INPUT = By.xpath("//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@title='Save']");


    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountNamePage fillInAccountForm(NewAccountModel newAccount) {
        LOGGER.debug(String.format("Enter Account Name %s into Field find %s", newAccount.getAccountName(), ACCOUNT_NAME_INPUT));
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(newAccount.getAccountName());
        LOGGER.debug(String.format("Enter Phone %s", newAccount.getPhone()));
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        LOGGER.debug(String.format("Enter fax %s ", newAccount.getFax()));
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        LOGGER.debug(String.format("Enter website %s", newAccount.getWebsite()));
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        LOGGER.debug(String.format("Select %s", newAccount.getType()));
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        LOGGER.debug(String.format("Enter number of employees %s", newAccount.getEmployees()));
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        LOGGER.debug(String.format("Select %s", newAccount.getIndustry()));
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        LOGGER.debug(String.format("Enter annual revenue %s", newAccount.getAnnualRevenue()));
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        LOGGER.debug(String.format("Enter discription %s", newAccount.getDescription()));
        new TextArea(driver, "Description").inputTextArea(newAccount.getDescription());
        LOGGER.debug(String.format("Enter billing street %s", newAccount.getBillingStreet()));
        new TextArea(driver, "Billing Street").inputTextArea(newAccount.getBillingStreet());
        LOGGER.debug(String.format("Enter billing city %s", newAccount.getBillingCity()));
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        LOGGER.debug(String.format("Enter billing state %s", newAccount.getBillingState()));
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingState());
        LOGGER.debug(String.format("Enter billing zipcode  %s", newAccount.getBillingZipCode()));
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipCode());
        LOGGER.debug(String.format("Enter billing country %s", newAccount.getBillingCountry()));
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        LOGGER.debug(String.format("Enter shipping street %s", newAccount.getShippingStreet()));
        new TextArea(driver, "Shipping Street").inputTextArea(newAccount.getShippingStreet());
        LOGGER.debug(String.format("Enter shipping city %s", newAccount.getShippingCity()));
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        LOGGER.debug(String.format("Enter shipping state %s", newAccount.getShippingState()));
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingState());
        LOGGER.debug(String.format("Enter shipping zipcode %s", newAccount.getShippingZipCode()));
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipCode());
        LOGGER.debug(String.format("Enter shipping country %s", newAccount.getShippingCountry()));
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());

        LOGGER.debug(String.format("Click to Save Button find %s", SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();

        return new NewAccountNamePage(driver);
    }
}

package tests;

import io.qameta.allure.Description;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModalPage;
import pages.NewAccountNamePage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());


    @Test
    @Description("User tries to log in and then to create new account ")
    public void createAccount() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Log in to SalesForce"));
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidDate();
        LOGGER.info(String.format("Page %s initialized", AccountsPage.class.getName()));
        LOGGER.info(String.format("Page %s initialized", NewAccountModel.class.getName()));
        LOGGER.info(String.format("Open  AccountsPage"));
        accountsPage.openAccountsPage();
        LOGGER.info(String.format("Open the New AccoutsPage"));
        accountsPage.openNewAccountModal();
        NewAccountModalPage newAccountModalPage = new NewAccountModalPage(driver);
        LOGGER.info(String.format("Page %s initialized", NewAccountModalPage.class.getName()));
        LOGGER.info(String.format("Enter data in the Form and create New Account"));
        newAccountModalPage.fillInAccountForm(accountModel);
        NewAccountNamePage accountName = new NewAccountNamePage(driver);
        LOGGER.info(String.format("Page %s initialized", NewAccountNamePage.class.getName()));
        LOGGER.info(String.format("Check if actual  Account Name  %s and expected Account Name %s are identical", accountModel.getAccountName(), accountName.findAccountName()));
        Assert.assertEquals(accountModel.getAccountName(), accountName.findAccountName(), "Accountnames are different");

    }
}

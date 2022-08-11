package tests;

import models.NewAccountModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountNamePage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidDate();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);
        NewAccountNamePage accountName = new NewAccountNamePage(driver);
       Assert.assertEquals(accountModel.getAccountName(), accountName.findAccountName(), "Accountnames are different");

    }
}

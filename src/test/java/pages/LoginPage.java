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
        //  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        // byte[] sourceFile = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        // try {
        //     Files.write(Paths.get("src/test/resources/screenshot.png"), sourceFile);

        // }
        // catch (IOException e){
        //     e.printStackTrace();
        // }
        driver.findElement(LOGIN_BUTTON).click();

    }
}

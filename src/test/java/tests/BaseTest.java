package tests;

import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class BaseTest {

    public WebDriver driver;
    public DriverManager driverManager;

    @BeforeSuite
    @Parameters({"browserType"})
    public void setUp(@Optional("chrome") String browser) {
        DriverFactory driverFactory = new DriverFactory();
        DriverType type = null;
        if (browser.equals("chrome")) {
            type = DriverType.CHROME;
        } else if (browser.equals("firefox")) {
            type = DriverType.FIREFOX;

        }
        driverManager = driverFactory.getManager(type);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driver = driverManager.getDriver();

    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}
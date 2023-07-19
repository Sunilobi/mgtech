package ApploginTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import applogin.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationTest {

    private WebDriver driver;
    private login loginInstance;

    @BeforeClass
    public void setUp() {
        // Set up ChromeOptions for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Add the headless argument

        // Initialize ChromeDriver with headless mode
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver(options);

        // Create an instance of the login class
        loginInstance = new login();
        loginInstance.setup(driver);
    }

    @Test(priority = 1)
    public void launchapp() {
        // Test case logic here
    }

    @Test(priority = 2)
    public void VerifyText() {
        // Test case logic here
    }

    @AfterClass
    public void tearDown() {
        loginInstance.teardown();
        driver.quit();
    }
}

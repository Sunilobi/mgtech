package ApploginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import applogin.login;

public class ApplicationTest {

    private WebDriver driver;
    private login login;

    @BeforeMethod
    public void setup() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create ChromeOptions and enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode

        // Create the WebDriver instance using ChromeOptions
        driver = new ChromeDriver(options);
        login = new login(driver);
    }

    @Test(priority = 1)
    public void launchapp() {
        login.setup();
    }

    @Test(priority = 2)
    public void VerifyText() {
        boolean status = login.verify();

        if (status) {
            Assert.assertTrue(true);
            System.out.println("Enter text is displayed");
        } else {
            System.out.println("User needs to enter the text");
            Assert.assertTrue(false);
        }

        login.teardown();
    }

    @AfterMethod
    public void tearDown() {
        // Quit the WebDriver after each test
        driver.quit();
    }
}

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
    public void setup() {
        // Set up ChromeOptions for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Add the headless argument

        // Initialize ChromeDriver with headless mode
        driver = new ChromeDriver(options);
        loginInstance = new login(driver);
    }

    @Test(priority = 1)
    public void launchapp() {
        loginInstance.setup();
    }

    @Test(priority = 2)
    public void VerifyText() {
        boolean status = loginInstance.verify();

        if (status) {
            Assert.assertTrue(true);
            System.out.println("Enter text is displayed");
        } else {
            System.out.println("User needs to enter the text");
            Assert.assertTrue(false);
        }
    }

    @AfterClass
    public void teardown() {
        loginInstance.teardown();
        driver.quit();
    }
}

package ApploginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import applogin.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationTest {

	login loginInstance;

	@Test(priority = 1)
	public void launchapp() {
		// Set up ChromeOptions for headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Add the headless argument

		// Initialize ChromeDriver with headless mode
		WebDriver driver = new ChromeDriver(options);

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
}

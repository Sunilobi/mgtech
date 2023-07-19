package ApploginTest; // Update package name to match the actual package name

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

    private WebDriver driver;

    public login(WebDriver driver) {
        this.driver = driver;
    }

    public void setup() {
        driver.get("https://www.example.com"); // Replace with the URL you want to test
    }

    public boolean verify() {
        // Replace this with the logic to verify the text on the page
        String expectedText = "Expected Text";
        String actualText = driver.findElement(By.tagName("body")).getText();
        return actualText.contains(expectedText);
    }

    // Add the teardown() method if you need it
    public void teardown() {
        // Add the logic to tear down or clean up after the test
        // For example, closing the browser or releasing resources.
    }
}

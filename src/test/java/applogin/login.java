package applogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public WebDriver driver;

    public login(WebDriver driver) {
        this.driver = driver;
    }

    public void setup() {
        driver.get("http://sunil-virtualbox:8050/webapp/");

        WebElement searchbox = driver.findElement(By.xpath("/html/body/form/input[1]"));
        searchbox.sendKeys("Nicky");

        driver.findElement(By.xpath("/html/body/form/input[2]")).click();
    }

    public boolean verify() {
        WebElement msg = driver.findElement(By.xpath("/html/body/p"));
        return msg.isDisplayed();
    }

    public void teardown() {
        driver.quit();
    }
}

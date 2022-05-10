package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Get the URL
        driver.get(baseUrl);
        //Giving implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of page
        String title = driver.getTitle();
        System.out.println("Title of Page = " + title);

        //Get the current the URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL = " + currentUrl);

        //Get the page source
        System.out.println("Page Source = "+driver.getPageSource());

        //Enter email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Patel123@yahoo.com");

        //Enter password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Patel123");

        //closing browser
        driver.close();

    }
}

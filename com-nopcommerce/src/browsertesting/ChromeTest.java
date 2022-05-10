package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of page
        String title = driver.getTitle();
        System.out.println("Title = " + title);//print title

        //Get current URl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL = " + currentUrl);

        //print page source
        String pageSource = driver.getPageSource();
        System.out.println("Page Source = "+pageSource);

        //Find email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Harsh123@Gmail.com");

        //Find password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //Close the browser
        driver.close();

    }
}

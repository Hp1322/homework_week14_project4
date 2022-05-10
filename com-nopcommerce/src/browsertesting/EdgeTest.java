package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Get Url
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title page
        String t = driver.getTitle();
        System.out.println("Title = "+t);

        //Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL = "+currentUrl);

        //Get the page source
        System.out.println("Page source = "+driver.getPageSource());

        //enter email to email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Kan456@ymail.com");

        //enter password to password field
        WebElement pass = driver.findElement(By.name("Password"));
        pass.sendKeys("123456Kan");

        //Closing browser
        driver.close();

    }
}

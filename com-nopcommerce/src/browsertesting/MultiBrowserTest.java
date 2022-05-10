package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter web Browser No. 1 for chrome, 2 for Firefox, 3 for Edge");
        int no = sc.nextInt();

        if (no == 1){
            System.out.println("Thank you for selecting Google chrome");
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);
        } else if (no == 2){
            System.out.println("Thank you for selecting Firefox");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(baseUrl);
        } else if (no == 3){
            System.out.println("Thank you for selecting Microsoft edge");
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get(baseUrl);
        } else {
            System.out.println("Please select from only given web browser numbers");
        }

    }

}

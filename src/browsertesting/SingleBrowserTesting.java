package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.border.TitledBorder;
import java.time.Duration;

public class SingleBrowserTesting
{
    public static void main(String[] args)
    {
        String baseUrl ="http://the-internet.herokuapp.com/login";

        // Launch the Chrome Browser OR Setup Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Selenium the URL into Browser
        driver.get(baseUrl);
        // Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the Title of the page
        String Title= driver.getTitle();
        System.out.println("Print the Page" + Title);
        //Print the Current URl
        System.out.println("Current URL:"+driver.getCurrentUrl());
        //Print the page source
        String pageSource= driver.getPageSource();
        System.out.println("Page Source" +driver.getPageSource());
        // Enter the Username to Username Field
        driver.findElement(By.name("username")).sendKeys("Admin123@gmail.com");
        //Enter the Password to PasswordField
        driver.findElement(By.id("password")).sendKeys("admin123");
        //Close the Browser
        driver.close();

    }
}

package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//no space inbetween path
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//Launch the Url
        driver.manage().window().maximize();//Maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//we give implicite timeto driver
        String title = driver.getTitle();//get the title for
        System.out.println("Page Title: " + title);
        System.out.println("Page Resource: " + driver.getPageSource());
        System.out.println("Current Url:" + driver.getCurrentUrl());
        WebElement usenameField = driver.findElement(By.id("user-name"));
        System.out.println(usenameField);
        usenameField.sendKeys("standard_user");
        // driver.close();//Close the browser
        WebElement passwordField = driver.findElement(By.name("password"));//sending password to password field element
        System.out.println(passwordField);
        passwordField.sendKeys("secret_sauce");
        // String homepageUrl = "https://www.saucedemo.com/inventory.html";
        // driver.navigate().to(homepageUrl);
        driver.close();


    }
}

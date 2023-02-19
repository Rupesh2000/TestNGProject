package TestNG.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerClass.class)
public class ListenerDemo {

    @Test
    public void login()
    {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open Url
        driver.get("https://www.saucedemo.com/");

        //find Username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //find Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //find login button
        driver.findElement(By.id("login-button")).submit();

        //verify webpage title
        Assert.assertEquals(driver.getTitle(),"Swag Labs");

    }

    @Test
    public void testFail()
    {
        System.out.println("Failed Test Cases.");
        Assert.assertTrue(false);
    }

    @Test
    public void testSkipped()
    {
        System.out.println("Skipped Test Cases.");
        throw new SkipException("skip exception thrown.");
    }

}

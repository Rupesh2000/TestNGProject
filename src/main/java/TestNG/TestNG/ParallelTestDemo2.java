package TestNG.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo2 {

    WebDriver driver;

    @Test
    public void verifyLogin() throws InterruptedException
    {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //login-button
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getTitle(),"Swag Labs");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();

    }
}

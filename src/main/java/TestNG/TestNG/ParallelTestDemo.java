package TestNG.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo {

    WebDriver driver;

    @Test
    public void verifyTitle() throws InterruptedException {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        Assert.assertEquals(driver.getTitle(),"Swag Labs");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();

    }

    @Test
    public void verifyLogo()
    {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        //Assert.assertEquals(driver.getTitle(),"Swag Labs");
        WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));

        Assert.assertTrue(logo.isDisplayed());

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();
    }

}

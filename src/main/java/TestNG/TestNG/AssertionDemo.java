package TestNG.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

    @Test
    public void testMethod()
    {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        SoftAssert softVerify = new SoftAssert();

        //Open Url
        driver.get("https://testautomationpractice.blogspot.com/");

        System.out.println("verifying title....");
        String exceptedTitle = "Automation Testing Practice1";
        String actualTitle = driver.getTitle();
        //Assert.assertEquals(exceptedTitle,actualTitle,"Title verification failed");
        softVerify.assertEquals(exceptedTitle,actualTitle,"Title verification failed");

        System.out.println("verifying presence of wikipedia-icon");
        WebElement icon = driver.findElement(By.className("wikipedia-icon"));
        //Assert.assertTrue(icon.isDisplayed());
        softVerify.assertTrue(icon.isDisplayed());

        //Wikipedia search button
        System.out.println("verifying presence of wikipedia-search-button");
        WebElement searchButton = driver.findElement(By.className("wikipedia-search-button"));
        //Assert.assertTrue(icon.isDisplayed());
        softVerify.assertTrue(icon.isDisplayed());

        driver.close();

        //report all failure message
        softVerify.assertAll();

    }
}

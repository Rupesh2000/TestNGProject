package TestNG.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGParameterGoogleSearch {

    @Test
    @Parameters({"keyword"})
    public void googleSearch(String SearchData)
    {
        //launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(SearchData);

        Assert.assertEquals(SearchData, searchBox.getAttribute("value"));

        driver.quit();
    }
}

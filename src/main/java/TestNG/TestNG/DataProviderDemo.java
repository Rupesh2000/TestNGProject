package TestNG.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    // 1. Indian Qutub minar
    // 2. Agra Taj Mahal
    // 3. Hyderabad Charminar

    @DataProvider(name = "SearchDataSet")
    public Object[][] searchData()
    {
        Object[][] searchKeywords = new Object[3][2];
        searchKeywords[0][0] = "India";
        searchKeywords[0][1] = "Qutub Minar";

        searchKeywords[1][0] = "Agra";
        searchKeywords[1][1] = "Taj Mahal";

        searchKeywords[2][0] = "Hyderabad";
        searchKeywords[2][1] = "Charminar";

        return searchKeywords;
    }

    @Test(dataProvider = "SearchDataSet")
    public void TestCaseGoogleSearch(String country, String monument)
    {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get("http://www.google.com");
        WebElement searchbox = driver.findElement(By.name("q"));

        //enter key combination of country and monument
        searchbox.sendKeys(country + " " + monument);

        driver.findElement(By.name("btnk")).submit();

    }
}

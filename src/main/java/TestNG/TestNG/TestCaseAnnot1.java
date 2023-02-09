package TestNG.TestNG;
import org.testng.annotations.*;

public class TestCaseAnnot1 {

    @AfterSuite
    public void afterSuit()
    {
        System.out.println("After Suit..");
    }

    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("Before Suit..");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test..");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test..");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before class...");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class...");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before method...");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method...\n");
    }

    @Test
    public void test1()
    {
        System.out.println("This is test1...");
    }

    @Test
    public void test2()
    {
        System.out.println("This is test2...");
    }
}

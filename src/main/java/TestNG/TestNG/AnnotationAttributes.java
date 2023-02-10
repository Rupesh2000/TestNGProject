package TestNG.TestNG;
import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationAttributes {

    //@Test(description = "This is testcase1.")
    //@Test(priority = 1)
    //@Test(dependsOnMethods = {"testCase2"})
    @Test(enabled = false)
    public void testCase1()
    {
        System.out.println("Mobile Login TestCase.");
    }

    //@Test(description = "This is testcase2.")
    //@Test(priority = 2)
    //@Test(timeOut = 200)
    @Test
    public void testCase2(){

        System.out.println("Web Login TestCase.");
        //Assert.assertTrue(false);
    }

    //@Test(description = "This is testcase3.")
    @Test
    public void testCase3()
    {
        System.out.println("API Login TestCase.");
    }
}

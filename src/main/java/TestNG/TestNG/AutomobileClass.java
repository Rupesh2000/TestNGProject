package TestNG.TestNG;
import org.testng.annotations.*;

public class AutomobileClass {

    @Test
    @Parameters({"AutoMobileName"})
    public void testCase1(String name)
    {
        System.out.println(name);
    }
}

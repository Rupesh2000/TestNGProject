package TestNG.TestNG;

import org.testng.annotations.*;


public class SoftwareClass {

    @Test
    @Parameters({"SoftWareCompanyName"})
    public void testCase1(String name)
    {
        System.out.println(name);
    }
}

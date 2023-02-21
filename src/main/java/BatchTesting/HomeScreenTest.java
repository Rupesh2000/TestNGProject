package BatchTesting;

import org.testng.annotations.Test;

import javax.annotation.Tainted;

public class HomeScreenTest {

//LaunchApplication()
//VerifyTitle()
//VerifyLogo()

    @Test
    public void LaunchApplication()
    {
        System.out.println("Application Launched Passed.");
    }

    @Test
    public void VerifyTitle()
    {
        System.out.println("Verify Title Passed.");
    }

    @Test
    public void VerifyLogo()
    {
        System.out.println("Verify Logo Passed.");
    }

}

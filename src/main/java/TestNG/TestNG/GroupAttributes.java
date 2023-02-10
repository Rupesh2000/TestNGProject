package TestNG.TestNG;
import org.testng.annotations.*;

public class GroupAttributes {
    @Test(groups = "Software Company")
    public void infosys()
    {
        System.out.println("Infosys");
    }

    @Test(groups = "Software Company")
    public void wipro()
    {
        System.out.println("Wipro");
    }

    @Test(groups = "Automobile")
    public void maruti()
    {
        System.out.println("Maruti");
    }

    @Test(groups = "Automobile")
    public void tata()
    {
        System.out.println("Tata");
    }
}

package TestNG.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
       //ITestListener.super.onStart(context);
        System.out.println("On Start method invoked...");
    }

    @Override
    public void onFinish(ITestContext context) {
        //ITestListener.super.onFinish(context);
        System.out.println("On Finish method invoked...");
    }

    //When Test case get failed, this method is called.
    @Override
    public void onTestFailure(ITestResult Result) {
        //ITestListener.super.onTestFailure(result);
        System.out.println("Name of Test Method Failed : " + Result.getTestName());
    }

    //When Test case get Skipped, this method is called.
    @Override
    public void onTestSkipped(ITestResult Result) {
        //ITestListener.super.onTestSkipped(result);
        System.out.println("Name of Test Method skipped : " + Result.getTestName());
    }

    //When Test case get started, this method is called.
    @Override
    public void onTestStart(ITestResult Result) {
        //ITestListener.super.onTestStart(result);
        System.out.println("Name of Test Method started : " + Result.getTestName());
    }

    //When Test case grt passed, this method is called.
    @Override
    public void onTestSuccess(ITestResult Result) {
        //ITestListener.super.onTestSuccess(result);
        System.out.println("Name of Test Method successfully executed : " + Result.getTestName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }
}

package RetryLogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

//counter to keep track of retry attempts
    int counterRetryAttempts = 0;

    //set max limit for retry
    int setMaxLimitForRetry = 3;

    //@Override
    //Method to retry failed test cases
    public boolean retry(ITestResult Result) {
        if(!Result.isSuccess())
        {
            if(counterRetryAttempts < setMaxLimitForRetry)
            {
                counterRetryAttempts++;
                return true;
            }
        }
        return false;
    }
}

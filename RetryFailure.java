package week6.assignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailure implements IRetryAnalyzer
{
	int retryCount = 0;
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		if(retryCount < 3)
		{
			retryCount++;
			return true;
		}
		
		return false;
	}

}

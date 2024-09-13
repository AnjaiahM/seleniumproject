package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser  implements IRetryAnalyzer{

	int min=0;int max=3;
	boolean b=false;
	@Override
	public boolean retry(ITestResult result) {
		while(min<max) {
			min++;
		     return true;
		}
		return false;
	}
	
	
}

package testNGExamples;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzerJavaClsImplement  implements IRetryAnalyzer{

	int retryCount=0;
	int retryMaxCount=3;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if (retryCount<retryMaxCount) {
			retryCount++;
			return true;
			
		}
	
		return false;
	}

}

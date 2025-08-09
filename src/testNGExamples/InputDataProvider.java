package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputDataProvider {

	@DataProvider(parallel = true) //parallel keyword used for parallel execution
	public Object[][] loginData(){
		return new Object[][] {
			{"Admin","dfsfsf32"},
			{"Admin12","admin123"},
			{"Admsds","AdJWKJWJWKJ"},
			{"Admin","admin123"},
			};
	}

}

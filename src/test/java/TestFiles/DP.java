package TestFiles;

import org.testng.annotations.DataProvider;

public class DP {
	
	@DataProvider (name = "data")
	public Object[][] dataProviderMethod1(){
		return new Object[][] {{"https://www.google.co.in/","Selenium"}, 
			{"https://www.google.co.in/", "Maven"}};
	}
}

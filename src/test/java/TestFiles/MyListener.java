package TestFiles;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	
	  public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestFailure(ITestResult arg0) {					
	    	System.out.println("Test Failed name is --- "+arg0.getName());	 	        		
	    }		

	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    public void onTestStart(ITestResult arg0) {					
	    	System.out.println("Test started name is --- "+arg0.getName());	        		
	    }		

	    public void onTestSuccess(ITestResult arg0) {					
	    	System.out.println("Test success name is --- "+arg0.getName());	   	        		
	    }	

}

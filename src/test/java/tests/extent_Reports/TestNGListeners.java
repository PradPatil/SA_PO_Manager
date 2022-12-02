package tests.extent_Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{
	
	@Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				  		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
     		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	  System.out.println("Test Fail"); 	
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("Test Skipped"); 	
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	 System.out.println("Test Pass"); 		
    }	
	
}

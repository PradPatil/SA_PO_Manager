package tests.extent_Reports;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestNGListeners extends Extent_Screenshot implements ITestListener{
	
	ExtentTest test;
	ExtentReports extent = Extent_Report.getReportObject();
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
			
	//@Override		
    public void onFinish(ITestContext context) {					
		extent.flush();    		
    }		
    
    public void onStart(ITestContext context) {					
        // TODO Auto-generated method stub				  		
    }		

   // @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
     		
    }		

   // @Override		
    public void onTestFailure(ITestResult result) {					
        extenttest.get().fail(result.getThrowable());
        WebDriver driver=null;
        String testcasename = result.getMethod().getMethodName();
        try {
            driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
            System.out.println("driver : "+driver);
        } catch (Exception e)
        {
            System.out.println("try error  : "+e.getMessage());
        }
        try {
            //we attached screenshot to report extent
        	extenttest.get().addScreenCaptureFromPath(getscreenshot(testcasename,driver), result.getMethod().getMethodName());
            System.out.println("ScreenShot Captured");
            
        } catch (Exception e) {
            System.out.println("error : "+e.getMessage());
        }
    }		

   // @Override		
    public void onTestSkipped(ITestResult result) {		
    	// ITestListener.super.onTestSkipped(result);
    	 test.log(Status.SKIP, "Test Skipped");		
    	System.out.println("Test Skipped"); 	
    }		

   // @Override		
    public void onTestStart(ITestResult result) {					
        test = extent.createTest(result.getMethod().getMethodName());
        extenttest.set(test);
        System.out.println("Test Start");
    }		

   // @Override		
    public void onTestSuccess(ITestResult result) {					
        test.log(Status.PASS, "Test Pass");		
        System.out.println("Test Pass");
    }	
	
}

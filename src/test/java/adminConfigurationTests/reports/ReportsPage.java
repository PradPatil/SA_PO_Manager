package adminConfigurationTests.reports;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.reportsObjects.ReportsObject;
import resources.Base;
import tests.login.LoginPage;

public class ReportsPage extends Base{
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public ReportsObject repoobj;
	
	@Test (dataProvider="getdata")
	public void ReportGeneration(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		repoobj = new ReportsObject(driver);
		Thread.sleep(1000);
		repoobj.getadminmastertmenu();
		Thread.sleep(2000);
		repoobj.getreportsmenu();
		Thread.sleep(2000);
		Properties prop= getProperties();
		String fromDate=prop.getProperty("fromDate");
		repoobj.getfromdate(fromDate);
		Thread.sleep(2000);
		repoobj.getTodate();
		Thread.sleep(1000);
		repoobj.getuserActiveStatus();
		Thread.sleep(1000);
		repoobj.getsubmitreport();
		Thread.sleep(2000);
		repoobj.getexportToExcel();
		Thread.sleep(2000);
		repoobj.getuserClosedStatus();
		Thread.sleep(1000);
		repoobj.getsubmitreport();
		Thread.sleep(2000);
		repoobj.getexportToExcel();
		Thread.sleep(2000);
		repoobj.getuserCancelledStatus();
		Thread.sleep(1000);
		repoobj.getsubmitreport();
		Thread.sleep(2000);
		repoobj.getexportToExcel();
		Thread.sleep(2000);
		obj.ValidateLogout();
		driver.quit();		
	}
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P50044121@capitaindia.onmicrosoft.com";
        data[0][1]="Welcome^123";
        return data;
	}

}

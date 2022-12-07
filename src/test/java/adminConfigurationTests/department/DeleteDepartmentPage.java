package adminConfigurationTests.department;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.departmentObjects.DeleteDepartmentObject;
import tests.login.LoginPage;

public class DeleteDepartmentPage {

	
	public JavascriptExecutor js;
	public WebDriver driver;
	public DeleteDepartmentObject deptobj;
	public String deptNameText = "";
	
	@Test (dataProvider="getdata")
	public void ViewRequestDisplay(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		deptobj = new DeleteDepartmentObject(driver);
		Thread.sleep(1000);
		deptobj.getadminmastertmenu();
		Thread.sleep(1000);
		deptobj.getdepartmenttmenu();
		Thread.sleep(1000);
		getactivepagination();
		deptobj.getlastrowscroll();
		Thread.sleep(1000);
		deptobj.getdeletedept();	
		Thread.sleep(1000);
		deptobj.getdeptdeleteyes();
		Thread.sleep(1000);
		deptobj.getdisplaymsg();
		Thread.sleep(1000);
		getactivepagination();
		Thread.sleep(2000);
		String deptNameText = deptobj.getdeptname();
		System.out.println("Department Deleted:" +deptNameText);
		deptobj.getSearchDept(deptNameText);
		Thread.sleep(2000);
		obj.ValidateLogout();
		driver.quit();
	}
	
	public void getactivepagination() throws InterruptedException { 
		int paginationsize = driver.findElements(By.cssSelector("#tblHeader_paginate>ul>li>a")).size();
		if(paginationsize!=3)
		{
	   for(int i=1; i<=paginationsize;i++)
  		{
		   String paginationselector = "#tblHeader_paginate>ul>li:nth-child("+i+")>a";
		   driver.findElement(By.cssSelector(paginationselector)).click();
		   Thread.sleep(2000);
  		}
		}
	}
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P50044121@capitaindia.onmicrosoft.com";
        data[0][1]="Welcome^123";
        return data;
	}

}

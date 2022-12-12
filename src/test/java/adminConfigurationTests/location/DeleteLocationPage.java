package adminConfigurationTests.location;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.locationObjects.DeleteLocationObject;
import tests.login.LoginPage;

public class DeleteLocationPage {

	
	public JavascriptExecutor js;
	public WebDriver driver;
	public DeleteLocationObject locobj;
	public String locNameText = "";
	
	@Test (dataProvider="getdata")
	public void deletelocation(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		locobj = new DeleteLocationObject(driver);
		Thread.sleep(1000);
		locobj.getadminmastertmenu();
		Thread.sleep(1000);
		locobj.getlocationmenu();
		Thread.sleep(1000);
		getactivepagination();
		locobj.getlastrowscroll();
		Thread.sleep(1000);
		locobj.getdeleteloc();	
		Thread.sleep(1000);
		locobj.getlocdeleteyes();
		Thread.sleep(1000);
		locobj.getdisplaymsg();
		Thread.sleep(1000);
		getactivepagination();
		Thread.sleep(2000);
		String locNameText = locobj.getlocname();
		System.out.println("Location Deleted:" +locNameText);
		locobj.getSearchLoc(locNameText);
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

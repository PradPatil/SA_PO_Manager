package adminConfigurationTests.vendor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.vendorObjects.DeleteVendorObject;
import tests.login.LoginPage;

public class DeleteVendorPage {

	
	public JavascriptExecutor js;
	public WebDriver driver;
	public DeleteVendorObject vendorobj;
	public String VendorNameText = "";
	
	@Test (dataProvider="getdata")
	public void deleteVendor(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		vendorobj = new DeleteVendorObject(driver);
		Thread.sleep(1000);
		vendorobj.getadminmastertmenu();
		Thread.sleep(1000);
		vendorobj.getvendormenu();
		Thread.sleep(1000);
		getactivepagination();
		vendorobj.getlastrowscroll();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-300)", "");
  		vendorobj.getscrolltolastcolumn();
		Thread.sleep(1000);
		vendorobj.getdeletevendor();	
		Thread.sleep(1000);
		String VendorNameText = vendorobj.getvendorvalue();
		System.out.println("Vendor Deleted:" +VendorNameText);
		vendorobj.getvendordeleteyes();
		Thread.sleep(1000);
		vendorobj.getdisplaymsg();
		Thread.sleep(1000);
		vendorobj.getSearchVendor(VendorNameText);
		Thread.sleep(2000);
		obj.ValidateLogoutforadmin();
		driver.quit();
	}
	
	public void getactivepagination() throws InterruptedException { 
		int paginationsize = driver.findElements(By.cssSelector("#gridVendorMaster_paginate>ul>li>a")).size();
		if(paginationsize!=3)
		{
	   for(int i=1; i<=paginationsize;i++)
  		{
		   String paginationselector = "#gridVendorMaster_paginate>ul>li:nth-child("+i+")>a";
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

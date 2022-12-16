package adminConfigurationTests.vendor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.vendorObjects.EditVendorObject;
import tests.login.LoginPage;

public class EditVendorPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public EditVendorObject vendorobj;
	
	@Test (dataProvider="getdata")
	public void editVendor(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		vendorobj = new EditVendorObject(driver);
		Thread.sleep(1000);
		vendorobj.getadminmastertmenu();
		Thread.sleep(2000);
		vendorobj.getvendormenu();
		Thread.sleep(2000);
		getactivepagination();
		Thread.sleep(2000);
		vendorobj.getlastrowscroll();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(1000);
		vendorobj.getscrolltolastcolumn();
		Thread.sleep(1000);
		vendorobj.geteditvendor();
		Thread.sleep(1000);
		vendorobj.geteditvendorname();
		Thread.sleep(2000);
		vendorobj.geteditvendorcode();
		Thread.sleep(2000);
		vendorobj.geteditvendoraddress();
		Thread.sleep(2000);
		vendorobj.geteditvendorcountry();
		Thread.sleep(2000);
		vendorobj.geteditvendorstate();
		Thread.sleep(2000);
		vendorobj.geteditvendorcity();
		Thread.sleep(2000);
		vendorobj.geteditvendorpostalcode();
		Thread.sleep(2000);
		vendorobj.geteditvendorVATNo();
		Thread.sleep(2000);
		vendorobj.geteditvendorfax();
		Thread.sleep(2000);
		vendorobj.geteditvendorcontactperson();
		Thread.sleep(2000);
		vendorobj.geteditvendorContact();
		Thread.sleep(2000);
		vendorobj.geteditvendorEmailID();
		Thread.sleep(2000);
		vendorobj.geteditvendorActivecheckbox();
		Thread.sleep(2000);
		vendorobj.getsubmitvendor();
		Thread.sleep(1000);
		vendorobj.getdisplaymsg();
		Thread.sleep(1000);
		getactivepagination();
		vendorobj.getlastrowscroll();
		String VendorNameText = vendorobj.getvendorvalue();
		System.out.println("Vendor Edited:" +VendorNameText);
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

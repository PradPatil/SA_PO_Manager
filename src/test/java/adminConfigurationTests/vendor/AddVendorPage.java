package adminConfigurationTests.vendor;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.vendorObjects.AddVendorObject;
import tests.login.LoginPage;
import utils.AllWaitsScript;

public class AddVendorPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public AddVendorObject vendorobj;
	public AllWaitsScript waitobj;
	
	@Test (dataProvider="getdata")
	public void addVendor(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		vendorobj = new AddVendorObject(driver);
		Thread.sleep(1000);	
		/*waitobj = new AllWaitsScript();
		waitobj.elementvisible(vendorobj.getadminmastertmenu());
		vendorobj.getadminmastertmenu().click();*/	
		vendorobj.getadminmastertmenu();
		Thread.sleep(2000);
		vendorobj.getvendormenu();
		Thread.sleep(2000);
		vendorobj.getaddvendoroption();	
		vendorobj.getaddvendorname();
		vendorobj.getaddvendorcode();
		vendorobj.getaddvendoraddress();
		vendorobj.getaddvendorcountry();
		vendorobj.getaddvendorstate();
		vendorobj.getaddvendorcity();
		vendorobj.getaddvendorpostalcode();
		vendorobj.getaddvendorVATNo();
		vendorobj.getaddvendorfax();
		vendorobj.getaddvendorcontactperson();
		vendorobj.getaddvendorContact();
		vendorobj.getaddvendorEmailID();
		vendorobj.getaddvendorActivecheckbox();
		vendorobj.getsubmitvendor();
		Thread.sleep(1000);
		vendorobj.getdisplaymsg();
		getactivepagination();
		Thread.sleep(2000);
		vendorobj.getlastrowscroll();
		Thread.sleep(1000);
		String VendorNameText = vendorobj.getvendorvalue();
		System.out.println("Vendor Added:" +VendorNameText);
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

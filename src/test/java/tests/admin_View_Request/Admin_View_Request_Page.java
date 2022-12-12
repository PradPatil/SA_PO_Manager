package tests.admin_View_Request;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.admin_View_RequestObjects.Admin_View_RequestObject;
import tests.login.LoginPage;

public class Admin_View_Request_Page {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public Admin_View_RequestObject ViewObj;

	@Test (dataProvider="getdata")
	public void AdminViewRequest(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		ViewObj = new Admin_View_RequestObject(driver);
		Thread.sleep(1000);
		ViewObj.getITRequestmenu();
		Thread.sleep(1000);
		ViewObj.getViewRequestmenu();
		Thread.sleep(1000);
		ViewObj.getlastrowscroll();	
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,-200)", "");
	   Thread.sleep(1000);
	    getactivepagination();
		Thread.sleep(1000);
		js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-300)", "");
  		Thread.sleep(2000);
	    ViewObj.getactivetoclosedtab();
		//Thread.sleep(2000);
		 ViewObj.getlastrowscroll();	
		 js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-200)", "");
	    Thread.sleep(1000);
	    getclosedpagination();
		Thread.sleep(1000);
		obj.ValidateLogout();
		driver.quit();	
	}
	
	public void getactivepagination() throws InterruptedException {
		int paginationsize = driver.findElements(By.cssSelector("#tblActive_paginate>ul>li>a")).size();
		if(paginationsize!=3)
		{
	   for(int i=1; i<=paginationsize;i++)
  		{
		   String paginationselector = "#tblActive_paginate>ul>li:nth-child("+i+")>a";
		   driver.findElement(By.cssSelector(paginationselector)).click();
		   Thread.sleep(2000);
  		}
		}
	}
		
	public void getclosedpagination() throws InterruptedException {
		int paginationsize = driver.findElements(By.cssSelector("#tblClose_paginate>ul>li>a")).size();
		if(paginationsize!=3)
		{
	   for(int i=1; i<=paginationsize;i++)
  		{
		   String paginationselector = "#tblClose_paginate>ul>li:nth-child("+i+")>a";
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

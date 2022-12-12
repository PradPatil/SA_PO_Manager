package tests.finance_Approver_Queried_Request;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.finance_Approver_Queried_RequestObjects.Finance_Approver_Queried_RequestObject;
import tests.login.LoginPage;

public class Finance_Approver_Queried_RequestPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestIDtext ="";
	Finance_Approver_Queried_RequestObject obj1;
	
	@Test (dataProvider="getdata")
	public void FinanceApprovalQuery(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		obj1 = new Finance_Approver_Queried_RequestObject(driver);
		obj1.getITRequestmenu();
		Thread.sleep(1000);
		obj1.getViewRequestmenu();
		obj1.getlastrowscroll();
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-200)", "");
		getpagination();
		Thread.sleep(1000);
  	    obj1.getscrolltolastcolumn();
  	    js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");	
	    obj1.getactionclick();
	    Thread.sleep(1000);
	    String requestIDtext = obj1.getReqID();
		System.out.println("Request ID Received is:" +requestIDtext);
		js = (JavascriptExecutor) driver;
	  	js.executeScript("window.scrollBy(0,1050)", "");
	  	Thread.sleep(2000);
	  	obj1.getfinanceapprovaldropdownaction();
	  	obj1.getfinanceremark();
	  	js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		//obj1.getUploadFile();
		//Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(1000);
		obj1.getfinanceapprovalsubmit();
		Thread.sleep(1000);
		 obj1.getsubmitokpopup();
		 Thread.sleep(1000);
		 obj1.getSearchReqID(requestIDtext);
		 Thread.sleep(2000);
		 obj.ValidateLogout();
		 driver.quit();	
	}
	
	public void getpagination() throws InterruptedException {
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
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P20000007@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        return data;
	}


}

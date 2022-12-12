package tests.ITRequestor_ModifyRequests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ITRequestor_ModifyRequestObjects.ITRequestor_ModifyRequestObject;
import tests.login.LoginPage;

public class ITRequestor_Modify_RequestPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestID ="";
	public ITRequestor_ModifyRequestObject ITReqObj;
	
	@Test (dataProvider="getdata")
	public void ITRequestModify(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		ITReqObj = new ITRequestor_ModifyRequestObject(driver);
		Thread.sleep(1000);
		ITReqObj.getITRequestmenu();
		Thread.sleep(1000);
		ITReqObj.getViewRequestmenu();
		Thread.sleep(1000);
		ITReqObj.getlastrowscroll();
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-200)", "");
  		getpagination();
		//int lastRowcount=driver.findElement(By.xpath("//*[@id='tblActive']/tbody")).findElements(By.tagName("tr")).size();
  	    //driver.findElement(By.xpath("//*[@id='tblActive']/tbody/tr["+lastRowcount+"]"));
  	    ITReqObj.getscrolltolastcolumn();
  	    js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");	
	    ITReqObj.getaction();
	    Thread.sleep(1000);
	    String requestIDtext = ITReqObj.getReqID();
		System.out.println("Request ID Received is:" +requestIDtext);
	    js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,600)", "");
  		Thread.sleep(2000);
  		ITReqObj.getqueryresponsedropdownaction();
  		Thread.sleep(1000);
  		ITReqObj.getqueryremark();
  		Thread.sleep(1000);
  		ITReqObj.getSubmit();
  		ITReqObj.getDisplayMsg();
		Thread.sleep(2000);
		ITReqObj.getSearchReqID(requestIDtext);
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
        data[0][0]="P20000001@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        return data;
	}
}

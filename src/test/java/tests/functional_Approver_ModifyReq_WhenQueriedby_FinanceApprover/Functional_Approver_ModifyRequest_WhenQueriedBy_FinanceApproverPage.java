package tests.functional_Approver_ModifyReq_WhenQueriedby_FinanceApprover;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.functional_Approver_ModifyRequest_whenQueried_byFinanceApproverObjects.Functional_Approver_ModifyReq_WhenQueriedBy_FinanceApproverObject;
import tests.login.LoginPage;

public class Functional_Approver_ModifyRequest_WhenQueriedBy_FinanceApproverPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestIDtext ="";
	public Functional_Approver_ModifyReq_WhenQueriedBy_FinanceApproverObject ITReqObj;
	
	@Test (dataProvider="getdata")
	public void ITRequestcreation(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		ITReqObj = new Functional_Approver_ModifyReq_WhenQueriedBy_FinanceApproverObject(driver);
		Thread.sleep(1000);
		ITReqObj.getITRequestmenu();
		Thread.sleep(1000);
		ITReqObj.getViewRequestmenu();
		Thread.sleep(1000);
		ITReqObj.getlastrowscroll();
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-200)", "");
  		getpagination();
  	    ITReqObj.getscrolltolastcolumn();
  	    js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");	
	    ITReqObj.getaction();
		String requestIDtext = ITReqObj.getReqID();
		System.out.println("Request ID Received is:" +requestIDtext);
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,650)", "");
		 ITReqObj.getfunapprovaldropdownaction();
		 ITReqObj.getfunctionalremark();
		 ITReqObj.getUploadFile();
		 Thread.sleep(2000);
		 ITReqObj.getfunctionalapprovalsubmit();
		 ITReqObj.getDisplayMsg();
		 Thread.sleep(1000);
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
        data[0][0]="P20000006@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        return data;
	}

}

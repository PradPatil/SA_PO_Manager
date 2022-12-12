package tests.finance_Approver_ModifyRequest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.finance_Approver_ModifyRequestObjects.Finance_Approver_ModifyRequestObject;
import tests.login.LoginPage;

public class Finance_Approver_ModifyRequestPage {

	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestIDtext ="";
	public Finance_Approver_ModifyRequestObject ITReqObj;
	
	@Test (dataProvider="getdata")
	public void FinanceApprover_ModifyRequest(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		ITReqObj = new Finance_Approver_ModifyRequestObject(driver);
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
	    Thread.sleep(1000);
  		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)", "");
		Thread.sleep(2000);
		ITReqObj.getremark();
		ITReqObj.getReqSave();
		Thread.sleep(1000);
		ITReqObj.getReqSubmit();
		ITReqObj.getClickHere();
		Thread.sleep(1000);
		String requestIDtext = ITReqObj.getReqID();
		System.out.println("Request ID Created is:" +requestIDtext);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");	
		ITReqObj.getCheckPriceCheckbox();
		Thread.sleep(1000);
		ITReqObj.getSubmitQuote();
		Thread.sleep(2000);
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
        data[0][0]="P20000007@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        return data;
	}

}

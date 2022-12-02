package tests.functional_Approver_RequestRejection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.functional_Approver_RequestRejectionObjects.Functional_Approver_Request_RejectionObject;
import tests.login.LoginPage;

public class Functional_Approver_RequestRejectionPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestIDtext ="";
	
	@Test (dataProvider="getdata")
	public void functionalRejection(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		Functional_Approver_Request_RejectionObject obj1 = new Functional_Approver_Request_RejectionObject(driver);
		obj1.getITRequestmenu();
		Thread.sleep(1000);
		obj1.getViewRequestmenu();
		obj1.getlastrowscroll();
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-200)", "");
		getpagination();
  	    obj1.getscrolltolastcolumn();
  	    js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");	
	    obj1.getselectquotationcolumn();
	    Thread.sleep(1000);
	    String requestIDtext = obj1.getReqID();
		System.out.println("Request ID Received is:" +requestIDtext);
	    js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,400)", "");
  		Thread.sleep(2000);
  		obj1.getvendorquotationselection();
  		Thread.sleep(1000);
  		obj1.getvendorquotationremark();
  		obj1.getvendorquotationsubmit();
  		obj1.getsubmitokpopup();
  		WebElement elementH1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[5]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH1);
	    js = (JavascriptExecutor) driver;
	  	js.executeScript("window.scrollBy(0,-200)", "");
	  	obj1.getSearchReqID(requestIDtext);
	  	Thread.sleep(2000);
	  	obj1.getscrolltolastcolumn();
	  	 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 obj1.getGeneratePOdraft();
		 Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		obj1.getViewdraft();
		Thread.sleep(3000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		obj1.getPOClose();
		obj1.getPOSubmit();
		obj1.getsubmitokpopup();
		Thread.sleep(1000);
		obj1.getSearchReqID(requestIDtext);
		Thread.sleep(2000);
		obj1.getscrolltolastcolumn();
		js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    obj1.getactionclick();
	    js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,450)", "");
		 obj1.getfunapprovaldropdownaction();
		 obj1.getfunctionalremark();
		 obj1.getUploadFile();
		 Thread.sleep(2000);
		 obj1.getfunctionalapprovalsubmit();
		 obj1.getsubmitokpopup();
		 Thread.sleep(1000);
		 obj1.getSearchReqID(requestIDtext);
		 Thread.sleep(2000);
		 obj1.getactivetoclosedtab();
		 Thread.sleep(2000);
		 obj1.getSearchReqIDInClosedtab(requestIDtext);
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

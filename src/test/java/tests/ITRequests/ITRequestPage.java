package tests.ITRequests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ITRequestsObjects.ITRequestObject;
import tests.login.LoginPage;
import utils.AllWaitsScript;

public class ITRequestPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestID ="";
	public ITRequestObject ITReqObj;
	public AllWaitsScript waitobj;
	
	@Test (dataProvider="getdata")
	public void ITRequestCreation(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		ITReqObj = new ITRequestObject(driver);
		Thread.sleep(1000);
		//WebElement ITReqElement = ITReqObj.getITRequestmenu();
		//waitobj = new AllWaitsScript();
		//waitobj.elementvisible(ITReqObj.getITRequestmenu());
		ITReqObj.getITRequestmenu();
		Thread.sleep(1000);
		ITReqObj.getNewRequestmenu();
		ITReqObj.getDeliveryLocation();
		Thread.sleep(1000);
		ITReqObj.getRequestType();
		Thread.sleep(1000);
		ITReqObj.getCERNo();
		Thread.sleep(1000);
		//ITReqObj.getDepartment();
		//Thread.sleep(1000);
		ITReqObj.getITRadiobtn();
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		ITReqObj.getAddBtn();
		Thread.sleep(2000);
		ITReqObj.getAsset();
		ITReqObj.getPartCode();
		ITReqObj.getItemDescription();
		ITReqObj.getItemQuantity();
		ITReqObj.getAssetComment();
		ITReqObj.getSubmitBtn();
		Thread.sleep(2000);
		ITReqObj.getsoftAddBtn();
		Thread.sleep(2000);
		ITReqObj.getItemType();
		ITReqObj.getSoftWareName();
		ITReqObj.getSoftWareVersion();
		ITReqObj.getSoftWareQuantity();
		ITReqObj.getSoftWareComment();
		ITReqObj.getSoftWareDescription();
		ITReqObj.getSubscriptionStatus();
		ITReqObj.getSoftWareStartDate();
		Thread.sleep(1000);
		ITReqObj.getSoftWareEndDate();
		Thread.sleep(1000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");	
		Thread.sleep(1000);
		ITReqObj.getSoftwareSubmitBtn();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);
		ITReqObj.getUploadFile();
		Thread.sleep(4000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		ITReqObj.getRemark();
		ITReqObj.getReqSave();
		Thread.sleep(1000);
		ITReqObj.getReqSubmit();
		ITReqObj.getClickHere();
		Thread.sleep(1000);
		//String requestIDtext1 = requestIDreceived();
		String requestIDtext = ITReqObj.getReqID();
		System.out.println("Request ID Created is:" +requestIDtext);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");	
		ITReqObj.getCheckPriceCheckbox();
		Thread.sleep(3000);
		ITReqObj.getAddQuotationBtn();
		Thread.sleep(1000);
		ITReqObj.getVendor1();
		ITReqObj.getPriority();
		ITReqObj.getVendorRemark();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");	
		ITReqObj.getUnitRates();
		ITReqObj.getVATPercentage();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		ITReqObj.getQuoteNo();
		Thread.sleep(1000);
		//ITReqObj.getQuoteCalendarPicker();
		ITReqObj.getQuoteDate();
		ITReqObj.getQuoteValidity();
		ITReqObj.getMSValue();
		ITReqObj.getCurrency();
		ITReqObj.getAdditionalRemark();
		ITReqObj.getComments();
		ITReqObj.getSubTotal();
		ITReqObj.getSLA();
		ITReqObj.getDeliveryCharge();
		ITReqObj.getDeliveryTimeline();
		ITReqObj.getPayment();
		ITReqObj.getWarranty();
		ITReqObj.getSOW();
		ITReqObj.getSoftTab();
		ITReqObj.getTd11();
		ITReqObj.getTd9();
		Thread.sleep(1000);
		ITReqObj.getsoftwareunit();
		Thread.sleep(1000);
		ITReqObj.getVAT();
		Thread.sleep(1000);
		ITReqObj.getscroll();
		Thread.sleep(1000);
		ITReqObj.getQuoteSubmit();
		Thread.sleep(1000);
		ITReqObj.getDisplayMsg();
		Thread.sleep(2000);
		ITReqObj.getSubmitQuote();
		Thread.sleep(2000);
		ITReqObj.getDisplayMsg();
		Thread.sleep(2000);
		ITReqObj.getSearchReqID(requestIDtext);
		Thread.sleep(2000);
		obj.ValidateLogout();
		driver.quit();	
		
	}
	/*public String requestIDreceived()
	{
		ITReqObj = new ITRequestObject(driver);
		String requestIDtext = ITReqObj.getReqID();
		System.out.println("Request ID Created is:" +requestIDtext);
		return requestIDtext;
	}*/
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P20000001@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        return data;
	}

}

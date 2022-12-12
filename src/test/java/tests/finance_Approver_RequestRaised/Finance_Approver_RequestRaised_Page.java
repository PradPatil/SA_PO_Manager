package tests.finance_Approver_RequestRaised;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.finance_Approver_RequestRaisedObjects.Finance_Approver_RaisedRequestObject;
import tests.login.LoginPage;

public class Finance_Approver_RequestRaised_Page {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestIDtext ="";
	public String requestIDtext1 ="";
	
	public Finance_Approver_RaisedRequestObject FinReqObj;
	
	@Test (dataProvider="getdata")
	public void Finance_Approve_RequestRaised(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		FinReqObj = new Finance_Approver_RaisedRequestObject(driver);
		Thread.sleep(1000);
		FinReqObj.getITRequestmenu();
		Thread.sleep(1000);
		FinReqObj.getNewRequestmenu();
		FinReqObj.getDeliveryLocation();
		Thread.sleep(1000);
		FinReqObj.getRequestType();
		Thread.sleep(1000);
		FinReqObj.getCERNo();
		Thread.sleep(1000);
		//FinReqObj.getDepartment();
		//Thread.sleep(1000);
		FinReqObj.getITRadiobtn();
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		FinReqObj.getAddBtn();
		Thread.sleep(2000);
		FinReqObj.getAsset();
		FinReqObj.getPartCode();
		FinReqObj.getItemDescription();
		FinReqObj.getItemQuantity();
		FinReqObj.getAssetComment();
		FinReqObj.getSubmitBtn();
		Thread.sleep(2000);
		FinReqObj.getsoftAddBtn();
		Thread.sleep(2000);
		FinReqObj.getItemType();
		FinReqObj.getSoftWareName();
		FinReqObj.getSoftWareVersion();
		FinReqObj.getSoftWareQuantity();
		FinReqObj.getSoftWareComment();
		FinReqObj.getSoftWareDescription();
		FinReqObj.getSubscriptionStatus();
		FinReqObj.getSoftWareStartDate();
		Thread.sleep(1000);
		FinReqObj.getSoftWareEndDate();
		Thread.sleep(1000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");	
		Thread.sleep(1000);
		FinReqObj.getSoftwareSubmitBtn();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);
		FinReqObj.getUploadFile();
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		FinReqObj.getRemark();
		FinReqObj.getReqSave();
		Thread.sleep(1000);
		FinReqObj.getReqSubmit();
		FinReqObj.getClickHere();
		Thread.sleep(1000);
		String requestIDtext = FinReqObj.getReqID();
		System.out.println("Request ID Created is:" +requestIDtext);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");	
		FinReqObj.getCheckPriceCheckbox();
		Thread.sleep(3000);
		FinReqObj.getAddQuotationBtn();
		Thread.sleep(1000);
		FinReqObj.getVendor1();
		FinReqObj.getPriority();
		FinReqObj.getVendorRemark();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");	
		FinReqObj.getUnitRates();
		FinReqObj.getVATPercentage();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		FinReqObj.getQuoteNo();
		FinReqObj.getQuoteCalendarPicker();
		FinReqObj.getQuoteDate();
		FinReqObj.getQuoteValidity();
		FinReqObj.getMSValue();
		FinReqObj.getCurrency();
		FinReqObj.getAdditionalRemark();
		FinReqObj.getComments();
		FinReqObj.getSubTotal();
		FinReqObj.getSLA();
		FinReqObj.getDeliveryCharge();
		FinReqObj.getDeliveryTimeline();
		FinReqObj.getPayment();
		FinReqObj.getWarranty();
		FinReqObj.getSOW();
		FinReqObj.getSoftTab();
		FinReqObj.getTd11();
		FinReqObj.getTd9();
		Thread.sleep(1000);
		FinReqObj.getsoftwareunit();
		Thread.sleep(1000);
		FinReqObj.getVAT();
		Thread.sleep(1000);
		FinReqObj.getscroll();
		Thread.sleep(1000);
		FinReqObj.getQuoteSubmit();
		Thread.sleep(1000);
		FinReqObj.getDisplayMsg();
		Thread.sleep(2000);
		FinReqObj.getSubmitQuote();
		Thread.sleep(2000);
		FinReqObj.getDisplayMsg();
		Thread.sleep(2000);
		FinReqObj.getSearchReqID(requestIDtext);
		Thread.sleep(2000);
		obj.ValidateLogout();
		driver.quit();	
		
	}
	/*public String requestIDreceived()
	{
		FunReqObj = new FunctionalApprover_RaisedRequestObject(driver);
		String requestIDtext = FunReqObj.getReqID();
		System.out.println("Request ID Created is:" +requestIDtext);
		return requestIDtext;
	}*/
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P20000007@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        return data;
	}

}

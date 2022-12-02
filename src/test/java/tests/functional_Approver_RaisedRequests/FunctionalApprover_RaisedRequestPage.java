package tests.functional_Approver_RaisedRequests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.functionalApprover_RaisedRequestObjects.FunctionalApprover_RaisedRequestObject;
import tests.login.LoginPage;

public class FunctionalApprover_RaisedRequestPage {

	public JavascriptExecutor js;
	public WebDriver driver;
	public String requestIDtext = "";
	public String requestIDtext1 = "";

	public FunctionalApprover_RaisedRequestObject FunReqObj;

	@Test(dataProvider = "getdata")
	public void ITRequestcreation(String username, String password) throws IOException, InterruptedException {
		LoginPage obj = new LoginPage();
		obj.validateLogin(username, password);
		driver = obj.driver;
		FunReqObj = new FunctionalApprover_RaisedRequestObject(driver);
		Thread.sleep(1000);
		FunReqObj.getITRequestmenu();
		Thread.sleep(1000);
		FunReqObj.getNewRequestmenu();
		FunReqObj.getDeliveryLocation();
		Thread.sleep(1000);
		FunReqObj.getRequestType();
		Thread.sleep(1000);
		FunReqObj.getCERNo();
		Thread.sleep(1000);
		//FunReqObj.getDepartment();
		//Thread.sleep(1000);
		FunReqObj.getITRadiobtn();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		FunReqObj.getAddBtn();
		Thread.sleep(2000);
		FunReqObj.getAsset();
		FunReqObj.getPartCode();
		FunReqObj.getItemDescription();
		FunReqObj.getItemQuantity();
		FunReqObj.getAssetComment();
		FunReqObj.getSubmitBtn();
		Thread.sleep(2000);
		FunReqObj.getsoftAddBtn();
		Thread.sleep(2000);
		FunReqObj.getItemType();
		FunReqObj.getSoftWareName();
		FunReqObj.getSoftWareVersion();
		FunReqObj.getSoftWareQuantity();
		FunReqObj.getSoftWareComment();
		FunReqObj.getSoftWareDescription();
		FunReqObj.getSubscriptionStatus();
		FunReqObj.getSoftWareStartDate();
		Thread.sleep(1000);
		FunReqObj.getSoftWareEndDate();
		Thread.sleep(1000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		FunReqObj.getSoftwareSubmitBtn();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		FunReqObj.getUploadFile();
		Thread.sleep(3000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(3000);
		FunReqObj.getRemark();
		FunReqObj.getReqSave();
		Thread.sleep(1000);
		FunReqObj.getReqSubmit();
		FunReqObj.getClickHere();
		Thread.sleep(1000);
		// String requestIDtext1 = requestIDreceived();
		String requestIDtext = FunReqObj.getReqID();
		System.out.println("Request ID Created is:" + requestIDtext);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		FunReqObj.getCheckPriceCheckbox();
		Thread.sleep(3000);
		FunReqObj.getAddQuotationBtn();
		Thread.sleep(1000);
		FunReqObj.getVendor1();
		FunReqObj.getPriority();
		FunReqObj.getVendorRemark();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		FunReqObj.getUnitRates();
		FunReqObj.getVATPercentage();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		FunReqObj.getQuoteNo();
		FunReqObj.getQuoteCalendarPicker();
		FunReqObj.getQuoteDate();
		FunReqObj.getQuoteValidity();
		FunReqObj.getMSValue();
		FunReqObj.getCurrency();
		FunReqObj.getAdditionalRemark();
		FunReqObj.getComments();
		FunReqObj.getSubTotal();
		FunReqObj.getSLA();
		FunReqObj.getDeliveryCharge();
		FunReqObj.getDeliveryTimeline();
		FunReqObj.getPayment();
		FunReqObj.getWarranty();
		FunReqObj.getSOW();
		FunReqObj.getSoftTab();
		FunReqObj.getTd11();
		FunReqObj.getTd9();
		Thread.sleep(1000);
		FunReqObj.getsoftwareunit();
		Thread.sleep(1000);
		FunReqObj.getVAT();
		Thread.sleep(1000);
		FunReqObj.getscroll();
		Thread.sleep(1000);
		FunReqObj.getQuoteSubmit();
		Thread.sleep(1000);
		FunReqObj.getDisplayMsg();
		Thread.sleep(2000);
		FunReqObj.getSubmitQuote();
		Thread.sleep(2000);
		FunReqObj.getDisplayMsg();
		Thread.sleep(2000);
		FunReqObj.getSearchReqID(requestIDtext);
		Thread.sleep(2000);
		// Select Quotation
		/*FunReqObj.getselectquotationcolumn();
		Thread.sleep(1000);
		String requestIDtext1 = FunReqObj.getReqID();
		System.out.println("Request ID Received is:" + requestIDtext1);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		FunReqObj.getvendorquotationselection();
		Thread.sleep(1000);
		FunReqObj.getvendorquotationremark();
		FunReqObj.getvendorquotationsubmit();
		FunReqObj.getsubmitokpopup();
		WebElement elementH1 = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[5]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH1);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-200)", "");
		FunReqObj.getSearchReqID(requestIDtext);
		Thread.sleep(2000);
		FunReqObj.getscrolltolastcolumn();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		FunReqObj.getGeneratePOdraft();
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		FunReqObj.getViewdraft();
		Thread.sleep(3000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		FunReqObj.getPOClose();
		FunReqObj.getPOSubmit();
		FunReqObj.getsubmitokpopup();
		Thread.sleep(1000);
		FunReqObj.getSearchReqID(requestIDtext1);
		Thread.sleep(2000);
		FunReqObj.getscrolltolastcolumn();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		FunReqObj.getactionclick();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		FunReqObj.getfunapprovaldropdownaction();
		FunReqObj.getfunctionalremark();
		FunReqObj.getUploadFile();
		Thread.sleep(2000);
		FunReqObj.getfunctionalapprovalsubmit();
		FunReqObj.getsubmitokpopup();
		Thread.sleep(1000);
		FunReqObj.getSearchReqID(requestIDtext1);
		Thread.sleep(2000); */
		obj.ValidateLogout();
		driver.quit();

	}
	/*
	 * public String requestIDreceived() { FunReqObj = new
	 * FunctionalApprover_RaisedRequestObject(driver); String requestIDtext =
	 * FunReqObj.getReqID(); System.out.println("Request ID Created is:"
	 * +requestIDtext); return requestIDtext; }
	 */

	@DataProvider()
	public Object[][] getdata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "P20000006@capitaindia.onmicrosoft.com";
		data[0][1] = "Capita#2022";
		return data;
	}

}

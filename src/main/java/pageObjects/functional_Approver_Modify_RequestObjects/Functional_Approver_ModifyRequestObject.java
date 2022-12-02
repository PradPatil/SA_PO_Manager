package pageObjects.functional_Approver_Modify_RequestObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Functional_Approver_ModifyRequestObject {

	public WebDriver driver;

	public Functional_Approver_ModifyRequestObject(WebDriver driver) {
		this.driver = driver;
	}

	By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]");
	By ViewRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]/ul/li[3]/a");
	By modifyrequest = By.xpath("//*[@id=\"tblActive\"]/tbody/tr[last()]/td[9]/a");
	By requestID = By.xpath("//*[@id='valRequestId']");
	By Remark = By.id("txtRemarks");
	By requestsave = By.id("btn_save");
	By requestsubmit = By.id("btn_submit");
	By Clickherelink = By.xpath("(//a[text()='click here'])");

	// Code for Quotation Details (Add/Submit Quotations)
	By Pricecheckbox = By.id("Check_Price");
	By SubmitQuotation = By.id("btnSubmitQuotation");
	By Displaymsg = By.id("DisplayMsgbtnOk");
	By Searchinput = By.xpath("//*[@id='tblActive_filter']/label/input");
	By action = By.xpath("//*[@id=\"tblActive\"]/tbody/tr[last()]/td[10]/a/i");
	By actionbuttondropdown = By.id("ddlMyAction");
	By functionalapproverremark = By.id("txtRemarks");
	By uploadfile = By.id("txtUploadFile");
	By submitbutton = By.xpath("//*[@id='viewTable']/table/tbody/tr/td/div[2]/div[2]/div[1]/button");

	public void getITRequestmenu() {
		driver.findElement(ITRequestmenu).click();
	}

	public void getViewRequestmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(ViewRequestmenu)).click().build().perform();
	}

	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}

	public void getscrolltolastcolumn() {
		WebElement lastrowcolumn = driver.findElement(By.xpath("(//*[@id='tblActive']/tbody/tr)[last()]/td[14]/i"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
	}

	public void getaction() {
		driver.findElement(modifyrequest).click();
	}

	public void getremark() {
		driver.findElement(Remark).clear();
		driver.findElement(Remark).sendKeys("Request Modified");
	}

	public void getReqSave() {
		driver.findElement(requestsave).click();
	}

	public void getReqSubmit() {
		driver.findElement(requestsubmit).click();
	}

	public void getClickHere() {
		driver.findElement(Clickherelink).click();
	}

	public String getReqID() {
		String requestIDtext = driver.findElement(requestID).getText();
		return requestIDtext;
	}

	// Code for Quotation Details (Add/Submit Quotations)
	public void getCheckPriceCheckbox() {
		driver.findElement(Pricecheckbox).click();
	}
	public void getSubmitQuote() {
		driver.findElement(SubmitQuotation).click();
	}

	public void getDisplayMsg() {
		driver.findElement(Displaymsg).click();
	}

	public void getSearchReqID(String requestIDtext) {
		driver.findElement(Searchinput).click();
		driver.findElement(Searchinput).sendKeys(requestIDtext);

	}
	public void getactionclick() {
        driver.findElement(action).click();
    }
	
	public void getfunapprovaldropdownaction() {
		Select approvalaction = new Select(driver.findElement(actionbuttondropdown));
		approvalaction.selectByVisibleText("Approved by Functional Approver");
	}
	
	public void getfunctionalremark() {
        driver.findElement(functionalapproverremark).sendKeys("Request Approved by Functional Approver");

    }
	
	public void getUploadFile() {
		driver.findElement(uploadfile).sendKeys("C:\\Users\\P50044121\\Capita_Automation\\Selenium_Projects\\SA_PO_Manager-master\\Documents\\Help Document.pdf");
	}
		
	public void getfunctionalapprovalsubmit() {
		driver.findElement(submitbutton).click();
		}
	

}

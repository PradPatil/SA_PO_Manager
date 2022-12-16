package pageObjects.finance_Approver_Request_RejectionObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Finance_Approver_RequestRejectionObject {

	public WebDriver driver;

	public Finance_Approver_RequestRejectionObject(WebDriver driver) {
		this.driver = driver;
	}

	By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]");
	By ViewRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]/ul/li[3]/a");
	By requestID = By.xpath("//*[@id='valRequestId']");
	By displaymsgokbtn = By.id("DisplayMsgbtnOk");
	By Searchinput = By.xpath("//*[@id='tblActive_filter']/label/input");
	By Actionbutton = By.xpath("//*[@id='tblActive']/tbody/tr[last()]/td[10]/a");
	By actionbuttondropdown = By.id("ddlMyAction");
	By financeapproverremark = By.id("txtRemarks");
	By uploadfile = By.id("txtUploadFile");
	By submitbutton = By.xpath("//*[@id='viewTable']/table/tbody/tr/td/div[2]/div[2]/div[1]/button");
	By Searchinputclosedtab = By.xpath("//*[@id='tblClose_filter']/label/input");
	By activetoclosetabswitch = By
			.xpath("//*[@id='div-to-scroll']/div/div[1]/div[1]/section[2]/div/div/div/ul/li[2]/a");

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
		WebElement lastrowcolumn = driver.findElement(By.xpath("(//*[@id='tblActive']/tbody/tr)[last()]/td[11]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
	}

	public void getactionclick() {
		driver.findElement(Actionbutton).click();
	}

	public String getReqID() {
		String requestIDtext = driver.findElement(requestID).getText();
		return requestIDtext;
	}

	public void getfinanceapprovaldropdownaction() {
		Select approvalaction = new Select(driver.findElement(actionbuttondropdown));
		approvalaction.selectByVisibleText("Rejected by Finance Approver");
	}

	public void getfinanceremark() {
		driver.findElement(financeapproverremark).sendKeys("Request Rejected by Finance Approver");

	}

	// Add attachment section - Choose/Upload File
	public void getUploadFile() {
		String current = System.getProperty("user.dir");
		String filepath = current + "\\Documents\\Help-Document.pdf";
		driver.findElement(uploadfile).sendKeys(filepath);
	}

	public void getfinanceapprovalsubmit() {
		driver.findElement(submitbutton).click();
	}

	public void getsubmitokpopup() {
		driver.findElement(displaymsgokbtn).click();
	}

	public void getSearchReqID(String requestIDtext) {
		driver.findElement(Searchinput).click();
		driver.findElement(Searchinput).sendKeys(requestIDtext);

	}

	public void getactivetoclosedtab() {
		driver.findElement(activetoclosetabswitch).click();

	}

	public void getSearchReqIDInClosedtab(String requestIDtext) {
		driver.findElement(Searchinputclosedtab).click();
		driver.findElement(Searchinputclosedtab).sendKeys(requestIDtext);

	}

}

package pageObjects.functional_Approver_ApproveObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Functional_Approver_ApprovedObject {

	public WebDriver driver;

	public Functional_Approver_ApprovedObject(WebDriver driver) {
		this.driver = driver;
	}

	By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]");
	By ViewRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]/ul/li[3]/a");
	// By modifyrequest =
	// By.xpath("//*[@id=\"tblActive\"]/tbody/tr[last()]/td[9]/a");
	By requestID = By.xpath("//*[@id='valRequestId']");

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
		driver.findElement(action).click();
	}

	public String getReqID() {
		String requestIDtext = driver.findElement(requestID).getText();
		return requestIDtext;
	}

	public void getfunapprovaldropdownaction() {
		Select approvalaction = new Select(driver.findElement(actionbuttondropdown));
		approvalaction.selectByVisibleText("Approved by Functional Approver");
	}

	public void getfunctionalremark() {
		driver.findElement(functionalapproverremark).sendKeys("Request Approved by Functional Approver");

	}

	// Add attachment section - Choose/Upload File
	public void getUploadFile() {
		String current = System.getProperty("user.dir");
		String filepath = current + "\\Documents\\Help-Document.pdf";
		driver.findElement(uploadfile).sendKeys(filepath);
	}

	public void getfunctionalapprovalsubmit() {
		driver.findElement(submitbutton).click();
	}

	public void getDisplayMsg() {
		driver.findElement(Displaymsg).click();
	}

	public void getSearchReqID(String requestIDtext) {
		driver.findElement(Searchinput).click();
		driver.findElement(Searchinput).sendKeys(requestIDtext);

	}

}

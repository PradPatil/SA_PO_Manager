package pageObjects.functional_PO_ApprovalObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Functional_PO_ApprovalObject {
	
	public WebDriver driver;

	public Functional_PO_ApprovalObject(WebDriver driver) {
		this.driver = driver;		
	}
	By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]");
	By ViewRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]/ul/li[3]/a");
	By requestID = By.xpath("//*[@id='valRequestId']");
	By displaymsgokbtn = By.id("DisplayMsgbtnOk");
	By Searchinputactivetab = By.xpath("//*[@id='tblActive_filter']/label/input");
	By Searchinputclosedtab = By.xpath("//*[@id='tblClose_filter']/label/input");
	By activetoclosetabswitch = By.xpath("//*[@id='div-to-scroll']/div/div[1]/div[1]/section[2]/div/div/div/ul/li[2]/a");
	By Actionbutton = By.xpath("//*[@id='tblActive']/tbody/tr[last()]/td[10]/a/i");
	By actionbuttondropdown = By.id("ddlMyAction");
	By functionalapproverremark = By.id("txtRemarks");
	By DownloadPOicon = By.xpath("//*[@id=\"tblActive\"]/tbody/tr[last()]/td[14]/i"); 
	By DownloadPO = By.xpath("//*[@id=\"tblActive\"]/tbody/tr[last()]/td[14]/a/i"); 
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
		WebElement elementH = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[5]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}
		public void getscrolltolastcolumn() {
			WebElement lastrowcolumn =  driver.findElement(DownloadPOicon);
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
		}
		
		public void getactionclick() {
			driver.findElement(Actionbutton).click();
			}
		
		public String getReqID() {
			   String requestIDtext = driver.findElement(requestID).getText();
			    return requestIDtext;
			    }
		
		public void getfunctionalPOapprovaldropdownaction() {
			Select approvalaction = new Select(driver.findElement(actionbuttondropdown));
			approvalaction.selectByVisibleText("Approved by Functional PO Approver");
		}
		
		public void getfunctionalremark() {
	        driver.findElement(functionalapproverremark).sendKeys("Request Approved by Functional PO Approver");

	    }
		
		public void getUploadFile() {
			driver.findElement(uploadfile).sendKeys("C:\\Users\\P50044121\\Capita_Automation\\Selenium_Projects\\SA_PO_Manager-master\\Documents\\Help Document.pdf");
		}
			
		public void getfunctionalPOapprovalsubmit() {
			driver.findElement(submitbutton).click();
			}
		
		public void getsubmitokpopup() {
			driver.findElement(displaymsgokbtn).click(); 
		}
		
		public void getSearchReqIDInActivetab(String requestIDtext) {
	        driver.findElement(Searchinputactivetab).click();
	        driver.findElement(Searchinputactivetab).sendKeys(requestIDtext);

	    }
		public void getscrolltodownloadPO() {
			WebElement lastrowcolumn =  driver.findElement(DownloadPO);
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
		}
		
		public void getdownloadPO() {
			driver.findElement(DownloadPO).click();
			}
		
		public void getswitchToParentWindow() {
			  ArrayList<String> Parenttab = new ArrayList<String>(driver.getWindowHandles());
		      driver.switchTo().window(Parenttab.get(0));
			}
		
		public void getfunctionalPOReqClosed() {
			Select approvalaction = new Select(driver.findElement(actionbuttondropdown));
			approvalaction.selectByVisibleText("Request Closed");
		}
		
		public void getfunctionalPOClosedremark() {
	        driver.findElement(functionalapproverremark).sendKeys("Request Closed by Functional Approver");

	    }
		public void getactivetoclosedtab() {
	        driver.findElement(activetoclosetabswitch).click();

	    }
		public void getSearchReqIDInClosedtab(String requestIDtext) {
	        driver.findElement(Searchinputclosedtab).click();
	        driver.findElement(Searchinputclosedtab).sendKeys(requestIDtext);

	    }


}

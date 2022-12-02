package pageObjects.functional_Approver_ApproverQueriedReqObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Functional_Approver_ApproverQueriedReqObject {
	
	public WebDriver driver;

	public Functional_Approver_ApproverQueriedReqObject(WebDriver driver) {
		this.driver = driver;
	}
		
		By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]");
		By ViewRequestmenu = By.xpath("//*[@id='ul-menus']/li[2]/ul/li[3]/a");
		By actionbutton = By.xpath("//*[@id='tblActive']/tbody/tr/td[9]/a/i"); 
		By requestID = By.xpath("//*[@id='valRequestId']");	
		By actionbuttondropdown = By.id("ddlMyAction");
		By Remark = By.id("txtRemarks");
		By submitbutton = By.xpath("//*[@id='viewTable']/table/tbody/tr/td/div[2]/div[2]/div[1]/button");
		By Displaymsg = By.id("DisplayMsgbtnOk");
		By Searchinput = By.xpath("//*[@id='tblActive_filter']/label/input");
		
		
		public void getITRequestmenu() {
			driver.findElement(ITRequestmenu).click();
		}

		public void getViewRequestmenu() {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(ViewRequestmenu)).click().build().perform();	
		}
		
		public void getlastrowscroll() {
			//driver.findElement(lastrowscroll);
			WebElement elementH = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[5]"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
		}
				
		public void getscrolltolastcolumn() {
				WebElement lastrowcolumn =  driver.findElement(By.xpath("(//*[@id='tblActive']/tbody/tr)[last()]/td[13]/i"));
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
		}
		
		
		public void getaction() {
			driver.findElement(actionbutton).click();	
	}
		
		public String getReqID() {
			   String requestIDtext = driver.findElement(requestID).getText();
			    return requestIDtext;
			    }
		
		public void getqueryresponsedropdownaction() {
			Select approvalaction = new Select(driver.findElement(actionbuttondropdown));
			approvalaction.selectByVisibleText("Approved by Functional Approver");
		}
		
		public void getqueryrapprovalemark() {
	        driver.findElement(Remark).sendKeys("Approved by Functional Approver");

	    }
		
		public void getSubmit() {
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

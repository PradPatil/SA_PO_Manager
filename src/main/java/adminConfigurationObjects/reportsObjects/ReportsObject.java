package adminConfigurationObjects.reportsObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ReportsObject {
	public WebDriver driver;
	public String fromDate; // Fetched the value from the data.properties file

	public ReportsObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By reportsmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[29]/a");
	By Fromdate = By.xpath("//*[@id=\"txtFromDate\"]");
	By Todate = By.xpath("//*[@id=\"txtToDate\"]");
	By userstatus = By.xpath("//*[@id=\"userstatus\"]");
	By ActiveStatus = By.xpath("//*[@id=\"userstatus\"]/option[1]");
	By ClosedStatus = By.xpath("//*[@id=\"userstatus\"]/option[2]");
	By CancelledStatus = By.xpath("//*[@id=\"userstatus\"]/option[3]");
	By submitreport = By.xpath("//*[@id=\"div-to-scroll\"]/div/div[1]/div[1]/section[1]/div/div/div[2]/div/div/div[1]/div[4]/div/div/button");
	By export = By.xpath("//*[@id=\"tblReport_wrapper\"]/div[1]/button");

	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}

	public void getreportsmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(reportsmenu)).click().build().perform();
	}

	public void getfromdate(String fromDate) {
		driver.findElement(Fromdate).sendKeys(fromDate);
	}

	public void getTodate() {
		driver.findElement(Todate).sendKeys("Current Time In India");
		driver.findElement(Todate).sendKeys(Keys.ENTER);
	}

	public void getuserActiveStatus() {
		driver.findElement(userstatus).click();
		driver.findElement(ActiveStatus).click();
	}

	public void getuserClosedStatus() {
		driver.findElement(userstatus).click();
		driver.findElement(ClosedStatus).click();
	}
	public void getuserCancelledStatus() {
		driver.findElement(userstatus).click();
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(CancelledStatus)).click().build().perform();
		driver.findElement(CancelledStatus).click();
	}
	public void getsubmitreport() {
		driver.findElement(submitreport).click();
	}
	public void getexportToExcel() {
		driver.findElement(export).click();
	}
}

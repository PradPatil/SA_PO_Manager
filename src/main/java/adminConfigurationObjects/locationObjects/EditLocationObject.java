package adminConfigurationObjects.locationObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditLocationObject {

	public WebDriver driver;

	public EditLocationObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By locationmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[25]/a");
	By editlocationclick = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[4]/a[1]");
	By Activecheckbox = By.xpath("//*[@id=\"chkActive\"]");
	By submitloc = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input");
	By locvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getlocationmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locationmenu)).click().build().perform();
	}
	
	public void geteditloc() {
		driver.findElement(editlocationclick).click();
	}
	
	public void getActiveCheckbox() {
		driver.findElement(Activecheckbox).click();
	}
	public void getsubmitloc() {
		driver.findElement(submitloc).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}

	public String getlocname() {
		String locNameText = driver.findElement(locvalue).getText();
		return locNameText;
	}
	public void getSearchLoc(String locNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(locNameText);
    }
}

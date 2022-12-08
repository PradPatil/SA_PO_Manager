package adminConfigurationObjects.locationObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddLocationObject {
	
	public WebDriver driver;
	public String locationName = "TestMumbai";
	public String locNameText ;

	public AddLocationObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By locationmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[17]/a");
	By addnewlocation = By.xpath("//*[@id=\"btnAdd\"]");
	By locationname = By.xpath("//*[@id=\"txtDept\"]");
	By submitlocation = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closedeptpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input"); 
	By locationvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getlocationmenttmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locationmenu)).click().build().perform();
	}
	public void getaddlocoption() {
		driver.findElement(addnewlocation).click();
	}
	public void getaddloc() {
		driver.findElement(locationname).sendKeys(locationName);
	}
	public void getsubmitloc() {
		driver.findElement(submitlocation).click();
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
		String locNameText = driver.findElement(locationvalue).getText();
		return locNameText;
	}
	public void getSearchLoc(String locNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(locNameText);
    }

}

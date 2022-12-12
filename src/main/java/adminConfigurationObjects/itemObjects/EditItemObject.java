package adminConfigurationObjects.itemObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditItemObject {

	public WebDriver driver;

	public EditItemObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By Itemmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[27]/a");
	By edititemclick = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[5]/a[1]");
	By Activecheckbox = By.xpath("//*[@id=\"chkActive\"]");
	By submititem = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input");
	By itemvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getitemmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(Itemmenu)).click().build().perform();
	}
	
	public void geteditItem() {
		driver.findElement(edititemclick).click();
	}
	
	public void getActiveCheckbox() {
	    driver.findElement(Activecheckbox).click();
		//driver.findElement(Activecheckbox);
	}
	public void getsubmitItem() {
		driver.findElement(submititem).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}

	public String getitemname() {
		String itemNameText = driver.findElement(itemvalue).getText();
		return itemNameText;
	}
	public void getSearchItem(String itemNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(itemNameText);
    }
}

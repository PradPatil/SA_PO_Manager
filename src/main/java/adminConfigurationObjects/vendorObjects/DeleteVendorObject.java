package adminConfigurationObjects.vendorObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteVendorObject {

	public WebDriver driver;

	public DeleteVendorObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By vendormenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[21]/a");
	By deletevendor = By.xpath("//*[@id=\"gridVendorMaster\"]/tbody/tr[last()]/td[15]/span[2]");
	By deleteconfirm = By.xpath("//*[@id=\"delete-confirm\"]");
	By deletecancel = By.xpath("//*[@id=\"mb-delete\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By searchinput = By.xpath("//*[@id=\"gridVendorMaster_filter\"]/label/input");
	By vendornamevalue = By.xpath("//*[@id=\"gridVendorMaster\"]/tbody/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}

	public void getvendormenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(vendormenu)).click().build().perform();
	}

	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}
	
	public void getscrolltolastcolumn() {
		WebElement lastrowcolumn = driver.findElement(By.xpath("//*[@id=\"gridVendorMaster_wrapper\"]/div[2]/div/div/div[1]/div/table/thead/tr[last()]/th[15]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
	}
	
	public void getdeletevendor() {
		driver.findElement(deletevendor).click();
	}

	public void getvendordeleteyes() {
		driver.findElement(deleteconfirm).click();
	}

	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}

	public String getvendorvalue() {
		String VendorNameText = driver.findElement(vendornamevalue).getText();
		return VendorNameText;
	}
	
	public void getSearchVendor(String VendorNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(VendorNameText);
    }

}

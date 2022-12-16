package adminConfigurationObjects.userManagementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteUserObject {

	public WebDriver driver;

	public DeleteUserObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By usermanagementmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[19]/a");
	By deleteuser = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[12]/a[2]");
	By deleteconfirm = By.xpath("//*[@id=\"delete-confirm\"]");
	By deletecancel = By.xpath("//*[@id=\"mb-delete\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input");
	By userLANvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}

	public void getusermanagementmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(usermanagementmenu)).click().build().perform();
	}

	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}
	
	public void getscrolltolastcolumn() { 
		WebElement lastrowcolumn = driver.findElement(By.xpath("//*[@id=\"tblHeader_wrapper\"]/div[2]/div/div/div[1]/div/table/thead/tr[last()]/th[12]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
	}
	
	public void getdeleteuser() {
		driver.findElement(deleteuser).click();
	}

	public void getuserdeleteyes() {
		driver.findElement(deleteconfirm).click();
	}

	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}

	public String getuserLANDID() {
		String userNameText = driver.findElement(userLANvalue).getText();
		return userNameText;
	}
	
	public void getSearchUser(String userNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(userNameText);
    }

}

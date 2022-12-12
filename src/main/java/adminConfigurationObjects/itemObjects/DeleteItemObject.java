package adminConfigurationObjects.itemObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteItemObject {

	public WebDriver driver;

	public DeleteItemObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By Itemmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[27]/a");
	By deleteitem = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[5]/a[2]");
	By deleteconfirm = By.xpath("//*[@id=\"delete-confirm\"]");
	By deletecancel = By.xpath("//*[@id=\"mb-delete\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By itemname = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input");
	By itemvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]"); 
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}

	public void getitemmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(Itemmenu)).click().build().perform();
	}

	public void getdeleteitem() {
		driver.findElement(deleteitem).click();
	}

	public void getitemdeleteyes() {
		driver.findElement(deleteconfirm).click();
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

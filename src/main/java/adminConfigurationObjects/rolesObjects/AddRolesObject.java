package adminConfigurationObjects.rolesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddRolesObject {
	
	public WebDriver driver;
	public String roleName = "TestUser";
	public String RoleNameText ;

	public AddRolesObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By rolemenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[1]/a");
	By addnewrole = By.xpath("//*[@id=\"btnAdd\"]");
	By rolenameinput = By.xpath("//*[@id=\"txtDept\"]");
	By submitrole = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closedeptpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input"); 
	By rolevalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getroletmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(rolemenu)).click().build().perform();
	}
	public void getaddroleoption() {
		driver.findElement(addnewrole).click();
	}
	public void getaddrole() {
		driver.findElement(rolenameinput).sendKeys(roleName);
	}
	public void getsubmitrole() {
		driver.findElement(submitrole).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}

	public String getrolename() {
		String RoleNameText = driver.findElement(rolevalue).getText();
		return RoleNameText;
	}
	public void getSearchRole(String RoleNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(RoleNameText);
    }

}

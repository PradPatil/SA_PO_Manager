package adminConfigurationObjects.departmentObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddDepartmentObject {
	
	public WebDriver driver;
	public String departmentName = "Test 8";
	public String deptNameText ;

	public AddDepartmentObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By departmentmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[25]/a");
	By addnewdept = By.xpath("//*[@id=\"btnAdd\"]");
	By deptname = By.xpath("//*[@id=\"txtDept\"]");
	By submitdept = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closedeptpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input"); 
	By deptvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		//return driver.findElement(adminmastermenu);
		driver.findElement(adminmastermenu).click();;
	}
	
	public void getdepartmentmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(departmentmenu)).click().build().perform();
	}
	public void getadddeptoption() {
		driver.findElement(addnewdept).click();
	}
	public void getadddept() {
		driver.findElement(deptname).sendKeys(departmentName);
	}
	public void getsubmitdept() {
		driver.findElement(submitdept).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}

	public String getdeptname() {
		String deptNameText = driver.findElement(deptvalue).getText();
		return deptNameText;
	}
	public void getSearchDept(String deptNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(deptNameText);
    }

}

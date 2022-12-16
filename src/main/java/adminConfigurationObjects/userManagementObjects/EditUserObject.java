package adminConfigurationObjects.userManagementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditUserObject {

	public WebDriver driver;
	public String UserNameText ;
	public String EmployeeLANID = "P00000001@test.co.uk";
	public String EmployeeID = "0000001";
	public String EmployeeFirstName = "TestTf";
	public String EmployeeLastName = "TestTf";
	public String EmployeeEmailID = "testtf.testtf@test.com";
	public String EmployeeContactDetails = "0123456789";

	public EditUserObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By usermanagementmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[19]/a");
	By editdeptclick = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[12]/a[1]");
	By employeeLANID = By.xpath("//*[@id=\"txtEmpLanID\"]");
	By employeeID = By.xpath("//*[@id=\"txtEmpID\"]");
	By empFirstName = By.xpath("//*[@id=\"txtEmpFirstName\"]");
	By empLastName = By.xpath("//*[@id=\"txtEmpLastName\"]");
	By empdepartment = By.xpath("//*[@id=\"ddlDepartment\"]");
	By empdeptselectedvalue =By.xpath("//*[@id=\"ddlDepartment\"]/option[3]");
	By emproles = By.xpath("//*[@id=\"ddlRole\"]");
	By emproleselectedvalue = By.xpath("//*[@id=\"ddlRole\"]/option[4]");
	By emplocation = By.xpath("//*[@id=\"ddlLocation\"]");
	By emplocationselectedvalue = By.xpath("//*[@id=\"ddlLocation\"]/option[3]");
	By empEmail = By.xpath("//*[@id=\"txtEmailId\"]");
	By empContactdetails = By.xpath("//*[@id=\"txtRemarks\"]");
	By Activecheckbox = By.xpath("//*[@id=\"chkActive\"]");
	By submituser = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closedeptpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
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
	
	public void getedituser() {
		driver.findElement(editdeptclick).click();
	}
	
	public void geteditempLAN() {
		driver.findElement(employeeLANID).clear();
		driver.findElement(employeeLANID).sendKeys(EmployeeLANID);
	}
	
	public String getuserLANDID() {
		String userNameText = driver.findElement(userLANvalue).getText();
		return userNameText;
	}
	
	public void geteditempID() {
		driver.findElement(employeeID).clear();
		driver.findElement(employeeID).sendKeys(EmployeeID);
	}
	
	public void geteditempFirstName() {
		driver.findElement(empFirstName).clear();
		driver.findElement(empFirstName).sendKeys(EmployeeFirstName);
	}
	
	public void geteditempLastName() {
		driver.findElement(empLastName).clear();
		driver.findElement(empLastName).sendKeys(EmployeeLastName);
	}
	public void geteditempdept() {
		driver.findElement(empdepartment).click();
		driver.findElement(empdeptselectedvalue).click();
	}
	public void geteditemproles() {
		driver.findElement(emproles).click();
		driver.findElement(emproleselectedvalue).click();
	}
	public void geteditemplocation() {
		driver.findElement(emplocation).click();
		driver.findElement(emplocationselectedvalue).click();
	}
	public void geteditempEmailID() {
		driver.findElement(empEmail).clear();
		driver.findElement(empEmail).sendKeys(EmployeeEmailID);
	}
	
	public void geteditempContact() {
		driver.findElement(empContactdetails).clear();
		driver.findElement(empContactdetails).sendKeys(EmployeeContactDetails);
	}
	public void geteditempActivecheckbox() {
		driver.findElement(Activecheckbox).click();
	}
	
	public void getsubmituser() {
		driver.findElement(submituser).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
	
	public void getSearchUser(String userNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(userNameText);
    }

}

package adminConfigurationObjects.userManagementObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddUserObject {
	
	public WebDriver driver;
	public String UserNameText ;
	public String EmployeeLANID = "P0000000011@test.co.uk";
	public String EmployeeID = "0000000011";
	public String EmployeeFirstName = "TestTff";
	public String EmployeeLastName = "TestTff";
	public String EmployeeEmailID = "testtff.testtff@test.com";
	public String EmployeeContactDetails = "0123456789";

	public AddUserObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By usermanagementmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[19]/a");
	By addnewuser = By.xpath("//*[@id=\"btnAdd\"]");
	By employeeLANID = By.xpath("//*[@id=\"txtEmpLanID\"]"); 
	By employeeID = By.xpath("//*[@id=\"txtEmpID\"]");
	By empFirstName = By.xpath("//*[@id=\"txtEmpFirstName\"]");
	By empLastName = By.xpath("//*[@id=\"txtEmpLastName\"]");
	By empdepartment = By.xpath("//*[@id=\"ddlDepartment\"]");
	By empdept1 =By.xpath("//*[@id=\"ddlDepartment\"]/option[2]");
	By emproles = By.xpath("//*[@id=\"ddlRole\"]");
	By emprole1 = By.xpath("//*[@id=\"ddlRole\"]/option[4]");
	By emplocation = By.xpath("//*[@id=\"ddlLocation\"]");
	By emplocation1 = By.xpath("//*[@id=\"ddlLocation\"]/option[2]");
	By empEmail = By.xpath("//*[@id=\"txtEmailId\"]");
	By empContactdetails = By.xpath("//*[@id=\"txtRemarks\"]");
	By Activecheckbox = By.xpath("//*[@id=\"chkActive\"]");
	By submituser = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closedeptpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input"); 
	By userLANvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	
	public void getadminmastertmenu() {
		//return driver.findElement(adminmastermenu);
		driver.findElement(adminmastermenu).click();;
	}
	
	public void getusermanagementmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(usermanagementmenu)).click().build().perform();
	}
	public void getadduseroption() {
		driver.findElement(addnewuser).click();
	}
	public void getaddempLAN() {
		driver.findElement(employeeLANID).sendKeys(EmployeeLANID);
	}
	
	public void getaddempID() {
		driver.findElement(employeeID).sendKeys(EmployeeID);
	}
	
	public void getaddempFirstName() {
		driver.findElement(empFirstName).sendKeys(EmployeeFirstName);
	}
	
	public void getaddempLastName() {
		driver.findElement(empLastName).sendKeys(EmployeeLastName);
	}
	public void getaddempdept() {
		driver.findElement(empdepartment).click();
		driver.findElement(empdept1).click();
	}
	public void getaddemproles() {
		driver.findElement(emproles).click();
		driver.findElement(emprole1).click();
	}
	public void getaddemplocation() {
		driver.findElement(emplocation).click();
		driver.findElement(emplocation1).click();
	}
	public void getaddempEmailID() {
		driver.findElement(empEmail).sendKeys(EmployeeEmailID);
	}
	
	public void getaddempContact() {
		driver.findElement(empContactdetails).sendKeys(EmployeeContactDetails);
	}
	public void getaddempActivecheckbox() {
		driver.findElement(Activecheckbox);
	}
	
	public void getsubmituser() {
		driver.findElement(submituser).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
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

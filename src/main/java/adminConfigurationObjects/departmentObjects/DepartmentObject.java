package adminConfigurationObjects.departmentObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartmentObject {
	
	public WebDriver driver;

	public DepartmentObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By departmentmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[25]/a");
	By addnewdept = By.xpath("//*[@id=\"btnAdd\"]");
	By deptname = By.xpath("//*[@id=\"txtDept\"]");
	By submitdept = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By closedeptpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getdepartmenttmenu() {
		driver.findElement(departmentmenu).click();
	}
	public void getadddept() {
		driver.findElement(addnewdept).click();
	}
	public void getdeptname() {
		driver.findElement(deptname).sendKeys("Apps Team");;
	}
	public void getsubmitdept() {
		driver.findElement(submitdept).click();
	}
	
	
	

}

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
	
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getdepartmenttmenu() {
		driver.findElement(departmentmenu).click();
	}
	public void getadddept() {
		driver.findElement(addnewdept).click();
	}
	
	

}

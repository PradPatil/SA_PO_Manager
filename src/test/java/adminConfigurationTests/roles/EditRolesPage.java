package adminConfigurationTests.roles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.rolesObjects.EditRolesObject;
import tests.login.LoginPage;

public class EditRolesPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public EditRolesObject roleobj;
	
	@Test (dataProvider="getdata")
	public void ViewRequestDisplay(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		roleobj = new EditRolesObject(driver);
		Thread.sleep(1000);
		roleobj.getadminmastertmenu();
		Thread.sleep(2000);
		roleobj.getrolemenu();
		Thread.sleep(2000);
		getactivepagination();
		Thread.sleep(2000);
		roleobj.getlastrowscroll();
		Thread.sleep(1000);
		String RoleNameText = roleobj.getrolename();
		System.out.println("Department Added:" +RoleNameText);
		roleobj.geteditrole();
		Thread.sleep(1000);
		roleobj.getActiveCheckbox();
		Thread.sleep(1000);
		roleobj.getsubmitrole();
		Thread.sleep(1000);
		roleobj.getdisplaymsg();
		Thread.sleep(1000);
		roleobj.getSearchRole(RoleNameText);
		Thread.sleep(2000);
		obj.ValidateLogout();
		driver.quit();
	}
	
	public void getactivepagination() throws InterruptedException { 
		int paginationsize = driver.findElements(By.cssSelector("#tblHeader_paginate>ul>li>a")).size();
		if(paginationsize!=3)
		{
	   for(int i=1; i<=paginationsize;i++)
  		{
		   String paginationselector = "#tblHeader_paginate>ul>li:nth-child("+i+")>a";
		   driver.findElement(By.cssSelector(paginationselector)).click();
		   Thread.sleep(2000);
  		}
		}
	}
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P50044121@capitaindia.onmicrosoft.com";
        data[0][1]="Welcome^123";
        return data;
	}
}

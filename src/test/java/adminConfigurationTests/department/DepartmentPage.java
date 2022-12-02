package adminConfigurationTests.department;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.departmentObjects.DepartmentObject;
import tests.login.LoginPage;

public class DepartmentPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public DepartmentObject deptobbj;
	
	@Test (dataProvider="getdata")
	public void ViewRequestDisplay(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		deptobbj = new DepartmentObject(driver);
		Thread.sleep(1000);
		deptobbj.getadminmastertmenu();
		deptobbj.getdepartmenttmenu();
		deptobbj.getadddept();	
	}
	
	public void getactivepagination() throws InterruptedException {
		int paginationsize = driver.findElements(By.cssSelector("#tblActive_paginate>ul>li>a")).size();
		if(paginationsize!=3)
		{
	   for(int i=1; i<=paginationsize;i++)
  		{
		   String paginationselector = "#tblActive_paginate>ul>li:nth-child("+i+")>a";
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

package adminConfigurationTests.items;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.itemObjects.EditItemObject;
import tests.login.LoginPage;

public class EditItemPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public EditItemObject itemobj;
	
	@Test (dataProvider="getdata")
	public void editItem(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		itemobj = new EditItemObject(driver);
		Thread.sleep(1000);
		itemobj.getadminmastertmenu();
		Thread.sleep(2000);
		itemobj.getitemmenu();
		Thread.sleep(2000);
		getactivepagination();
		Thread.sleep(2000);
		itemobj.getlastrowscroll();
		Thread.sleep(1000);
		String itemNameText = itemobj.getitemname();
		System.out.println("Item Edited:" +itemNameText);
		itemobj.geteditItem();
		Thread.sleep(1000);
		itemobj.getActiveCheckbox();
		Thread.sleep(1000);
		itemobj.getsubmitItem();
		Thread.sleep(1000);
		itemobj.getdisplaymsg();
		Thread.sleep(1000);
		itemobj.getSearchItem(itemNameText);
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

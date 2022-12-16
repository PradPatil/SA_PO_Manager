package adminConfigurationTests.userManagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.userManagementObjects.DeleteUserObject;
import tests.login.LoginPage;

public class DeleteUserPage {

	
	public JavascriptExecutor js;
	public WebDriver driver;
	public DeleteUserObject userobj;
	public String userNameText = "";
	
	@Test (dataProvider="getdata")
	public void deleteUser(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		userobj = new DeleteUserObject(driver);
		Thread.sleep(1000);
		userobj.getadminmastertmenu();
		Thread.sleep(1000);
		userobj.getusermanagementmenu();
		Thread.sleep(1000);
		getactivepagination();
		userobj.getlastrowscroll();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-300)", "");
		userobj.getscrolltolastcolumn();
		Thread.sleep(1000);
		userobj.getdeleteuser();	
		Thread.sleep(1000);
		String userNameText = userobj.getuserLANDID();
		System.out.println("User Deleted:" +userNameText);
		userobj.getuserdeleteyes();
		Thread.sleep(1000);
		userobj.getdisplaymsg();
		Thread.sleep(1000);
		//getactivepagination();
		//Thread.sleep(2000);
		//String userNameText = userobj.getuserLANDID();
		//System.out.println("User Deleted:" +userNameText);
		userobj.getSearchUser(userNameText);
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

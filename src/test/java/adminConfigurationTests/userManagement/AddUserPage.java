package adminConfigurationTests.userManagement;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.userManagementObjects.AddUserObject;
import tests.login.LoginPage;
import utils.AllWaitsScript;

public class AddUserPage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public AddUserObject userobj;
	public AllWaitsScript waitobj;
	
	@Test (dataProvider="getdata")
	public void addUser(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		userobj = new AddUserObject(driver);
		Thread.sleep(1000);	
		/*waitobj = new AllWaitsScript();
		waitobj.elementvisible(userobj.getadminmastertmenu());
		userobj.getadminmastertmenu().click();*/	
		userobj.getadminmastertmenu();
		Thread.sleep(2000);
		userobj.getusermanagementmenu();
		Thread.sleep(2000);
		userobj.getadduseroption();	
		Thread.sleep(2000);
		userobj.getaddempLAN();
		Thread.sleep(2000);
		userobj.getaddempID();
		userobj.getaddempFirstName();
		userobj.getaddempLastName();
		userobj.getaddempdept();
		userobj.getaddemproles();
		userobj.getaddemplocation();
		userobj.getaddempEmailID();
		userobj.getaddempContact();
		userobj.getaddempActivecheckbox();
		userobj.getsubmituser();
		Thread.sleep(1000);
		userobj.getdisplaymsg();
		getactivepagination();
		Thread.sleep(2000);
		userobj.getlastrowscroll();
		Thread.sleep(1000);
		String userNameText = userobj.getuserLANDID();
		System.out.println("User Added:" +userNameText);
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

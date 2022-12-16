package adminConfigurationTests.profiles;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.profilesObjects.AddProfileObject;
import tests.login.LoginPage;
import utils.AllWaitsScript;

public class AddProfilePage {
	
	public JavascriptExecutor js;
	public WebDriver driver;
	public AddProfileObject pageobj;
	public AllWaitsScript waitobj;
	
	@Test (dataProvider="getdata")
	public void addprofile(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		pageobj = new AddProfileObject(driver);
		Thread.sleep(1000);	
		/*waitobj = new AllWaitsScript();
		waitobj.elementvisible(pageobj.getadminmastertmenu());
		pageobj.getadminmastertmenu().click();*/	
		pageobj.getadminmastertmenu();
		Thread.sleep(2000);
		pageobj.getprofilemenu();
		Thread.sleep(2000);
		pageobj.getaddprofileoption();	
		Thread.sleep(2000);
		pageobj.getaddprofile();
		Thread.sleep(2000);
		pageobj.getsubmitprofile();
		Thread.sleep(1000);
		pageobj.getdisplaymsg();
		getactivepagination();
		/*Thread.sleep(2000);
		pageobj.getlastrowscroll();
		Thread.sleep(1000);
		String profileNameText = pageobj.getprofilename();
		System.out.println("Page Added:" +profileNameText);
		pageobj.getSearchProfile(profileNameText);*/
		Thread.sleep(2000);
		obj.ValidateLogoutforadmin();
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

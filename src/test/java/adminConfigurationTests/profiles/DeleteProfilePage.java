package adminConfigurationTests.profiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminConfigurationObjects.profilesObjects.DeleteProfileObject;
import tests.login.LoginPage;

public class DeleteProfilePage {

	
	public JavascriptExecutor js;
	public WebDriver driver;
	public DeleteProfileObject profileobj;
	public String profileNameText = "";
	
	@Test (dataProvider="getdata")
	public void deleteprofile(String username,String password) throws IOException, InterruptedException
	{
		LoginPage obj = new LoginPage();
		obj.validateLogin(username,password);
		driver = obj.driver;
		profileobj = new DeleteProfileObject(driver);
		Thread.sleep(1000);
		profileobj.getadminmastertmenu();
		Thread.sleep(1000);
		profileobj.getprofilemenu();
		Thread.sleep(1000);
		getactivepagination();
		profileobj.getlastrowscroll();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,-300)", "");
  		profileobj.getscrolltolastcolumn();
		Thread.sleep(1000);
		profileobj.getdeleteprofile();	
		Thread.sleep(1000);
		profileobj.getprofiledeleteyes();
		Thread.sleep(1000);
		profileobj.getdisplaymsg();
		Thread.sleep(1000);
		getactivepagination();
		/*Thread.sleep(2000);
		String profileNameText = profileobj.getprofilename();
		System.out.println("Profile Deleted:" +profileNameText);
		deptobj.getSearchProfile(profileNameText);*/
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

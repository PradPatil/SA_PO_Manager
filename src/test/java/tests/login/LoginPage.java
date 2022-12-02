package tests.login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.loginObjects.LoginObject;
import resources.Base;

public class LoginPage extends Base{
	
	public LoginObject obj;

	public WebDriver driver;
	
	@Test (dataProvider="getdata")
	public void validateLogin(String username,String password) throws IOException, InterruptedException
	{
		driver =initializeDriver();
		obj = new LoginObject(driver);
		Thread.sleep(2000);
		obj.getUserName(username);
		obj.getNextBtn();
		Thread.sleep(3000);
		obj.getPassword(password);
		obj.getSignIn();
		Thread.sleep(2000);
		obj.getdontshowmsg();
		obj.getNoButton();
		String Welcometext = obj.getHeading();
		System.out.println(Welcometext);
		Assert.assertEquals(Welcometext, "Welcome to Purchase Order Manager Application");
	}
	
	public void ValidateLogout() throws InterruptedException
	{
		obj.getLogoutMenu();
		Thread.sleep(2000);
		obj.getLogoutyes();
	}
	
	@DataProvider()
	public Object[][] getdata(){
        Object[][] data=new Object[1][2];
        data[0][0]="P20000001@capitaindia.onmicrosoft.com";
        data[0][1]="Capita#2022";
        
       /*data[1][0]="P20000006@capitaindia.onmicrosoft.com";
        data[1][1]="Capita#2022";
        
        data[2][0]="P20000007@capitaindia.onmicrosoft.com";
        data[2][1]="Capita#2022";
        
        data[3][0]="p50044121@capitaindia.onmicrosoft.com";
        data[3][1]="Welcome$123"; */
        
        return data;
        
    }
	
}
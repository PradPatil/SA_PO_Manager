package pageObjects.loginObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
	
	public WebDriver driver;
	
	public LoginObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username=By.name("loginfmt");
	By nextbutton=By.id("idSIButton9");
	By password=By.name("passwd");
	By signin=By.xpath("//input[@value='Sign in']");
	By dontshowmsg=By.name("DontShowAgain");
	By nobutton=By.id("idBtn_Back");
	By heading = By.xpath("//h2[@style='text-align:center']");
	By logoutmenu = By.xpath("//*[@id='div-to-scroll']/div/header/nav/div/ul/li[2]");
	By logoutadminmenu = By.xpath("//*[@id='logoff']");
	By logoutyes = By.id("btn-success");
	
	public void getUserName(String userName) {
        driver.findElement(username).sendKeys(userName);
    }
	
	public void getNextBtn() {
        driver.findElement(nextbutton).click();
    }
	public void getPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
	public void getSignIn() {
        driver.findElement(signin).click();
    }
	public void getdontshowmsg() {
        driver.findElement(dontshowmsg).click();
    }
	public void getNoButton() {
        driver.findElement(nobutton).click();
    }
	public String getHeading() {
        return driver.findElement(heading).getText(); 
    }
	public void getLogoutMenu() {
        driver.findElement(logoutmenu).click(); 
    }
	public void getLogoutadminMenu() {
        driver.findElement(logoutadminmenu).click(); 
    }
	public void getLogoutyes() {
        driver.findElement(logoutyes).click(); 
    }

}


package adminConfigurationObjects.profilesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddProfileObject {
	
	public WebDriver driver;
	public String profileName = "Test Profile";
	public String profileNameText ;

	public AddProfileObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By profilemenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[3]/a"); 
	By addnewprofile = By.xpath("//*[@id=\"btnAdd\"]");
	By profilename = By.xpath("//*[@id=\"txtProfile\"]");
	By submitprofile = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closeprofilepopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input"); 
	By profilevalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]"); 
	
	public void getadminmastertmenu() {
		//return driver.findElement(adminmastermenu);
		driver.findElement(adminmastermenu).click();;
	}
	
	public void getprofilemenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(profilemenu)).click().build().perform();
	}
	public void getaddprofileoption() {
		driver.findElement(addnewprofile).click();
	}
	public void getaddprofile() {
		driver.findElement(profilename).sendKeys(profileName);
	}
	public void getsubmitprofile() {
		driver.findElement(submitprofile).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}
	
	public String getprofilename() {
		String profileNameText = driver.findElement(profilevalue).getText();
		return profileNameText;
	}
	public void getSearchProfile(String profileNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(profileNameText);
    }

}

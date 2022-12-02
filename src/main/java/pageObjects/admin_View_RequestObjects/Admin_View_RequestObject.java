package pageObjects.admin_View_RequestObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Admin_View_RequestObject {
	
	public WebDriver driver;

	public Admin_View_RequestObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[3]");
	By ViewRequestmenu = By.xpath("//*[@id='ul-menus']/li[3]/ul/li[3]/a");
	By Searchinput = By.xpath("//*[@id='tblActive_filter']/label/input");
	By Searchinputactivetab = By.xpath("//*[@id='tblActive_filter']/label/input");
	By Searchinputclosedtab = By.xpath("//*[@id='tblClose_filter']/label/input");
	By activetoclosetabswitch = By.xpath("//*[@id='div-to-scroll']/div/div[1]/div[1]/section[2]/div/div/div/ul/li[2]/a");
	
	public void getITRequestmenu() {
		driver.findElement(ITRequestmenu).click();
	}

	public void getViewRequestmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(ViewRequestmenu)).click().build().perform();	
	}
	
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/section[2]/div/div/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}
		
	public void getscrolltolastcolumn() {
			WebElement lastrowcolumn =  driver.findElement(By.xpath("(//*[@id='tblActive']/tbody/tr)[last()]/td[11]/i"));
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
	}
	public void getactivetoclosedtab() {
        driver.findElement(activetoclosetabswitch).click();

    }
	
	/*public void getsearchresult(String requestIDtext) {
		//driver.findElement(By.xpath("Searchinput")).click();	
		driver.findElement(Searchinput).sendKeys(requestIDtext);
	}*/


}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllWaitsScript {
	
	public WebDriver driver;
	public void elementvisible (WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	

}

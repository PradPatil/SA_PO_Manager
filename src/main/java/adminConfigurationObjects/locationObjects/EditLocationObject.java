package adminConfigurationObjects.locationObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditLocationObject {

	public WebDriver driver;
	public String LocationName = "Test Pune";
	public String CompanyName = "Test";
	public String Address1 = "Testaddress1";
	public String Address2 = "Testaddress2";
	public String CountryName = "INDIA";
	public String statename = "MH";
	public String CityName = "Pune";
	public String PostalCode = "411041";
	public String ContactNo = "0123456789";
	public String locNameText;

	public EditLocationObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By locationmenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[17]/a");
	By editlocationclick = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[12]/a[1]");
	By location = By.xpath("//*[@id=\"txtLocation\"]");
	By company = By.id("txtCompanyName");
	By addressline1 = By.id("txtAddressLine2");
	By addressline2 = By.id("txtAddressLine3");
	By country = By.id("txtCountry");
	By state = By.id("txtState");
	By city = By.id("txtCity");
	By postalcode = By.id("txtPinCode");
	By phone = By.id("txtPhoneNo");
	By activecheckbox = By.id("chkActive");
	By submitloc = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By searchinput = By.xpath("//*[@id=\"tblHeader_filter\"]/label/input");
	By locvalue = By.xpath("//*[@id=\"tblData\"]/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getlocationmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locationmenu)).click().build().perform();
	}
	
	public void geteditloc() {
		driver.findElement(editlocationclick).click();
	}
	
	public void getaddloc() {
		driver.findElement(location).sendKeys(LocationName);
	}
	public void getaddCompanyName() {
		driver.findElement(company).sendKeys(CompanyName);
	}
	public void getaddaddress1() {
		driver.findElement(addressline1).sendKeys(Address1);
	}
	public void getaddaddress2() {
		driver.findElement(addressline2).sendKeys(Address2);
	}
	public void getaddCountry() {
		driver.findElement(country).sendKeys(CountryName);
	}
	public void getaddState() {
		driver.findElement(state).sendKeys(statename);
	}
	public void getaddCity() {
		driver.findElement(city).sendKeys(CityName);
	}
	public void getaddPostalCode() {
		driver.findElement(postalcode).sendKeys(PostalCode);
	}
	public void getaddContactNo() {
		driver.findElement(phone).sendKeys(ContactNo);
	}
	public void getActiveCheckbox() {
		driver.findElement(activecheckbox).click();
	}
	public void getsubmitloc() {
		driver.findElement(submitloc).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}

	public String getlocname() {
		String locNameText = driver.findElement(locvalue).getText();
		return locNameText;
	}
	public void getSearchLoc(String locNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(locNameText);
    }
}

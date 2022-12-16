package adminConfigurationObjects.vendorObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditVendorObject {

	public WebDriver driver;
	public String VendorNameText ;
	public String VendorName = "Test";
	public String VendorCode = "A00";
	public String Address = "Test Address";
	public String Country = "Test Country";
	public String State = "Test State";
	public String City = "Test City";
	public String PostalCode = "0000";
	public String VATno = "000010";
	public String Fax = "011 788 1832";
	public String ContactPerson = "Test Person";
	public String ContactNo = "0123456789";
	public String ContactPersonEmail = "test.test@test.com";

	public EditVendorObject(WebDriver driver) {
		this.driver = driver;
	}

	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By vendormenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[21]/a");
	By editvendorclick = By.xpath("//*[@id=\"gridVendorMaster\"]/tbody/tr[last()]/td[15]/span[1]");
	By vendorname = By.xpath("//*[@id=\"txtVendor\"]"); 
	By vendorcode = By.xpath("//*[@id=\"txtVendorCode\"]");
	By address = By.xpath("//*[@id=\"txtAddressLine2\"]");
	By country = By.xpath("//*[@id=\"txtCountry\"]");
	By state = By.xpath("//*[@id=\"txtState\"]");
	By city =By.xpath("//*[@id=\"txtCity\"]");
	By postalcode = By.xpath("//*[@id=\"txtPinCode\"]");
	By VATNO = By.xpath("//*[@id=\"txtvatno\"]");
	By fax = By.xpath("//*[@id=\"txtAddressLine3\"]");
	By contactperson = By.xpath("//*[@id=\"txtContactPerson\"]");
	By contactno = By.xpath("//*[@id=\"txtContactNo\"]");
	By Contactpersonemail = By.xpath("//*[@id=\"txtContactPersonEmailID\"]");
	By Activecheckbox = By.xpath("//*[@id=\"chkActive\"]");
	By submitvendor = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]");
	By okpopup = By.xpath("//*[@id=\"DisplayMsgbtnOk\"]");
	By closevendorpopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]");
	By searchinput = By.xpath("//*[@id=\"gridVendorMaster_filter\"]/label/input"); 
	By vendornamevalue = By.xpath("//*[@id=\"gridVendorMaster\"]/tbody/tr[last()]/td[2]");
	
	public void getadminmastertmenu() {
		driver.findElement(adminmastermenu).click();
	}
	
	public void getvendormenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(vendormenu)).click().build().perform();
	}
	
	public void geteditvendor() {
		driver.findElement(editvendorclick).click();
	}
	public void geteditvendorname() {
		driver.findElement(vendorname).clear();
		driver.findElement(vendorname).sendKeys(VendorName);
	}
	
	public void geteditvendorcode() {
		driver.findElement(vendorcode).clear();
		driver.findElement(vendorcode).sendKeys(VendorCode);
	}
	
	public void geteditvendoraddress() {
		driver.findElement(address).clear();
		driver.findElement(address).sendKeys(Address);
	}
	
	public void geteditvendorcountry() {
		driver.findElement(country).clear();
		driver.findElement(country).sendKeys(Country);
	}
	
	public void geteditvendorstate() {
		driver.findElement(state).clear();
		driver.findElement(state).sendKeys(State);
	}
	
	public void geteditvendorcity() {
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys(City);
	}
	public void geteditvendorpostalcode() {
		driver.findElement(postalcode).clear();
		driver.findElement(postalcode).sendKeys(PostalCode);
	}
	public void geteditvendorVATNo() {
		driver.findElement(VATNO).clear();
		driver.findElement(VATNO).sendKeys(VATno);
	}
	public void geteditvendorfax() {
		driver.findElement(fax).clear();
		driver.findElement(fax).sendKeys(Fax);
	}
	public void geteditvendorcontactperson() {
		driver.findElement(contactperson).clear();
		driver.findElement(contactperson).sendKeys(ContactPerson);
	}
	public void geteditvendorContact() {
		driver.findElement(contactno).clear();
		driver.findElement(contactno).sendKeys(ContactNo);
	}
	public void geteditvendorEmailID() {
		driver.findElement(Contactpersonemail).clear();
		driver.findElement(Contactpersonemail).sendKeys(ContactPersonEmail);
	}
	public void geteditvendorActivecheckbox() {
		driver.findElement(Activecheckbox).click();
	}
	
	public void getsubmitvendor() {
		driver.findElement(submitvendor).click();
	}
	
	public void getdisplaymsg() {
		driver.findElement(okpopup).click();
	}
		
	public void getlastrowscroll() {
		WebElement elementH = driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[1]/section[2]/div[1]/div/div[3]/table/tbody/tr/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[last()]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementH);
	}
	
	public void getscrolltolastcolumn() {
		WebElement lastrowcolumn = driver.findElement(By.xpath("//*[@id=\"gridVendorMaster_wrapper\"]/div[2]/div/div/div[1]/div/table/thead/tr[last()]/th[15]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastrowcolumn);
	}

	public String getvendorvalue() {
		String VendorNameText = driver.findElement(vendornamevalue).getText();
		return VendorNameText;
	}
	public void getSearchVendor(String VendorNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(VendorNameText);
    }
}

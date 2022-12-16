package adminConfigurationObjects.vendorObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddVendorObject {
	
	public WebDriver driver;
	public String VendorNameText ;
	public String VendorName = "Testt";
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
	public String ContactPersonEmail = "testt.testt@test.com";
	

	public AddVendorObject(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminmastermenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/a");
	By vendormenu = By.xpath("//*[@id=\"ul-menus\"]/li[2]/ul/li[21]/a");
	By addnewvendor = By.xpath("//*[@id=\"btnAdd\"]");
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
		//return driver.findElement(adminmastermenu);
		driver.findElement(adminmastermenu).click();;
	}
	
	public void getvendormenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(vendormenu)).click().build().perform();
	}
	public void getaddvendoroption() {
		driver.findElement(addnewvendor).click();
	}
	public void getaddvendorname() {
		driver.findElement(vendorname).sendKeys(VendorName);
	}
	
	public void getaddvendorcode() {
		driver.findElement(vendorcode).sendKeys(VendorCode);
	}
	
	public void getaddvendoraddress() {
		driver.findElement(address).sendKeys(Address);
	}
	
	public void getaddvendorcountry() {
		driver.findElement(country).sendKeys(Country);
	}
	
	public void getaddvendorstate() {
		driver.findElement(state).sendKeys(State);
	}
	
	public void getaddvendorcity() {
		driver.findElement(city).sendKeys(City);
	}
	public void getaddvendorpostalcode() {
		driver.findElement(postalcode).sendKeys(PostalCode);
	}
	public void getaddvendorVATNo() {
		driver.findElement(VATNO).sendKeys(VATno);
	}
	public void getaddvendorfax() {
		driver.findElement(fax).sendKeys(Fax);
	}
	public void getaddvendorcontactperson() {
		driver.findElement(contactperson).sendKeys(ContactPerson);
	}
	public void getaddvendorContact() {
		driver.findElement(contactno).sendKeys(ContactNo);
	}
	public void getaddvendorEmailID() {
		driver.findElement(Contactpersonemail).sendKeys(ContactPersonEmail);
	}
	public void getaddvendorActivecheckbox() {
		driver.findElement(Activecheckbox);
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

	public String getvendorvalue() {
		String VendorNameText = driver.findElement(vendornamevalue).getText();
		return VendorNameText;
	}
	public void getSearchVendor(String VendorNameText) {
        driver.findElement(searchinput).click();
        driver.findElement(searchinput).sendKeys(VendorNameText);
    }

}

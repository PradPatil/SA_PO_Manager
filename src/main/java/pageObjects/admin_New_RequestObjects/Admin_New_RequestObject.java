package pageObjects.admin_New_RequestObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Admin_New_RequestObject {
	
	public WebDriver driver;

	public Admin_New_RequestObject(WebDriver driver) {
		this.driver = driver;
	}
	By ITRequestmenu = By.xpath("//*[@id='ul-menus']/li[3]");
	By newrequest = By.xpath("//*[@id=\"ul-menus\"]/li[3]/ul/li[1]/a");
	By DeliveryLocation = By.xpath("//*[@id=\"ddlLocation\"]/option[2]");
	By RequestTyp = By.xpath("//*[@id=\"ddlRequestType\"]/option[1]");
	By CERNO = By.id("txtCerNoelement");
	By department = By.xpath("//*[@id=\"ddlReqDept\"]");
	By ITRadioButton = By.id("optionsRadios1");

	// Add item Assets & Accessories (Item Details )
	By addbutton = By.id("btnAdd");
	By Assets = By.xpath("//*[@id=\"ddlAssetGrp\"]/option[22]");
	By PartCode = By.id("txtAssetGrpMake");
	By itemdescription = By.id("txtAssetGrpModel");
	By Quantity = By.id("txtAssetGrpQty");
	By Assetcomments = By.id("txtAssetGrpComments");
	By Assetsubmitbtn = By.xpath("//*[@id='myModal']/div/div/div[2]/div[5]/button[2]");

	// Add item Softwares (Item Details )
	By itemtype = By.id("itemTypesSW"); 
	By SoftwareName = By.id("txtSoftwareNm");
	By SoftwareVersion = By.id("txtSoftwareVer");
	By SoftwareQuantity = By.id("txtSoftwareQty");
	By SoftwareComments = By.id("txtSoftwarecomment");
	By SoftwareDescription = By.id("txtSoftwareDesc");
	By subscriptionstatus = By.xpath("//*[@id='ddlSoftwareSubsStatus']/option[2]");
	By SoftStartDate = By.id("txtRenewalSD");
	By SoftEndDate = By.id("txtRenewalED");
	By Softwaresubmitbtn = By.xpath("//*[@id='myModal']/div/div/div[2]/div[5]/button[2]");

	// Add attachment section - Choose/Upload File
	By uploadfile = By.id("txtUploadFile");
	By Remark = By.id("txtRemarks");
	By requestsave = By.id("btn_save");
	//By requestID = By.id("txtRequestID");
	By requestID = By.xpath("//*[@id='valRequestId']");
	By requestsubmit = By.id("btn_submit");
	By Clickherelink = By.xpath("(//a[text()='click here'])");

	// Code for Quotation Details (Add/Submit Quotations)
	By Pricecheckbox = By.id("Check_Price");
	By AddQuotationbtn = By.id("btnAdd");
	By Vendor1 = By.xpath("//*[@id='ddlVendor']/option[2]");
	By Vendor2 = By.xpath("//*[@id='ddlVendor']/option[3]");
	By Vendor3 = By.xpath("//*[@id='ddlVendor']/option[4]");
	By Priority1 = By.xpath("//*[@id=\"ddlPriority\"]/option[1]");
	By Priority2 = By.xpath("//*[@id=\"ddlPriority\"]/option[2]");
	By Priority3 = By.xpath("//*[@id=\"ddlPriority\"]/option[3]");
	By VendorRemark = By.id("txtRemarks");
	By UnitRate = By.name("porunitrate");
	By VAT1 = By.xpath("//*[@id='1']");
	By VAT2 = By.xpath("//*[@id='2']");
	By VATPercentage = By.xpath("/html/body/div[1]/div[1]/div[1]/section[4]/div[2]/div/div/div[2]/table/tbody/tr[5]/td/div[2]/div/table/tbody/tr/td[7]/select");
	
	// Quotations details
	By QuoteNo = By.id("txtReferenceNo");
	By Quotecalendarpicker = By.xpath("/html/body/div[1]/div[1]/div[1]/section[4]/div[2]/div/div/div[2]/table/tbody/tr[7]/td[2]/div/div/input");
	By Quotedate = By.id("txtQuotDate");
	//By Quotedate = By.xpath("//*[@id='txtQuotDate']");
	By Quotevalidity = By.id("txtQuotValidatity");
	By ValueofMS = By.id("txtMS");
	By Currency = By.xpath("//*[@id=\"4\"]");
	By AdditionalRemark = By.id("txtAddRemarks");
	By Comments = By.id("txtComments");
	By SubTotal = By.id("txtComments");

	// Terms & Conditions
	By SLA = By.id("txtSLA");
	By DeliveryCharge = By.id("txtDeliveryCharges");
	By DeliveryTimelines = By.id("txtDelTimelines");
	By Payment = By.id("txtPayment");
	By Warranty = By.id("txtWarranty");
	By SOW = By.id("txtSOW");

	// Software Tab -
	By SoftwareTab = By.id("tabsoftware");
	By td11Focus = By.xpath("//*[@id='tbl_softwares_data']/tbody/tr/td[11]");
	By td9Focus = By.xpath("//*[@id='tbl_softwares_data']/tbody/tr/td[9]");
	By SoftwareUnitRate = By.xpath("/html/body/div[1]/div[1]/div[1]/section[4]/div[2]/div/div/div[2]/table/tbody/tr[5]/td/div[3]/div/table/tbody/tr/td[9]/input");
	By VATsoftPercentage = By.xpath("/html/body/div[1]/div[1]/div[1]/section[4]/div[2]/div/div/div[2]/table/tbody/tr[5]/td/div[3]/div/table/tbody/tr/td[10]/select");
	//By SoftwareVAT1 = By.xpath("//*[@id='1']");
	//By SoftwareVAT2 = By.xpath("//*[@id='2']");   
	By scroll = By.xpath("/html/body/div[1]/div[1]/div[1]/section[4]/div[2]");
	By QuotationSubmit = By.xpath("//*[@id='myModalQuotation']/div/div/div[3]/button[2]");
	By Displaymsg = By.id("DisplayMsgbtnOk");
	By SubmitQuotation = By.id("btnSubmitQuotation");

	// Search the generated Request ID in New Request on view request page
	By Searchinput = By.xpath("//*[@id='tblActive_filter']/label/input");

	public void getITRequestmenu() {
		driver.findElement(ITRequestmenu).click();
	}

	public void getNewRequestmenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(newrequest)).click().build().perform();	
	}

	public void getDeliveryLocation() {
		driver.findElement(DeliveryLocation).click();
	}

	public void getRequestType() {
		driver.findElement(RequestTyp).click();
	}

	public void getCERNo() {
		driver.findElement(CERNO).sendKeys("CER0011");
	}

	/*public void getDepartment() {
		//driver.findElement(department).click();
		Select dept = new Select(driver.findElement(department));
		dept.selectByVisibleText("Application Delivery");
	}*/

	public void getITRadiobtn() {
		 driver.findElement(ITRadioButton).click();
	}

	// Add item Assets & Accessories (Item Details )
	public void getAddBtn() {
		   driver.findElement(addbutton).click();
		}

	public void getAsset() {
		driver.findElement(Assets).click();
	}

	public void getPartCode() {
		driver.findElement(PartCode).sendKeys("P-123");
	}

	public void getItemDescription() {
		driver.findElement(itemdescription).sendKeys("Testing Description");
	}

	public void getItemQuantity() {
		driver.findElement(Quantity).sendKeys("5");
	}

	public void getAssetComment() {
		driver.findElement(Assetcomments).sendKeys("Testing Comments");
	}

	public void getSubmitBtn() {
		driver.findElement(Assetsubmitbtn).click();
	}

	// Add item Softwares (Item Details )
	public void getsoftAddBtn() {
        driver.findElement(addbutton).click();
    }
	public void getItemType() {
		driver.findElement(itemtype).click();
	}

	public void getSoftWareName() {
		driver.findElement(SoftwareName).sendKeys("Visual Studio");
	}

	public void getSoftWareVersion() {
		driver.findElement(SoftwareVersion).sendKeys("5.8");
	}

	public void getSoftWareQuantity() {
		driver.findElement(SoftwareQuantity).sendKeys("10");
	}

	public void getSoftWareComment() {
		driver.findElement(SoftwareComments).sendKeys("Software Testing Comments");
	}

	public void getSoftWareDescription() {
		driver.findElement(SoftwareDescription).sendKeys("Software Description");
	}

	public void getSubscriptionStatus() {
		driver.findElement(subscriptionstatus).click();
	}

	public void getSoftWareStartDate() {
		driver.findElement(SoftStartDate).sendKeys(Keys.ENTER);
	}
	public void getSoftWareEndDate() {
        driver.findElement(SoftEndDate).sendKeys("12/30/2022");
        }

	public void getSoftwareSubmitBtn() {
		        driver.findElement(Softwaresubmitbtn).click();
		    }

	// Add attachment section - Choose/Upload File
	public void getUploadFile() {
		driver.findElement(uploadfile).sendKeys("C:\\Users\\P50044121\\Capita_Automation\\Selenium_Projects\\SA_PO_Manager-master\\Documents\\Help Document.pdf");
		//driver.findElement(uploadfile).sendKeys(("user.dir") + "//SA_PO_Manager-master//Documents//Help Document.pdf");
		//driver.findElement(uploadfile).sendKeys(("user.dir") + "\\SA_PO_Manager-master\\Documents\\Help Document.pdf");
		
	}
	public void getRemark() {
		        driver.findElement(Remark).sendKeys("Request Initiated");
		    }

	public void getReqSave() {
		driver.findElement(requestsave).click();
	}
	
	public void getReqSubmit() {
        driver.findElement(requestsubmit).click();
    }
	
	public void getClickHere() {
        driver.findElement(Clickherelink).click();
    }

	public String getReqID() {
		   String requestIDtext = driver.findElement(requestID).getText();
		    return requestIDtext;
		    }
	
	// Code for Quotation Details (Add/Submit Quotations)
	public void getCheckPriceCheckbox() {
		    driver.findElement(Pricecheckbox).click();
		    }

	public void getAddQuotationBtn() {
		driver.findElement(AddQuotationbtn).click();
	}

	public void getVendor1() {
		driver.findElement(Vendor1).click();
	}

	public void getPriority() {
		driver.findElement(Priority2).click();
	}

	public void getVendorRemark() {
		        driver.findElement(VendorRemark).sendKeys("Vendor Selected");
		    }
	public void getUnitRates() {
		        driver.findElement(UnitRate).sendKeys("1000");
		    }

	public void getVATPercentage() {
		 driver.findElement(VATPercentage).click(); 
		 driver.findElement(VAT2).click();
		    }

	// Quotations details
	public void getQuoteNo() {
		driver.findElement(QuoteNo).sendKeys("Q-1234");
	}

	/*public void getQuoteCalendarPicker() {
		driver.findElement(Quotecalendarpicker).click();
	}*/

	public void getQuoteDate() {
		driver.findElement(Quotedate).sendKeys("Current Time In India");
		driver.findElement(Quotedate).sendKeys(Keys.ENTER);
	}

	public void getQuoteValidity() {
		driver.findElement(Quotevalidity).sendKeys("2 Years");
	}

	public void getMSValue() {
		driver.findElement(ValueofMS).getText();
	}

	public void getCurrency() {
		driver.findElement(Currency).click();
	}

	public void getAdditionalRemark() {
		driver.findElement(AdditionalRemark).sendKeys("Test Additional Remark");
	}

	public void getComments() {
		driver.findElement(Comments).sendKeys("Test Comments");
	}

	public void getSubTotal() {
		driver.findElement(SubTotal).getText();
	}

	// Terms & Conditions
	public void getSLA() {
	        driver.findElement(SLA).sendKeys("Test SLA");
	    }
	public void getDeliveryCharge() {
	        driver.findElement(DeliveryCharge).sendKeys("200");
	    }
	public void getDeliveryTimeline() {
	        driver.findElement(DeliveryTimelines).sendKeys("10Days");
	    }
	public void getPayment() {
	        driver.findElement(Payment).sendKeys("Online");
	    }
	public void getWarranty() {
	        driver.findElement(Warranty).sendKeys("5 Years");
	    }
	public void getSOW() {
	        driver.findElement(SOW).sendKeys("SOW");
	    }
	
	// Software Tab -
	public void getSoftTab() {
	        driver.findElement(SoftwareTab).click();
	    }
	public void getTd11() {
	        driver.findElement(td11Focus).click();
	    }
	public void getTd9() {
	        driver.findElement(td9Focus).click();
	    }
	public void getsoftwareunit() {
	        driver.findElement(SoftwareUnitRate).sendKeys("1200");
	    }
	public void getVAT() throws InterruptedException { 
		Select SWVAT = new Select(driver.findElement(VATsoftPercentage));
		SWVAT.selectByVisibleText("15%");
	    }
	
	public void getscroll() {
        driver.findElement(scroll).sendKeys(Keys.PAGE_DOWN);
    }
	public void getQuoteSubmit() {
	        driver.findElement(QuotationSubmit).click();
	    }
	public void getDisplayMsg() {
	        driver.findElement(Displaymsg).click();
	    }
	public void getSubmitQuote() {
	        driver.findElement(SubmitQuotation).click();
	    }
	public void getSearchReqID(String requestIDtext) {
        driver.findElement(Searchinput).click();
        driver.findElement(Searchinput).sendKeys(requestIDtext);

    }


}

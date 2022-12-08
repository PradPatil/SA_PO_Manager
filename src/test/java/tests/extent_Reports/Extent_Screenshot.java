package tests.extent_Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Extent_Screenshot {
	
	public String getscreenshot(String testcasename,WebDriver driver) throws IOException
	{
		//String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//String destination = System.getProperty("user.dir")+"//reports//" + testcasename + dateName + ".png";
		String destination = System.getProperty("user.dir")+"//reports//" + testcasename + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

}

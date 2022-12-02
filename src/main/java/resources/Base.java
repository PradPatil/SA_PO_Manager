package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
    public Properties prop;
    
public static WebDriver initializeDriver() throws IOException {
        
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//data.properties");
        
        prop.load(fis);
        String browserName=prop.getProperty("Browser"); //!=null ? System.getProperty("browser"):System.getProperty("browser");
        String url = prop.getProperty("URL");
        if(browserName.contains("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get(url);
        }
        
        if(browserName.contains("Firefox")) 
        {
        	System.setProperty("WebDriver.gecko.driver", "C:\\Users\\P50044121\\Capita_Automation\\geckodriver-v0.32.0-win32\\geckodriver.exe");
        	 WebDriverManager.firefoxdriver().setup();
             driver=new ChromeDriver();
             driver.get(url);
        }
        else if(browserName.contains("Edge")) 
        {
        	System.setProperty("WebDriver.edge.driver", "C:\\Users\\P50044121\\Capita_Automation\\edgedriver_win64\\msedgedriver.exe");
       	 WebDriverManager.edgedriver().setup();
            driver=new ChromeDriver();
            driver.get(url);
        }
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
       
    }

public String getscreenshot(String testcasename,WebDriver driver) throws IOException
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"//reports//" + testcasename + ".png");
	FileUtils.copyFile(source, file);
	return System.getProperty("user.dir") + "//reports//" + ".png";
}


}

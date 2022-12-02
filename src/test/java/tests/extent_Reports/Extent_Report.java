package tests.extent_Reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report {
	
	public static ExtentReports getReportObject()
	{
	
	String Path = System.getProperty("user.dir") + "\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
	reporter.config().setReportName("SA_PO Manager Automation Result");
	reporter.config().setDocumentTitle("Test Results");
	
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Pradnya Patil");
	return extent;
	}
}

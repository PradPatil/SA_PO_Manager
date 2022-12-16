package tests.extent_Reports;
//import org.testng.annotations.AfterSuite;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners(ITestListener.class)
public class Extent_Report {

	public static ExtentReports getReportObject() {
		String Path = System.getProperty("user.dir") + "\\reports\\ExtentReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("SA_PO Manager Automation Result");
		reporter.config().setDocumentTitle("Test Results");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("UserName", "Pradnya Patil");
		extent.setSystemInfo("Environment", "Windows 10");
		return extent;
	}
}
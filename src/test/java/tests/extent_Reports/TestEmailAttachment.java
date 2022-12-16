package tests.extent_Reports;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
//import org.testng.annotations.AfterSuite;
//import org.testng.Reporter;


public class TestEmailAttachment {
	
	//@AfterSuite
	public void sendEmailWithAttachment() {

		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		// attachment.setPath(System.getProperty("//SA_PO_Manager-master//test-output//emailable-report.html"));
		 attachment.setPath(System.getProperty("user.dir")+"\\test-output\\emailable-report.html");
		//attachment.setPath(System.getProperty("user.dir") + "//test-output//emailable-report.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("PO Manager Test Run Report");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("cias-server-smtp-uk");
		email.setSmtpPort(25);
		// email.setAuthenticator(new DefaultAuthenticator("P50044121@capita.co.uk",
		// "Email Password"));
		try {
			email.addTo("pradnya.patil2@capita.com", "Pradnya Patil");
			// email.addTo("Amit.Verma@capita.com", "Amit Verma");
			// email.addTo("Amit.Verma@capita.com", "Sanjiv Kumar");
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			email.setFrom("pradnya.patil2@capita.com", "Me");
		} catch (EmailException e) {
			e.printStackTrace();
		}
		email.setSubject("Automation Test Execution Report");
		try {
			email.setMsg("Hello, Please find the attached test run report for your reference");
		} catch (EmailException e) {
			e.printStackTrace();
		}

		// add the attachment
		try {
			// Reporter.getCurrentTestResult();
			email.attach(attachment);
		} catch (EmailException e) {
			e.printStackTrace();
		}

		// send the email
		try {
			// Reporter.getCurrentTestResult();
			email.send();
			System.out.println("Email Sent Successfully");
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 public void tearDown() { TestEmailAttachment testEmailAttachment = new
	 TestEmailAttachment(); Reporter.getCurrentTestResult();
	  testEmailAttachment.sendEmailWithAttachment(); 
	  }
	 */

}

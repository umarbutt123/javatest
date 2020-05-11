package javatest;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

public class bambootest {
	
//	static ExtentTest test;
//	public static ExtentReports report;
//	public static WebDriver driver;

	
//	@org.testng.annotations.BeforeClass
//	public static void startTest()
//	{
//	String text = "test";
//	report = new ExtentReports(System.getProperty("reports")+"\\ExtentReportResults.html");
//	test = report.startTest("ExtentDemo");
//	}
	
//	@Test
//	public void extentReportsDemo()
//	{
//	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.get("https://www.google.com");
//	if(driver.getTitle().equals("Google"))
//	{
//		String a = "<span style='font-weight:bold;color:red'>";
//		System.out.print(a);
//		test.log(LogStatus.INFO, "<span style='font-weight:bold;color:red'>"+a);
//
////		test.log(LogStatus.PASS,"step 1", "<span class='label info'>info text</span>");
////		test.log(LogStatus.PASS,"step 1", "<span class='label warn'>warning</span>");
////		test.log(LogStatus.INFO, "HTML", "Usage: <span style='font-weight:bold;color:red'>text bold and color red</span>");
//
////	test.log(LogStatus.PASS,"step 1", "<span class='label success'>Navigated to the specified URL</span>");
////	test.log(LogStatus.PASS,"<b>successful</b>");
//	}
//	else
//	{
//	test.log(LogStatus.FAIL, "<span class='label failure'> Test Failed due to testing purpose</span>");
//	}
//	}

	@Test
	public void test1()
	{
		Assert.assertEquals("abc", "abc");
//		test.log(LogStatus.PASS, "assertion passed");

	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("abc", "qwr");
	}
	
//	@AfterClass
//	public static void endTest()
//	{
//	report.endTest(test);
//	report.flush();
//	driver.close();
//	}
}
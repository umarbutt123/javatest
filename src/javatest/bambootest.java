package javatest;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class bambootest {
	
//	public static void main(String args[])
//	{
//		System.out.print("testttttttttttttttt");
//	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("abc", "abc");

	}
	
//	{
//	  System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("http://facebook.com");
//	  Thread.sleep(2000);
//}
//	@Test
//	public void test2()
//	{
//		Assert.assertEquals("abc", "qwr");
//	}
}
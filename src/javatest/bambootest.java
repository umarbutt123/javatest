package javatest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class bambootest {
	
	@Test	
	public void test()  {
		Assert.assertEquals("abc", "abc");
//	  System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.get("http://facebook.com");
//	  Thread.sleep(2000);
}
	@Test
	public void test2()
	{
		Assert.assertEquals("abc", "qwr");
	}
}
package Demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multipletest {
	WebDriver driver;
	@BeforeMethod
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void title()
	{
		String title1=driver.getTitle();
		String exptitle="Google";
		Assert.assertEquals(exptitle, title1);
		}
	@Test
	public void logo()
	{
	boolean d = driver.findElement(By.id("hplogo")).isDisplayed();
	Assert.assertTrue(d);
	}
@AfterMethod
public void closebrowser()
{
	driver.quit();
}
	
}

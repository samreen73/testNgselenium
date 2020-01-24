package Demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNAlways 
{
	WebDriver driver;
	@Test
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		System.out.println("start application");
	}
	@Test(dependsOnMethods="startapp")
	public void checktitle()
	{
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("samreen");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	String expectedname="Demowebsite";
	String actualname=driver.getTitle();
	System.out.println(actualname);
	Assert.assertEquals(expectedname,actualname);
	driver.findElement(By.linkText("Log out")).click();
		System.out.println("logout to application");
	}
	@Test(dependsOnMethods="checktitle",alwaysRun=true)
	public void logout()
	{
		driver.close();
		System.out.println("logout from the application");
	}

}

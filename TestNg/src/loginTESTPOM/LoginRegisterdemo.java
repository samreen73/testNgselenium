package loginTESTPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demowebshopPOM.LoginPOM;
import demowebshopPOM.RegisterPOM;

public class LoginRegisterdemo 
{
WebDriver driver;
//WebDriver driver1;
@BeforeMethod
public void startapp()
{
	System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	
}
/*
@Test
public void registerNlogin()
{
	RegisterPOM rg=new RegisterPOM(driver);
	rg.registerlink();
	rg.enterfirstname("jh23hjdf");
	rg.enterlasttname("hhserasdf");
	rg.entermail("hdhff234ghf@gmail.com");
	rg.enterpassword("hfhhfgjjd");
	rg.cnfirmpass("hfhhfgjjd");
    rg.clickregister();
	WebElement dr = driver.findElement(By.xpath("//div[@class='result']"));
		 String ext="registration completed";
		String actual= dr.getText();
		Assert.assertEquals(actual,ext);		
}*/

@Test(priority=2)
public void loginagain( )
{
	
	LoginPOM lg=new LoginPOM(driver);
	lg.loginlink();
	lg.enteremail("samreen@gmail.com");
	lg.enterpassword("samreen");
     String result=lg.actual;  
	String expt="samreen@gmail.com";
	Assert.assertEquals(result,expt);
	lg.clicklogin();

}
@AfterMethod
public void closebrowser()
{
	driver.quit();

}
}

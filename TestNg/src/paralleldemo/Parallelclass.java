package paralleldemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallelclass
{
	WebDriver driver;
	
	@BeforeTest
	
	@Parameters("browser")
	
	public void setup(String browser) throws Exception
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();		
		}
		else
		{
			throw new Exception("browser is not correct");
			
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	public void method()
	{
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("samreen");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//String expectedname="Demowebsite";
		//String actualname=driver.getTitle();
		//System.out.println(actualname);
		//Assert.assertEquals(expectedname,actualname);
		driver.findElement(By.linkText("Log out")).click();
			System.out.println("logout to application");
	}
@AfterTest
public void end()
{
	driver.quit();
}
	

}

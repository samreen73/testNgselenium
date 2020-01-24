package loginTESTPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshopPOM.LoginPOM;

public class Demologinverify 
{
	WebDriver driver;
	@Test
	public void demologin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		LoginPOM lg=new LoginPOM(driver);
		lg.enteremail("samreen@gmail.com");
		lg.enterpassword("samreen");
		lg.clicklogin();
	    driver.close();
	}

}

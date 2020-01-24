package loginTESTPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshopPOM.RegisterPOM;

public class DemoRegister
{
	@Test
	public void registerpage()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		RegisterPOM rg=new RegisterPOM(driver);
		rg.enterfirstname("exzsd");
		rg.enterlasttname("egdh");
		rg.entermail("samreen12345@gmail.com");
		rg.enterpassword("samreen12335");
		rg.cnfirmpass("samreen12335");
		rg.clickregister();;
		
	}

}

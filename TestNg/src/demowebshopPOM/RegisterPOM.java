package demowebshopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPOM 
{
	WebDriver driver;
By rgst=	By.xpath("//a[@class='ico-register']");
By firstname=	By.xpath("//input[@id='FirstName']");
By lastname=By.xpath("//input[@id='LastName']");
By email=By.xpath("//input[@id='Email']");
By password=By.xpath("//input[@id='Password']");
By confirm=By.xpath("//input[@id='ConfirmPassword']");
By register=By.xpath("//input[@id='register-button']");
//By text=By.xpath("//*[contains(text(),'Your registration completed')]");
//By logout=By.linkText("Log out");


public RegisterPOM(WebDriver driver)
{
	this.driver=driver;
}
public void registerlink()
{
	driver.findElement(rgst).click();
}

public void enterfirstname(String fn)
{
	driver.findElement(firstname).sendKeys(fn);
}
public void enterlasttname(String ln)
{
	driver.findElement(lastname).sendKeys(ln);
}
public void entermail(String eml)
{
	driver.findElement(email).sendKeys(eml);
	
}
public void enterpassword(String ps)
{
	driver.findElement(password).sendKeys(ps);
	
}
public void cnfirmpass(String ps1)
{
	driver.findElement(confirm).sendKeys(ps1);
	
}
public void clickregister()
{
 driver.findElement(register).click();

}


}

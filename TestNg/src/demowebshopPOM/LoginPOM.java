package demowebshopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {
	WebDriver driver;
By loginfrt=By.xpath("//a[@class='ico-login']");
	By email =By.id("Email");
	By password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
 public String actual=driver.findElement(By.xpath("//a[contains(text(),'samreen@gmail.com')]")).getText();
 
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginlink()
	{
		driver.findElement(loginfrt).click();
	}
	
	public void enteremail(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	
	public void enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	
	

}

package Demotest;

import org.testng.annotations.Test;

public class Prioritydemo 
{
@Test
public void startapp()
{
	System.out.println("start application");
}
@Test(priority=4)
public void login()
{
	System.out.println("login to application");
}
@Test(priority=0)
public void logout()
{
	System.out.println("logout from the application");
}

}

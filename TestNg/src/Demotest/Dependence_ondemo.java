package Demotest;

import org.testng.annotations.Test;

public class Dependence_ondemo
{
@Test
public void startapp()
{
	System.out.println("start application");
}
@Test(dependsOnMethods="startapp",priority=0)
public void login()
{
	System.out.println("login to application");
}
@Test()
public void logout()
{
	System.out.println("logout from the application");
}

}



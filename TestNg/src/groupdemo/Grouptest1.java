package groupdemo;
import org.testng.annotations.Test;
public class Grouptest1 {

	 @Test(groups = { "smoke" })
	  public void testMethod1()
	 { 
		 System.out.println("first smoke test");
	 }
	 
	  @Test(groups = {"smoke"} )
	  public void testMethod2() 
	  {
		  System.out.println("second smoke test");
	  }
	 
	  @Test(groups = { "smoke" })
	  public void testMethod3() {
		  System.out.println(" Third smoke");
	  }
	  @Test(groups = { "regression" })
	  public void testMethod4() {
		  System.out.println("first regression");
	  }
	  

}

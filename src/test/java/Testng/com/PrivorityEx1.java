package Testng.com;

import org.testng.annotations.Test;

public class PrivorityEx1 {
	@Test(priority=2)
	public void CapitalTest() {
		  System.out.println("CapitalTest");
		  this.smalltest();
	  }
	@Test(priority=5)
	  public void smalltest() {
		  System.out.println("smalltest");
	  }
	@Test(priority=1)
	  public void CapitalUser() {
		  System.out.println("CapitalUser");
	  }
	@Test(priority=3)
	  public void smalluser() {
		  
		  System.out.println("smalluser");

	  }
	@Test(priority=4)
	  public void CapitalPassword() {
		  System.out.println("CapitalPassword");

		  
	  }
	@Test(priority=0)
	  public void smallpassword() {
		  System.out.println("smallpassword");
	  }


}

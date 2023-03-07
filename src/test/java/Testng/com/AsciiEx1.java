package Testng.com;

import org.testng.annotations.Test;



public class AsciiEx1 {
	@Test
	public void CapitalTest() {
		  System.out.println("CapitalTest");
		  this.smalltest();
	  }
	@Test
	  public void smalltest() {
		  System.out.println("smalltest");
	  }
	@Test
	  public void CapitalUser() {
		  System.out.println("CapitalUser");
	  }
	@Test
	  public void smalluser() {
		  
		  System.out.println("smalluser");

	  }
	@Test
	  public void CapitalPassword() {
		  System.out.println("CapitalPassword");

		  
	  }
	@Test
	  public void smallpassword() {
		  System.out.println("smallpassword");
	  }

	
	

}

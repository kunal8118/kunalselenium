package Testng.com;

import org.testng.annotations.Test;

public class NewTestEx1 {
  @Test
  public void CapitalTest() {
	  System.out.println("CapitalTest");
	  this.smalltest();
  }
  public void smalltest() {
	  System.out.println("smalltest");
  }

  public void CapitalUser() {
	  System.out.println("CapitalUser");
  }

  public void smalluser() {
	  
	  System.out.println("smalluser");

  }

  public void CapitalPassword() {
	  System.out.println("CapitalPassword");

	  
  }

  public void smallpassword() {
	  System.out.println("smallpassword");
  }

}

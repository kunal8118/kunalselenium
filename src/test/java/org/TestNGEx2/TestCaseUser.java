package org.TestNGEx2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseUser {
	@Test
	public void TestCaseUser1() {
		  System.out.println("TestCaseUser");

	  }
	@Test
	  public void CreatUser() {
		  System.out.println("CreatUser");
	  }
	@Test
	  public void DeleteUser() {
		  System.out.println("DeleteUser");
	  }
	@Test
	  public void VerifyUser() {
		  
		  System.out.println("VerifyUser");

	  }
@BeforeMethod
	  public void BeforeMethod() {
		  System.out.println("BeforeMethod");

		  
	  }
@AfterMethod

	  public void AfterMethod() {
		  System.out.println("AfterMethod");
	  }

}

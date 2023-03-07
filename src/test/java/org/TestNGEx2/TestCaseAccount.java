package org.TestNGEx2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseAccount {


@Test
public void TestCaseAccount() {
	  System.out.println("TestCaseAccount");

  }
@Test
  public void CreatAccount() {
	  System.out.println("CreatAccount");
  }
@Test
  public void DeleteAccount() {
	  System.out.println("DeleteAccount");
  }
@Test
  public void VerifyAccount() {
	  
	  System.out.println("VerifyAccount");

  }
@BeforeTest
  public void BeforeMethod() {
	  System.out.println("BeforeTest");

	  
  }
@AfterTest

  public void AfterMethod() {
	  System.out.println("AfterTest");
  }
}
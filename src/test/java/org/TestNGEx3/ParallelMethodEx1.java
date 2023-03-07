package org.TestNGEx3;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParallelMethodEx1 {


@Test(invocationCount=2,threadPoolSize=2)
public void TestCaseChorom() {
	String url="http://localhost/login.do";
	WebDriver driver=BaseUtility.bu.startup(url,"ch");
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	  System.out.println("TestCaseChorom");

  }

@Test
public void TestCaseFireFox() {
	String url="http://localhost/login.do";
	WebDriver driver=BaseUtility.bu.startup(url,"Ch");
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	  System.out.println("TestCaseFireFox");

  }
}
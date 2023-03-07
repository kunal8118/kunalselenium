package org.assertion;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx1 {
	@Test
	public void SoftAssert(){
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		  System.out.println("TestCaseChorom");
		  SoftAssert sa=new  SoftAssert();
		  String getTitle=driver.getTitle();
		  System.out.println("getTitle:"+getTitle);
		  sa.assertEquals(getTitle, "actiTIME - Enter Time-Track");
		
	}


}

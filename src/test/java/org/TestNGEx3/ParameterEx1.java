package org.TestNGEx3;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class ParameterEx1 {
	@Test
	@org.testng.annotations.Parameters({"BrowserName", "UserName", "Password"})
	public void Parameters(String Bname,String Uname,String Pwd) {
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bu.startup(url,Bname);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(Uname);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(Pwd);
		driver.findElement(By.id("loginButton")).click();
		  System.out.println("TestCaseChorom");


	

}
	}

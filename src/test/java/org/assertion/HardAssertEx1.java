package org.assertion;



import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssertEx1 {
	@Test
	public void HardAssert(){
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		  System.out.println("TestCaseChorom");
		  String getTitle=driver.getTitle();
		  System.out.println("getTitle:"+getTitle);
	        Assert.assertEquals(getTitle, "actiTIME - Enter Time-Track");
	        driver.close();
		
	}

}

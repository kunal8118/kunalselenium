package org.TestNGEx4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class TesngPractice {
	WebDriver driver=new ChromeDriver();;
	@BeforeTest
	public void begin() {
	   driver.get("https://www.mycarhelpline.com/");
	   WebElement ele=driver.findElement(By.linkText("Calculator"));
	    ele.click();
	}
	@Test
	public void test() {
		driver.findElement(By.cssSelector("#bodycontainer-innerpage > div.innerpage-bodycontainer-left > div > table:nth-child(7) > tbody > tr:nth-child(3) > td:nth-child(2) > span > a > img")).click();
	}
	@AfterTest
	public void test1() {
		driver.close();
		
	}

}

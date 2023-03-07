package org.Alert;

import org.Utility.BaseUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("program End");
		String url="https://demoqa.com/alerts";
		System.out.println("hit url");
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		System.out.println("open browser");
//		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement promtalertButtonbtn=driver.findElement(By.id("promtButton"));
		promtalertButtonbtn.click();
		promtalertButtonbtn.sendKeys("hi, from kunal");

		driver.switchTo().alert().accept();
	
		
		
	
	
		
		
		
		}
		}



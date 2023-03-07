package org.Alert;

import org.Utility.BaseUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("program End");
		String url="https://demoqa.com/alerts";
		System.out.println("hit url");
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		System.out.println("open browser");
//		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement confirmalertButtonbtn=driver.findElement(By.id("confirmButton"));
		confirmalertButtonbtn.click();

		driver.switchTo().alert().accept();
	
		
		
	
	
		
		
		
		}
		}



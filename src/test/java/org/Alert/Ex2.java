package org.Alert;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program Starts");
		String url="https://demoqa.com/alerts";
		System.out.println("hit url");
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		System.out.println("open browser");
//		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement timealertButtonbtn=driver.findElement(By.id("timerAlertButton"));
		timealertButtonbtn.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	
		
		
	
	
		
		
		
		}
		}



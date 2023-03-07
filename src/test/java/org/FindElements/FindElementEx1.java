package org.FindElements;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementEx1 {

	public static void main(String[] args) {
//		String url="https://demoqa.com/";
//		WebDriver driver=BaseUtility.bu.startup(url,"ch");
//		WebElement adv =driver.findElement(By.cssSelector("img[title='Ad.Plus Advertising']"));
//		adv.click();
		String url="https://online.actitime.com/kingorg/login.do";
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		WebElement usernm=driver.findElement(By.id("username"));
		usernm.sendKeys("kunal.thorat.1@gmail.com");
		WebElement passnm=driver.findElement(By.cssSelector("input[name='pwd']"));
		passnm.sendKeys("kunal@123");
		WebElement loginbtn=driver.findElement(By.cssSelector("a[id='loginButton']"));
		loginbtn.click();
	System.out.println(driver.getTitle());
		
		
		
	}

}

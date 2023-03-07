package org.BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForPracticeshortcut {

	public static void main(String[] args) {
//		WebDriver driver=null;
		String Googlepage="http://flipkart.com";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver =new ChromeDriver();
		driver.get(Googlepage);
		WebElement Flipkard=driver.findElement(By.cssSelector("	link[href='https://www.flipkart.com/']"));
		Flipkard.click();
//		driver.navigate().back();
		WebElement login=driver.findElement(By.cssSelector("a[href='/account/login?ret=/']"));
		login.click();
		
				WebElement loginno=driver.findElement(By.cssSelector("input[class='input']"));
				loginno.click();
				loginno.sendKeys("9423254537");
				
	}

}

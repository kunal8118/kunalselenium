package org.BasicMethod;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GettextEx1 {
	public static void main(String [] args) {
		String url="https://www.flipkart.com/";
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		WebElement searchbar=driver.findElement(By.cssSelector("input[title='Search for products, brands and more']"));
		searchbar.sendKeys("samsunge m");
	
		WebElement closbt=driver.findElement(By.xpath("	//button[@class='_2KpZ6l _2doB4z']"));
		closbt.click();
		WebElement searchbt=driver.findElement(By.cssSelector("button>svg[xmlns='http://www.w3.org/2000/svg']"));
		searchbt.click();
		WebElement loginbt=driver.findElement(By.xpath("//div[a[text()='Login']]"));
		loginbt.click();
		
				WebElement field=driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
				field.sendKeys("9423254537");
		
		
		
		
		
		
		
	}

}

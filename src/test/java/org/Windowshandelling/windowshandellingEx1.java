package org.Windowshandelling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowshandellingEx1 {

	public static void main(String[] args) {
		String url="https://demoqa.com/browser-windows";
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		WebElement btn=driver.findElement(By.id("windowButton"));
		btn.click();
		String parentid1=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		driver.switchTo().window(parentid1);
		List<WebElement> ele=driver.findElements(By.id("sampleHeading"));

		System.out.println();

		//		Iterator<String> itr=allwindow.iterator();

		String text="";


	}

}

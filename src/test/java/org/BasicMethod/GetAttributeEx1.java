package org.BasicMethod;

import org.Utility.BaseUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GetAttributeEx1 {
	public static void main(String [] args) {
		String url="https://demoqa.com/alerts";
		WebDriver driver=BaseUtility.bu.startup(url,"ch");
		driver.findElement(By.id("promtButton")).click();
		Alert alt=driver.switchTo().alert();

	
//		System.out.println(alt.getText());
//		alt.sendKeys("hi, from kunal");
//		alt.accept();







	}

}

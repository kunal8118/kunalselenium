package org.BasicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Ex4 {


	

	public static void main(String[] args) {
		WebDriver driver=null;
		String Googlepage="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		
		driver= new ChromeDriver();
		driver.get(Googlepage);
		WebElement emailid=driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		emailid.sendKeys("kunal.thorat.1@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		pass.sendKeys("kunal@123");
		String passw="kunal@123";
		if(passw.equals("kunal@123")) {
		WebElement login=driver.findElement(By.cssSelector("button[data-testid='royal_login_button']"));
	    login.click();
	}else {
		String forgotpass="https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcwMzA2Mzk3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login";
		driver.get(forgotpass);
	}
//		driver.close();

}
	public static void test1() {
		 String path=System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
			
	}
	}

package org.BasicMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex5 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.out.println("path:"+path);
		String browsername="ch";
		Ex5 obj=new Ex5();
		obj.startup(browsername);
		
	}
	public static WebDriver startup(String browsername) {
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome")||browsername.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
//		     ChromeDriver driver= new ChromeDriver();
			driver= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Firefox")||browsername.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe/");
//		     FirefoxDriver driver= new    FirefoxDriver();
			driver= new    FirefoxDriver();
		}
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		
		return driver;
	}

}

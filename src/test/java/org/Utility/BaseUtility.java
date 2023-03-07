package org.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtility {
	public static BaseUtility bu= new BaseUtility();

	public WebDriver startup(String url,String browsername) {
		
		String path=System.getProperty("user.dir");
		WebDriver driver=null;

		if(browsername.equalsIgnoreCase("chrome") ||browsername.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			 driver= new ChromeDriver(options);
			 }else if( (browsername.equalsIgnoreCase("Firefox") ||browsername.equalsIgnoreCase("FF"))){
				 System.setProperty("webdriver.chrome.driver", path+"\\drivers\\geckodriver.exe");
			      driver= new FirefoxDriver();
			      
			      
			 }
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	

	
	


	
		}
	public void Scrollpage(WebElement ele, WebDriver driver) {
		JavascriptExecutor js=(	JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)", ele);
		
	}
	public void click(WebElement ele, WebDriver driver) {
		JavascriptExecutor js=(	JavascriptExecutor)driver;
		js.executeScript("argument[0].click(true)", ele);
	}
 	public void notificationrmv() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options); 

	
	}
	}



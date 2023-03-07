package org.BasicMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {
	public static void main(String args[]) {
		String path=System.getProperty("user.dir");
		System.out.println("path:"+path);
		String browsername="ch";
		Ex1 obj=new Ex1();
		obj.startup(browsername);
	}
	
	public WebDriver startup(String browsername) {
		String path=System.getProperty("user.dir");
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome") ||browsername.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
			 driver= new ChromeDriver();
			 }else if( (browsername.equalsIgnoreCase("Firefox") ||browsername.equalsIgnoreCase("FF"))){
				 System.setProperty("webdriver.chrome.driver", path+"\\drivers\\geckodriver.exe");
			      driver= new FirefoxDriver();
		}
	    
		
	     return driver;
		
		
}
	}




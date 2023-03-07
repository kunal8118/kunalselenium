package org.BasicMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.Utility.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.propertiesfile.PropertiesFile;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		PropertiesFile obj=new PropertiesFile();

		String BrowserName=obj.PropertiesflileEx("BrowserName");
		String url=obj.PropertiesflileEx("UrL");
		String userName=obj.PropertiesflileEx("userName");
		String password=obj.PropertiesflileEx("password");
		WebDriver driver=BaseUtility.bu.startup(url,BrowserName);
	
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
		driver.findElement(By.cssSelector("span[dir='auto']")).click();

		





	}
	public String PropertiesflileEx(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".\\PropertiesFile\\Propertiesfile\\config.proprties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		System.out.println(value);

		return value;

	}




}



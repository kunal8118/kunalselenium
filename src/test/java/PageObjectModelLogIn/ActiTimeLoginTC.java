package PageObjectModelLogIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeLoginTC {
	private WebDriver driver=new ChromeDriver();		
	
	@BeforeMethod
	public void openURL()  {
		driver.get("http://localhost/login.do");		
		//String Url="http://localhost/login.do";
		//BaseUtility.bu.startup(Url,"ch");
//		WebElement unam=driver.findElement(By.id("username"));
//		WebElement pass=driver.findElement(By.cssSelector("input[placeholder='Password']"));
//		WebElement click=driver.findElement(By.id("loginButton"));
//Thread.sleep(10000);
//		System.out.println(unam.isDisplayed());
//		System.out.println(pass.isDisplayed());
//		System.out.println(click.isDisplayed());
		
//		
//		unam.sendKeys("admin");
//		pass.sendKeys("manager");
//		click.click();


	}
   @Test
	public void login() {
 POM_LogIn obj=new POM_LogIn(driver);
//		obj.pwdtextfielddisplayed();
//		obj.loginbtndisplayed();
		obj.enterUsername("admin");
		obj.enterPassword("manager");
		obj.enterloginButton();
	
	}	

}

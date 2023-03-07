package PageObjectModelLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LogIn {
	 WebDriver driver;
//	private WebElement
//	@FindBy(id="username")
//	private WebElement Untextfield;
//	@FindBy(css="input[placeholder='Password']")
//	private WebElement pwdtextfield;
//	@FindBy(id="loginButton")
//	private WebElement loginbtn;
//	
	WebElement Untextfield=driver.findElement(By.id("username"));
	WebElement pwdtextfield=driver.findElement(By.cssSelector("input[placeholder='Password']"));
	WebElement loginbtn=driver.findElement(By.id("loginButton"));


//constructor
 public POM_LogIn(WebDriver driver) {
	 PageFactory.initElements( driver,POM_LogIn.class);
	 this.driver=driver;
	 
 }
 
//ActionMethod
 public boolean Untextfielddisplayed() {
	 System.out.println(Untextfield.isDisplayed());
	 return Untextfield.isDisplayed();
	 
 }
 public boolean pwdtextfielddisplayed() {
	 return pwdtextfield.isDisplayed();
	 
 }
 public boolean loginbtndisplayed() {
	 return loginbtn.isDisplayed();
	 
 }

public void enterUsername(String uname) {
	Untextfield.sendKeys(uname);
	}
public void enterPassword(String pwdname) {
	pwdtextfield.sendKeys(pwdname);
	}
public void enterloginButton() {
	loginbtn.click();
	}






}

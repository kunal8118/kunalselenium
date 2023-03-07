package org.BasicMethod;

import org.Utility.BaseUtility;
import org.openqa.selenium.WebDriver;

public class CallStartupBU {

	public static void main(String[] args) {
	
		String url="https://www.google.com/";
		WebDriver driver=BaseUtility.bu.startup(url,"FF");
	
		

	
	}

}

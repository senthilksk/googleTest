package Pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class loginPage {
	
	WebDriver wd ;
	@Test
	public void login()  {
		
		 wd = new FirefoxDriver();
		wd.get("https://www.google.co.in/");

	}
	


}

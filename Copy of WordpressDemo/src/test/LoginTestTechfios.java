package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.LoginPageTechfios;
import util.BrowserFactory;

public class LoginTestTechfios {

@Test
public void loginTest() throws IOException{
		
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/biling/?ng=login");
				
		
LoginPageTechfios loginPage1 = PageFactory.initElements(driver, LoginPageTechfios.class);
		
			
loginPage1.login_demo1();

driver.close();

driver.quit();
			
	
}

}
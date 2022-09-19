package scripts;
//implementing POM classes
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.baseTest;
import pages.initialisePages;

public class actiLogin extends baseTest {
	
	@Test
	public void actiLogin()
	{
		initialisePages pages = new initialisePages(driver);
		pages.actiLogin.login(p.getProperty("username"), p.getProperty("password"));
	}

}

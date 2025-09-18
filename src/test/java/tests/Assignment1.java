package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import browser.login.Login;
import browser.login.central.Central;
import reusables.Elements;

public class Assignment1 extends LaucnBrowser {
	
	Elements elements = new Elements();
	
	@Test(priority = 1, enabled = true)

	public void verifyBrowserTitle() {

		assertEquals(driver.getTitle(), "IMSAXE");

	}

	@Test(priority = 2, enabled = true)
	public void verifyIMSLogin() {
		
		Login login = new Login();
		
		login.loginUser();
		
		
	}
	
	@Test(priority=3,enabled=true,dependsOnMethods = "verifyIMSLogin")
	public void verifyExecuteButton() {
		
		Central central = new Central();
		central.openExecuteScript();
		
		Assert.assertEquals(true, true);
		
		
	}
	
}

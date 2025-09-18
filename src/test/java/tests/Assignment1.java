package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import browser.login.Login;

public class Assignment1 extends LaucnBrowser {

	@Test(priority = 1, enabled = true)

	public void verifyBrowserTitle() {

		assertEquals(driver.getTitle(), "IMSAXE");

	}

	@Test(priority = 2, enabled = true)
	public void verifyIMSLogin() {
		
		Login login = new Login();
		
		login.loginUser();
		
		
	}
	
	@Test(priority=3,enabled=true)
	public void verifyExecuteButton() {
		
		
		
	}
	
}

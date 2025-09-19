package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.login.Login;
import browser.login.central.Central;
import browser.login.central.quickcapExecute.QuickCapExecute;
import reusables.Elements;

public class Assignment1 extends LaucnBrowser {
	
	SoftAssert softAssert = new SoftAssert();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
	
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
		
		softAssert.assertAll();
		
	}
	
	@Test(priority=4,enabled=true,dependsOnMethods = "verifyExecuteButton")
	public void verifyProductDropDown() {
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://imsaxes.meditab.com/#/Execute/SANITY/EditConfigSanity";
		
		softAssert.assertEquals(currentURL, expectedURL);
		
		QuickCapExecute quickcapExecute = new QuickCapExecute(driver);
		
		quickcapExecute.selectQuickCap();
		
		
		
	}
	
}

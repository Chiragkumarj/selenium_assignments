package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import reusables.Driver;

public class LaucnBrowser extends Driver {
	
	
	
	@BeforeSuite(enabled = true, description = "This Method will Lauch Site Under test")
	public void lauchSite() {

		String siteName = "https://imsaxes.meditab.com/";

		launchBrowser();

		driver.get(siteName);

	}

	@AfterSuite(enabled = true,alwaysRun = true)
	public void closeDriver() {

		driver.quit();

	}

}

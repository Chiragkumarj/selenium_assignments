package browser.login.central.quickcapExecute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class QuickCapExecute {

	WebDriver driver;
	WebDriverWait webDriverwait;
	SoftAssert sa;

	public QuickCapExecute(WebDriver driver) {
		this.driver = driver;
		webDriverwait = new WebDriverWait(this.driver, Duration.ofSeconds(6));
		sa = new SoftAssert();
	}

	public By productSelect = By.xpath(
			"//div[normalize-space(text())='QuickCap' or normalize-space(text())='IMS']/parent::*/parent::*/ descendant::*/*[local-name()='svg']");
	public By testingTypeSelect = By.xpath(
			"//div[normalize-space(text())='REGRESSION' or normalize-space(text())='SANITY' or normalize-space(text())='BROKEN POPUP']");

	public By IMS = By.xpath("//div[@id='react-select-2-listbox']/*[text()='IMS' and @role='option']");
	public By Quickcap = By.xpath("//div[@id='react-select-2-listbox']/*[text()='QuickCap' and @role='option']");

	public void selectQuickCap() {

		webDriverwait.until(ExpectedConditions.elementToBeClickable(productSelect));

		String selectedProduct = driver.findElement(productSelect).getText();

		sa.assertEquals(selectedProduct, "QuickCap", "Asserting Already selected product is Quickcap");

		driver.findElement(productSelect).click();

		webDriverwait.until(ExpectedConditions.presenceOfElementLocated(IMS));
		driver.findElement(IMS).click();
		
		try {
			webDriverwait.until(ExpectedConditions.textToBe(productSelect, "IMS"));
		} catch (Exception e) {
			System.out.print("exception occuurred");
		}
		

		String productName = driver.findElement(productSelect).getText();

		sa.assertEquals(productName, "IMS");

		sa.assertAll();

	}

}

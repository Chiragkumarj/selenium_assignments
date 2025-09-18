package browser.login;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reusables.Driver;

public class Login extends Driver {

	private By userNameInput = By.xpath("//input[@id='userName']");
	private By passwordInput = By.xpath("//input[@id='password']");
	private By loginButton = By.cssSelector("[type='submit']");
	private By SpanIMSAxes = By.xpath("//span[text()='IMSAXE']");
	
	public void loginUser() {

		String password = props.getProperty("password");
		String username = props.getProperty("username");
		
		driver.findElement(userNameInput).sendKeys(username);
		driver.findElement(passwordInput).sendKeys(password);
		driver.findElement(loginButton).click();
		
		WebElement span = driver.findElement(SpanIMSAxes);
		
		if (span == null) {
			Assert.fail("Span IMSAxes Element Not Exists!");
		}
		

	}

}

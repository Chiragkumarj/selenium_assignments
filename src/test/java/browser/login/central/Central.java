package browser.login.central;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reusables.Driver;
import reusables.Elements;

public class Central extends Elements{


	By execute = By.xpath("//a[@data-name='Execution']");
	
	public void openExecuteScript() {
		
		if (isElementExist(execute)) {
			driver.findElement(execute).click();
		}
		
	}
	
	
	
	
}

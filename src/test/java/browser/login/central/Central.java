package browser.login.central;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reusables.Driver;

public class Central extends Driver{

	@FindBy(xpath = "//a[@data-name='Execution']")
	private WebElement execute;
	
	
	public void openExecuteScript() {
		
		
		
	}
	
	
	
	
}

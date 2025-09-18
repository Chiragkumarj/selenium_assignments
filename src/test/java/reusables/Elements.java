package reusables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Elements extends Driver {
	
	/**
	 * This method will checks the elements existence and return boolean
	 * @param element
	 * @return
	 */
	public boolean isElementExist(By element) {
		
		List<WebElement> elements = driver.findElements(element);
		
		if (!elements.isEmpty()) {
			return true;
		}
		return false;
		
	}
	
	
}

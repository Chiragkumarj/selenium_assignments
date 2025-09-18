package reusables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Driver {

	public static WebDriver driver;
	public static Properties props = new Properties();

	public void launchBrowser() {

		// Read from Config.Properties file

		Path path = Path.of("config.properties");
		File file = path.getFileName().toFile();

		try (FileInputStream fis = new FileInputStream(file)) {
			props.load(fis);
		} catch (IOException e) {
			Assert.fail("Exception occurred During Reading from config.properties file", e);
		}

		// Get browser_name
		String browserName = props.getProperty("browser.name");

		ChromeOptions options = new ChromeOptions();
		options.setImplicitWaitTimeout(java.time.Duration.ofMillis(2000));

		switch (browserName) {
		case "Chrome":

			driver = new ChromeDriver(options);
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		case "MsEdge":

			driver = new EdgeDriver();

			break;
		default:

			Assert.fail("Failed as Given Browser is Not handled");

			break;
		}
	}

}

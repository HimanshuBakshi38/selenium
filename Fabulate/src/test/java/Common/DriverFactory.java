package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {

	private static DriverFactory factory = new DriverFactory();
	private WebDriver driver;

	private DriverFactory() {
	}

	public static DriverFactory getInstance() {
		return factory;
	}

	public WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		return driver;
	}
}

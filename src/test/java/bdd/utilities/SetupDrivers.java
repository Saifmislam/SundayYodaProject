package bdd.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;

	
	public static void setupDriver() {

    	//System.setProperty("webdriver.chrome.driver", "C:/TTSoftware/chromedriver.exe");
		WebDriverManager.chromedriver().driverVersion("84.0.4147.89").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
//84.0.4147.89
	public static WebDriver getDriver() {
		return driver;

	}

	public static void tearDownDriver() {
		driver.quit();
	}
}
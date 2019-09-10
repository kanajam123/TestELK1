package example;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	public Logger logger = Logger.getLogger(NewTest.class);
	private WebDriver driver;

	@Test
	public void testEasy() {

		PropertyConfigurator.configure("log4j.properties");
		logger.info("EddAutoamtionTest Started");
		//driver.get("http://demo.guru99.com/test/guru99home/");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.One.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Two.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Three.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Four.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Five.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Six.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Seven.Pass ");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Eight.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("EddAutoamtion.Nine.Pass");
		AssertJUnit.assertTrue(title.contains("FordDirectOne"));
		logger.info("EddAutoamtion.Ten.Failures");
		AssertJUnit.assertTrue(title.contains("FordDirectOne"));
		logger.info("EddAutoamtion.Eleven.Failures");
		logger.info("EddAutoamtionTest Ended");
	}

	@BeforeTest
	public void beforeTestChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanajam.madhu\\git\\TestELK1\\workspace\\FDTestApp\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setCapability("marionette", true);
		driver = new ChromeDriver(capabilities);

	}

	/*
	 * @BeforeTest public void beforeTestFirefox() {
	 * System.setProperty("webdriver.gecko.driver",
	 * "D:\\TestELK\\workspace\\FDTestApp\\geckodriver.exe");
	 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	 * capabilities.setCapability("marionette", true); driver = new
	 * FirefoxDriver(capabilities); //driver = new FirefoxDriver(); }
	 */

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
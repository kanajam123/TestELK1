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
	public void testEasyOne() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.One.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.One.Pass");
		logger.info("FDTestApp.One.Ended");
	}

	@Test
	public void testEasyTwo() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Two.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Two.Pass");
		logger.info("FDTestApp.Two.Ended");
	}
	
	@Test
	public void testEasyThree() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Three.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Three.Pass");
		logger.info("FDTestApp.Three. Ended");
	}
	
	@Test
	public void testEasyfour() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Four.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Four.Pass");
		logger.info("FDTestApp.Four.Ended");
	}
		
	@Test
	public void testEasyfive() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Five.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Five.Pass");
		logger.info("FDTestApp.Five.Ended");
	}
	
	
	@Test
	public void testEasySix() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.six.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Six.Pass");
		logger.info("FDTestApp.six.Ended");
	}
	
	@Test
	public void testEasySeven() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.seven.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Seven.Pass ");
		logger.info("FDTestApp.seven.Ended");
	}
	
	@Test
	public void testEasyEight() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Eight.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Eight.Pass");
		logger.info("FDTestApp.Eight.Ended");
	}
	
	
	@Test
	public void testEasyNine() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Nine.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Nine.Pass");
		logger.info("FDTestApp.Nine.Ended");
	}
	
	@Test
	public void testEasyTen() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Ten.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirect"));
		logger.info("FDTestApp.Ten.Failures");
		logger.info("FDTestApp.Ten.Ended");
	}
	
	@Test
	public void testEasyEleven() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Eleven.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirectOne"));
		logger.info("FDTestApp.Eleven.Failures");
		logger.info("FDTestApp.Eleven.Ended");
	}
	
	@Test
	public void testEasyTwelve() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FDTestApp.Twelve.Started");
		driver.get("https://www.forddirect.com/");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("FordDirectOne"));
		logger.info("FDTestApp.Twelve.Failures");
		logger.info("FDTestApp.Twelve.Ended");
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
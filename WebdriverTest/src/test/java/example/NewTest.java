package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
	}

	@BeforeTest
	public void beforeTest() {
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().browserVersion("99.0.4844.82-1").setup();
		driver = new ChromeDriver(chromeoptions);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

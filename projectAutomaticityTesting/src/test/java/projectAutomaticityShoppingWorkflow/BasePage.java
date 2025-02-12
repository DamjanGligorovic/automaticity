package projectAutomaticityShoppingWorkflow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import projectAutomaticity.TestPage;

public class BasePage {
	WebDriver driver;
	LoginPage bookPage;
	TestPage testData;
	
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		bookPage = new LoginPage (driver);
		testData = new TestPage();
	}	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}

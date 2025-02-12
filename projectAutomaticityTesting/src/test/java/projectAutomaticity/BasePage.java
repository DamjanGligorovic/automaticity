package projectAutomaticity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BasePage {
	WebDriver driver;
	RegistrationPage bookPage;
	TestPage testData;
	
	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		bookPage = new RegistrationPage(driver);
		testData = new TestPage();
	}
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
}

package projectAutomaticityLogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
    WebDriver driver;
    LoginPage bookPage;

    @BeforeTest
    public void initialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        
        // Initialize LoginPage instance
        bookPage = new LoginPage(driver);
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();  // It's better to use quit() to close all browser windows
    }
}


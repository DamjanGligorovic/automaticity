package projectAutomaticityLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestPage1 extends BasePage {
	 @BeforeMethod
	    public void navigation() {
	        driver.navigate().to("https://automaticityacademy.ngrok.app/");
	        driver.navigate().refresh();
	    }

	    @AfterMethod
	    public void deleteCookie() {
	        driver.manage().deleteAllCookies();
	    }

    @Test
    public void testCase1() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        
        bookPage.clickOnTheButtonLogIn();
        Thread.sleep(1000);
        bookPage.clickButtonForgotPassword();
        Thread.sleep(1000);
        bookPage.insertDataEmail("damjangligorovic@hotmail.com");  
        bookPage.clickButtonForgotRecoveryLink();

        softAssert.assertTrue(bookPage.verifyRedErrorMessage12("Please wait before retrying."));
        		
        
        softAssert.assertAll();
    }
}


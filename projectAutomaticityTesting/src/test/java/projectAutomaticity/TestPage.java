package projectAutomaticity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestPage extends BasePage {

    @BeforeMethod
    public void navigation() {
        driver.navigate().to("https://automaticityacademy.ngrok.app/");
        driver.navigate().refresh();
    }

    @AfterMethod
    public void deleteCookie() {
        driver.manage().deleteAllCookies();
    }
    // ------------POSITIVE TEST CASES - REGISTRATION PAGE AUTOMATICITY-------------------------------

    @Test(dataProvider = "correctUsername", dataProviderClass = TestDataUsername.class)
    public void testCase1(String username, String email) {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickButtonRegister();
        bookPage.insertDataUsername(username);
        bookPage.insertDataEmail(email);
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickButtonRegister2();
        softAssert.assertTrue(bookPage.verifyConfirmationMessageDisplayed("Successfully registered!", "The username has already been taken."));
        bookPage.clickButtonMenu();
        bookPage.clickButtonLogOut();
        softAssert.assertAll();
    }
    @Test (priority =20)
    public void testCase2() {
    	SoftAssert softAssert = new SoftAssert();
    	 String currentURL1 = driver.getCurrentUrl();
         String actualURL1 = "https://automaticityacademy.ngrok.app/";
         String currentTitle1 = driver.getTitle();
         String actualTitle1 = "AQA eShop - Academy Ecommerce App";
         softAssert.assertEquals(currentTitle1, actualTitle1);
         softAssert.assertEquals( currentURL1, actualURL1);

         bookPage.clickButtonRegister();
         bookPage.insertDataUsername("");
         bookPage.insertDataEmail("johndamjan@gmail.com");
         bookPage.insertDataPassword("Felina10@");
         bookPage.clickButtonRegister2();
         bookPage.verifyErrorMessageUsernameIsRequired("The username field is required.");

         softAssert.assertAll();

    }

    @Test(dataProvider = "correctEmail", dataProviderClass = TestDataEmail.class)
    public void testCase3(String emailInput, String usernameInput) {
        bookPage.clickButtonRegister();
        bookPage.insertDataUsername(usernameInput);
        bookPage.insertDataEmail(emailInput);  
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickButtonRegister2();
    }
    @Test(dataProvider = "incorrectEmail", dataProviderClass = TestDataInvalidEmail.class)
    public void testCase4(String emailInput, String usernameInput) {
    	SoftAssert softAssert = new SoftAssert();

        bookPage.clickButtonRegister();
        bookPage.insertDataUsername(usernameInput);
        bookPage.insertDataEmail(emailInput);  
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickButtonRegister2();
        softAssert.assertTrue(bookPage.verifyErrorMessage2("The email field format is invalid."));
        softAssert.assertAll();

    }
    @Test(dataProvider = "correctPassword", dataProviderClass = TestDataPassword.class)
    public void testCase5( String passwordInput, String usernameInput) {
    	SoftAssert softAssert = new SoftAssert();

        bookPage.clickButtonRegister();
        bookPage.insertDataUsername(usernameInput);
        bookPage.insertDataEmail("damjangligorovic@hotmail.com");  
        bookPage.insertDataPassword(passwordInput);
        bookPage.clickButtonRegister2();
        softAssert.assertAll();

    }
    @Test(dataProvider = "incorrectPassword1", dataProviderClass = TestDataPassword2.class)
    public void testCase6( String passwordInput, String usernameInput) {
    	SoftAssert softAssert = new SoftAssert();

        bookPage.clickButtonRegister();
        bookPage.insertDataUsername(usernameInput);
        bookPage.insertDataEmail("damjangligorovic@hotmail.com");  
        bookPage.insertDataPassword(passwordInput);
        bookPage.clickButtonRegister2();
        softAssert.assertTrue(bookPage.verifyErrorMessageInvalidPassword("The password field must be at least 6 characters."));
        softAssert.assertAll();

    }
    @Test (priority =3)
    public void testCase7() throws InterruptedException {
    	SoftAssert softAssert = new SoftAssert();
    	 String currentURL1 = driver.getCurrentUrl();
         String actualURL1 = "https://automaticityacademy.ngrok.app/";
         String currentTitle1 = driver.getTitle();
         String actualTitle1 = "AQA eShop - Academy Ecommerce App";
         softAssert.assertEquals(currentTitle1, actualTitle1);
         softAssert.assertEquals( currentURL1, actualURL1);

         bookPage.clickButtonRegister();
         bookPage.insertDataUsername("NimrodIsreal21");
         bookPage.insertDataEmail("");
         bookPage.insertDataPassword("Felina10@");
         bookPage.clickButtonRegister2();
         Thread.sleep(500);
         softAssert.assertTrue(bookPage.verifyConfirmationsMessage5("The email field is required."));

         softAssert.assertAll();

    }
    @Test (priority =5)
    public void testCase8() {
    	SoftAssert softAssert = new SoftAssert();
    	 String currentURL1 = driver.getCurrentUrl();
         String actualURL1 = "https://automaticityacademy.ngrok.app/";
         String currentTitle1 = driver.getTitle();
         String actualTitle1 = "AQA eShop - Academy Ecommerce App";
         softAssert.assertEquals(currentTitle1, actualTitle1);
         softAssert.assertEquals( currentURL1, actualURL1);

         bookPage.clickButtonRegister();
         bookPage.insertDataUsername("NimrodIsreal21");
         bookPage.insertDataEmail("glfdjgl@gmail.com");
         bookPage.insertDataPassword("");
         bookPage.clickButtonRegister2();
         softAssert.assertTrue(bookPage.verifyConfirmationsMessage6("The password field is required."));

         softAssert.assertAll();

    }
    @Test (priority =7)
    
    public void testCase9() {
    	SoftAssert softAssert = new SoftAssert();
    	 String currentURL1 = driver.getCurrentUrl();
         String actualURL1 = "https://automaticityacademy.ngrok.app/";
         String currentTitle1 = driver.getTitle();
         String actualTitle1 = "AQA eShop - Academy Ecommerce App";
         softAssert.assertEquals(currentTitle1, actualTitle1);
         softAssert.assertEquals( currentURL1, actualURL1);

        
         bookPage.clickButtonRegister();
        

         bookPage.clickLinkLogIn();
       

         softAssert.assertAll();

    }
    @Test (priority =10)
    
    public void testCase10() {
    	SoftAssert softAssert = new SoftAssert();
    	 String currentURL1 = driver.getCurrentUrl();
         String actualURL1 = "https://automaticityacademy.ngrok.app/";
         String currentTitle1 = driver.getTitle();
         String actualTitle1 = "AQA eShop - Academy Ecommerce App";
         softAssert.assertEquals(currentTitle1, actualTitle1);
         softAssert.assertEquals( currentURL1, actualURL1);

         bookPage.clickButtonRegister();
         
         bookPage.clickButtonRegister2();
         bookPage.verifyConfirmationsMessage6("The password field is required.");
         bookPage.verifyConfirmationsMessage5("The email field is required.");
         softAssert.assertTrue(bookPage.verifyErrorMessageUsernameIsRequired("The username field is required."));

         softAssert.assertAll();

    }
 

    
}





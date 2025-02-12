package projectAutomaticityLogin;

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
    @Test(dataProvider = "correctEmail1", dataProviderClass = TestDataValidEmailLogin.class)
    public void testCase1(String email) {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail(email);
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickOnTheButtonSignIn();
        bookPage.clickButtonMenu();
        bookPage.clickButtonLogOut();
        softAssert.assertAll();
    }
    @Test(dataProvider = "incorrectEmail", dataProviderClass = TestDataInvalidEmail1.class)
    public void testCase2(String email) {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail(email);
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickOnTheButtonSignIn();
        softAssert.assertTrue(bookPage.verifyRedErrorMessage1("The email field must be a valid email address."));
        
        softAssert.assertAll();
    }
    @Test(priority =5)
    public void testCase3() {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail("");
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickOnTheButtonSignIn();
        softAssert.assertTrue(bookPage.verifyRedErrorMessage8("The email field is required."));
        softAssert.assertAll();


    }
    @Test(dataProvider = "correctPassword1", dataProviderClass = TestDataValidPassword.class)
    public void testCase4(String password, String email) {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail(email);
        bookPage.insertDataPassword(password);
        bookPage.clickOnTheButtonSignIn();
        softAssert.assertTrue(bookPage.verifyRedErrorMessage9("The email address or password you entered is invalid"));

        softAssert.assertAll();
    }
    @Test(dataProvider = "incorrectPassword1", dataProviderClass = TestDataInvalidPassword.class)
    public void testCase5(String email) {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail(email);
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickOnTheButtonSignIn();
        softAssert.assertTrue(bookPage.verifyRedErrorMessage1("The email field must be a valid email address."));
        
        softAssert.assertAll();
    }
    @Test(priority =4)
    public void testCase6() {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail("damjangligorovic@hotmail.com");
        bookPage.insertDataPassword("");
        bookPage.clickOnTheButtonSignIn();
        softAssert.assertTrue(bookPage.verifyRedErrorMessage10("The password field is required."));
        softAssert.assertAll();


    }
   
    @Test(priority =3)
    public void testCase8() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        Thread.sleep(5000);
        bookPage.clickButtonForgotPassword();
        Thread.sleep(5000);

        bookPage.insertDataEmail("");
        Thread.sleep(5000);

        bookPage.clickButtonForgotRecoveryLink();
        Thread.sleep(10000);

        softAssert.assertTrue(bookPage.verifyRedErrorMessage12("The email field is required."));
        softAssert.assertAll();


    }
    @Test(priority =3)
    public void testCase10() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.clickLinkCreateAccount();

        softAssert.assertAll();


    }
    @Test(priority =3)
    public void testCase12() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail("damjanserbia123@gmail.com");
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickOnTheButtonSignIn();
        bookPage.clickButtonMenu();
        bookPage.clickButtonLogOut();

        softAssert.assertAll();


    }
}
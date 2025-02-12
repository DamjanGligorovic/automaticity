package projectAutomaticityShoppingWorkflow;

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
    @Test
    public void testCase1() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        bookPage.clickOnTheButtonLogIn();
        bookPage.insertDataEmail("damjanserbia123@gmail.com");
        bookPage.insertDataPassword("Felina10@");
        bookPage.clickOnTheButtonSignIn();
        Thread.sleep(20000);
        bookPage.clickFirstProduct();
        bookPage.clickButtonBigButtonShoppingCart();
        bookPage.clickButtonButtonCheckout();
        bookPage.clickButtonNextSteps();
        bookPage.clickButtonMakeChanges();
        bookPage.insertDataFirstName("Tihomir");
        bookPage.insertDataLastName("Spasic");
        bookPage.insertDataEmail("tihomirspasic@gmail.com");
        bookPage.insertDataPhoneNumber("0673853585");
        bookPage.insertDataStreetAndNumber("Krunska 45");
        bookPage.insertDataCity("Aleksinac");
        bookPage.clickButtonUpdate();
        bookPage.clickButtonNextStep();
        bookPage.clickButtonMakeChanges();
       // Thread.sleep(20000);
        bookPage.insertDataCardHolder("Tihomir Spasic");
        bookPage.insertDataCardNumber("54859489342");
        bookPage.insertDataCVVNumber("456");
        bookPage.clickButtonUpdate();
        bookPage.clickButtonNextStep();
        bookPage.clickOnTheButtonPlaceOrder();

        softAssert.assertAll();
    }
   
}
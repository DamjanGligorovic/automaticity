package projectAutomaticityLogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	 WebDriver driver;
	 Actions actions;
	 WebDriverWait wait;
	 
	 @FindBy(css="div[class='mr-2']")
	 WebElement buttonRegister;
	 @FindBy(id= "email")
	 WebElement field_Email;
	 @FindBy(id = "username")
	 WebElement field_Username;
	 @FindBy(id = "password")
	 WebElement field_Password;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div.flex.align-items-center.justify-content-between > button")
	 WebElement button_Register2;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > div.mt-4.text-sm.text-green-600.text-center")
	 WebElement confirmationMessage;
	 @FindBy(css="button[class='inline-flex items-center px-3 py-2 border border-transparent text-sm leading-4 font-medium rounded-md text-primary hover:text-gray-600 focus:outline-none transition ease-in-out duration-150']")
	 WebElement button_Menu;
	 @FindBy(css="button[class='block w-full px-4 py-2 text-start text-sm leading-5 text-gray-700 hover:bg-gray-100 focus:outline-none focus:bg-gray-100 transition duration-150 ease-in-out']")
	 WebElement button_LogOut;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div:nth-child(1) > div > p")
	 WebElement errorMessage;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div:nth-child(1) > div > p")
	 WebElement errorMessage3;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div:nth-child(2) > div > p")
	 WebElement errorMessage2;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div:nth-child(3) > div > p")
	 WebElement errorMessage4;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div:nth-child(2) > div > p")
	 WebElement errorMessage5;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div:nth-child(3) > div > p")
	 WebElement errorMessage6;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > div > a")
	 WebElement link_LogIn;
	 @FindBy(css="#loginBtn")
	 WebElement button_LogIn;
	 @FindBy(css="button[aria-label='Sign in']")
	 WebElement button_SignIn;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > p:nth-child(1)")
	 WebElement errorMessageInvalidEmail;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > p:nth-child(1)")
	 WebElement errorMessageEmailRequired;
	 @FindBy(css=".text-sm.text-red-600")
	 WebElement errorMessagePasswordInvalid1;
	 @FindBy(css=".text-sm.text-red-600")
	 WebElement errorMessagePasswordRequired;
	 @FindBy(css=".font-medium.no-underline.text-primary.text-right.cursor-pointer")
	 WebElement link_ForgotPassword;
	 @FindBy(css="button[aria-label='Password recovery link']")
	 WebElement button_PasswordRecoveryLink;
	 @FindBy(css=".text-sm.text-red-600.mt-2")
	 WebElement errorMessage_PleaseWait;
	 @FindBy(css=".text-sm.text-red-600.mt-2")
	 WebElement errorMessageEmailRequired1;
	 @FindBy(css="a[class='font-medium no-underline ml-2 text-primary text-lg hover:text-gray-600 cursor-pointer']")
	 WebElement link_CreateAccount;
	 public LoginPage (WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 actions = new Actions(driver);
		 wait = new WebDriverWait (driver, Duration.ofSeconds(15));
		 
	}
	 public void insertDataEmail(String email) {
		 wait.until(ExpectedConditions.visibilityOf(field_Email));
		 field_Email.clear();
		 field_Email.sendKeys(email);
		 
	 }
	 public void insertDataUsername(String username) {
	 wait.until(ExpectedConditions.visibilityOf(field_Username));
	 field_Username.sendKeys(username);
	 
}
	 public void insertDataPassword(String password) {
		 wait.until(ExpectedConditions.visibilityOf(field_Password));
		 field_Password.clear();
		 field_Password.sendKeys(password);
		 
	}
	 
	 
	
	 public String verifyURLBeforeSubmit() {
		 return driver.getCurrentUrl();
	 }
	 public void clickLinkCreateAccount() {
		 wait.until(ExpectedConditions.elementToBeClickable(link_CreateAccount)).click();
	 }
	 public void clickButtonRegister() {
		 wait.until(ExpectedConditions.elementToBeClickable(buttonRegister)).click();
	 }
	 public void clickButtonForgotPassword() {
		 wait.until(ExpectedConditions.elementToBeClickable(link_ForgotPassword)).click();
	 }
	 public void clickButtonForgotRecoveryLink() {
		 
		 wait.until(ExpectedConditions.visibilityOf(button_PasswordRecoveryLink));
		 wait.until(ExpectedConditions.elementToBeClickable(button_PasswordRecoveryLink)).click();
	 }
	 public void clickButtonRegister2() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Register2)).click();
	 }
	 public void clickButtonMenu() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Menu)).click();
	 }
	 public void clickButtonLogOut() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_LogOut)).click();
	 }
	 public void clickLinkLogIn() {
		 wait.until(ExpectedConditions.elementToBeClickable(link_LogIn)).click();
	 }
	 public void clickOnTheButtonLogIn() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_LogIn)).click();
	 }
	 public void clickOnTheButtonSignIn() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_SignIn)).click();
	 }
	 public String verifyURLAfterSubmit() {
		 return driver.getCurrentUrl();
	 }
	 public String verifyTitleBeforeSubmit() {
		 return driver.getTitle();
	 }
	 public String verifyTitleAfterSubmit() {
		 return driver.getTitle();
	 }
	
	 public boolean verifyRedErrorMessage1(String errorMessage1) {
		 return errorMessageInvalidEmail.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyRedErrorMessage8(String errorMessage1) {
		 return errorMessageEmailRequired.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyRedErrorMessage9(String errorMessage1) {
		 return errorMessagePasswordInvalid1.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyRedErrorMessage10(String errorMessage1) {
		 return errorMessagePasswordRequired.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyRedErrorMessage11(String errorMessage1) {
		 return errorMessage_PleaseWait.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyRedErrorMessage12(String errorMessage1) {
		 return errorMessageEmailRequired1.getText().contains(errorMessage1);
		 		
	 }
}



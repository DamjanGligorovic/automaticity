package projectAutomaticity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

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
	 @FindBy(css=".mt-4.text-sm.text-green-600.text-center")
	 WebElement confirmationMessageSuccessfullyRegistered;
	 @FindBy(css="button[class='inline-flex items-center px-3 py-2 border border-transparent text-sm leading-4 font-medium rounded-md text-primary hover:text-gray-600 focus:outline-none transition ease-in-out duration-150']")
	 WebElement button_Menu;
	 @FindBy(css="button[class='block w-full px-4 py-2 text-start text-sm leading-5 text-gray-700 hover:bg-gray-100 focus:outline-none focus:bg-gray-100 transition duration-150 ease-in-out']")
	 WebElement button_LogOut;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > p:nth-child(1)")
	 WebElement errorMessageUsernameAlreadyTaken;
	 @FindBy(css=".text-sm.text-red-600")
	 WebElement errorMessageUsernameIsRequired;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > p:nth-child(1)")
	 WebElement errorMessageEmailInvalid;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > p:nth-child(1)")
	 WebElement errorMessageInvalidPassword;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3)")
	 WebElement errorMessageEmailIsRequired;
	 @FindBy(css="body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > p:nth-child(1)")
	 WebElement errorMessagePasswordIsRequired;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > div > a")
	 WebElement link_LogIn;
	 @FindBy(css="#loginBtn")
	 WebElement button_LogIn;
	 @FindBy(css="#app > div.min-h-screen.flex.flex-col.sm\\:justify-center.items-center.sm\\:pt-0.border-t-4.border-gray-200.bg-gradient-to-br.from-gray-300.to-white > div > div > form > div > div.flex.flex-column.text-center > button")
	 WebElement button_SignIn;
	 public RegistrationPage (WebDriver driver) {
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
	 public void clickButtonRegister() {
		 wait.until(ExpectedConditions.elementToBeClickable(buttonRegister)).click();
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
	 public boolean verifyConfirmationMessageDisplayed(String string, String string2) {
		    return confirmationMessageSuccessfullyRegistered.getText().contains(string) || errorMessageUsernameAlreadyTaken.getText().contains(string2);
		}
	 public boolean verifyConfirmationsMessage1(String errorMessage1) {
		 return errorMessageUsernameAlreadyTaken.getText().contains("The username has already been taken.");
		 		
	 }
	 public boolean verifyErrorMessage2(String errorMessage1) {
		 return errorMessageEmailInvalid.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyErrorMessageUsernameIsRequired(String errorMessage1) {
		 return errorMessageUsernameIsRequired.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyErrorMessageInvalidPassword(String errorMessage1) {
		 return errorMessageInvalidPassword.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyConfirmationsMessage5(String errorMessage1) {
		 return errorMessageEmailIsRequired.getText().contains(errorMessage1);
		 		
	 }
	 public boolean verifyConfirmationsMessage6(String errorMessage1) {
		 return errorMessagePasswordIsRequired.getText().contains(errorMessage1);
		 		
	 }
}
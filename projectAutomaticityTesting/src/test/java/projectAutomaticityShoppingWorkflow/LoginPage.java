package projectAutomaticityShoppingWorkflow;

import java.time.Duration;
import java.util.List;

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
	 @FindBy(css="#app > div > div.flex-grow.px-8.border-t-2.bg-gradient-to-br.from-gray-300.to-gray-white.z-0 > div.flex.justify-between.mt-4 > div.flex.flex-col.w-\\[1500px\\] > div > div.justify-end.mr-4.z-0.products-container > div > div:nth-child(2) > div > div.flex.py-1.border-t-2.border-t-gray-300.bg-gray-100 > button > svg")
	 WebElement smallButton_ShoppingCart;
	 @FindBy(css="button[class='inline-flex items-center py-2 border border-transparent text-sm leading-4 font-medium rounded-md text-primary hover:text-gray-600 focus:outline-none transition ease-in-out duration-150 p-button p-component']")
	 WebElement bigButton_ShppingCart;
	 @FindBy(css="button[aria-label='Checkout']")
	 WebElement button_Checkout;
	 @FindBy(css="button[aria-label='Next step'] span[class='p-button-label p-c']") 
	 WebElement button_NextSteps;
	 @FindBy(css="button[aria-label='Make changes']")
	 WebElement button_MakeChanges;
	 @FindBy(id="first_name")
	 WebElement field_FirstName;
	 @FindBy(id="last_name")
	 WebElement field_LastName;
	 @FindBy(id="phone_number")
	 WebElement field_PhoneNumber;
	 @FindBy(id="street_and_number")
	 WebElement field_StreetAndNumber;
	 @FindBy(id="city")
	 WebElement field_City;
	 @FindBy(css="button[aria-label='Update']")
	 WebElement button_Update;
	 @FindBy(css = ".h-6.w-fit.hover\\:fill-indigo-300")
	 private List<WebElement> list_Products;
	 @FindBy(css = "p-dropdown-label p-inputtext")
	 private List<WebElement> list_Cards;
	 @FindBy(css = "p-dropdown-item")
	 private List<WebElement> list_Options;
	 @FindBy(css="button[aria-label='Next step']")
	 WebElement button_NextStep;
	 @FindBy(id="cardholder")
	 WebElement field_CardHolder;
	 @FindBy(css="div[id='card_type'] span[class='p-dropdown-label p-inputtext']")
	 WebElement  dropDown_MenuCard;
	 @FindBy(id="loom-companion-mv3")
	 WebElement option_MasterCard;
	 @FindBy(id="card_number")
	 WebElement field_CardNumber;
	 @FindBy(id="cvv")
	 WebElement field_CvvNumber;
	 @FindBy(css="div[aria-label='Month']")
	 WebElement dropDownMenu_Months;
	 @FindBy(css="li[aria-label='03']")
	 WebElement option_March;
	 @FindBy(css="div[aria-label='Year']")
	 WebElement dropDownMenu_Years;
	 @FindBy(css="li[aria-label='2031']")
	 WebElement dropDownMenu_2031;
	 @FindBy(css="button[aria-label='Place your order!']")
	 WebElement button_PlaceOrder;
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
	
	 public void insertDataPassword(String password) {
		 wait.until(ExpectedConditions.visibilityOf(field_Password));
		 field_Password.clear();
		 field_Password.sendKeys(password);
		 
	}
	 public void insertDataFirstName(String firstname) {
		 wait.until(ExpectedConditions.visibilityOf(field_FirstName));
		 field_FirstName.clear();
		 field_FirstName.sendKeys(firstname);
		 
	}
	 public void insertDataLastName(String lastname) {
		 wait.until(ExpectedConditions.visibilityOf(field_LastName));
		 field_LastName.clear();
		 field_LastName.sendKeys(lastname);
		 
	}
	 public void insertDataPhoneNumber(String phone) {
		 wait.until(ExpectedConditions.visibilityOf(field_PhoneNumber));
		 field_PhoneNumber.clear();
		 field_PhoneNumber.sendKeys(phone);
		 
	}
	 public void insertDataStreetAndNumber(String street) {
		 wait.until(ExpectedConditions.visibilityOf(field_StreetAndNumber));
		 field_StreetAndNumber.clear();
		 field_StreetAndNumber.sendKeys(street);
		 
	}
	 public void insertDataCity(String city) {
		 wait.until(ExpectedConditions.visibilityOf(field_City));
		 field_City.clear();
		 field_City.sendKeys(city);
		 
	}
	 public void insertDataCardHolder(String card) {
		 wait.until(ExpectedConditions.visibilityOf(field_CardHolder));
		 field_CardHolder.clear();
		 field_CardHolder.sendKeys(card);
		 
	}
	 public void insertDataCardNumber(String card) {
		 wait.until(ExpectedConditions.visibilityOf(field_CardNumber));
		 field_CardNumber.clear();
		 field_CardNumber.sendKeys(card);
		 
	}
	 public void insertDataCVVNumber(String cardcvv) {
		 wait.until(ExpectedConditions.visibilityOf(field_CvvNumber));
		 field_CvvNumber.clear();
		 field_CvvNumber.sendKeys(cardcvv);
		 
	}
	  public void clickFirstProduct() {
	        if (!list_Products.isEmpty()) {
	            list_Products.get(3).click();  // Click the first product
	        }
	    }
	  public void clickCardsOptions() {
	        if (!list_Options.isEmpty()) {
	        	list_Options.get(7).click();  // Click the first product
	        }
	    }
	  public void clickListsCards() {
	        if (!list_Cards.isEmpty()) {
	        	list_Cards.get(0).click();  // Click the first product
	        }
	    }
	  public void clickListsCards2() {
	        if (!list_Cards.isEmpty()) {
	        	list_Cards.get(1).click();  // Click the first product
	        }
	    }
	  public void clickListsCards3() {
	        if (!list_Cards.isEmpty()) {
	        	list_Cards.get(2).click();  // Click the first product
	        }
	    }

	 public String verifyURLBeforeSubmit() {
		 return driver.getCurrentUrl();
	 }
	 public void clickDropDownMenu2031() {
		 wait.until(ExpectedConditions.elementToBeClickable(dropDownMenu_2031)).click();
	 }
	 public void clickOnTheButtonPlaceOrder() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_PlaceOrder)).click();
	 }
	 public void clickDropDownMenuYears() {
		 wait.until(ExpectedConditions.elementToBeClickable(dropDownMenu_Years)).click();
	 }
	 public void clickDropDownMenuMarch() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_March)).click();
	 }
	 public void clickDropDownMenuMonths() {
		 wait.until(ExpectedConditions.elementToBeClickable(dropDownMenu_Months)).click();
	 }
	 public void clickDropDownMenu() {
		 wait.until(ExpectedConditions.elementToBeClickable(dropDown_MenuCard)).click();
	 }
	
	 public void clickOptionMasterCard() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_MasterCard)).click();
	 }
	 public void clickButtonNextStep() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_NextStep)).click();
	 }
	 public void clickButtonSmallButtonShoppingCart() {
		 wait.until(ExpectedConditions.elementToBeClickable(smallButton_ShoppingCart)).click();
	 }
	 public void clickButtonUpdate() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Update)).click();
	 }
	 public void clickButtonMakeChanges() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_MakeChanges)).click();
	 }
	 public void clickButtonNextSteps() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_NextSteps)).click();
	 }
	 public void clickButtonBigButtonShoppingCart() {
		 wait.until(ExpectedConditions.elementToBeClickable(bigButton_ShppingCart)).click();
	 }
	 public void clickButtonButtonCheckout() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Checkout)).click();
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



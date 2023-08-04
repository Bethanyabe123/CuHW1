package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
	this.driver = driver;
	}
	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//ul[@id=\'side-menu\']/li[10]/a/span[1]")
	WebElement bankandcash;
	@FindBy(how = How.XPATH, using = "//ul[@id=\'side-menu\']/li[10]/ul/li[1]/a")
	WebElement newAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Describtion;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement Initialbalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement Accountnumbers;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement  Contactperson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement  Phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement  InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement  submit;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
	UserName.sendKeys(userName);
	try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	public void enterPassword(String password) {
	Password.sendKeys(password);
	try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}

	public void clickSignInButton() {
	SignInButton.click();
	try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	
	public void clickonbankandcash() {
		bankandcash.click();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	public void clickonnewAccount() {
		newAccount.click();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		} 
	public void enteraccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	
	public void entersdescribtion(String describtion) {
		Describtion.sendKeys(describtion);
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	public void entersinitialbalance(String  initialbalance) {
		 Initialbalance.sendKeys( initialbalance);
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	
	public void entersaccountnumbers(String  accountnumbers) {
		Accountnumbers.sendKeys(accountnumbers + randomNumGenerator(999));
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	public void enterscontactperson(String  contactperson) {
		Contactperson.sendKeys(contactperson);
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	public void entersphone(String  phone) {
		Phone.sendKeys( randomNumGenerator(999) + phone);
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	public void entersinternetBankingURL(String  internetBankingURL) {
		InternetBankingURL.sendKeys(internetBankingURL);
		try {
		Thread.sleep(3000);
		} 
	   catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	public void clickonsubmit() {
		submit.click();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		} 
	
	
	public String getPageTitle() {
		return driver.getTitle();
		}
	
	
}



package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginpage;
	
	// @Before
	// public void setup(){
	// initDriver();
	//loginpage = pagefactory.initelement(driver,loginpage.class);
	//}
	
	@Given ("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		initDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		
	}
	@When ("User enters username as {string}")
	public  void user_enters_username_as(String username) {
		loginpage = PageFactory.initElements( driver, LoginPage.class);
		loginpage.enterUserName(username);
		
	}
	@When("User enter passward as {string}")
	public void user_enter_passward_as(String password) {
		loginpage.enterPassword(password);
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
		loginpage.clickSignInButton();
	}

	@Then("User land on dashboard page")
	public void user_land_on_dashboard_page() {
		String excpectedTitle = "Dashboard- iBilling";
		String acttualTitle = loginpage.getPageTitle();
		Assert.assertEquals(excpectedTitle,acttualTitle );
	}
	
	@And ("User click on bank and cash")
	public void user_click_on_bank_and_cash() {
		
		loginpage.clickonbankandcash();
	}
	@And ("User click on newAccount")
	public void user_click_on_newAccount() {
		loginpage.clickonnewAccount();
		
	}
	
	@And("User should land on accounts page")
	
	public void user_should_land_on_accounts_page () {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
	}
	@And("User enters accountTitle as {string}")
	public void user_enters_accountTitle_as(String accountTitle) {
		loginpage.enteraccountTitle(accountTitle);
		
	}
	
	@And("User enters describtion as {string}")
	public void user_enters_describtion(String describtion) {
		loginpage.entersdescribtion(describtion);
	}
	@And ("User enters initialbalance as {string}")
		public void user_enters_initial_balance(String initialbalance ) {
		loginpage.entersinitialbalance(initialbalance);
		
	}
	@And("Users enters accountnumbers as {string}")
	public void users_enters_accountnumbers ( String accountnumbers) {
		loginpage.entersaccountnumbers(accountnumbers);
    }
		
	@And ("User enters contactperson as {string}")
	public void user_enters_contactperson(String contactperson) {
		loginpage.enterscontactperson(contactperson);
	}
	@And ("User enters phone as {string}")
	public void user_enters_phone( String phone) {
		loginpage.entersphone(phone);
    }
	@And ("User enters internetBankingURL as {string}")
	public void User_enters_internetBankingURL(String internetBankingURL) {
		loginpage.entersinternetBankingURL(internetBankingURL);
	}
	@And ("User click on submit")
	public void user_click_on_submit() {
		loginpage.clickonsubmit();
		
	}
	
		
	}
	
			
	
			
	


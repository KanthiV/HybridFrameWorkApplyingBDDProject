package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.CommonUtilities;
import util.Database;







public class LoginSteps extends BasePage {

	 WebDriver driver;
	 LoginPage login;
	 DashBoardPage dashboardPage;
	 Database database;
	 
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		login = PageFactory.initElements(driver, LoginPage.class);
	    dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);	
	}
	
	 
	@Given("^I am on Techfios website$")
	public void i_am_on_Techfios_website()  {
		
	
	}

	
	
	  @When("^I enter username and password$")
	  public void i_enter_username_and_password() throws Throwable {
	  login.enterUserName(database.get("username")); 
	  login.enterPassword(database.get("password"));
	  
	  }
	 
	 
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
	 login.enterUserName(username);
	 login.enterPassword(password);
	 screenShot(driver, "C:\\Users\\kvell\\Documents\\Kanthis Work\\LoginTestCaseScreenShot\\test.jpg");
	}

	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() throws Throwable {
	  login.clickSignInButton();
	}

	@Then("^DashBoard Page should display$")
	public void dashboard_Page_should_display() throws Throwable {
		
		  String expected = "Dashboard- iBilling";
		  CommonUtilities.assertionEquals("Wrong Page Displayed!", dashboardPage.getPageTitle(), expected);
		 
	
		//DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
		//dashboardpage.varifyDashBoardElement();    // To use this add testng dependency in pom.xml
	
	}
   
	@After
	public void afterRun() {
    	BrowserFactory.tearDown();
    }
}

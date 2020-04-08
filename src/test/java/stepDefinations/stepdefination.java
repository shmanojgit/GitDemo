package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

@RunWith(Cucumber.class)
public class stepdefination extends Base {

	@Given("^Initialize browser$")
	public void initialize_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=intializeDriver();
	}

	@Given("^Navigate to \"(.*?)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^click on to Login$")
	public void click_on_to_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
	}

	@When("^user enter (.+) and (.+)$")
    public void user_enter_and(String username, String password) throws Throwable {
		LoginPage login = new LoginPage(driver);
		login.email().sendKeys(username);
		login.password().sendKeys(password);
		login.Loginbutton().click();
    }

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}

    

}
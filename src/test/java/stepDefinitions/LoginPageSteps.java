package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageOjects.LoginPage;

public class LoginPageSteps {
	
	
	TestContext testcontext;
	LoginPage lo;
	
	public LoginPageSteps(TestContext context) {
		testcontext = context;
		lo = testcontext.pageW().getLogin();
		
	}
	@Given("^first hit url$")
	public void first_hit_url() {
		lo.BadC();
		lo.login();
		
	
	}
	

}

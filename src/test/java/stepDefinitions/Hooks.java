package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.Before;
import cucumber.api.java.After;


public class Hooks {
	
	TestContext testcontext;
	
	
	
	public Hooks(TestContext context) {
		testcontext = context;
	}
	@Before
	public void beforesteps() {
		System.out.println("Starting TEST");
	}
	@After
	public void aftersteps() {
		System.out.println("Ending TESTS");
	}

}

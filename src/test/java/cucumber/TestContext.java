package cucumber;

import manager.PageObjectManager;
import manager.WebDriverManager;

public class TestContext {
	
	WebDriverManager web;
	PageObjectManager page;
	
	
	public TestContext() {
		web = new WebDriverManager();
		page = new PageObjectManager(web.getdriver());
		
	}
	public WebDriverManager webd() {
		return web;
		
	}
	
	public PageObjectManager pageW() {
		return page;
	}

}

package manager;

import org.openqa.selenium.WebDriver;

import pageOjects.LoginPage;

public class PageObjectManager {
	
	
	private WebDriver driver;
	private LoginPage  login;
	
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage getLogin()
	{
		return (login == null) ? login = new LoginPage(driver):login;
	}

}

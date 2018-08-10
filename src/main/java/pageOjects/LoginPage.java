package pageOjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import junit.framework.Assert;
import manager.FileReaderManager;

public class LoginPage {
	WebDriver driver;
	//ConfigFileReader filereader;
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public void login() {
		
		//filereader = new ConfigFileReader();
		driver.get(FileReaderManager.getInstance().getConfigFileReader().geturl());
		System.out.println(FileReaderManager.getInstance().getConfigFileReader().geturl());
		
	}
	
	@FindBy(how = How.CSS, using = "input#username")
	private WebElement username;

	@FindBy(how = How.CSS, using = "input#password")
	private WebElement password;
	
	@FindBy(how = How.CSS, using = "input.button")
	private WebElement click;
	
	public void enter_username(String name)
	{
		
		username.sendKeys(name);
	}
	
	public void enter_password(String pass)
	{
		
		password.sendKeys(pass);
	}
	
	public void click()
	{
		click.click();
	}
	public void BadC() 
	{
	    enter_username("qwerty");
		enter_password("qwerty");
		click.click();
		String a = driver.findElement(By.xpath("//*[@id=\"effect\"]/center/h4")).getText();
		Assert.assertEquals(a, "Bad credentials");
		System.out.println(a);
		
	}
	
	public void det()
	{
	 
	 enter_username(FileReaderManager.getInstance().getConfigFileReader().getusername());
	 
	 enter_password(FileReaderManager.getInstance().getConfigFileReader().getpassword());
	}
}

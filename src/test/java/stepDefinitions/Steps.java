//package stepDefinitions;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//import manager.FileReaderManager;
//import manager.PageObjectManager;
//import manager.WebDriverManager;
//import pageOjects.HomePage;
//import pageOjects.LoginPage;
//
//public class Steps {
//	//WebDriver driver;
//	PageObjectManager page;
//	LoginPage lp;
//	HomePage home;
//	FileReaderManager fileread;
//	WebDriverManager wb;
//
//	@Given("^first hit url$")
//	public void first_hit_url() {
//		
////	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lalit\\Downloads\\chromedriver_win32\\chromedriver.exe");
////		driver = new ChromeDriver();
////		
//		wb = new WebDriverManager();
//		wb.getdriver();
//		page = new PageObjectManager(wb.getdriver());
//	    lp = page.getLogin();
//	   try {
//	    lp.login();
//	   }catch (WebDriverException e)
//	   {
//		   System.out.println(e.getMessage());
//	   }
//	}
//	@And("^Login For Bad Credentials$")
//	public void Login_For_Bad_Credentials() throws Exception  {
//		
//		lp.BadC();
//	}
//	
//
//	@Then("^Do login$")
//	public void do_login() {
//		
//		lp.det();
//		
//		
//	}
//
//	@And("^Click Login$")
//	public void click_Login()  {
//		lp.click();
//		
//		
//	}
//
//	@Then("^Capture Screen Shot$")
//	public void capture_Screen_Shot()  {
//		home = new HomePage(wb.getdriver());
//		home.screen();
//		
//		
//	}
//
//}

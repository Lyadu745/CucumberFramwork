package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.Drivertype;

public class WebDriverManager {
	
	private WebDriver driver;
	private static Drivertype dtype;
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";
	private static final String FIREFOX_DRIVER ="webdriver.firefox.driver";

	
	
	public WebDriverManager()
	{
		dtype = FileReaderManager.getInstance().getConfigFileReader().getbrowser();
	}
	
	public WebDriver getdriver()
	{
		if(driver == null)driver = createDriver();
		return driver;
	}
	
	private WebDriver createDriver()
	{
		switch(dtype) {
		case CHROME : System.setProperty(CHROME_DRIVER, "C:\\Users\\Lalit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		case FIREFOX:  System.setProperty(FIREFOX_DRIVER, "C:\\Users\\Lalit\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new FirefoxDriver();
		}
		return driver;
	}
	
}

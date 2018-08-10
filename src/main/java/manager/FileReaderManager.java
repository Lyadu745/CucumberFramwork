package manager;

import org.openqa.selenium.WebDriver;

import dataprovider.ConfigFileReader;

public class FileReaderManager
{
	WebDriver driver;
	
	
	private static FileReaderManager fileReader = new FileReaderManager();
	ConfigFileReader fileprop;
	
	public FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance()
	{
		return fileReader;
	}
	
	public ConfigFileReader getConfigFileReader()
	{
		return (fileprop == null) ? fileprop = new ConfigFileReader():fileprop;
	}
	
	
}
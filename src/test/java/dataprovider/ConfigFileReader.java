package dataprovider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.Drivertype;

public class ConfigFileReader {
	
    
	Properties properties;
	private final String filepath = "configs/data.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filepath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config having value in the URL");
		}

	}
	public Drivertype getbrowser()
	{
		String brow  = properties.getProperty("browser");
		if(brow.equalsIgnoreCase("chrome"))return Drivertype.CHROME;
		else if(brow.equalsIgnoreCase("firefox")) return Drivertype.FIREFOX;
		else throw new  RuntimeException("No driver is present");
		
	}

	public String geturl() {
		String url = properties.getProperty("url");
		System.out.println(url);
		if (url != null||"".equals(url))
			return url;
		else throw  new RuntimeException("Url is not provided");
	}
	
	public String getusername()
	{
		String user = properties.getProperty("username");
		 if(user != null&&user !=""  ) { return user;}
		else {
			throw new RuntimeException("No USERNAME is proivided");
	}
 }
	public String getpassword()
	{
		String pass = properties.getProperty("password");
	    if(pass != null) return pass;
	    else throw new RuntimeException("No Password field in the Config file"); 
	}
}

package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base 
{
	protected WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties(); 
		FileInputStream fis = new FileInputStream("C:\\Users\\dhara\\eclipse-workspace\\V2Kart\\src\\main\\java\\Automation\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName=="chrome")
		{
			//executes in chrome browser
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}
		else if(browserName=="firefox")
		{
			//executes in firefox browser
			System.setProperty("webdriver.geko.driver", prop.getProperty("firefoxPath"));
			driver = new FirefoxDriver();
			
		}
		else if(browserName=="IE")
		{
			//executes in internet explorer
			System.setProperty("webdriver.ie.driver", prop.getProperty("internetExplorerPath"));
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		
	}

}

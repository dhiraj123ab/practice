package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase 
{
	public WebDriver driver;

	public String readpropertyfile(String value) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\Dhiraj\\eclipse-workspace\\Maven2\\src\\main\\java\\config\\properties");
		prop.load(file);
		return prop.getProperty(value);
	}
	
	public void initialization() throws IOException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(option);
	    driver.get(readpropertyfile("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		
	}
	
	
}

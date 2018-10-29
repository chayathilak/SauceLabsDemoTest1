package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {

	  public static final String URL = "https://chaya:97863576-4590-45ba-8a36-a41fdde52359@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
 
		DesiredCapabilities caps = DesiredCapabilities.safari();
		caps.setCapability("platform", "macOS 10.13");
		caps.setCapability("version", "12.0");
		caps.setCapability("screenResolution", "2360x1770");
		caps.setCapability("version", "latest");

		caps.setCapability("name", "Test1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    
	
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "Drivers\\Chromedriver.exe");
	 
		//Go to the url
		driver.get("https://www.findmyfare.com/");
		 
		//Get the title and print it
		System.out.println(driver.getTitle());
		
		//Validate landed url
		System.out.println(driver.getCurrentUrl());
			
		//Print page source
		System.out.println(driver.getPageSource());
			
		//Go to the url
		driver.get("https://www.airbnb.com/");
			
		//Navigate back
		driver.navigate().back();
			
		//Navigate forward
		driver.navigate().forward();
			
		//Close current browser
		driver.close();
			
		//Close all the browsers
		driver.quit();

	}

}
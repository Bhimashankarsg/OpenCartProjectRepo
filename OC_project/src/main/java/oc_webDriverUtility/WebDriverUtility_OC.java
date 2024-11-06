package oc_webDriverUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebDriverUtility_OC {
	public WebDriver launch_browser(String browser) {
WebDriver driver = null;
		
		try {

			if (browser.equals("firefox")) {
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equals("edge")) {
				driver = new EdgeDriver();
			}
		
	
		} catch (Exception E) {
			System.out.println("Browser Launch - issue");

		}

		return driver;//return driver;
	}
}

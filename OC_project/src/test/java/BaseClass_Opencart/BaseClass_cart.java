package BaseClass_Opencart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import oc_webDriverUtility.WebDriverUtility_OC;

public class BaseClass_cart {
	WebDriver driver = null;
	public WebDriverUtility_OC wLib = new WebDriverUtility_OC();

	@BeforeSuite
	public void db_Config() {
		System.out.println("DB CONNECTION");

	}

	@BeforeClass
	public void launch_browser() {
		System.out.println("LAUNCH BROWSER");

		driver = wLib.launch_browser("firefox");
		driver.get("http://localhost/opencart-4.0.2.3/upload/index.php");
		
		
		String title = driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals(title, "Your Store");
	}

}

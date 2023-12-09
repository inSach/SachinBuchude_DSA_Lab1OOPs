package Base;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public WebDriver driver = null;
	public static String browserName;
	
	public TestBase() {
		this.setDriverName("Chrome");
		driver = this.getWebdriver();
	}
	
	public TestBase(String browserName) {
		this.setDriverName(browserName);
		driver = this.getWebdriver();
	}
	
	public void setDriverName(String browserName) {
		this.browserName = browserName;
	}
	
	public WebDriver getWebdriver() {
		try{
			this.driver.getTitle();
			return this.driver;
		}catch(Exception ex) {
			driver = this.initiateDriver(this.browserName);
			return driver;
		}
	}
	
	private WebDriver initiateDriver(String browserName){
		switch (browserName) {
		case "Chrome":
			driver = WebDriverManager.chromedriver().create();
			break;
		case "FireFox":
			driver = WebDriverManager.firefoxdriver().create();
			break;
		case "IE":
			driver = WebDriverManager.iedriver().create();
			break;
		case "Edge":
			driver = WebDriverManager.edgedriver().create();
			break;
		case "Safari":
			driver = WebDriverManager.safaridriver().create();
			break;
		case "Opera":
			driver = WebDriverManager.operadriver().create();
			break;
		}
		return driver;
	}

}

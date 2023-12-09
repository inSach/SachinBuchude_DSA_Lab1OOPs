import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.indexeddb.model.Key;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest extends TestBase{
  
	public NewTest(String browserName) {
		super(browserName);
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void beforeTest(){
		WebDriver driver = super.getWebdriver();
	}

@Test
  public void f() throws InterruptedException {
	 
	  System.out.println("Java test");
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(d->((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete"));
		System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q' and @title='Search']"));
		search.click();
		search.sendKeys(Keys.chord("piyusha", Keys.ENTER));
  }
  
}

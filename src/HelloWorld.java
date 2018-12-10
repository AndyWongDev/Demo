import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// Create Driver object
		System.setProperty("webdriver.gecko.driver", "D:\\Coding\\Eclipse\\selenium-java\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Browser has clicked on the Back Button.");
		driver.navigate().forward();
		System.out.println("Browser has clicked on the Forward Button.");
		driver.getPageSource();
		driver.quit();
		System.out.println("Selenium process has been ended.");
	}
}
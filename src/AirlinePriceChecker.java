import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AirlinePriceChecker {

	public static void main(String[] args) {
		
		// Create Driver object
		System.setProperty("webdriver.gecko.driver", "D:\\Coding\\Eclipse\\selenium-java\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		System.out.println("DEBUG: Script Start.");
		
		driver.get("https://www.priceline.com/flights");
		
		driver.findElement(By.id("trip-type-one-way")).click();
	}

}

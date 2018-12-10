import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		// Create Driver object
		System.setProperty("webdriver.gecko.driver", "D:\\Coding\\Eclipse\\selenium-java\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		System.out.println("DEBUG: Script Start.");
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello World!");
		
		//driver.findElement(By.name("q")).sendKeys("Hello World!"+Keys.RETURN);
		driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
	}
}
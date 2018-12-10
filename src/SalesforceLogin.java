import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
		
		// Create Driver object
		System.setProperty("webdriver.gecko.driver", "D:\\Coding\\Eclipse\\selenium-java\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		System.out.println("DEBUG: Script Start.");
		
		driver.get("https://www.salesforce.com");
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys("Username");
		
		driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("Password");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("Password");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AirlinePriceChecker {

	public static void main(String[] args) {
		
		// Create Driver object
		System.setProperty("webdriver.gecko.driver", "D:\\Coding\\Eclipse\\selenium-java\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		System.out.println("DEBUG: Script Start.");
		
		driver.get("https://www.priceline.com/flights");
		
		// Select One-Way Ticket
		driver.findElement(By.id("trip-type-one-way")).click();
		
		// Select Premium Economy Seat
	    driver.findElement(By.id("cabin-class-select")).click();
	    Select cabinClass = new Select(driver.findElement(By.id("cabin-class-select")));
	    cabinClass.selectByVisibleText("Premium Economy");
	    
	    // Select Number of Passengers
	    driver.findElement(By.id("traveler-selection-readonly-input")).click();
	    // Add 1 Adult (Advanced Automated method)
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adults'])[1]/following::button[2]")).click();
	    // Add 1 Youth (User Manual method)
	    driver.findElement(By.xpath("//form/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/button[2]")).click();
	  }
}
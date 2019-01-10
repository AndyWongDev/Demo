import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AirlinePriceChecker {

	public static void main(String[] args) {
		
		// Create Driver object
		System.setProperty("webdriver.gecko.driver", "D:\\Coding\\Eclipse\\selenium-java\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("DEBUG: Script Start.");
		
		driver.get("https://www.priceline.com/flights");
		
		// Select One-Way Ticket
		driver.findElement(By.id("trip-type-one-way")).click();
		
		// Select Premium Economy Seat via Static Drop-down
	    driver.findElement(By.id("cabin-class-select")).click();
	    Select cabinClass = new Select(driver.findElement(By.id("cabin-class-select")));
	    cabinClass.selectByVisibleText("Premium Economy");
	    // Select Economy and then Business Class via Drop-down
	    cabinClass.selectByIndex(0);	// Select Economy
	    cabinClass.selectByIndex(2);	// Select Business
	    
	    // Select Number of Passengers via Static Drop-down & Button
	    driver.findElement(By.id("traveler-selection-readonly-input")).click();
	    // Add 1 Adult (Advanced Automated method)
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adults'])[1]/following::button[2]")).click();
	    // Add 1 Youth (User Manual method)
	    driver.findElement(By.xpath("//form/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/button[2]")).click();
	    // Remove 1 Adult and 1 Youth (back to just 1 Adult)
	    driver.findElement(By.xpath("//div[@id='traveler-control-panel']//div[1]//div[1]//div[1]//button[1]")).click();	// Remove 1 Adult
	    driver.findElement(By.xpath("//div[@id='traveler-control-panel']//div[2]//div[1]//div[1]//button[1]")).click(); // Remove 1 Youth
	    
	    // Select Departure City via Dynamic Drop-down
	    driver.findElement(By.id("flight-departure-airport0")).click();
	    driver.findElement(By.id("flight-departure-airport0")).clear();
	    driver.findElement(By.id("flight-departure-airport0")).sendKeys("N");
	    
	    // Store all dynamic search results into a list
	    System.out.println("Dynamic Search");
	    List<WebElement> departureDropdown = driver.findElements(By.xpath("//div[@id='flight-departure-airport0-dropdown']/div/div/div"));
	    System.out.println("List: "+departureDropdown.get(0).getText());
	  }
}
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		System.out.println("Test automation started");
		System.out.println("Setting driver for Chrome browser");
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\REAL LIFE\\Testleaf\\MavenProject\\MavenProject\\drivers\\chromedriver.exe");
		System.out.println("Opening chrome browser");
	
		@SuppressWarnings("unused")
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Load the URL : http://leaftaps.com/opentaps/control/main");
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Maximising the browser");
		driver.manage().window().maximize();
		
		System.out.println("Finding the element for username");
		WebElement elementUsername  = driver.findElement(By.id("username"));
		System.out.println("Entering the username as Demosalesmanager");
		elementUsername.sendKeys("Demosalesmanager");
		
		System.out.println("Finding the element for password");
		WebElement elementPassword  = driver.findElement(By.id("password"));
		System.out.println("Entering the password as crmsfa");
        elementPassword.sendKeys("crmsfa");
		
		System.out.println("Finding the element for Login button");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sriraman");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    WebElement elementDropdown= driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select dd = new Select(elementDropdown);
	    dd.deselectByVisibleText("Public Relations");
	    
	    //dd.selectByValue("LEAD_PR");
	    
	    //dd.selectByIndex(2);
	    
	}
	
	
}

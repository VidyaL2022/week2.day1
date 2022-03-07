package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
		System.out.println("Test automation starts");
		System.out.println("setting up google chrome browser");
		WebDriverManager.chromedriver().setup();
		System.out.println("Opening Chrome");
		
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
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("VS");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DB");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Working with Testleaf");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidya3389@gmail.com");
	    WebElement elementDropdown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd = new Select(elementDropdown);
	    dd.selectByVisibleText("New York");
	    
	    WebElement elementLeadClick = driver.findElement(By.className("smallSubmit"));
	    elementLeadClick.click();
	    String OurTitle = driver.getTitle();
		System.out.println(OurTitle);
	    
	    
	}

}

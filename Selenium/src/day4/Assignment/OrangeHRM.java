package day4.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		String pageTitle=driver.getTitle();
		
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		String expectedTitle="OrangeHRM";
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		
		driver.findElement(By.cssSelector(".oxd-icon.bi-plus.oxd-button-icon")).click();
		driver.findElement(By.name("firstName")).sendKeys("JumboMax");
		driver.findElement(By.name("lastName")).sendKeys("Admin");

		driver.findElement(By.cssSelector(".orangehrm-left-space")).click();
		driver.findElement(By.cssSelector(".oxd-main-menu-item.active")).click();
		driver.findElement(By.linkText("Name")).click();
		
		
		//driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
		//driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
	}

}

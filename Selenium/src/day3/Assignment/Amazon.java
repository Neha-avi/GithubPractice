package day3.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Explore more from Amazon Pay")).click();
		
		driver.navigate().back();
		driver.navigate().to("https://www.google.com");
		driver.close();

		
		/*driver.findElement(By.id("ap_email")).sendKeys("8421669109");
		driver.findElement(By.id("ap_password")).sendKeys("Nehakaware1@");
		driver.findElement(By.id("signInSubmit")).click();*/
		
	}	
}
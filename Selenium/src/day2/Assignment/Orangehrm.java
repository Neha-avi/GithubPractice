package day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Acceleration\\Workspace\\Selenium\\executables\\chromedriver.exe");
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//to enter the url on the open browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//application title validation
		String actualTitle= driver.getTitle();
		String expectedTitle="OrangeHRM";
		System.out.println("Actaul title is: "+actualTitle);
		System.out.println("Expected title is: "+expectedTitle);
		System.out.println("Title validation: "+actualTitle.equals(expectedTitle));
		
		//page source code
		String pageSoucre=driver.getPageSource();
		System.out.println("Page source code content length: "+pageSoucre.length());
		
		//validation of url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com";
		System.out.println("Actaul URL is: "+actualUrl);
		System.out.println("Expected URL is: "+expectedUrl);
		System.out.println("url validation: "+actualUrl.contains(expectedUrl));
		
		//type username as admin
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement Login=driver.findElement(By.className("orangehrm-login-button"));
		Login.click();
		
		//close the current browser
		//driver.close();
	}

}

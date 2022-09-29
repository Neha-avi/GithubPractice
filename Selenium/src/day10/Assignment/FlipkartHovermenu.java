package day10.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHovermenu {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		List<WebElement> mainMenu = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		
		Actions act = new Actions(driver);
		for(int i=0;i<mainMenu.size();i++) {
		WebElement option=mainMenu.get(i);
		act.moveToElement(option).perform();
		}
		mainMenu.get(2).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/div/section/div[3]/div/a")).click();	
		
		WebElement Mobile=driver.findElement(By.cssSelector("div>div>div:nth-child(3)>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>div>div>div>a>div:nth-child(2)>div>div"));
		String S =Mobile.getText();
		System.out.println("Name of Mobile : " + S);
		
		WebElement Price=driver.findElement(By.cssSelector("div>div>div:nth-child(3)>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>div>div>div>a>div:nth-child(2)>div:nth-child(2)>div>div>div"));
		String P =Price.getText();
		System.out.println("Name of Mobile : " + P);
		//driver.close();
		
	}
}

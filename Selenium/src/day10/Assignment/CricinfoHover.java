package day10.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CricinfoHover {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		List<WebElement> mainMenu = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[3]/div/nav/div/div/div/div[2]/div[1]/div"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		
		Actions act = new Actions(driver);
		for(int i=0;i<mainMenu.size();i++) {
		WebElement option=mainMenu.get(i);
		act.moveToElement(option).perform();
		Thread.sleep(1000);
		}
	}

}

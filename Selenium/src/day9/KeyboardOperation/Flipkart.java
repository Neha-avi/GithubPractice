package day9.KeyboardOperation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Flipkart {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.cssSelector("#container > div > div._331-kn._2tvxW > div > div > div:nth-child(3) > a > div._1mkliO > div > img")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#container > div > div._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1AtVbE.col-2-12 > div > div > section > div:nth-child(3) > div > a")));
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		driver.findElement(By.cssSelector("#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(2) > div:nth-child(2) > div > div > div"));	
		
		WebElement Mobile=driver.findElement(By.cssSelector("div>div>div:nth-child(3)>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>div>div>div>a>div:nth-child(2)>div>div"));
		String S =Mobile.getText();
		System.out.println("Name of Mobile : " + S);
		
		WebElement Price=driver.findElement(By.cssSelector("div>div>div:nth-child(3)>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>div>div>div>a>div:nth-child(2)>div:nth-child(2)>div>div>div"));
		String P =Price.getText();
		System.out.println("Name of Mobile : " + P);
		driver.close();
		
	}

}

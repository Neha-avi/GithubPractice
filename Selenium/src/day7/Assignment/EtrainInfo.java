package day7.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtrainInfo {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://etrain.info/current-booking");
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement dropdown=driver.findElement(By.id("transstn1"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		//identify dropdown list and click on it
		dropdown.click();
		
		
		
		
		
	}

}

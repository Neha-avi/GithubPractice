package day1.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//to enter the url on the open browser
		driver.get("https://www.flipkart.com/");
		
		//application title validation
		String actualTitle=driver.getTitle();
		String expectedTitle="Flipkart";
		System.out.println("Actaul Flipkart page title is: "+actualTitle);
		System.out.println("Expected Flipkart page title is: "+expectedTitle);
		System.out.println("Flipkart title validation: "+actualTitle.equals(expectedTitle));
		
		//validation of url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.flipkart.com";
		System.out.println("Actaul Flipkart page URL is: "+actualUrl);
		System.out.println("Expected Flipkart page URL is: "+expectedUrl);
		System.out.println("Flipkart url validation: "+actualUrl.contains(expectedUrl));
		
		//page source code
		String pageSoucre=driver.getPageSource();
		System.out.println("Page source code content length: "+pageSoucre.length());
		
		//close the current browser
		driver.close();
	}
}
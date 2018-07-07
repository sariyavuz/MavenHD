package PageObject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Credentials;

public class StartAppPage extends MainPage {

	
	
		public StartAppPage(WebDriver driver) {
		super(driver);
		
	}

		public static void startTest() throws InterruptedException {
			String driverpath = Credentials.chromedriverPath;
			String url = Credentials.url;
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}public static void Wait() throws InterruptedException {
			Thread.sleep(3000);

}
}
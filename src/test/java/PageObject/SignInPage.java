package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends MainPage{

	static WebElement element = null;
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	public static WebElement myAccount() {
		try {
			element = driver.findElement(By.id("headerMyAccountTitle"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	public static WebElement SignIn() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"authSignIn\"]/a"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	public static WebElement email() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"email_id\"]"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	public static WebElement password() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	public static WebElement submit_SignIn() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"accountSignIn\"]/span"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
  
			 }
			 
}

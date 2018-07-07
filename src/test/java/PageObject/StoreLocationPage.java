package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreLocationPage extends MainPage{
	static WebElement element = null;

	public StoreLocationPage(WebDriver driver) {
		super(driver);
		
	}
	public static WebElement Storefinder() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div/div[1]/div/ul/li[1]"));
		} catch (Exception e) {
			e.getStackTrace();
			}
	return element;
	}
	
	public static WebElement ZipCode() {
		try {
			element = driver.findElement(By.id("storeSearchBox"));
		} catch (Exception e) {
			e.getStackTrace();
			}
	return element;
	}
	public static WebElement Submit() {
		try {
			element = driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/section[1]/div[2]/form/div[2]/button/span"));
		} catch (Exception e) {
			e.getStackTrace();
			}
	return element;
	}

}

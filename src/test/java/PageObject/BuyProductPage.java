package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyProductPage extends MainPage{
static WebElement element = null;
	public BuyProductPage(WebDriver driver) {
		super(driver);
		
	}
	
	public static WebElement SelectProduct() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"products\"]/div/div[1]/div/div[4]/div[3]/div/a/span"));
		} catch (Exception e) {
			e.getStackTrace();
			}
	return element;
	}
	public static WebElement Iframe()  {
		
		WebElement card = driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/iframe"));
		driver.switchTo().frame(card);
		return card;
		
	}
	
	public static WebElement AddtoCart() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div[2]/div/div[2]/a"));
		} catch (Exception e) {
			e.getStackTrace();
			}
	return element;
	}
public static WebElement parentframe()  {
		
	driver.switchTo().defaultContent();
	return element;
}

}
		

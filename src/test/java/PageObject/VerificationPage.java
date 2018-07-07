package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationPage extends MainPage{
	static WebElement element = null;
	public VerificationPage(WebDriver driver) {
		super(driver);
		
	}
	public static WebElement verification1() {
		boolean logoisDisplayed= driver.findElement(By.className("Header3__logo")).isDisplayed();
		if(logoisDisplayed) {
			System.out.println("Home Depot Logo is Displayed");
		}else {
				System.out.println("Home Depot Logo IS NOT Displayed");
		}
		return null;
		
	}public static WebElement verification2() {
			boolean searchisDisplayed =driver.findElement(By.id("headerSearch")).isDisplayed();
			if(searchisDisplayed) {
				System.out.println("Search Webedit field is Displayed");
				}else {
					System.out.println("Search Webedit field is NOT Displayed");}
			return element;
					
				}
			public static WebElement FindProduct() {
				try {
					element = driver.findElement(By.cssSelector("#headerSearch"));
				} catch (Exception e) {
					e.getStackTrace();
					}
			return element;
			}
			public static WebElement search() {
				try {
					element = driver.findElement(By.cssSelector("#headerSearchButton"));
				} catch (Exception e) {
					e.getStackTrace();
					}
			return element;
			}
			
			public static WebElement verification3() {
				boolean HammerDisplayed =driver.findElement(By.cssSelector("#products > div > div.js-pod.js-pod-0.plp-pod.plp-pod--default.pod-item--0 > div > div.plp-pod__info > div.pod-plp__description.js-podclick-analytics > a")).isDisplayed();
				if(HammerDisplayed) {
					System.out.println("Hammer link is Displayed?");
					}else {
						System.out.println("Hammer link is NOT Displayed");
						
				return element;
			}
				return element;
}
			}

		 
			
		

		
	

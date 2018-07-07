package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondProductPage extends MainPage{
	
	static WebElement element = null;
	public SecondProductPage(WebDriver driver) {
		super(driver);
		
	
	}
	public static void SecondProduct() throws InterruptedException {
		
		String quantity = driver.findElement(By.className("MyCart__itemCount")).getText();
		int n = Integer.parseInt(quantity);
		if(n==1) {
			System.out.println("1 item is selected");
		}else {
			System.out.println("Check the cart");
		}
		
		driver.navigate().back();
		driver.findElement(By.cssSelector("#headerSearch")).clear();
		driver.findElement(By.cssSelector("#headerSearch")).sendKeys("bug Sprey");
		driver.findElement(By.cssSelector("#headerSearchButton")).click();
		
		if (driver.findElements(By.xpath("//*[@id=\"products\"]/div/div[1]/div/div[3]/div[1]/a")).size() >0) {
			 System.out.println("link is founded");
		}else {
			System.out.println("link is not founded");}
		
		driver.navigate().back();
		Thread.sleep(3000);
	}

}

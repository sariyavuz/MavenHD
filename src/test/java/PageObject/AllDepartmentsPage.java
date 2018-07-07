package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllDepartmentsPage extends MainPage{
	static WebElement element = null;
	public AllDepartmentsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public static WebElement AllDepartment() {
		try {
			element = driver.findElement(By.cssSelector("body > div.Header3 > div > div.grid.flush.hide.show--sm > div > ul > li:nth-child(1) > a"));
		} catch (Exception e) {
			e.getStackTrace();
			}
	return element;

}}
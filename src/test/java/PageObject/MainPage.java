package PageObject;


import org.openqa.selenium.WebDriver;

public abstract class MainPage {
	
static WebDriver driver ;
	
	public MainPage(WebDriver driver) {
		MainPage.driver = driver;

}
}
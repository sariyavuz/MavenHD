package Action;

import PageObject.StartAppPage;
import PageObject.StoreLocationPage;

public class StoreLocationAction {

	public static void Execute () throws Exception{
		
		
		StoreLocationPage.Storefinder().click();
		StartAppPage.Wait();
		StoreLocationPage.ZipCode().sendKeys("22556");
		StoreLocationPage.Submit().submit();
		StartAppPage.Wait();
	}
}

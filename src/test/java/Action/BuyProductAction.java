package Action;

import PageObject.BuyProductPage;
import PageObject.StartAppPage;

public class BuyProductAction {
	
	public static void Execute () throws Exception{
		BuyProductPage.SelectProduct().click();
		StartAppPage.Wait();
		StartAppPage.Wait();
		StartAppPage.Wait();
		BuyProductPage.Iframe();
		StartAppPage.Wait();
		BuyProductPage.AddtoCart().click();
		StartAppPage.Wait();
		BuyProductPage.parentframe();
		
		
	}

}

package Action;

import PageObject.StartAppPage;
import PageObject.VerificationPage;

public class VerificationAction {
	
	public static void Execute() throws Exception{
		
		VerificationPage.verification1();
		VerificationPage.verification2();
		StartAppPage.Wait();
		VerificationPage.FindProduct().sendKeys("Hammer");
		StartAppPage.Wait();
		VerificationPage.search().click();
		StartAppPage.Wait();
		VerificationPage.verification3();
		StartAppPage.Wait();
		
	}

}

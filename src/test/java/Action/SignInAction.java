package Action;

import Helper.Credentials;
import PageObject.SignInPage;
import PageObject.StartAppPage;
public class SignInAction {
	public static void Execute() throws Exception{
	
		SignInPage.myAccount().click();
		StartAppPage.Wait();
		SignInPage.SignIn().click();
		StartAppPage.Wait();
		SignInPage.email().sendKeys(Credentials.email_ID);
		StartAppPage.Wait();
		SignInPage.password().sendKeys(Credentials.password);
		StartAppPage.Wait();
		SignInPage.submit_SignIn().click();
		StartAppPage.Wait();
		StartAppPage.Wait();
	}

}

package TestRun;

import Action.AllDpartmentsAction;
import Action.BuyProductAction;
import Action.SecondProductAction;
import Action.SignInAction;

import Action.StartAppAction;
import Action.StoreLocationAction;
import Action.VerificationAction;
import PageObject.SignInPage;
import PageObject.VerificationPage;

public class TestRuner {

	public static void main(String[] args) throws Exception{
		

		StartAppAction.Execute();
		VerificationAction.Execute();
		BuyProductAction.Execute();
		SecondProductAction.Execute();
		SignInAction.Execute();
		StoreLocationAction.Execute();
		AllDpartmentsAction.Execute();

		

	}

}

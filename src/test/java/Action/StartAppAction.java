package Action;


import PageObject.StartAppPage;

public class StartAppAction {
	
	public static void Execute() throws Exception{

		StartAppPage.startTest();
		StartAppPage.Wait();

	}

}

package Action;

import PageObject.AllDepartmentsPage;
import PageObject.MainPage;
import PageObject.StartAppPage;

public class AllDpartmentsAction {
	
	public static void Execute () throws Exception{
		AllDepartmentsPage.AllDepartment().click();
		StartAppPage.Wait();
	}

}

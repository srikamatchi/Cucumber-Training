package demoPack;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class dtDefenition
{
	int i;
	@Given("^I open Facebook URL$")
	public void OpenURL() throws Throwable
	{
	    System.out.println("Open facebook URL");
	    
	}

	@Given("^fill up the new account form with the following data$")
	public void createAcc(DataTable dt) throws Throwable 
	{
		List<Map<String,String>> list=dt.asMaps(String.class, String.class);
		for(i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).get("First Name")+" "+
			(list.get(i).get("Last Name"))+" "+
			(list.get(i).get("Password"))+" "+
			(list.get(i).get("Gender")));
			System.out.println("\n");
		}
		/*List <String> acclist=dt.asList(String.class);
		for(i=0;i<acclist.size();i++)
		{
			System.out.println(acclist.get(i));
			
		}
		*/
}
}

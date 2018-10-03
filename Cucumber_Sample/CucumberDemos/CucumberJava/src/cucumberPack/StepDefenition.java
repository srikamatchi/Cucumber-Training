package cucumberPack;

import cucumber.api.java.en.Given;

public class StepDefenition 
{
	@Given("^message is displayed in the page$")
	public void displaymsg() throws Throwable
	{
	 System.out.println("Hello Welcome to Cucumber !!");
	    
	}


}

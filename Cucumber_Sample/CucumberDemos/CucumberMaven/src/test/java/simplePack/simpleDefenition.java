package simplePack;

import cucumber.api.java.en.Given;

public class simpleDefenition 
{
	@Given("^i am printing message$")
	public void message() throws Throwable
	{
		System.out.println("Hello World");
	}

	
}

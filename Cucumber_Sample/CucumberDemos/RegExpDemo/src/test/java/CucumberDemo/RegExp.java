package CucumberDemo;

import cucumber.api.java.en.Given;

public class RegExp 
{
	@Given("^User will login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_login_with_and(String arg1, String arg2) throws Throwable 
	{
		System.out.println(arg1+" has logged in using "+arg2);
   	}

	@Given("^Login using (.*) and (.*)$")
	public void login_using_and(String arg1, String arg2) throws Throwable
	{
	    System.out.println(arg1+"has logged in using"+arg2);
	    
	}

	}

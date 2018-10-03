package myPack;

import cucumber.api.java.en.Given;

public class StepDef 
{
	@Given("^This is a blank test$")
	public void this_is_a_blank_test() throws Throwable
	{
		System.out.println("This will a Blank Test");
	}
}

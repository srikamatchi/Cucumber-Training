package addCucum;

import cucumber.api.java.en.Given;

public class StepDef 
{
	@Given("^I want to verify that (\\d+) plus (\\d+) equals (\\d+)$")
	public void i_want_to_verify_that_plus_equals(int a, int b, int sum) throws Throwable
	{
		if((a+b)==sum)
		   {
			   System.out.println("sum is correct");
		   }
		   else
		   {
			   System.out.println("There is mismatch in sum");
		   }
		    
		}
/*	@Given("^I want to verify that (\\d+.\\d+) plus (\\d+.\\d+) equals (\\d+.\\d+)$")
	public void i_want_to_verify_that_plus_equals(double a, double b, double sum) throws Throwable 
	{
	   if((a+b)==sum)
	   {
		   System.out.println("sum is correct");
	   }
	   else
	   {
		   System.out.println("There is mismatch in sum");
	   }
	    
	}

*/}

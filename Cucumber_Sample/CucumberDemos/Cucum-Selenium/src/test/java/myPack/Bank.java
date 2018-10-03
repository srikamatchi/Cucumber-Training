package myPack;

import java.util.Scanner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bank 
{
	int amt;
	@Given("^Min Balance amount must be (\\d+)$")
	public void min_Balance_amount_must_be(int minbal) throws Throwable
	{
	   System.out.println("enter the amount to withdraw");
	   Scanner sc= new Scanner(System.in);
	   amt=sc.nextInt();
	}  
	@When("^amount is greater than (\\d+)$")
	public void amount_is_greater_than(int minbal) throws Throwable 
	{
		 if(amt>=minbal)
		   {
			   System.out.println("Insufficient balance");
		   }
		 else
		 {
			 System.out.println("amount withdrawn successfully !!");
		 }
	}
}

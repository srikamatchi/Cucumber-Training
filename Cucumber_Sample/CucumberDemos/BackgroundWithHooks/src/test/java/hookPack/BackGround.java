package hookPack;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackGround 
{
	@Given("^User is in the AUT login page$")
	public void user_is_in_the_AUT_login_page() throws Throwable 
	{
		System.out.println("Open Amazon website");
	}

	@When("^Enter Username & Password$")
	public void enter_Username_Password() throws Throwable
	{
		System.out.println("Login using credential");
	}

	@Then("^User must be logged in$")
	public void user_must_be_logged_in() throws Throwable 
	{
		System.out.println("must see home page");
	}

	@Given("^User search for Mobile$")
	public void user_search_for_Mobile() throws Throwable 
	{
		System.out.println("Search for the iPhone");
	}

	@When("^Adds the mobile to cart$")
	public void adds_the_mobile_to_cart() throws Throwable
	{
		System.out.println("Add iPhone to Cart");
	}

	@Then("^added must be displayed in the cart$")
	public void added_must_be_displayed_in_the_cart() throws Throwable
	{
		System.out.println("iPhone displayed in cart");
	}

	@Given("^User navigates to the cart$")
	public void user_navigates_to_the_cart() throws Throwable 
	{
		System.out.println("Open the order summary");
		
	}

	@When("^Checks for the delivery details$")
	public void checks_for_the_delivery_details() throws Throwable 
	{
		System.out.println("Select the latest ordered item");
		
	}

	@Then("^Current status must be displayed$")
	public void current_status_must_be_displayed() throws Throwable
	{
	  System.out.println("Status will be displayed");
	    
	}
}

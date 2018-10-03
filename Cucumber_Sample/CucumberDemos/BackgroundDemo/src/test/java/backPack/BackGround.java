package backPack;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackGround 
{
	@Given("^I navigate to the login page$")
	public void login() throws Throwable 
	{
		System.out.println("User is in the login page");
	    
	}

	@When("^I submit username and password$")
	public void EnterCredential()throws Throwable 
	{
	    System.out.println("user enters the credential");
	    
	}

	@Then("^I should be logged in$")
	public void HomePage() throws Throwable 
	{
	    System.out.println("user has logged in to the corresponding home page");
	    
	}

	@Given("^User search for Lenovo Laptop$")
	public void searchProduct() throws Throwable
	{
	    System.out.println("user is searching for the lenovo laptop");
	    
	}

	@When("^Add the first laptop that appears in the search result to the basket$")
	public void addProduct() throws Throwable 
	{
	    System.out.println("Lenovo laptop is added to cart");
	    
	}

	@Then("^User basket should display with added item$")
	public void displayProduct() throws Throwable 
	{
	    System.out.println("Lenovo laptop is displayed in cart");
	    
	}

	@Given("^User navigate for Lenovo Laptop$")
	public void navigateProduct() throws Throwable 
	{
	    System.out.println("User navigates to specific page and finds lenovo laptop");
	    
	}

	@When("^Add the laptop to the basket$")
	public void addNavigateedProduct() throws Throwable 
	{
	   System.out.println("Now Lenovo laptop is added to the cart");
	   
	}
	
}

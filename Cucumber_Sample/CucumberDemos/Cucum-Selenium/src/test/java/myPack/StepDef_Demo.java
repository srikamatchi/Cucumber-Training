package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_Demo 
{
	WebDriver driver;
	@Given("^Login must be done only by registered user$")
	public void beoreLogin() throws Throwable 
	{
		System.out.println("user must be registered");
		System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://demoaut.com/");
	    //throw new PendingException();
	}
	@When("^Enter the valid credentials$")
	public void do_login() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}
	@Then("^display logged in successfully$")
	public void post_login() throws Throwable 
	{
		System.out.println("Logged in successfully");
		driver.close();
	    //throw new PendingException();
	}


}

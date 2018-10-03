package cucumberReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberReport 
{
	WebDriver driver;
	@Given("^I have opened the browser$")
	public void openBrowser() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}

	@When("^I open Facebook website$")
	public void openFacebook() throws Throwable 
	{
		driver.get("https://www.facebook.com/");
	}

	@Then("^Login button should exist$")
	public void loginButtonCheck() throws Throwable 
	{
		if(driver.findElement(By.id("u_0_3")).isEnabled())
		{
			System.out.println("Test 1 pass");
		}
		else
		{
			System.out.println("Test 1 Fail");
		}
	}
	@Then("^Forgot password link should exist$")
	public void forgotPass() throws Throwable
	{
		if(driver.findElement(By.linkText("Forgotten account?")).isEnabled())
		{
			System.out.println("Test 2 pass");
		}
		else
		{
			System.out.println("Test 2 Fail");
		}
	}
}

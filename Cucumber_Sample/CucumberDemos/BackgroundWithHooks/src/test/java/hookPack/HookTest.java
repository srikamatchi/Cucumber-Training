package hookPack;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookTest
{
	@Before()
    public void beforeScenario()
	{
        System.out.println("Before Hook");
        
    }	
	@After()
	public void afterScenrio()
	{
		System.out.println("After Hook");
	}
}

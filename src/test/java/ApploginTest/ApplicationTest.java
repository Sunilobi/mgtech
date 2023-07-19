package ApploginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import applogin.login;

public class ApplicationTest {
	
	login login=new login();
	
	
	@Test(priority=1)
	public void launchapp()
	{
		
		login.setup();
	}
	
	
	@Test(priority=2)
	public void VerifyText()
	{
		
		boolean status=login.verify();
		
		if(status==true)
		{
			Assert.assertTrue(true);
			System.out.println("Enter text is dispalyed");
			
		}else
		{
			System.out.println("User need to enter the text");
			Assert.assertTrue(false);
			
			
		}
		
		
		login.traedown();
		
		
		
	}

}

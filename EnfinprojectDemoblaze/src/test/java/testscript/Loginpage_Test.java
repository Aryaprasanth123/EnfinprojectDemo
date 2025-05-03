package testscript;

import java.awt.AWTException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Login_Page;

public class Loginpage_Test extends Base {
	 @Test
	  @Parameters({"username","password"})
	 public void verifyifUserIsAbleToLoginWithValidCredentials(String username,String password) throws AWTException
	  {
		  Login_Page login=new Login_Page(driver);
		  login.enterUsername(username);
		  login.enterPassword(password);
		  login.clickLogin();
		 
	  }
	 
	  public void verifyifUserIsNtAbleToLoginWithInValidCredentials(String username,String password) throws AWTException
	  {
		  Login_Page login=new Login_Page(driver);
		  login.enterUsername(username);
		  login.enterPassword(password);
		  login.clickLogin();
		 
	  }
}

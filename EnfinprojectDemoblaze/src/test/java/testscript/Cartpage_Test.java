package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Cart_Page;

public class Cartpage_Test extends Base {
  @Test
  public void validateWhetherUserIsAbleToEnterTheDetails(String name,String country,String city) throws IOException{
		 Cart_Page cart=new Cart_Page(driver);
		 cart.verifyIfUserIsAbleToNavigateCartPage();
		 cart.verifyIfUserIsAbleToClickThePlaceOrderbutton();
		  cart.verifyIfUserIsAbleToEnterTheName(name);
		  cart.checkIfUserIsAbleToEnterTheCountry(country);
		  cart.verifyWhetherUserIsAbleToEnterTheCity(city);
	  
} 
}

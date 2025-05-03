package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	public WebDriver driver;
	public Cart_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//[text()='Cart']") WebElement cartlink;
	@FindBy(xpath="//button[@class='btn btn-success']") WebElement placeorderbtn;
	@FindBy(xpath="//label[text()='Name:']") WebElement nametext;
	@FindBy(xpath="//label[text()='Country:']") WebElement countrytext;
	@FindBy(xpath="//label[text()='City:']") WebElement citytext;
	@FindBy(xpath="//label[text()='Credit card:']") WebElement creditcardtext;
	@FindBy(xpath="//label[text()='Month:']") WebElement monthtext;
	@FindBy(xpath="//label[text()='Year:']") WebElement yeartext;
	@FindBy(xpath="//button[text()='Purchase']") WebElement purchasebtn;
	public void verifyIfUserIsAbleToNavigateCartPage()
	{
		cartlink.click();
	}
	public void verifyIfUserIsAbleToClickThePlaceOrderbutton()
	{
		placeorderbtn.click();
	}
	public void verifyIfUserIsAbleToEnterTheName(String namefield)
	{
		nametext.sendKeys(namefield);
	}
	public void checkIfUserIsAbleToEnterTheCountry(String countryfield)
	{
		countrytext.sendKeys(countryfield);
	}
	public void verifyWhetherUserIsAbleToEnterTheCity(String cityfield)
	{
		citytext.sendKeys(cityfield);
	}
	public void verifyIfUserIsAbleToEnterTheMonthDetails(String monthfield)
	{
		monthtext.sendKeys(monthfield);
	}
	public void verifyIfUserIsAbleToEnterTheCreditcardDetails(String creditcardfield)
	{
		creditcardtext.sendKeys(creditcardfield);
	}
	public void verifyIfUserIsAbleToEnterTheyearDetails(String yearfield)
	{
		yeartext.sendKeys(yearfield);
	}
	public void verifyIfUserIsAbleToClickPurchaseButton()
	{
		purchasebtn.click();
	}
}

package pages;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Log in']") WebElement Logintitle;
	@FindBy(id="loginusername") WebElement username;
	@FindBy(id="loginpassword") WebElement password;
	@FindBy(xpath="//button[text()='Log in']") WebElement loginbtn;
	public void enterUsername(String usernamefield)
	{
	username.sendKeys(usernamefield);
	}
	public void enterPassword(String passwordfield)
	{
	password.sendKeys(passwordfield);
	}
	public void clickLogin() throws AWTException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
		loginbtn.click();
}


}

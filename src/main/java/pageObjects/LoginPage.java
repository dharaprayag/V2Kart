package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	
	By clickOnLogin = By.xpath("//ul[@class='navbar-nav right-menu']/li[1]/a");
	By clickOnLoginUsingEmail = By.xpath("//div[@class='login-choice']/button[2]");
	By email = By.cssSelector("input[placeholder='Email id']");
	By password = By.cssSelector("input[placeholder='Password']");
	By loginButton = By.cssSelector("button[class='btn btn-login']");
	
	
	
	
	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		
	}

	public WebElement getLoginLink()
	{
		return driver.findElement(clickOnLogin);
	}

	public WebElement getLoginPopUp()
	{
		return driver.findElement(clickOnLoginUsingEmail);
	}

	public WebElement getEmailId()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickOnLoginButton()
	{
		return driver.findElement(loginButton);
	}
	
	
}

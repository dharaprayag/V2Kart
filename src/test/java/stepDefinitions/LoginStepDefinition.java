package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LoginPage;

import org.junit.runner.RunWith;

import Resources.base;

@RunWith(Cucumber.class)
public class LoginStepDefinition extends base
{
	LoginPage lp = new LoginPage(driver);

    @Given("^Initialize the browser with \"([^\"]*)\"$")
    public void initialize_the_browser_with_something(String strArg1) throws Throwable
    {
        driver = initializeDriver();   
    }
    
    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable
    {
    	driver.get(strArg1);
     
    }
    
    @And("^Click on login link$")
    public void click_on_login_link() throws Throwable
    {
    	lp.getLoginLink().click();
    }
    
    @And("^Click on Login using email link$")
    public void click_on_login_using_email_link() throws Throwable
    {
    	lp.getLoginPopUp().click();     
    }
    
    @When("^enters (.+) and (.+)$")
    public void enters_and(String emailid, String password) throws Throwable
    {
    	lp.getEmailId().sendKeys(emailid);
    	lp.getPassword().sendKeys(password);     
    }
    
    @And("^Click on login Button$")
    public void click_on_login_button() throws Throwable
    {
    	lp.clickOnLoginButton().click();     
    }

    @Then("^verify the \"([^\"]*)\" is visible$")
    public void verify_the_something_is_visible(String strArg1) throws Throwable
    {
    	System.out.println(lp.getAccountText().getText());    
    }

   
    

}
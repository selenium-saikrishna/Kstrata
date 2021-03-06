package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	static FirefoxDriver driver=null;
	@Given("^the browser is launched and we navigate to the url$")
	public void the_browser_is_launched_and_we_navigate_to_the_url() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^we enter the username as \"([a-zA-z]+)\"$")
	public void we_enter_the_username_as(String str) throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys(str);
	}

	@When("^password as \"([a-zA-z0-9]+)\"$")
	public void password_as(String str) throws Throwable {
	    driver.findElement(By.id("txtPassword")).sendKeys(str);
	}

	@When("^clcik on login button$")
	public void clcik_on_login_button() throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(3000);
	}
	@Then("^it should display \"([w]+)\" msg$")
	public void it_should_display_msg(String expmsg) throws Throwable {
		String actmsg=null;
		if(expmsg.equals("Welcome Admin"))
	    {
	    	actmsg=driver.findElement(By.id("welcome")).getText();
	    }
	    else if(expmsg.equals("Invalid Credentials"))
	    {
	    	actmsg=driver.findElement(By.id("spanMessage")).getText();
	    }
	    Assert.assertEquals(actmsg, expmsg);
	}

}






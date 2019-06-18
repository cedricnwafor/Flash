package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	//Selenium code to navigate to login URL
       System.out.println("Navigated to Login URL");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	//Selenium code to login
    	System.out.println(strArg1);
    	System.out.println(strArg2);	
       
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	//Selenium code for home page validation
    	System.out.println("Validated HomePage");
        
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	//Selenium code for validating the cards
    	System.out.println(strArg1);
        
    }

}
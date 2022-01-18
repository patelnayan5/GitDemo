package stepDefinations;

//import cucumber.api.PendingException;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {
	
	


    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
      System.out.println("test1");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("test3");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
}
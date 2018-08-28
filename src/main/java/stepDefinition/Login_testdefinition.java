package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;	
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;	

public class Login_testdefinition {
	
	@Given("^User navigates to jenkins$")
	public void User_navigates_to_jenkins() throws Throwable 
   {
		system.out.println("welcome to jenkins");
   }

  

     @when("^User Clicks on login button$")
     public void User_Clicks_on_login_button() throws Throwable
     {
    	 
       	  System.out.println("publish report to qmetry"); 
       	 
      }
     
     @Then("^login page needs to be displayed$")
     public void login_page_needs_to_be_displayed() throws Throwable 
     {
    	 
       	  System.out.println("test succesfull");
       	 
      }
     
    
     
     
}

package com.example.sil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class CucumberTest {
    WebDriver driver;

    

    @Given("^user navigate$")
    public void userNavigate() throws Throwable {
        System.out.println("hi");
    }

    @Given("^user clicks$")
    public void userClicks() throws Throwable{
        
    }

    @Given("^user enter the username$")
    public void userEnterTheUsername() throws Throwable{
        
    }

    @Given("^user enter the password$")
    public void userEnterThePassword() throws Throwable{
    }

    @When("^user click on the login but$")
    public void userClickOnTheLoginBut() throws Throwable{
        
    }

    @Then("^login should be success$")
    public void loginShouldBeSuccess() throws Throwable{
    }
}

package com.Cucumber.MavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^This is my first dummy given step$")
	public void this_is_my_first_dummy_given_step() throws Throwable {
	   System.out.println("Executed the given step");
	}

	@When("^This is my first dummy when  step$")
	public void this_is_my_first_dummy_when_step() throws Throwable {
		System.out.println("Executed the when step");
	}

	@Then("^This is my first dummy then step$")
	public void this_is_my_first_dummy_then_step() throws Throwable {
		System.out.println("Executed the then step");
	}
}
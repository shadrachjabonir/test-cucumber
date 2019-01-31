package com.shadrachjabonir.cucumber;

import com.shadrachjabonir.cucumber.Person;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private String dob;
    private Integer actualAnswer;
    @Given("^DOB \"([^\"]*)\"$")
    public void DOB_is(String today) {
        this.dob =  today;
    }

    @When("^I ask for my age$")
    public void i_ask_whether_for_my_age() {
        Person p = new Person();
        this.actualAnswer = p.age(this.dob);
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(java.util.Optional.ofNullable(Integer.parseInt(expectedAnswer)).get(), actualAnswer);
    }

}

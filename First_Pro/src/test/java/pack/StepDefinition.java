package pack;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("I am going to buy car")
	public void i_am_going_to_buy_car() {
	    System.out.println("I am going to buy car");
	}

	@And("car must be less than {int} year old")
	public void car_must_be_less_than_year_old(int years) {
	    System.out.println("car must be less than "+years+" year old");
	}

	@When("I pay the money")
	public void i_pay_the_money() {
	    System.out.println("I pay the money");
	}

	@Then("I will pay by {string}")
	public void i_will_pay_by_credit_card(String type_of_payment) {
	    System.out.println("I will pay by "+type_of_payment);
	}

}

package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("Uber wants to select car type {string} from uber application")
	public void uber_wants_to_select_car_type_from_uber_app(String carType) {
		System.out.println("Step1 :" + carType);
	}

	@When("Uber selects car {string} and pickup location {string} and drop location {string}")
	public void uber_selects_car_and_pickup_location_and_drop_location(String carType, String pickLocation,
			String dropLocation) {
		System.out.println("Step2 :" + carType + "pickLocation: " + pickLocation + "dropLocation: " + dropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step3 : Journey starts");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step4 : Journey ends");
	}

	@Then("User pays {int} Rupees")
	public void user_pays_rupees(Integer cost) {
		System.out.println("Step5 : cost: " + cost);
	}

}

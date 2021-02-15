package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.test.sampleJava.Product;
import test.test.sampleJava.Search;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search filed on Amazon Page")
	public void i_have_a_search_filed_on_amazon_page() {
		System.out.println("Step 1: I'm on Search Page.");
	}

	@When("I search for product with name {string} and Price {int}")
	public void i_search_for_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name : " + productName + " price: " + price);
		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: product " + productName + " is displayed.");
		search=new Search();
		String proName=search.displayProduct(product);
		System.out.println("Searched product is :"+proName);
	}

}

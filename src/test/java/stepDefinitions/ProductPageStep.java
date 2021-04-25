package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.PageGeneratorManager;
import pageObjects.ProductPageObject;

public class ProductPageStep {
	WebDriver driver;
	ProductPageObject productPage;

	public ProductPageStep() {
		driver = Hooks.openAndQuitBrowser();
		productPage = PageGeneratorManager.getProductPage(driver);
	}

	@Given("^Click to \"([^\"]*)\" in Top Menu$")
	public void clickToInTopMenu(String arg1) {
	   
	   
	}

	@When("^Click to sub list with data \"([^\"]*)\"$")
	public void clickToSubListWithData(String arg1) {
	   
	   
	}

	@When("^Click to Add To Cart with product name \"([^\"]*)\"$")
	public void clickToAddToCartWithProductName(String arg1) {
	   
	   
	}

	@When("^Click to Add Your Review link text$")
	public void clickToAddYourReviewLinkText() {
	   
	   
	}

	@When("^Click to Rating radio button with value \"([^\"]*)\"$")
	public void clickToRatingRadioButtonWithValue(String arg1) {
	   
	   
	}

	@Then("^Verify Product Review Title diplayed with \"([^\"]*)\"$")
	public void verifyProductReviewTitleDiplayedWith(String arg1) {
	   
	   
	}

	@Then("^Verify Product Review Content diplayed with \"([^\"]*)\"$")
	public void verifyProductReviewContentDiplayedWith(String arg1) {
	   
	   
	}
}

package stepDefinitions;

import org.junit.Assert;
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

	@When("^Click to Add Your Review link text$")
	public void clickToAddYourReviewLinkText() {
		productPage.clickToAddYourReviewLinkText();
	}

	@Then("^Verify search product warning with message \"([^\"]*)\"$")
	public void verifySearchProductWarningWithMessage(String message) {
		Assert.assertEquals(productPage.getSearchProductWarning(), message);
	}

	@Then("^Verify search result display with \"([^\"]*)\" products$")
	public void verifySearchResultDisplayWithProducts(String numberProduct) {
		Assert.assertEquals(String.valueOf(productPage.getSearchProductResultNumber()), numberProduct);
	}

	@Then("^Verify product sorted \"([^\"]*)\"$")
	public void verifyProductSorted(String sortby) {
		switch (sortby) {
		case "Name: A to Z":
			Assert.assertTrue(productPage.isProductSortedAscendingByName());
			break;
		case "Name: Z to A":
			Assert.assertTrue(productPage.isProductSortedDescendingByName());
			break;
		case "Price: Low to High":
			Assert.assertTrue(productPage.isProductSortedAscendingByPrice());
			break;
		case "Price: High to Low":
			Assert.assertTrue(productPage.isProductSortedDescendingByPrice());
			break;
		default:
			break;
		}
		
	}
}

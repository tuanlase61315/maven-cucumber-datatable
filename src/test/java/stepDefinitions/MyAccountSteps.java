package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import pageObjects.MyAccountPageObject;
import pageObjects.PageGeneratorManager;

public class MyAccountSteps {
	WebDriver driver;
	MyAccountPageObject myAccountPage;

	public MyAccountSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		myAccountPage = PageGeneratorManager.getMyAccountPage(driver);
	}

	@When("^Click to close button in success notification$")
	public void clickToCloseButtonInSuccessNotification() {
		myAccountPage.clickCloseIconInNotification();
	}

	@Then("^Change Password success message \"([^\"]*)\" displayed$")
	public void changePasswordSuccessMessageSomethingDisplayed(String message) {
		Assert.assertEquals(myAccountPage.getChangePasswordSuccessText(), message);
		
	}
	
	@Then("^Verify Product Review Title diplayed with \"([^\"]*)\"$")
	public void verifyProductReviewTitleDiplayedWith(String title) {
		Assert.assertEquals(myAccountPage.getProductReviewTitle(), title);
	   
	}

	@Then("^Verify Product Review Content diplayed with \"([^\"]*)\"$")
	public void verifyProductReviewContentDiplayedWith(String content) {
		Assert.assertEquals(myAccountPage.getProductReviewContent(), content);
	   
	}
	

}

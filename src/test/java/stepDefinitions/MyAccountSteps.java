package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.MyAccountPageObject;
import pageObjects.PageGeneratorManager;

public class MyAccountSteps {
	WebDriver driver;
	MyAccountPageObject myAccountPage;

	public MyAccountSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		myAccountPage = PageGeneratorManager.getMyAccountPage(driver);
	}





	

}

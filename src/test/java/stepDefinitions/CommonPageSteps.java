package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.CommonPageObject;
import pageObjects.PageGeneratorManager;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	TestContext testContext;

	public CommonPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		commonPage = PageGeneratorManager.getCommonPage(driver);
	}

	@Then("^Click to \"([^\"]*)\" link text$")
	public void clickToDynamicLinkText(String linkText) {
//		switch (linkText) {
//		case "Register":
//			commonPage.clickToDynamicTextLinkByText("Register");
//			break;
//		case "Log out":
//			commonPage.clickToDynamicTextLinkByText("Log out");
//			break;
//		case "Log in":
//			commonPage.clickToDynamicTextLinkByText("Log in");
//			break;
//		case "My account":
//			commonPage.clickToDynamicTextLinkByText("My account");
//			break;
//		}
		commonPage.clickToDynamicTextLinkByText(linkText);
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToDynamicButton(String buttonName) {
//		switch (buttonName) {
//		case "Register":
//			commonPage.clickToDynamicButtonByText("Register");
//			break;
//		case "Log in":
//			commonPage.clickToDynamicButtonByText("Log in");
//			break;
//		case "Save":
//			commonPage.clickToDynamicButtonByText("Save");
//			break;
//		case "Add new":
//			commonPage.clickToDynamicButtonByText("Add new");
//			break;
//		case "Change password":
//			commonPage.clickToDynamicButtonByText("Change password");
//			break;
//		case "Change password":
//			commonPage.clickToDynamicButtonByText("Change password");
//			break;
//		}
		
		commonPage.clickToDynamicButtonByText(buttonName);
	}

	@When("^Select to Gender raido button with value \"([^\"]*)\"$")
	public void selectToDynamicGenderRaidoButtonWithValue(String radioButtonValue) {
		commonPage.clickToGenderRadioByText(radioButtonValue);
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToDynamicTextboxWithValue(String fieldName, String inputValue) {
		commonPage.inputToDynamicTextboxByName(fieldName, inputValue);
	}

	@When("^Select \"([^\"]*)\" dropdown with value \"([^\"]*)\"$")
	public void selectDynamicDropdownWithValue(String dropdownName, String selectValue) {
		commonPage.selectDateOfBirthDropdownByName(dropdownName, selectValue);
	}

	@Then("^Verify \"([^\"]*)\" link text is displayed$")
	public void verifyDynamicLinkTextIsDisplayed(String textLink) {
		Assert.assertTrue(commonPage.isDynamicTextLinkIsDisplayed(textLink));
	}

	@Then("^Verify \"([^\"]*)\" textbox displayed with value \"([^\"]*)\"$")
	public void verifyTextboxDisplayedWithValue(String fieldName, String inputValue) {
		Assert.assertEquals(commonPage.getDynamicTextboxAttributeValue(fieldName), inputValue);
	}

	@Then("^Verify \"([^\"]*)\" dropdown displayed with value \"([^\"]*)\"$")
	public void verifyDropdownDisplayedWithValue(String dropdownName, String selectValue) {
		Assert.assertEquals(commonPage.getDynamicDropdownValueByName(dropdownName), selectValue);
	}

	@Given("^Click to \"([^\"]*)\" navigation menu$")
	public void clickToNavigationMenu(String menuName) {
		commonPage.clickToDynamicNaviMenuByText(menuName);
	}

	@Then("^Verify \"([^\"]*)\" address displayed with value \"([^\"]*)\"$")
	public void verifyAddressDisplayedWithValue(String className, String textValue) {
		switch (className) {
		case "email":
			Assert.assertEquals(commonPage.getAddressInfoByClass(className), "Email: " + textValue);
			break;
		case "phone":
			Assert.assertEquals(commonPage.getAddressInfoByClass(className), "Phone number: " + textValue);
			break;
		case "fax":
			Assert.assertEquals(commonPage.getAddressInfoByClass(className), "Fax number: " + textValue);
			break;
		default:
			Assert.assertEquals(commonPage.getAddressInfoByClass(className), textValue);
			break;
		}

	}

	@Then("^Verify \"([^\"]*)\" address displayed with value \"([^\"]*)\"\"([^\"]*)\"$")
	public void verifyAddressDisplayedWithValue(String className, String firtName, String lastName) {
		Assert.assertEquals(commonPage.getAddressInfoByClass(className), firtName + " " + lastName);
	}

	@Then("^Verify \"([^\"]*)\" address displayed with value \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void verifyAddressDisplayedWithValue(String className, String city, String state, String zip) {
		Assert.assertEquals(commonPage.getAddressInfoByClass(className), city + ", " + state + ", " + zip);
	}
	

	@Then("^Success message displayed \"([^\"]*)\"$")
	public void successMessageDisplayed(String message) {
		Assert.assertEquals(commonPage.getRegisterSuccessMessage(), message);

	   
	}

}

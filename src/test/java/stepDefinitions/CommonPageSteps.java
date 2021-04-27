package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.CommonPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.ProductPageObject;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	ProductPageObject productPage;
	TestContext testContext;

	public CommonPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		commonPage = PageGeneratorManager.getCommonPage(driver);
	}

	@Then("^Click to \"([^\"]*)\" link text$")
	public void clickToDynamicLinkText(String linkText) {
		commonPage.clickToDynamicTextLinkByText(linkText);
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToDynamicButton(String buttonName) {
		switch (buttonName) {
		case "Search":
			productPage = PageGeneratorManager.getProductPage(driver);
			productPage.clickToSearchButtonInFormSearch();
			break;
		default:
			commonPage.clickToDynamicButtonByText(buttonName);
			break;
		}
		
		
	}

	@When("^Select to Gender raido button with value \"([^\"]*)\"$")
	public void selectToDynamicGenderRaidoButtonWithValue(String radioButtonValue) {
		commonPage.clickToGenderRadioByText(radioButtonValue);
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToDynamicTextboxWithValue(String fieldName, String inputValue) {
		switch (fieldName) {
		case "q":
			productPage = PageGeneratorManager.getProductPage(driver);
			productPage.inputToSearchTextboxInFormSearch(inputValue);
			break;
		default:
			commonPage.inputToDynamicTextboxByName(fieldName, inputValue);
			break;
		}
		
	}
	
	@When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
	public void inputToDynamicTextareaWithValue(String fieldName, String inputValue) {
		commonPage.inputToDynamicTextareaByName(fieldName, inputValue);
	}

	@When("^Select \"([^\"]*)\" dropdown with value \"([^\"]*)\"$")
	public void selectDynamicDropdownWithValue(String dropdownName, String selectValue) {
		commonPage.selectDynamicDropdownByName(dropdownName, selectValue);
		commonPage.sleepInSecond(1);
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
	
	@Given("^Click to \"([^\"]*)\" in Top Menu$")
	public void clickToInTopMenu(String category) {
		commonPage.clickToCategoryTopMenuByCategory(category);
	}

	@When("^Click to sub list with data \"([^\"]*)\"$")
	public void clickToSubListWithData(String subList) {
		commonPage.clickToSubListCategoryByText(subList);
	}

	@When("^Click to Add To Cart button with product name \"([^\"]*)\"$")
	public void clickToAddToCartWithProductName(String productName) {
	   commonPage.clickToAddToCartButtonByProductName(productName);   
	}
	
	@When("^Click to Rating radio button with value \"([^\"]*)\"$")
	public void clickToRatingRadioButtonWithValue(String selectValue) {
		commonPage.clickToDynamicRatingRadioButtonByValue(selectValue);	   
	}
	
	 @Given("^Open \"([^\"]*)\" footer page$")
	public void onenFooterPage(String pageName) {
		commonPage.clickToDynamicFooterLinktext(pageName);
		commonPage.sleepInSecond(3);
	}

	@When("^Check to \"([^\"]*)\" checkbox$")
	public void checkToCheckbox(String checkboxName) {
		commonPage.checkToDynamicCheckboxByText(checkboxName);	    
	}
	
	@When("^Click to product name \"([^\"]*)\"$")
	public void clickToProductName(String productName)  {
		commonPage.clickToDynamicProductNameByText(productName);
	}

	@When("^Click to product \"([^\"]*)\" button$")
	public void clickToProductButton(String buttonText)  {
		commonPage.sleepInSecond(1);
		commonPage.clickToDynamicButtonInProductDetailByText(buttonText);	   	   
	}



	@Then("^Verify Column \"([^\"]*)\" displayed \"([^\"]*)\" in \"([^\"]*)\"$")
	public void verifyColumnDisplayedIn(String columnName, String productName, String tableClass) {
		Assert.assertTrue(commonPage.isInformationDisplayedAtColumnNameAndRowNumber(tableClass, columnName, "1", productName));	
	}
	
	@When("^Click to Checkbox Row \"([^\"]*)\" in column \"([^\"]*)\" of Table \"([^\"]*)\"$")
    public void clickToDataOfTable(String rowIndex, String column, String table)  {
    	commonPage.clickToInfomationAtColumnNameAndRowNumber(table, column, rowIndex);
    }


}

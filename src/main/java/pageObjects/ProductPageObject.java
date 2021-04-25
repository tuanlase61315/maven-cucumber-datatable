package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.ProductPageUI;

public class ProductPageObject extends BasePage{
	private WebDriver driver;

	public ProductPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToAddYourReviewLinkText() {
		waitForElementClickable(driver, ProductPageUI.ADD_YOUR_REVIEW_LINK_TEXT);
		clickToElement(driver, ProductPageUI.ADD_YOUR_REVIEW_LINK_TEXT);
	}
	
	
}

package pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.CommonPageUI;
import pageUI.ProductPageUI;

public class ProductPageObject extends BasePage {
	private WebDriver driver;

	public ProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToAddYourReviewLinkText() {
		waitForElementClickable(driver, ProductPageUI.ADD_YOUR_REVIEW_LINK_TEXT);
		clickToElement(driver, ProductPageUI.ADD_YOUR_REVIEW_LINK_TEXT);
	}

	public String getSearchProductWarning() {
		waitForAllElementVisible(driver, ProductPageUI.SEARCH_PRODUCT_WARNING);
		return getTextElement(driver, ProductPageUI.SEARCH_PRODUCT_WARNING);
	}

	public int getSearchProductResultNumber() {
		waitForAllElementVisible(driver, ProductPageUI.SEARCH_RESULT_PRODUCT_NUMBER);
		return getElementSize(driver, ProductPageUI.SEARCH_RESULT_PRODUCT_NUMBER);
	}

	public void clickToSearchButtonInFormSearch() {
		waitForElementClickable(driver, ProductPageUI.SEARCH_BUTTON_IN_FORM_SEARCH);
		clickToElement(driver, ProductPageUI.SEARCH_BUTTON_IN_FORM_SEARCH);
	}

	public void inputToSearchTextboxInFormSearch(String inputValue) {
		waitForElementVisible(driver, ProductPageUI.SEARCH_TEXTBOX_IN_FORM_SEARCH);
		sendkeyToElement(driver, ProductPageUI.SEARCH_TEXTBOX_IN_FORM_SEARCH, inputValue);
	}

	public boolean isProductSortedAscendingByName() {
		waitForAllElementVisible(driver, ProductPageUI.LIST_PRODUCT_NAME);
		return isDataStringSortedAscending(driver, ProductPageUI.LIST_PRODUCT_NAME);
	}

	public boolean isProductSortedDescendingByName() {
		waitForAllElementVisible(driver, ProductPageUI.LIST_PRODUCT_NAME);
		return isDataStringSortedDescending(driver, ProductPageUI.LIST_PRODUCT_NAME);
	}

	public boolean isProductSortedAscendingByPrice() {
		waitForAllElementVisible(driver, ProductPageUI.LIST_PRODUCT_PRICE);
		return isDataFloatSortedAscending(driver, ProductPageUI.LIST_PRODUCT_PRICE);
	}

	public boolean isProductSortedDescendingByPrice() {
		waitForAllElementVisible(driver, ProductPageUI.LIST_PRODUCT_PRICE);
		return isDataFloatSortedDescending(driver, ProductPageUI.LIST_PRODUCT_PRICE);
	}

	public boolean isNextPageIconDisplayed() {
		return isElementDisplay(driver, ProductPageUI.NEXT_PAGE_ICON);

	}

	public boolean isPreviousIconDisplayed() {
		return isElementDisplay(driver, ProductPageUI.PREVIOUS_PAGE_ICON);
	}

	public void clickToNextPageIcon() {
		waitForElementClickable(driver, ProductPageUI.NEXT_PAGE_ICON);
		clickToElement(driver, ProductPageUI.NEXT_PAGE_ICON);
	}

	public void clickToPreviousPageIcon() {
		waitForElementClickable(driver, ProductPageUI.PREVIOUS_PAGE_ICON);
		clickToElement(driver, ProductPageUI.PREVIOUS_PAGE_ICON);
	}
	
	public String getAddWishlistSuccessMessage() {
		waitForElementVisible(driver, ProductPageUI.ADD_WISHLIST_SUCCESS_MESSAGE);
		return getTextElement(driver, ProductPageUI.ADD_WISHLIST_SUCCESS_MESSAGE);
	}
	
	public void clickToYourWishlistUrl() {
		waitForElementClickable(driver, ProductPageUI.YOUR_WISHLIST_URL);
		clickToElement(driver, ProductPageUI.YOUR_WISHLIST_URL);
	}
	
	public String getTextPageTitleH1() {
		waitForElementVisible(driver, ProductPageUI.PAGE_TITLE_H1_TEXT);
		return getTextElement(driver, ProductPageUI.PAGE_TITLE_H1_TEXT);
	}
	
	public String getNoDataMessage() {
		waitForElementVisible(driver, ProductPageUI.NO_DATA_MESSAGE);
		return getTextElement(driver, ProductPageUI.NO_DATA_MESSAGE);
	}
	


}

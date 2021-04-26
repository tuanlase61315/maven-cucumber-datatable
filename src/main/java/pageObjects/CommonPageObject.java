package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.CommonPageUI;
import pageUI.HomePageUI;
import pageUI.ProductPageUI;
import pageUI.RegisterPageUI;

public class CommonPageObject extends BasePage {
	private WebDriver driver;

	public CommonPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getErrorMessageAtLine01Notification() {
		waitForElementVisible(driver, CommonPageUI.ERROR_MESSAGE_lINE_01_AT_NOTIFICATION);
		return getTextElement(driver, CommonPageUI.ERROR_MESSAGE_lINE_01_AT_NOTIFICATION);
	}

	public String getErrorMessageAtLine02Notification() {
		waitForElementVisible(driver, CommonPageUI.ERROR_MESSAGE_LINE_02_AT_NOTIFICATION);
		return getTextElement(driver, CommonPageUI.ERROR_MESSAGE_LINE_02_AT_NOTIFICATION);
	}

	public String getRulePasswordErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.RULE_PASSWORD_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.RULE_PASSWORD_ERROR_MESSAGE);
	}

	public String getLessThan6CharacterErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.LESS_THAN_6_CHARACTER_MESSAGE);
		return getTextElement(driver, RegisterPageUI.LESS_THAN_6_CHARACTER_MESSAGE);
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, CommonPageUI.SUCCESS_MESSAGE);
		return getTextElement(driver, CommonPageUI.SUCCESS_MESSAGE);
	}

	// DYNAMIC LOCATOR
	public void clickToDynamicTextLinkByText(String textValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textValue);
	}

	public void inputToDynamicTextboxByName(String textboxName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_NAME, textboxName);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_NAME, inputValue, textboxName);
	}
	
	public void inputToDynamicTextareaByName(String textareaName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA_BY_NAME, textareaName);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA_BY_NAME, inputValue, textareaName);
	}


	public void clickToDynamicButtonByText(String textValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TEXT, textValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TEXT, textValue);
	}

	public String getItemErrorMessageByID(String idValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_ERROR_MESSAGE_BY_ID, idValue);
		return getElementText(driver, CommonPageUI.DYNAMIC_ERROR_MESSAGE_BY_ID, idValue);
	}

	public boolean isDynamicTextLinkIsDisplayed(String textLinkName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textLinkName);
		return isElementDisplay(driver, CommonPageUI.DYNAMIC_TEXT_LINK_HEADER_BY_TEXT, textLinkName);
	}

	public void clickToGenderRadioByText(String textValue) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT, textValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT, textValue);

	}

	public void selectDynamicDropdownByName(String dropdownName, String itemText) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_NAME, dropdownName);
		selectItemInDropdownByText(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_NAME, itemText, dropdownName);
	}

	public String getDynamicTextboxAttributeValue(String textboxName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_NAME, textboxName);
		return getAttributeValue(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_NAME, textboxName);
	}

	public String getDynamicDropdownValueByName(String dropdownName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_NAME, dropdownName);
		return getSelectItemInDropdown(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_NAME, dropdownName);
	}

	public void clickToDynamicNaviMenuByText(String textValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_NAVI_MENU, textValue);
		clickToElement(driver, CommonPageUI.DYNAMIC_NAVI_MENU, textValue);
	}

	public String getAddressInfoByClass(String className) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_ADDRESS_INFO_BY_CLASS, className);
		return getElementText(driver, CommonPageUI.DYNAMIC_ADDRESS_INFO_BY_CLASS, className);
	}

	public void clickToCategoryTopMenuByCategory(String category) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_TOP_MENU_BY_TEXT, category);
		clickToElement(driver, CommonPageUI.DYNAMIC_TOP_MENU_BY_TEXT, category);
	}

	public void clickToAddToCartButtonByProductName(String productName) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_ADD_TO_CART_BY_PRODUCT_NAME, productName);
		clickToElement(driver, CommonPageUI.DYNAMIC_ADD_TO_CART_BY_PRODUCT_NAME, productName);
	}

	public void clickToSubListCategoryByText(String subList) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_SUB_LIST_TOP_MENU_BY_TEXT, subList);
		clickToElement(driver, CommonPageUI.DYNAMIC_SUB_LIST_TOP_MENU_BY_TEXT, subList);
	}

	public void clickToDynamicRatingRadioButtonByValue(String value) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_RATTING_RADIO_BUTTON_BY_VALUE, value);
		clickToElement(driver, CommonPageUI.DYNAMIC_RATTING_RADIO_BUTTON_BY_VALUE, value);
	}
	
	public void checkToDynamicCheckboxByText(String checkboxText) {
		if(!isElementSelected(driver, CommonPageUI.DYNAMIC_CHECKBOX_BY_TEXT, checkboxText)) {
			waitForElementClickable(driver, CommonPageUI.DYNAMIC_CHECKBOX_BY_TEXT, checkboxText);
			clickToElement(driver, CommonPageUI.DYNAMIC_CHECKBOX_BY_TEXT, checkboxText);
		}
	}
	
	public void clickToDynamicFooterLinktext(String menuLinktext) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_FOOTER_MENU_BY_TEXT, menuLinktext);
		clickToElement(driver, CommonPageUI.DYNAMIC_FOOTER_MENU_BY_TEXT, menuLinktext);
	}
	
	public void clickToDynamicButtonInProductDetailByText(String buttonText) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON_PRODUCT_DETAIL, buttonText);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON_PRODUCT_DETAIL, buttonText);
	}
	
	public void clickToDynamicProductNameByText(String productText) {
		waitForElementClickable(driver, CommonPageUI.DYNAMIC_PRODUCT_NAME_BY_TEXT, productText);
		clickToElement(driver, CommonPageUI.DYNAMIC_PRODUCT_NAME_BY_TEXT, productText);
	}

}

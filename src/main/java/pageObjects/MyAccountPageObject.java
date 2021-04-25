package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.MyAccountPageUI;

public class MyAccountPageObject extends BasePage{
	private WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getChangePasswordSuccessText() {
		waitForElementVisible(driver, MyAccountPageUI.CHANGE_PASSWORD_NOTIFICATION);
		return getTextElement(driver, MyAccountPageUI.CHANGE_PASSWORD_NOTIFICATION);
	}
	
	public void clickCloseIconInNotification() {
		waitForElementClickable(driver, MyAccountPageUI.CLOSE_ICON_NOTIFICATION);
		clickToElement(driver, MyAccountPageUI.CLOSE_ICON_NOTIFICATION);
		sleepInSecond(2);
	}
	
	public String getProductReviewTitle() {
		waitForElementVisible(driver, MyAccountPageUI.PRODUCT_REVIEW_TITLE);
		return getTextElement(driver, MyAccountPageUI.PRODUCT_REVIEW_TITLE);
	}
	
	public String getProductReviewContent() {
		waitForElementVisible(driver, MyAccountPageUI.PRODUCT_REVIEW_CONTENT);
		return getTextElement(driver, MyAccountPageUI.PRODUCT_REVIEW_CONTENT);
	}
}

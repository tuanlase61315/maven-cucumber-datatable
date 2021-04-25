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
}

package pageUI;

public class CommonPageUI {
	public static final String ERROR_MESSAGE_lINE_01_AT_NOTIFICATION = "//div[@class='message-error validation-summary-errors']";
	public static final String ERROR_MESSAGE_LINE_02_AT_NOTIFICATION = "//div[@class='message-error validation-summary-errors']//li";
	
	public static final String DYNAMIC_TEXT_LINK_HEADER_BY_TEXT = "//div[@class='header-links']//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_NAME = "//input[@name='%s']";
	public static final String DYNAMIC_BUTTON_BY_TEXT = "//button[text()='%s']";
	public static final String DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT = "//label[text()='%s']/preceding-sibling::input";
	public static final String DYNAMIC_DATE_OF_BIRTH_DROPDOWN_BY_NAME = "//select[@name='%s']";
	public static final String DYNAMIC_DATE_OF_BIRTH_DROPDOWN_VALUE_BY_NAME = "//select[@name='%s']//option[@selected]";
	
	public static final String DYNAMIC_ERROR_MESSAGE_BY_ID = "//span[@id='%s']";
	
	public static final String DYNAMIC_NAVI_MENU = "//div[@class='block block-account-navigation']//a[text()='%s']";
	
	//address
	public static final String DYNAMIC_ADDRESS_INFO_BY_CLASS = "//div[@class='section address-item']//li[@class='%s']";
	

}

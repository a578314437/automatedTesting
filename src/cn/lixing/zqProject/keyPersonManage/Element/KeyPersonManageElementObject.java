package cn.lixing.zqProject.keyPersonManage.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;

public class KeyPersonManageElementObject {
	private WebElement KeyPersonManageListElement;
	private WebElement AddKeyPersonElement;
	private WebElement EditKeyPersonElement;
	private WebElement DelKeyPersonElement;
	private WebElement ShowCustomerNameElement;
	private WebElement SelectCustomerNameElement;
	private WebElement KeyPersonNameElement;
	private WebElement ContactWayElement;
	private WebElement SaveBtnElement;
	private ApplicationContext context;
	private ParentPage page;
	private WebDriver driver;
	private KeyPersonManageElementXpathData xpathData;
	
	public KeyPersonManageElementObject() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		xpathData=new KeyPersonManageElementXpathData();
		driver=page.startBrowse();
	}

	public WebElement getKeyPersonManageListElement() {
		KeyPersonManageListElement=page.getWebElement(xpathData.getKeyPersonManageListXpath());
		return KeyPersonManageListElement;
	}

	public void setKeyPersonManageListElement(WebElement keyPersonManageListElement) {
		KeyPersonManageListElement = keyPersonManageListElement;
	}

	public WebElement getAddKeyPersonElement() {
		AddKeyPersonElement=page.getWebElement(xpathData.getAddKeyPersonXpath());
		return AddKeyPersonElement;
	}

	public void setAddKeyPersonElement(WebElement addKeyPersonElement) {
		AddKeyPersonElement = addKeyPersonElement;
	}

	public WebElement getEditKeyPersonElement() {
		EditKeyPersonElement=page.getWebElement(xpathData.getEditKeyPersonXpath());
		return EditKeyPersonElement;
	}

	public void setEditKeyPersonElement(WebElement editKeyPersonElement) {
		EditKeyPersonElement = editKeyPersonElement;
	}

	public WebElement getDelKeyPersonElement() {
		DelKeyPersonElement=page.getWebElement(xpathData.getDelKeyPersonXpath());
		return DelKeyPersonElement;
	}

	public void setDelKeyPersonElement(WebElement delKeyPersonElement) {
		DelKeyPersonElement = delKeyPersonElement;
	}

	public WebElement getShowCustomerNameElement() {
		ShowCustomerNameElement=page.getWebElement(xpathData.getShowCustomerNameXpath());
		return ShowCustomerNameElement;
	}

	public void setShowCustomerNameElement(WebElement showCustomerNameElement) {
		ShowCustomerNameElement = showCustomerNameElement;
	}

	public WebElement getSelectCustomerNameElement() {
		SelectCustomerNameElement=page.getWebElement(xpathData.getSelectCustomerNameXpath());
		return SelectCustomerNameElement;
	}

	public void setSelectCustomerNameElement(WebElement selectCustomerNameElement) {
		SelectCustomerNameElement = selectCustomerNameElement;
	}

	public WebElement getKeyPersonNameElement() {
		KeyPersonNameElement=page.getWebElement(xpathData.getKeyPersonNameXpath());
		return KeyPersonNameElement;
	}

	public void setKeyPersonNameElement(WebElement keyPersonNameElement) {
		KeyPersonNameElement = keyPersonNameElement;
	}

	public WebElement getContactWayElement() {
		ContactWayElement=page.getWebElement(xpathData.getContactWayXpath());
		return ContactWayElement;
	}

	public void setContactWayElement(WebElement contactWayElement) {
		ContactWayElement = contactWayElement;
	}

	public WebElement getSaveBtnElement() {
		SaveBtnElement=page.getWebElement(xpathData.getSaveBtnXpath());
		return SaveBtnElement;
	}

	public void setSaveBtnElement(WebElement saveBtnElement) {
		SaveBtnElement = saveBtnElement;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}

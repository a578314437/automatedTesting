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
	private WebElement USER_ACCOUNTElement;
	private WebElement SEARCHBTNElement;
	private WebElement KEYPERSONNAMEElement;
	private WebElement KEYPERSONPHONEElement;
	private WebElement SAVEBTNElement;
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
	public WebElement getUSER_ACCOUNTElement() {
		USER_ACCOUNTElement=page.getWebElement(xpathData.getUSER_ACCOUNTXPATH());
		return USER_ACCOUNTElement;
	}

	public void setUSER_ACCOUNTElement(WebElement uSER_ACCOUNTElement) {
		USER_ACCOUNTElement = uSER_ACCOUNTElement;
	}

	public WebElement getSEARCHBTNElement() {
		SEARCHBTNElement=page.getWebElement(xpathData.getSEARCHBTNXPATH());
		return SEARCHBTNElement;
	}

	public void setSEARCHBTNElement(WebElement sEARCHBTNElement) {
		SEARCHBTNElement = sEARCHBTNElement;
	}

	public WebElement getKEYPERSONNAMEElement() {
		KEYPERSONNAMEElement=page.getWebElement(xpathData.getKEYPERSONNAMEXPATH());
		return KEYPERSONNAMEElement;
	}

	public void setKEYPERSONNAMEElement(WebElement kEYPERSONNAMEElement) {
		KEYPERSONNAMEElement = kEYPERSONNAMEElement;
	}

	public WebElement getKEYPERSONPHONEElement() {
		KEYPERSONPHONEElement=page.getWebElement(xpathData.getKEYPERSONPHONEXPATH());
		return KEYPERSONPHONEElement;
	}

	public void setKEYPERSONPHONEElement(WebElement kEYPERSONPHONEElement) {
		KEYPERSONPHONEElement = kEYPERSONPHONEElement;
	}

	public WebElement getSAVEBTNElement() {
		SAVEBTNElement=page.getWebElement(xpathData.getSAVEBTNXPATH());
		return SAVEBTNElement;
	}

	public void setSAVEBTNElement(WebElement sAVEBTNElement) {
		SAVEBTNElement = sAVEBTNElement;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}

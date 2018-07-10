package cn.lixing.zqProject.pushManage.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;

public class PushElementObject {
	private WebDriver driver;
	private ParentPage page;
	private ApplicationContext context;
	private PushElementXpathData xpathData;
	
	private WebElement pushListElement;
	private WebElement pushBntElement;
	private WebElement titleElement;
	private WebElement abstrElement;
	private WebElement srcElement;
	private WebElement contextElement;
	private WebElement saveBtnElement;
	private WebElement EditPushBntElement;
	
	public PushElementObject() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		xpathData=new PushElementXpathData();
		driver=page.startBrowse();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPushListElement() {
		pushListElement=page.getWebElement(xpathData.getPushListXpath());
		return pushListElement;
	}

	public void setPushListElement(WebElement pushListElement) {
		this.pushListElement = pushListElement;
	}

	public WebElement getPushBntElement() {
		pushBntElement=page.getWebElement(xpathData.getAddPushBnt());
		return pushBntElement;
	}

	public void setPushBntElement(WebElement pushBntElement) {
		this.pushBntElement = pushBntElement;
	}

	public WebElement getTitleElement() {
		titleElement=page.getWebElement(xpathData.getTitleXpath());
		return titleElement;
	}

	public void setTitleElement(WebElement titleElement) {
		this.titleElement = titleElement;
	}

	public WebElement getAbstrElement() {
		abstrElement=page.getWebElement(xpathData.getAbstrXpath());
		return abstrElement;
	}

	public void setAbstrElement(WebElement abstrElement) {
		this.abstrElement = abstrElement;
	}

	public WebElement getSrcElement() {
		srcElement=page.getWebElement(xpathData.getSrcXPath());
		return srcElement;
	}

	public void setSrcElement(WebElement srcElement) {
		this.srcElement = srcElement;
	}

	public WebElement getContextElement() {
		contextElement=page.getWebElement(xpathData.getContextXpath());
		return contextElement;
	}

	public void setContextElement(WebElement contextElement) {
		this.contextElement = contextElement;
	}

	public WebElement getSaveBtnElement() {
		saveBtnElement=page.getWebElement(xpathData.getSaveBtn());
		return saveBtnElement;
	}

	public void setSaveBtnElement(WebElement saveBtnElement) {
		this.saveBtnElement = saveBtnElement;
	}

	public ParentPage getPage() {
		return page;
	}

	public void setPage(ParentPage page) {
		this.page = page;
	}

	public WebElement getEditPushBntElement() {
		EditPushBntElement=page.getWebElement(xpathData.getEditPushBnt());
		return EditPushBntElement;
	}

	public void setEditPushBntElement(WebElement editPushBntElement) {
		EditPushBntElement = editPushBntElement;
	}
	
}

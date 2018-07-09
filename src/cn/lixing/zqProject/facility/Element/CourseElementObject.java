package cn.lixing.zqProject.facility.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;

public class CourseElementObject {
	private ParentPage page;
	private WebElement devicesListElement;
	private WebElement jcListElement;
	private WebElement insertDeviceJcBtnElement;
	private WebElement titleElement;
	private WebElement contentElement;
	private WebElement saveBtnElement;
	private WebElement editBtnElement;
	private CourseElementXpathData xpathData;
	private static CourseElementObject elementObject;
	private WebDriver driver;
	private ApplicationContext context;
	
	public CourseElementObject() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		driver=page.startBrowse();
		xpathData=new CourseElementXpathData();
	}
	public static CourseElementObject getInStanceBlock(){
        if(elementObject==null)
            synchronized (CourseElementObject.class) {
                if(elementObject==null)
                	elementObject = new CourseElementObject();
            }
        return elementObject;
    }

	public ParentPage getPage() {
		return page;
	}

	public void setPage(ParentPage page) {
		this.page = page;
	}

	public WebElement getDevicesListElement() {
		devicesListElement=page.getWebElement(xpathData.getDevicesListXpath());
		return devicesListElement;
	}

	public void setDevicesListElement(WebElement devicesListElement) {
		this.devicesListElement = devicesListElement;
	}

	public WebElement getJcListElement() {
		jcListElement=page.getWebElement(xpathData.getJcListXpath());
		return jcListElement;
	}

	public void setJcListElement(WebElement jcListElement) {
		this.jcListElement = jcListElement;
	}

	public WebElement getInsertDeviceJcBtnElement() {
		insertDeviceJcBtnElement=page.getWebElement(xpathData.getInsertDeviceJcBtnXpath());
		return insertDeviceJcBtnElement;
	}

	public void setInsertDeviceJcBtnElement(WebElement insertDeviceJcBtnElement) {
		this.insertDeviceJcBtnElement = insertDeviceJcBtnElement;
	}

	public WebElement getTitleElement() {
		titleElement=page.getWebElement(xpathData.getTitleXpath());
		return titleElement;
	}

	public void setTitleElement(WebElement titleElement) {
		this.titleElement = titleElement;
	}

	public WebElement getContentElement() {
		contentElement=page.getWebElement(xpathData.getContentXpath());
		return contentElement;
	}

	public void setContentElement(WebElement contentElement) {
		this.contentElement = contentElement;
	}

	public WebElement getSaveBtnElement() {
		saveBtnElement=page.getWebElement(xpathData.getSaveBtnXpath());
		return saveBtnElement;
	}

	public void setSaveBtnElement(WebElement saveBtnElement) {
		this.saveBtnElement = saveBtnElement;
	}
	
	public WebElement getEditBtnElement() {
		editBtnElement=page.getWebElement(xpathData.getEditBtnXpath());
		return editBtnElement;
	}

	public void setEditBtnElement(WebElement editBtnElement) {
		this.editBtnElement = editBtnElement;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}

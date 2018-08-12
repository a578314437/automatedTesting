package cn.lixing.zqProject.CustManage.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;

public class CustManageElementObject {
	private WebElement staffListElement;
	private WebElement custManageListElement;
	private WebElement addCustElement;
	private WebElement custNameElement;
	private WebElement custPhoneElement;
	private WebElement custSaveElement;
	
	private ParentPage page;
	private ApplicationContext context;
	private CustManageElementXpathData xpathData;
	private WebDriver driver;
	
	public CustManageElementObject() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		xpathData=new CustManageElementXpathData();
		driver=page.startBrowse();
	}

	public WebElement getStaffListElement() {
		staffListElement=page.getWebElement(xpathData.getStaffListXpath());
		return staffListElement;
	}

	public void setStaffListElement(WebElement staffListElement) {
		this.staffListElement = staffListElement;
	}

	public WebElement getCustManageListElement() {
		custManageListElement=page.getWebElement(xpathData.getCustManageListXpath());
		return custManageListElement;
	}

	public void setCustManageListElement(WebElement custManageListElement) {
		this.custManageListElement = custManageListElement;
	}

	public WebElement getAddCustElement() {
		addCustElement=page.getWebElement(xpathData.getAddCustXpath());
		return addCustElement;
	}

	public void setAddCustElement(WebElement addCustElement) {
		this.addCustElement = addCustElement;
	}

	public WebElement getCustNameElement() {
		custNameElement=page.getWebElement(xpathData.getCustNameXpath());
		return custNameElement;
	}

	public void setCustNameElement(WebElement custNameElement) {
		this.custNameElement = custNameElement;
	}

	public WebElement getCustPhoneElement() {
		custPhoneElement=page.getWebElement(xpathData.getCustPhoneXpath());
		return custPhoneElement;
	}

	public void setCustPhoneElement(WebElement custPhoneElement) {
		this.custPhoneElement = custPhoneElement;
	}

	public WebElement getCustSaveElement() {
		custSaveElement=page.getWebElement(xpathData.getCustSaveXpath());
		return custSaveElement;
	}

	public void setCustSaveElement(WebElement custSaveElement) {
		this.custSaveElement = custSaveElement;
	}

	public ParentPage getPage() {
		return page;
	}

	public void setPage(ParentPage page) {
		this.page = page;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}

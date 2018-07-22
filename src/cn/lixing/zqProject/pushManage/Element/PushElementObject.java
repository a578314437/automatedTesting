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
	private WebElement AddpushBntElement;
	private WebElement titleElement;
	private WebElement abstrElement;
	private WebElement srcElement;
	private WebElement contextElement;
	private WebElement saveBtnElement;
	private WebElement EditPushBntElement;
	private WebElement getContextXpthElement;
	
	private WebElement PUSHBTNPUSHBTNXPATHElement;
	private WebElement COMPANYNAMEElement;
	private WebElement SEARCHBTNElement;
	private WebElement PUSHALLBTNElement;
	private WebElement SELECTCOMPANYElement;
	private WebElement CONFIRMBTNElement;
	private WebElement PUSHBTNElement;
	private WebElement CONFIRMPUSHBTNElement;
	
	private static PushElementObject elementObject;
	
	public PushElementObject() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		xpathData=new PushElementXpathData();
		driver=page.startBrowse();
	}
	
	public static PushElementObject getInStanceBlock(){
        if(elementObject==null)
            synchronized (PushElementObject.class) {
                if(elementObject==null)
                	elementObject = new PushElementObject();
            }
        return elementObject;
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


	public WebElement getAddpushBntElement() {
		AddpushBntElement=page.getWebElement(xpathData.getAddPushBnt());
		return AddpushBntElement;
	}

	public void setAddpushBntElement(WebElement addpushBntElement) {
		AddpushBntElement = addpushBntElement;
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

	public WebElement getGetContextXpthElement() {
		getContextXpthElement=page.getWebElement(xpathData.getGetContextXpth());
		return getContextXpthElement;
	}

	public void setGetContextXpthElement(WebElement getContextXpthElement) {
		this.getContextXpthElement = getContextXpthElement;
	}

	public WebElement getPUSHBTNElement() {
		PUSHBTNElement=page.getWebElement(xpathData.getPUSHBTN());
		return PUSHBTNElement;
	}

	public void setPUSHBTNElement(WebElement pUSHBTNElement) {
		PUSHBTNElement = pUSHBTNElement;
	}

	public WebElement getCOMPANYNAMEElement() {
		COMPANYNAMEElement=page.getWebElement(xpathData.getCOMPANYNAME());
		return COMPANYNAMEElement;
	}

	public void setCOMPANYNAMEElement(WebElement cOMPANYNAMEElement) {
		COMPANYNAMEElement = cOMPANYNAMEElement;
	}

	public WebElement getSEARCHBTNElement() {
		SEARCHBTNElement=page.getWebElement(xpathData.getSEARCHBTN());
		return SEARCHBTNElement;
	}

	public void setSEARCHBTNElement(WebElement sEARCHBTNElement) {
		SEARCHBTNElement = sEARCHBTNElement;
	}

	public WebElement getPUSHALLBTNElement() {
		PUSHALLBTNElement=page.getWebElement(xpathData.getPUSHALLBTN());
		return PUSHALLBTNElement;
	}

	public void setPUSHALLBTNElement(WebElement pUSHALLBTNElement) {
		PUSHALLBTNElement = pUSHALLBTNElement;
	}

	public WebElement getSELECTCOMPANYElement() {
		SELECTCOMPANYElement=page.getWebElement(xpathData.getSELECTCOMPANY());
		return SELECTCOMPANYElement;
	}

	public void setSELECTCOMPANYElement(WebElement sELECTCOMPANYElement) {
		SELECTCOMPANYElement = sELECTCOMPANYElement;
	}

	public WebElement getCONFIRMBTNElement() {
		CONFIRMBTNElement=page.getWebElement(xpathData.getCONFIRMBTN());
		return CONFIRMBTNElement;
	}

	public void setCONFIRMBTNElement(WebElement cONFIRMBTNElement) {
		CONFIRMBTNElement = cONFIRMBTNElement;
	}

	public WebElement getCONFIRMPUSHBTNElement() {
		CONFIRMPUSHBTNElement=page.getWebElement(xpathData.getCONFIRMPUSHBTN());
		return CONFIRMPUSHBTNElement;
	}

	public void setCONFIRMPUSHBTNElement(WebElement cONFIRMPUSHBTNElement) {
		CONFIRMPUSHBTNElement = cONFIRMPUSHBTNElement;
	}

	public WebElement getPUSHBTNPUSHBTNXPATHElement() {
		PUSHBTNPUSHBTNXPATHElement=page.getWebElement(xpathData.getPUSHBTNXPATH());
		return PUSHBTNPUSHBTNXPATHElement;
	}

	public void setPUSHBTNPUSHBTNXPATHElement(WebElement pUSHBTNPUSHBTNXPATHElement) {
		PUSHBTNPUSHBTNXPATHElement = pUSHBTNPUSHBTNXPATHElement;
	}
	
	
}

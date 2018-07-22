package cn.lixing.zqProject.pushManage.pages;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.pushManage.Element.PushElementObject;
import static cn.lixing.zqProject.Uilt.ExecuteUploadFileUilt.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class AddPushPage {
	private ParentPage page;
	private PushManageListPage listPage;
	private PushElementObject elementObject;
	private WebDriver driver;
	
	private String title;
	private String abstr;
	private String context;
	public AddPushPage() {
		listPage=new PushManageListPage();
		elementObject=listPage.getElementObject();
		page=listPage.getPage();
		driver=elementObject.getDriver();
	}
	
	public void openAddPushPage() {
		listPage.openPushManageListPage();
		page.click(elementObject.getAddpushBntElement());
	}
	
	public void openEditPushPage() {
		listPage.openPushManageListPage();
		page.click(elementObject.getEditPushBntElement());
	}
	
	public void openPushPage() {
		listPage.openPushManageListPage();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.click(elementObject.getPUSHBTNPUSHBTNXPATHElement());
	}
	
	public void submitAddPush(String TestTitle,String TestAbstr,String TestContext) {
		openAddPushPage();
		page.sendKey(elementObject.getTitleElement(), TestTitle);
		title=elementObject.getTitleElement().getAttribute("value");
		page.sendKey(elementObject.getAbstrElement(), TestAbstr);
		abstr=elementObject.getAbstrElement().getAttribute("value");
		//context=elementObject.getContextElement().getAttribute("value");
		
		//System.out.println(context);
		page.click(elementObject.getSrcElement());
		upload();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.sendKey(elementObject.getContextElement(), TestContext);
		context=elementObject.getGetContextXpthElement().getText();
		
		System.out.println(context);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1200)");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.click(elementObject.getSaveBtnElement());
		
	}
	public void submitPush(String compaynName) {
		openPushPage();
		page.sendKey(elementObject.getCOMPANYNAMEElement(), compaynName);
		page.click(elementObject.getSEARCHBTNElement());
		page.click(elementObject.getSELECTCOMPANYElement());
		page.click(elementObject.getCONFIRMBTNElement());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.click(elementObject.getPUSHBTNElement());
		page.click(elementObject.getCONFIRMPUSHBTNElement());
		
	}
	public void submitAllPush() {
		openPushPage();
		page.click(elementObject.getPUSHALLBTNElement());
		page.click(elementObject.getCONFIRMPUSHBTNElement());
		
	}
	
	public PushElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(PushElementObject elementObject) {
		this.elementObject = elementObject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstr() {
		return abstr;
	}

	public void setAbstr(String abstr) {
		this.abstr = abstr;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	public static void main(String[] args) {
		AddPushPage page=new AddPushPage();
		page.submitAllPush();
	}
}

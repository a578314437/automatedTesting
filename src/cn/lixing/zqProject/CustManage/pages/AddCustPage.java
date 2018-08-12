package cn.lixing.zqProject.CustManage.pages;

import cn.lixing.zqProject.CustManage.Element.CustManageElementObject;
import cn.lixing.zqProject.Pages.ParentPage;

public class AddCustPage {
	private CustListPage listPage;
	private CustManageElementObject elementObject;
	private ParentPage page;
	
	private String actualCustName;
	private String actualCustPhone;
	
	public AddCustPage() {
		listPage=new CustListPage();
		elementObject=listPage.getElementObject();
		page=listPage.getPage();
	}
	
	public void openAddCustPage() {
		listPage.openCustListPage();
		page.click(elementObject.getAddCustElement());
	}
	public void submitAddCust(String custName,String custPhone) {
		openAddCustPage();
		page.sendKey(elementObject.getCustNameElement(), custName);
		actualCustName=elementObject.getCustNameElement().getAttribute("value");
		page.sendKey(elementObject.getCustPhoneElement(), custPhone);
		actualCustPhone=elementObject.getCustPhoneElement().getAttribute("value");
		page.click(elementObject.getCustSaveElement());
	}
	
	public String getActualCustName() {
		return actualCustName;
	}

	public void setActualCustName(String actualCustName) {
		this.actualCustName = actualCustName;
	}

	public String getActualCustPhone() {
		return actualCustPhone;
	}

	public void setActualCustPhone(String actualCustPhone) {
		this.actualCustPhone = actualCustPhone;
	}
	
	public CustManageElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(CustManageElementObject elementObject) {
		this.elementObject = elementObject;
	}

	public static void main(String[] args) {
		AddCustPage page=new AddCustPage();
		page.submitAddCust("lixing","13526478512");
	}
}


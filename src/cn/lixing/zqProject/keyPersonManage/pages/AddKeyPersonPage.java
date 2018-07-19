package cn.lixing.zqProject.keyPersonManage.pages;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.keyPersonManage.Element.KeyPersonManageElementObject;

public class AddKeyPersonPage {
	private KeyPersonManageListPage listPage;
	private KeyPersonManageElementObject elementObject;
	private ParentPage page;
	private String actualKeyPersonName;
	private String actualKeyPhone;
	public AddKeyPersonPage() {
		listPage=new KeyPersonManageListPage();
		elementObject=listPage.getElementObject();
		page=listPage.getPage();
	}
	
	public void openAddKeyPersonPage() {
		listPage.openKeyPersonManageListPage();
	
		page.click(elementObject.getAddKeyPersonElement());
		
	}
	
	public void openEditKeyPersonPage() {
		listPage.openKeyPersonManageListPage();
		page.click(elementObject.getEditKeyPersonElement());
	}
	
	public void submitAddKeyPerson(String keyPersonName,String phone) {
		openAddKeyPersonPage();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.sendKey(elementObject.getUSER_ACCOUNTElement(), "607284572");
		page.click(elementObject.getSEARCHBTNElement());
		page.sendKey(elementObject.getKEYPERSONNAMEElement(), keyPersonName);
		actualKeyPersonName=elementObject.getKEYPERSONNAMEElement().getAttribute("value");
		page.sendKey(elementObject.getKEYPERSONPHONEElement(), phone);
		actualKeyPhone=elementObject.getKEYPERSONPHONEElement().getAttribute("value");
		page.click(elementObject.getSAVEBTNElement());

	}
	
	
	public KeyPersonManageElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(KeyPersonManageElementObject elementObject) {
		this.elementObject = elementObject;
	}
	
	public String getActualKeyPersonName() {
		return actualKeyPersonName;
	}

	public void setActualKeyPersonName(String actualKeyPersonName) {
		this.actualKeyPersonName = actualKeyPersonName;
	}

	public String getActualKeyPhone() {
		return actualKeyPhone;
	}

	public void setActualKeyPhone(String actualKeyPhone) {
		this.actualKeyPhone = actualKeyPhone;
	}

	public static void main(String[] args) {
		AddKeyPersonPage page=new AddKeyPersonPage();
		page.submitAddKeyPerson("zhangsan", "13598754110");
	}
}

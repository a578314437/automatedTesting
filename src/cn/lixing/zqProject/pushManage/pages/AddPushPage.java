package cn.lixing.zqProject.pushManage.pages;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.pushManage.Element.PushElementObject;

public class AddPushPage {
	private ParentPage page;
	private PushManageListPage listPage;
	private PushElementObject elementObject;
	public AddPushPage() {
		listPage=new PushManageListPage();
		elementObject=listPage.getElementObject();
		page=listPage.getPage();
	}
	
	public void openAddPushPage() {
		listPage.openPushManageListPage();
		page.click(elementObject.getPushBntElement());
	}
	
	public void openEditPushPage() {
		listPage.openPushManageListPage();
		page.click(elementObject.getEditPushBntElement());
	}
	public static void main(String[] args) {
		AddPushPage page=new AddPushPage();
		page.openEditPushPage();
	}
}

package cn.lixing.zqProject.pushManage.pages;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.pushManage.Element.PushElementObject;

public class PushManageListPage {
	private ParentPage page;
	private PushElementObject elementObject;
	public PushManageListPage() {
		elementObject=new PushElementObject();
		page=elementObject.getPage();
	}
	
	public void openPushManageListPage() {
		page.click(elementObject.getPushListElement());
	}

	public ParentPage getPage() {
		return page;
	}

	public void setPage(ParentPage page) {
		this.page = page;
	}

	public PushElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(PushElementObject elementObject) {
		this.elementObject = elementObject;
	}
	
}

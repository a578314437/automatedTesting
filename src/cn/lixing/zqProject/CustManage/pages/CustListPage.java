package cn.lixing.zqProject.CustManage.pages;

import cn.lixing.zqProject.CustManage.Element.CustManageElementObject;
import cn.lixing.zqProject.Pages.ParentPage;

public class CustListPage {
	private CustManageElementObject elementObject;
	private ParentPage page;
	public CustListPage() {
		elementObject=new CustManageElementObject();
		page=elementObject.getPage();
	}
	
	public void openCustListPage() {
		page.click(elementObject.getStaffListElement());
		page.click(elementObject.getCustManageListElement());
	}
	
	public static void main(String[] args) {
		CustListPage listPage=new CustListPage();
		listPage.openCustListPage();
	}

	public CustManageElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(CustManageElementObject elementObject) {
		this.elementObject = elementObject;
	}

	public ParentPage getPage() {
		return page;
	}

	public void setPage(ParentPage page) {
		this.page = page;
	}
}

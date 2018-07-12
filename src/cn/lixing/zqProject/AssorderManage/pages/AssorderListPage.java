package cn.lixing.zqProject.AssorderManage.pages;

import cn.lixing.zqProject.AssorderManage.Element.AssorderElementObject;
import cn.lixing.zqProject.Pages.ParentPage;

public class AssorderListPage {
	private ParentPage page;
	private AssorderElementObject elementObject;
	
	public AssorderListPage() {
		elementObject=new AssorderElementObject();
		page=elementObject.getPage();
	}
	
	public void openAssorderListPage() {
		page.click(elementObject.getAssorderListElement());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.click(elementObject.getLabelManageBtnElement());
	}

	public AssorderElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(AssorderElementObject elementObject) {
		this.elementObject = elementObject;
	}
	
}

package cn.lixing.zqProject.AssorderManage.pages;

import cn.lixing.zqProject.AssorderManage.Element.AssorderElementObject;
import cn.lixing.zqProject.Pages.ParentPage;

public class AddAssorderPage {
	private AssorderListPage listPage;
	private AssorderElementObject elementObject;
	private ParentPage page;
	private String context;
	
	public AddAssorderPage() {
		listPage=new AssorderListPage();
		elementObject=listPage.getElementObject();
		page=elementObject.getPage();
	}
	
	public void openAddAssorderPage() {
		listPage.openAssorderListPage();
		page.click(elementObject.getAddlabelBtnElement());
		
	}
	
	public void submitAddAssorder(String context) {
		openAddAssorderPage();
		page.sendKey(elementObject.getLabelContextElement(), context);
		
		page.click(elementObject.getLabelStarsSelectElement());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.click(elementObject.getStarsElement());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.click(elementObject.getCreateBtnElement());
		page.click(elementObject.getAcceptBtnElement());
	}

	public AssorderElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(AssorderElementObject elementObject) {
		this.elementObject = elementObject;
	}
	
	
	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public static void main(String[] args) {
		AddAssorderPage page=new AddAssorderPage();
		page.submitAddAssorder("444");
	}
}

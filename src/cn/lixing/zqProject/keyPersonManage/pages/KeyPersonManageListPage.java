package cn.lixing.zqProject.keyPersonManage.pages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.keyPersonManage.Element.KeyPersonManageElementObject;

public class KeyPersonManageListPage {
	private KeyPersonManageElementObject elementObject;
	private ApplicationContext context;
	private ParentPage page;
	public KeyPersonManageListPage() {
		elementObject=new KeyPersonManageElementObject();
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
	}
	
	public void openKeyPersonManageListPage() {
		page.click(elementObject.getKeyPersonManageListElement());
	}

	public KeyPersonManageElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(KeyPersonManageElementObject elementObject) {
		this.elementObject = elementObject;
	}

	public ParentPage getPage() {
		return page;
	}

	public void setPage(ParentPage page) {
		this.page = page;
	}
}

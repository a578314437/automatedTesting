package cn.lixing.zqProject.login.pages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.login.Element.LoginElementObject;

public class LoginPage {
	private LoginElementObject elementObject;
	private ParentPage page;
	private ApplicationContext context;
	public LoginPage() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		elementObject=LoginElementObject.getInStanceBlock();
	}
	public void login(String username,String password) {
		page.sendKey(elementObject.getUsernameElement(), username);
		page.sendKey(elementObject.getPasswordElement(), password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.click(elementObject.getLoginBtnElement());
	}
	public LoginElementObject getElementObject() {
		return elementObject;
	}
	public void setElementObject(LoginElementObject elementObject) {
		this.elementObject = elementObject;
	}
	
}

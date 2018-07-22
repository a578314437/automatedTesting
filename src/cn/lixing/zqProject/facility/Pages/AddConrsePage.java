package cn.lixing.zqProject.facility.Pages;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.facility.Element.CourseElementObject;

public class AddConrsePage{
	private CourseListPage listPage;
	private CourseElementObject elementObject;
	private ParentPage page;
	private String TitleExpect;
	private String ContentExpect;
	private ApplicationContext context;
	
	public AddConrsePage() {
		listPage=CourseListPage.getInStanceBlock();
		elementObject=listPage.getElementObject();
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
	}
	/**
	 * 打开新增教程页面
	 */
	public void openAddConrsePage() {
		listPage.openCourseListPage();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementObject.getInsertDeviceJcBtnElement().click();
	}
	
	/**
	 * 打开编辑教程页面
	 */
	public void openEditConrsePage() {
		listPage.openCourseListPage();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementObject.getEditBtnElement().click();
	}
	
	/**
	 * 提交新增教程操作
	 * @param title
	 * @param content
	 */
	public void submitAddConrse(String title,String content) {
		//进入新增教程页面
		openAddConrsePage();
		//输入教程标题名称
		page.sendKey(elementObject.getTitleElement(), title);
		TitleExpect=elementObject.getTitleElement().getAttribute("value");
		//输入教程内容
		page.sendKey(elementObject.getContentElement(), content);
		ContentExpect=elementObject.getGetContentXpathElement().getText();
		//提交新增操作
		elementObject.getSaveBtnElement().click();
	}
	
	/**
	 * 提交编辑教程操作
	 * @param title
	 * @param content
	 */
	public void submitEditConrse(String title,String content) {
		//进入编辑页面
		openEditConrsePage();
		//编辑教程标题名称
		page.sendKey(elementObject.getTitleElement(), title);
		System.out.println(elementObject.getTitleElement().getAttribute("value"));
		//编辑教程内容
		page.sendKey(elementObject.getContentElement(), content);
		//提交编辑操作
		elementObject.getSaveBtnElement().click();
	}
	
	public String getTitleExpect() {
		return TitleExpect;
	}
	public String getContentExpect() {
		return ContentExpect;
	}
	
	public ParentPage getPage() {
		return page;
	}
	
	public CourseListPage getListPage() {
		return listPage;
	}
}

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
	 * �������̳�ҳ��
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
	 * �򿪱༭�̳�ҳ��
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
	 * �ύ�����̳̲���
	 * @param title
	 * @param content
	 */
	public void submitAddConrse(String title,String content) {
		//���������̳�ҳ��
		openAddConrsePage();
		//����̳̱�������
		page.sendKey(elementObject.getTitleElement(), title);
		TitleExpect=elementObject.getTitleElement().getAttribute("value");
		//����̳�����
		page.sendKey(elementObject.getContentElement(), content);
		ContentExpect=elementObject.getGetContentXpathElement().getText();
		//�ύ��������
		elementObject.getSaveBtnElement().click();
	}
	
	/**
	 * �ύ�༭�̳̲���
	 * @param title
	 * @param content
	 */
	public void submitEditConrse(String title,String content) {
		//����༭ҳ��
		openEditConrsePage();
		//�༭�̳̱�������
		page.sendKey(elementObject.getTitleElement(), title);
		System.out.println(elementObject.getTitleElement().getAttribute("value"));
		//�༭�̳�����
		page.sendKey(elementObject.getContentElement(), content);
		//�ύ�༭����
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

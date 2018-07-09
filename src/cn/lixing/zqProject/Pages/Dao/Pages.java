package cn.lixing.zqProject.Pages.Dao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Pages {
	/**
	 * ��ȡWebDriver����
	 * @param browseName
	 * @return
	 */
	public WebDriver startBrowse();
	/**
	 * ��ȡWebElement����
	 * @param driver
	 * @return WebElement����
	 */
	public WebElement getWebElement(String xpath);
	/**
	 * ��Ԫ�ؽ��е������
	 * @param element
	 */
	public void click(WebElement element);
	/**
	 * ��Ԫ�ؽ����������
	 * @param element
	 */
	public void sendKey(WebElement element,String context);
	/**
	 * ���Ԫ��ֵ
	 * @param element
	 */
	public void clear(WebElement element);
	
}

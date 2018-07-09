package cn.lixing.zqProject.Pages.Dao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Pages {
	/**
	 * 获取WebDriver对象
	 * @param browseName
	 * @return
	 */
	public WebDriver startBrowse();
	/**
	 * 获取WebElement对象
	 * @param driver
	 * @return WebElement对象
	 */
	public WebElement getWebElement(String xpath);
	/**
	 * 对元素进行点击操作
	 * @param element
	 */
	public void click(WebElement element);
	/**
	 * 对元素进行输入操作
	 * @param element
	 */
	public void sendKey(WebElement element,String context);
	/**
	 * 清空元素值
	 * @param element
	 */
	public void clear(WebElement element);
	
}

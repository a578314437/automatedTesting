package cn.lixing.zqProject.Uilt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementExistUilts {
	public static boolean ElementExis(WebDriver driver,String xpath) {
		try {
			driver.findElement(By.xpath(xpath));
			return true;
		} catch (Exception e) {
			System.out.println("Ԫ�ز����ڣ���");
			return false;
		}
	}
}

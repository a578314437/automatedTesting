package cn.lixing.zqProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import cn.lixing.zqProject.Pages.Dao.Pages;

import static cn.lixing.zqProject.Uilt.BrowseUilt.getBrowseDriver;

@Component("parent")
public class ParentPage implements Pages {
	private String browseName="chrome";
	private WebDriver driver;
	private WebElement element;
	private WebDriverWait wait;
	private String url="http://58.249.55.68:30063/adminUi/#/facility";
	
	
	public WebDriver startBrowse() {
		driver=getBrowseDriver(browseName);
		String localStorageData="var a={\"business\":[{\"id\":101,\"name\":\"��������\"},{\"id\":102,\"name\":\"�豸����\",\"menus\":[{\"id\":10201,\"name\":\"�豸����\"},{\"id\":10202,\"name\":\"���Ź���\"},{\"id\":10203,\"name\":\"�̳��б�\"}]},{\"id\":103,\"name\":\"ͼƬ����\"},{\"id\":104,\"name\":\"���ݱ���\",\"menus\":[{\"id\":10401,\"name\":\"�������ݷ���\"},{\"id\":10402,\"name\":\"�������ݷ���\"}]},{\"id\":105,\"name\":\"���۹���\",\"menus\":[{\"id\":10501,\"name\":\"�����б�\"},{\"id\":10502,\"name\":\"��ǩ����\"}]},{\"id\":106,\"name\":\"�˺Ų�ѯ\"},{\"id\":107,\"name\":\"�����ѯ\"},{\"id\":108,\"name\":\"������ϸ\"},{\"id\":109,\"name\":\"Ͷ�߹���\",\"menus\":[{\"id\":10901,\"name\":\"�����б�\"},{\"id\":10902,\"name\":\"Ͷ���б�\"}]},{\"id\":110,\"name\":\"���͹���\"},{\"id\":111,\"name\":\"�ؼ��˹���\"}],\"code\":[{\"id\":201,\"name\":\"���ι���\"},{\"id\":202,\"name\":\"������\"}],\"authority\":[{\"id\":301,\"name\":\"��Ա��Ϣ\"},{\"id\":302,\"name\":\"��ɫ����\"}]};"
				+ "var b={\"JSESSIONID\":\"5983201B9E23300EFFEC70BCA74054D0\",\"login\":\"success\",\"menu\":{\"authority\":{\"id\":300,\"name\":\"Ȩ�޹���\",\"menus\":[{\"id\":301,\"name\":\"��Ա��Ϣ\"},{\"id\":302,\"name\":\"��ɫ����\"}]},\"business\":{\"id\":100,\"name\":\"ҵ�����\",\"menus\":[{\"id\":101,\"name\":\"��������\"},{\"id\":102,\"name\":\"�豸����\",\"menus\":[{\"id\":10201,\"name\":\"�豸����\"},{\"id\":10202,\"name\":\"���Ź���\"},{\"id\":10203,\"name\":\"�̳��б�\"}]},{\"id\":103,\"name\":\"ͼƬ����\"},{\"id\":104,\"name\":\"���ݱ���\",\"menus\":[{\"id\":10401,\"name\":\"�������ݷ���\"},{\"id\":10402,\"name\":\"�������ݷ���\"}]},{\"id\":105,\"name\":\"���۹���\",\"menus\":[{\"id\":10501,\"name\":\"�����б�\"},{\"id\":10502,\"name\":\"��ǩ����\"}]},{\"id\":106,\"name\":\"�˺Ų�ѯ\"},{\"id\":107,\"name\":\"�����ѯ\"},{\"id\":108,\"name\":\"������ϸ\"},{\"id\":109,\"name\":\"Ͷ�߹���\",\"menus\":[{\"id\":10901,\"name\":\"�����б�\"},{\"id\":10902,\"name\":\"Ͷ���б�\"}]},{\"id\":110,\"name\":\"���͹���\"},{\"id\":111,\"name\":\"�ؼ��˹���\"}]},\"code\":{\"id\":200,\"name\":\"�����\",\"menus\":[{\"id\":201,\"name\":\"���ι���\"},{\"id\":202,\"name\":\"������\"}]}},\"totalModule\":[{\"createTime\":1517380837000,\"moduleDesc\":\"10\",\"moduleId\":101,\"moduleName\":\"��������\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1517380837000,\"moduleDesc\":\"30\",\"moduleId\":103,\"moduleName\":\"ͼƬ����\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528947078000,\"moduleDesc\":\"50\",\"moduleId\":105,\"moduleName\":\"���۹���\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528955954000,\"moduleDesc\":\"60\",\"moduleId\":106,\"moduleName\":\"�˺Ų�ѯ\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1522721836000,\"moduleDesc\":\"70\",\"moduleId\":107,\"moduleName\":\"�����ѯ\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1522721836000,\"moduleDesc\":\"80\",\"moduleId\":108,\"moduleName\":\"������ϸ\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528947078000,\"moduleDesc\":\"90\",\"moduleId\":109,\"moduleName\":\"Ͷ�߹���\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528947078000,\"moduleDesc\":\"100\",\"moduleId\":110,\"moduleName\":\"���͹���\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1530759856000,\"moduleDesc\":\"100\",\"moduleId\":111,\"moduleName\":\"�ؼ��˹���\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1517380837000,\"moduleDesc\":\"10\",\"moduleId\":201,\"moduleName\":\"���ι���\",\"status\":\"1\",\"upModuleId\":200},{\"createTime\":1517380837000,\"moduleDesc\":\"20\",\"moduleId\":202,\"moduleName\":\"������\",\"status\":\"1\",\"upModuleId\":200},{\"createTime\":1517380837000,\"moduleDesc\":\"10\",\"moduleId\":301,\"moduleName\":\"��Ա��Ϣ\",\"status\":\"1\",\"upModuleId\":300},{\"createTime\":1517380837000,\"moduleDesc\":\"20\",\"moduleId\":302,\"moduleName\":\"��ɫ����\",\"status\":\"1\",\"upModuleId\":300},{\"createTime\":1517380837000,\"moduleDesc\":\"30\",\"moduleId\":303,\"moduleName\":\"�޸�����\",\"status\":\"1\",\"upModuleId\":300},{\"createTime\":1530061281000,\"moduleDesc\":\"20\",\"moduleId\":10201,\"moduleName\":\"�豸����\",\"status\":\"1\",\"upModuleId\":102},{\"createTime\":1530061281000,\"moduleDesc\":\"30\",\"moduleId\":10202,\"moduleName\":\"���Ź���\",\"status\":\"1\",\"upModuleId\":102},{\"createTime\":1530061281000,\"moduleDesc\":\"40\",\"moduleId\":10203,\"moduleName\":\"�̳��б�\",\"status\":\"1\",\"upModuleId\":102},{\"createTime\":1522721836000,\"moduleDesc\":\"20\",\"moduleId\":10401,\"moduleName\":\"�������ݷ���\",\"status\":\"1\",\"upModuleId\":104},{\"createTime\":1522721836000,\"moduleDesc\":\"30\",\"moduleId\":10402,\"moduleName\":\"�������ݷ���\",\"status\":\"1\",\"upModuleId\":104},{\"createTime\":1528947078000,\"moduleDesc\":\"50\",\"moduleId\":10501,\"moduleName\":\"�����б�\",\"status\":\"1\",\"upModuleId\":105},{\"createTime\":1528947078000,\"moduleDesc\":\"60\",\"moduleId\":10502,\"moduleName\":\"��ǩ����\",\"status\":\"1\",\"upModuleId\":105},{\"createTime\":1530759856000,\"moduleDesc\":\"100\",\"moduleId\":10901,\"moduleName\":\"�����б�\",\"status\":\"1\",\"upModuleId\":109},{\"createTime\":1530759856000,\"moduleDesc\":\"100\",\"moduleId\":10902,\"moduleName\":\"Ͷ���б�\",\"status\":\"1\",\"upModuleId\":109}],\"userInfo\":{\"areaCode\":\"1000,1001,1002,1004,1005,1006,1007,1008,1009,1010,1011,1012,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023,1024,1025,1026,1027,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041\",\"createTime\":1517381133000,\"lastLoginTime\":1531097837000,\"roleId\":1,\"status\":1,\"updateTime\":1528678405000,\"userAccount\":\"admin\",\"userId\":1,\"userName\":\"admin\"}};"
				+ "localStorage.setItem(\"jurisdiction\",JSON.stringify(a));localStorage.setItem(\"userInfo\", JSON.stringify(b));localStorage.setItem(\"loginTime\", 1530176501000);localStorage.setItem(\"urgeTime\", 18930176501527);localStorage.setItem(\"userNames\", \"admin\");localStorage.setItem(\"pages\", \"workOrderService\");";
		driver.get(url);
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		js.executeScript(localStorageData);
		driver.get(url);
		js.executeScript("location.reload()");
		driver.manage().window().maximize();
		return driver;
	}
	
	public void ElementWaitTime(String xpathExpression) {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathExpression)));
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String getBrowseName() {
		return browseName;
	}
	public void setBrowseName(String browseName) {
		this.browseName = browseName;
	}
	@Override
	public WebElement getWebElement(String xpath) {
		ElementWaitTime(xpath);
		element=driver.findElement(By.xpath(xpath));
		return element;
	}

	@Override
	public void click(WebElement element) {
		element.click();
	}

	@Override
	public void sendKey(WebElement element, String context) {
		element.sendKeys(context);
	}

	@Override
	public void clear(WebElement element) {
		element.clear();
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}

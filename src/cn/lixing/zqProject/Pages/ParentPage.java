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
		String localStorageData="var a={\"business\":[{\"id\":101,\"name\":\"工单管理\"},{\"id\":102,\"name\":\"设备管理\",\"menus\":[{\"id\":10201,\"name\":\"设备管理\"},{\"id\":10202,\"name\":\"串号管理\"},{\"id\":10203,\"name\":\"教程列表\"}]},{\"id\":103,\"name\":\"图片管理\"},{\"id\":104,\"name\":\"数据报表\",\"menus\":[{\"id\":10401,\"name\":\"排障数据分析\"},{\"id\":10402,\"name\":\"流量数据分析\"}]},{\"id\":105,\"name\":\"评价管理\",\"menus\":[{\"id\":10501,\"name\":\"评价列表\"},{\"id\":10502,\"name\":\"标签管理\"}]},{\"id\":106,\"name\":\"账号查询\"},{\"id\":107,\"name\":\"绑码查询\"},{\"id\":108,\"name\":\"排障明细\"},{\"id\":109,\"name\":\"投诉管理\",\"menus\":[{\"id\":10901,\"name\":\"需求列表\"},{\"id\":10902,\"name\":\"投诉列表\"}]},{\"id\":110,\"name\":\"推送管理\"},{\"id\":111,\"name\":\"关键人管理\"}],\"code\":[{\"id\":201,\"name\":\"批次管理\"},{\"id\":202,\"name\":\"码任务\"}],\"authority\":[{\"id\":301,\"name\":\"人员信息\"},{\"id\":302,\"name\":\"角色管理\"}]};"
				+ "var b={\"JSESSIONID\":\"5983201B9E23300EFFEC70BCA74054D0\",\"login\":\"success\",\"menu\":{\"authority\":{\"id\":300,\"name\":\"权限管理\",\"menus\":[{\"id\":301,\"name\":\"人员信息\"},{\"id\":302,\"name\":\"角色管理\"}]},\"business\":{\"id\":100,\"name\":\"业务管理\",\"menus\":[{\"id\":101,\"name\":\"工单管理\"},{\"id\":102,\"name\":\"设备管理\",\"menus\":[{\"id\":10201,\"name\":\"设备管理\"},{\"id\":10202,\"name\":\"串号管理\"},{\"id\":10203,\"name\":\"教程列表\"}]},{\"id\":103,\"name\":\"图片管理\"},{\"id\":104,\"name\":\"数据报表\",\"menus\":[{\"id\":10401,\"name\":\"排障数据分析\"},{\"id\":10402,\"name\":\"流量数据分析\"}]},{\"id\":105,\"name\":\"评价管理\",\"menus\":[{\"id\":10501,\"name\":\"评价列表\"},{\"id\":10502,\"name\":\"标签管理\"}]},{\"id\":106,\"name\":\"账号查询\"},{\"id\":107,\"name\":\"绑码查询\"},{\"id\":108,\"name\":\"排障明细\"},{\"id\":109,\"name\":\"投诉管理\",\"menus\":[{\"id\":10901,\"name\":\"需求列表\"},{\"id\":10902,\"name\":\"投诉列表\"}]},{\"id\":110,\"name\":\"推送管理\"},{\"id\":111,\"name\":\"关键人管理\"}]},\"code\":{\"id\":200,\"name\":\"码管理\",\"menus\":[{\"id\":201,\"name\":\"批次管理\"},{\"id\":202,\"name\":\"码任务\"}]}},\"totalModule\":[{\"createTime\":1517380837000,\"moduleDesc\":\"10\",\"moduleId\":101,\"moduleName\":\"工单管理\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1517380837000,\"moduleDesc\":\"30\",\"moduleId\":103,\"moduleName\":\"图片管理\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528947078000,\"moduleDesc\":\"50\",\"moduleId\":105,\"moduleName\":\"评价管理\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528955954000,\"moduleDesc\":\"60\",\"moduleId\":106,\"moduleName\":\"账号查询\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1522721836000,\"moduleDesc\":\"70\",\"moduleId\":107,\"moduleName\":\"绑码查询\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1522721836000,\"moduleDesc\":\"80\",\"moduleId\":108,\"moduleName\":\"排障明细\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528947078000,\"moduleDesc\":\"90\",\"moduleId\":109,\"moduleName\":\"投诉管理\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1528947078000,\"moduleDesc\":\"100\",\"moduleId\":110,\"moduleName\":\"推送管理\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1530759856000,\"moduleDesc\":\"100\",\"moduleId\":111,\"moduleName\":\"关键人管理\",\"status\":\"1\",\"upModuleId\":100},{\"createTime\":1517380837000,\"moduleDesc\":\"10\",\"moduleId\":201,\"moduleName\":\"批次管理\",\"status\":\"1\",\"upModuleId\":200},{\"createTime\":1517380837000,\"moduleDesc\":\"20\",\"moduleId\":202,\"moduleName\":\"码任务\",\"status\":\"1\",\"upModuleId\":200},{\"createTime\":1517380837000,\"moduleDesc\":\"10\",\"moduleId\":301,\"moduleName\":\"人员信息\",\"status\":\"1\",\"upModuleId\":300},{\"createTime\":1517380837000,\"moduleDesc\":\"20\",\"moduleId\":302,\"moduleName\":\"角色管理\",\"status\":\"1\",\"upModuleId\":300},{\"createTime\":1517380837000,\"moduleDesc\":\"30\",\"moduleId\":303,\"moduleName\":\"修改密码\",\"status\":\"1\",\"upModuleId\":300},{\"createTime\":1530061281000,\"moduleDesc\":\"20\",\"moduleId\":10201,\"moduleName\":\"设备管理\",\"status\":\"1\",\"upModuleId\":102},{\"createTime\":1530061281000,\"moduleDesc\":\"30\",\"moduleId\":10202,\"moduleName\":\"串号管理\",\"status\":\"1\",\"upModuleId\":102},{\"createTime\":1530061281000,\"moduleDesc\":\"40\",\"moduleId\":10203,\"moduleName\":\"教程列表\",\"status\":\"1\",\"upModuleId\":102},{\"createTime\":1522721836000,\"moduleDesc\":\"20\",\"moduleId\":10401,\"moduleName\":\"排障数据分析\",\"status\":\"1\",\"upModuleId\":104},{\"createTime\":1522721836000,\"moduleDesc\":\"30\",\"moduleId\":10402,\"moduleName\":\"流量数据分析\",\"status\":\"1\",\"upModuleId\":104},{\"createTime\":1528947078000,\"moduleDesc\":\"50\",\"moduleId\":10501,\"moduleName\":\"评价列表\",\"status\":\"1\",\"upModuleId\":105},{\"createTime\":1528947078000,\"moduleDesc\":\"60\",\"moduleId\":10502,\"moduleName\":\"标签管理\",\"status\":\"1\",\"upModuleId\":105},{\"createTime\":1530759856000,\"moduleDesc\":\"100\",\"moduleId\":10901,\"moduleName\":\"需求列表\",\"status\":\"1\",\"upModuleId\":109},{\"createTime\":1530759856000,\"moduleDesc\":\"100\",\"moduleId\":10902,\"moduleName\":\"投诉列表\",\"status\":\"1\",\"upModuleId\":109}],\"userInfo\":{\"areaCode\":\"1000,1001,1002,1004,1005,1006,1007,1008,1009,1010,1011,1012,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023,1024,1025,1026,1027,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041\",\"createTime\":1517381133000,\"lastLoginTime\":1531097837000,\"roleId\":1,\"status\":1,\"updateTime\":1528678405000,\"userAccount\":\"admin\",\"userId\":1,\"userName\":\"admin\"}};"
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

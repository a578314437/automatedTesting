package cn.lixing.zqProject.login.TestCase;

import static cn.lixing.zqProject.Uilt.CsvDataUilt.getCsvData;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.zqProject.login.Element.LoginElementObject;
import cn.lixing.zqProject.login.pages.LoginPage;

public class LoginTestCase {
	private LoginElementObject elementObject;
	private LoginPage page;
	
	@BeforeClass
	public void initTestData() {
		page=new LoginPage();
		elementObject=page.getElementObject();
	}
	@DataProvider(name="loginData")
	public Object[][] getTestData(){
		return getCsvData("D:\\zqProject\\zqProject\\TestDataFile\\loginData.csv");
	}
	
	@Test(dataProvider="loginData")
	public void LoginTestCase_01(String username,String password) {
		page.login(username, password);
	}
	
	@AfterClass
	public void close() {
		elementObject.getDriver().quit();
	}
}

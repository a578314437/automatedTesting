package cn.lixing.zqProject.keyPersonManage.TestCase;

import static cn.lixing.zqProject.Uilt.CsvDataUilt.getCsvData;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static cn.lixing.zqProject.Uilt.SelectDbUilts.*;
import cn.lixing.zqProject.keyPersonManage.Element.KeyPersonManageElementObject;
import cn.lixing.zqProject.keyPersonManage.pages.AddKeyPersonPage;

public class KeyPersonManageTestCase {
	private AddKeyPersonPage keyPersonPage;
	private KeyPersonManageElementObject elementObject;
	private List<Object>expectedValues;
	private String actualKeyPersonName;
	private String actualPhone;
	private String expectedKeyPersonName;
	private String expectedPhone;
	
	@BeforeClass
	public void initTestClass() {
		keyPersonPage=new AddKeyPersonPage();
		elementObject=keyPersonPage.getElementObject();
	}
	
	@DataProvider(name="addKeyPersonData")
	public Object[][] getTestData(){
		return getCsvData("D:\\zqProject\\zqProject\\TestDataFile\\AddKeyPersonManageData.csv");
	}
	
	@Test(dataProvider="addKeyPersonData")
	public void AddKeyPersonTestCase(String keyPersonName,String phone,String expResult) {
		keyPersonPage.submitAddKeyPerson(keyPersonName, phone);
		expectedValues=select("TB_KEY_PERSON_INFO", new String[]{"PERSON_NAME","KEY_PHONE"},"id");
		expectedKeyPersonName=(String) expectedValues.get(0);
		expectedPhone=(String) expectedValues.get(1);
		
		actualKeyPersonName=keyPersonPage.getActualKeyPersonName();
		actualPhone=keyPersonPage.getActualKeyPhone();
		
		Assert.assertEquals(actualKeyPersonName,expectedKeyPersonName);
		Assert.assertEquals(actualPhone,expectedPhone);
	}
	
	
	
	@AfterClass
	public void close() {
		elementObject.getDriver().quit();
	}
}

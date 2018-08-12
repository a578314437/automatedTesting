package cn.lixing.zqProject.CustManage.TestCase;

import static cn.lixing.zqProject.Uilt.CsvDataUilt.getCsvData;
import static cn.lixing.zqProject.Uilt.SelectDbUilts.deleteData;
import static cn.lixing.zqProject.Uilt.SelectDbUilts.select;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.zqProject.CustManage.Element.CustManageElementObject;
import cn.lixing.zqProject.CustManage.pages.AddCustPage;

public class CustManageTestCase {
	private AddCustPage addCustPage;
	private CustManageElementObject elementObject;
	private List<Object>expectedValues;
	
	private String actualCustName;
	private String actualCustPhone;
	private String expectedCustName;
	private String expectedCustPhone;
	
	@BeforeClass
	public void initTestClass() {
		addCustPage=new AddCustPage();
		elementObject=addCustPage.getElementObject();
	}
	
	@DataProvider(name="addCustData")
	public Object[][] getTestData(){
		return getCsvData("AddCustData");
	}
	
	@Test(dataProvider="addCustData")
	public void AddCustTestCase(String custName,String custPhone,String expResult) {
		addCustPage.submitAddCust(custName, custPhone);
		expectedValues=select("TB_CUST_INFO", new String[]{"CUST_NAME","CUST_PHONE"},"CREATE_TIME");
		
		expectedCustName=(String) expectedValues.get(0);
		expectedCustPhone=(String) expectedValues.get(1);
		
		actualCustName=addCustPage.getActualCustName();
		actualCustPhone=addCustPage.getActualCustPhone();
		
		Assert.assertEquals(actualCustName,expectedCustName);
		Assert.assertEquals(actualCustPhone,expectedCustPhone);
	}
	
	@AfterClass
	public void close() {
		deleteData("TB_CUST_INFO","id");
		elementObject.getDriver().quit();
	}
}

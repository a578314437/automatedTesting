package cn.lixing.zqProject.pushManage.TestCase;

import static cn.lixing.zqProject.Uilt.CsvDataUilt.getCsvData;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import cn.lixing.zqProject.pushManage.pages.AddPushPage;
import static cn.lixing.zqProject.Uilt.SelectDbUilts.*;
import cn.lixing.zqProject.pushManage.Element.PushElementObject;
public class PushTestCase {
	private AddPushPage page;
	private PushElementObject elementObject;
	private List<Object> expectedValues;
	
	private String expecteTitle;
	private String expecteAbstract;
	private String expecteContext;
	
	private String actualTitle;
	private String actualAbstract;
	private String actualContext;
	
	@BeforeClass
	public void initTestClass() {
		page=new AddPushPage();
		elementObject=page.getElementObject();
	}
	
	@DataProvider(name="pushData")
	public Object[][] getTestData(){
		return getCsvData("C:\\Users\\a6573\\git\\automatedTesting\\TestDataFile\\AddPushData.csv");
	}
	
	@Test(dataProvider="pushData")
	public void addPushTestCase(String title,String Abstract,String context,String expResult) {
		page.submitAddPush(title, Abstract, context);
		expectedValues=select("TB_ARTICLE", new String[] {"TITLE","ABSTR","dbms_lob.substr(CONTENT)"});
		expecteTitle=(String) expectedValues.get(0);
		expecteAbstract=(String) expectedValues.get(1);
		expecteContext=((String) expectedValues.get(2)).replace("<p>", "").replace("</p>", "");
		
		actualTitle=page.getTitle();
		actualAbstract=page.getAbstr();
		actualContext=page.getContext();
		
		Assert.assertEquals(actualTitle,expecteTitle);
		Assert.assertEquals(actualAbstract,expecteAbstract);
		Assert.assertEquals(actualContext,expecteContext);
	}
	
	@AfterClass
	public void close() {
		elementObject.getDriver().quit();
	}
}

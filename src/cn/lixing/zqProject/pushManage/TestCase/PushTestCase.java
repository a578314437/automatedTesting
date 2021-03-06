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
	
	private int compaynNameNum=0;
	private int actualCompaynNameNum;
	private int expecteCompaynNameNum;
	
	
	@BeforeClass
	public void initTestClass() {
		page=new AddPushPage();
		elementObject=page.getElementObject();
	}
	
	@DataProvider(name="AddpushData")
	public Object[][] getTestAddPushData(){
		return getCsvData("AddPushData");
	}
	
	@DataProvider(name="pushData")
	public Object[][]getTestPushData(){
		return getCsvData("pushData");
	}
	@Test(dataProvider="AddpushData")
	public void addPushTestCase(String title,String Abstract,String context,String expResult) {
		page.submitAddPush(title, Abstract, context);
		expectedValues=select("TB_ARTICLE", new String[] {"TITLE","ABSTR","dbms_lob.substr(CONTENT)"},"id");
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
	@Test(dataProvider="pushData")
	public void submitPushTestCase(String compaynName) {
		compaynNameNum=0;
		actualCompaynNameNum=getTableCountNum("TB_ARTICLE_COMPANY", compaynName);
		page.submitPush(compaynName);
		compaynNameNum++;
		actualCompaynNameNum=actualCompaynNameNum+compaynNameNum;
		expecteCompaynNameNum=getTableCountNum("TB_ARTICLE_COMPANY", compaynName);
		
		Assert.assertEquals(actualCompaynNameNum,expecteCompaynNameNum);
		
	}
	@Test
	public void submitAllPushTestCase() {
		actualCompaynNameNum=getTableCountNum("TB_ARTICLE_COMPANY", null);
		compaynNameNum=getTableCountNum("TB_CACHE_COMPANY_INFO", null);
		actualCompaynNameNum=actualCompaynNameNum+compaynNameNum;
		
		page.submitAllPush();
		
		expecteCompaynNameNum=getTableCountNum("TB_ARTICLE_COMPANY", null);
		
		Assert.assertEquals(actualCompaynNameNum,expecteCompaynNameNum);
	}
	@AfterClass
	public void close() {
		elementObject.getDriver().quit();
		deleteData("TB_ARTICLE","id");
		deleteData("TB_ARTICLE_COMPANY",null);
	}
}

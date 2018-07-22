package cn.lixing.zqProject.AssorderManage.TestCase;

import static cn.lixing.zqProject.Uilt.CsvDataUilt.getCsvData;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.zqProject.AssorderManage.Element.AssorderElementObject;
import cn.lixing.zqProject.AssorderManage.pages.AddAssorderPage;
import static cn.lixing.zqProject.Uilt.SelectDbUilts.*;

public class AssorderTestCase {
	private AddAssorderPage page;
	private AssorderElementObject elementObject;
	private List<Object> expectedValues;
	private String expectedContext;
	private String actualContext;
	
	@BeforeClass
	public void initTestClass() {
		page=new AddAssorderPage();
		elementObject=page.getElementObject();
	}
	
	@DataProvider(name="assorderData")
	public Object[][] getTestData(){
		return getCsvData("AddAssorderData");
	}
	
	@Test(dataProvider="assorderData")
	public void AddAssorderTestCase(String context,String expResult) {
		page.submitAddAssorder(context);
		expectedValues=select("TB_PARAM_EVALUTION_TAG", new String[] {"TYPE_DESC"},"TAG_ID");
		expectedContext=(String) expectedValues.get(0);
		
		actualContext=page.getContext();
		Assert.assertEquals(actualContext,expectedContext);
	}
	
	@AfterClass
	public void close() {
		elementObject.getDriver().quit();
	}
}

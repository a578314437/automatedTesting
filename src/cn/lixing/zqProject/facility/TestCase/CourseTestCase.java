package cn.lixing.zqProject.facility.TestCase;

import static cn.lixing.zqProject.Uilt.CsvDataUilt.getCsvData;
import static cn.lixing.zqProject.Uilt.SelectDbUilts.select;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cn.lixing.zqProject.facility.Element.CourseElementObject;
import cn.lixing.zqProject.facility.Pages.AddConrsePage;

public class CourseTestCase {
	private AddConrsePage conrsePage;
	private String actualTitle;
	private String actualContext;
	private String expectedTitle;
	private String expectedContext;
	private List<Object>expectedValues;
	private CourseElementObject elementObject;
	
	
	@BeforeClass
	public void initTestClass() {
		conrsePage=new AddConrsePage();
		elementObject=CourseElementObject.getInStanceBlock();
	}
	
	@DataProvider(name="CourseData")
	public Object[][] getTestData(){
		return getCsvData("D:\\zqProject\\zqProject\\TestDataFile\\AddCourseData.csv");
	}
	
	@Test(dataProvider="CourseData")
	public void addCourseTestCase(String title,String content,String expResult) {
		
		conrsePage.submitAddConrse(title, content);
		
		expectedValues=select("TB_DEVICE_EDU",new String[] {"TITLE","dbms_lob.substr(CONTENT)"});
		expectedTitle=(String) expectedValues.get(0);
		expectedContext=(String) ((String) expectedValues.get(1)).replace("<p>", "").replace("</p>", "");
		actualTitle=conrsePage.getTitleExpect();
		actualContext=conrsePage.getContentExpect();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		Assert.assertEquals(actualContext,expectedContext);
	}
	
	@AfterClass
	public void close() {
		elementObject.getDriver().quit();
	}
}

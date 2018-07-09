package cn.lixing.zqProject.Uilt;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.getData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowseUilt {
	
	public static WebDriver getBrowseDriver(String browseKey){
		if(browseKey.equals("ie")) {
			/**
			 * ����InternetExpDriver����
			 */
			System.setProperty("webdriver.ie.driver", getData("ieDriver","\\configFile\\browseConfig"));
			WebDriver InternetExpDriver=new InternetExplorerDriver();
			return InternetExpDriver;
		}else if(browseKey.equals("chrome")) {
			/**
			 * ����ChromeDriver����
			 */
			System.setProperty("webdriver.chrome.driver", getData("chromeDriver","\\configFile\\browseConfig"));
			WebDriver ChromeDriver=new ChromeDriver();
			return ChromeDriver;
		}else {
			/**
			 * ����FirefoxDriver����
			 */
			System.setProperty("webdriver.firefox.bin", getData("firefoxDriver","\\configFile\\browseConfig"));
			WebDriver FirefoxDriver=new FirefoxDriver();
			return FirefoxDriver;
		}
	}
}

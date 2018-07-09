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
			 * 声明InternetExpDriver对象
			 */
			System.setProperty("webdriver.ie.driver", getData("ieDriver","\\configFile\\browseConfig"));
			WebDriver InternetExpDriver=new InternetExplorerDriver();
			return InternetExpDriver;
		}else if(browseKey.equals("chrome")) {
			/**
			 * 声明ChromeDriver对象
			 */
			System.setProperty("webdriver.chrome.driver", getData("chromeDriver","\\configFile\\browseConfig"));
			WebDriver ChromeDriver=new ChromeDriver();
			return ChromeDriver;
		}else {
			/**
			 * 声明FirefoxDriver对象
			 */
			System.setProperty("webdriver.firefox.bin", getData("firefoxDriver","\\configFile\\browseConfig"));
			WebDriver FirefoxDriver=new FirefoxDriver();
			return FirefoxDriver;
		}
	}
}

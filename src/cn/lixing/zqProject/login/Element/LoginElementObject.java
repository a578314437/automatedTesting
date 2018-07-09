package cn.lixing.zqProject.login.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.zqProject.Pages.ParentPage;
import cn.lixing.zqProject.facility.Element.CourseElementObject;
@SuppressWarnings("all")
public class LoginElementObject {
	private WebDriver driver;
	private ParentPage page;
	private LoginElementXpathData xpathData;
	private WebElement usernameElement;
	private WebElement passwordElement;
	private WebElement loginBtnElement;
	private String url="http://58.249.55.68:30063/adminUi/#/login";
	private static LoginElementObject elementObject;
	
	public LoginElementObject() {
		ApplicationContext context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(ParentPage) context.getBean("parent");
		page.setUrl(url);
		driver=page.startBrowse();
		xpathData=new LoginElementXpathData();
	}
	
	public static LoginElementObject getInStanceBlock(){
        if(elementObject==null)
            synchronized (CourseElementObject.class) {
                if(elementObject==null)
                	elementObject = new LoginElementObject();
            }
        return elementObject;
    }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameElement() {
		usernameElement=page.getWebElement(xpathData.getUsername());
		return usernameElement;
	}

	public void setUsernameElement(WebElement usernameElement) {
		this.usernameElement = usernameElement;
	}

	public WebElement getPasswordElement() {
		passwordElement=page.getWebElement(xpathData.getPassword());
		return passwordElement;
	}

	public void setPasswordElement(WebElement passwordElement) {
		this.passwordElement = passwordElement;
	}

	public WebElement getLoginBtnElement() {
		loginBtnElement=page.getWebElement(xpathData.getLoginBtn());
		return loginBtnElement;
	}

	public void setLoginBtnElement(WebElement loginBtnElement) {
		this.loginBtnElement = loginBtnElement;
	}
}

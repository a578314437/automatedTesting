package cn.lixing.zqProject.login.Element;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;
public class LoginElementXpathData {
	private String username;
	private String password;
	private String loginBtn;
	
	public LoginElementXpathData() {
		username=getData("username", "\\TestDataFile\\loginXpath");
		password=getData("password", "\\TestDataFile\\loginXpath");
		loginBtn=getData("loginBtn", "\\TestDataFile\\loginXpath");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(String loginBtn) {
		this.loginBtn = loginBtn;
	}
	
}

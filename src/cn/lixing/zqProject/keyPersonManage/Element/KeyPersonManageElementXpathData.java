package cn.lixing.zqProject.keyPersonManage.Element;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;
public class KeyPersonManageElementXpathData {
	private String KeyPersonManageListXpath;
	private String AddKeyPersonXpath;
	private String EditKeyPersonXpath;
	private String DelKeyPersonXpath;
	private String USER_ACCOUNTXPATH;
	private String SEARCHBTNXPATH;
	private String KEYPERSONNAMEXPATH;
	private String KEYPERSONPHONEXPATH;
	private String SAVEBTNXPATH;
	
	public KeyPersonManageElementXpathData() {
		KeyPersonManageListXpath=getData("KeyPersonManageListXpath", "\\TestDataFile\\KeyPersonManageXpath");
		AddKeyPersonXpath=getData("AddKeyPersonXpath", "\\TestDataFile\\KeyPersonManageXpath");
		EditKeyPersonXpath=getData("EditKeyPersonXpath", "\\TestDataFile\\KeyPersonManageXpath");
		DelKeyPersonXpath=getData("DelKeyPersonXpath", "\\TestDataFile\\KeyPersonManageXpath");
		USER_ACCOUNTXPATH=getData("USER_ACCOUNTXPATH", "\\TestDataFile\\KeyPersonManageXpath");
		SEARCHBTNXPATH=getData("SEARCHBTNXPATH", "\\TestDataFile\\KeyPersonManageXpath");
		KEYPERSONNAMEXPATH=getData("KEYPERSONNAMEXPATH", "\\TestDataFile\\KeyPersonManageXpath");
		KEYPERSONPHONEXPATH=getData("KEYPERSONPHONEXPATH", "\\TestDataFile\\KeyPersonManageXpath");
		SAVEBTNXPATH=getData("SAVEBTNXPATH",  "\\TestDataFile\\KeyPersonManageXpath");
	}

	public String getKeyPersonManageListXpath() {
		return KeyPersonManageListXpath;
	}

	public void setKeyPersonManageListXpath(String keyPersonManageListXpath) {
		KeyPersonManageListXpath = keyPersonManageListXpath;
	}

	public String getAddKeyPersonXpath() {
		return AddKeyPersonXpath;
	}

	public void setAddKeyPersonXpath(String addKeyPersonXpath) {
		AddKeyPersonXpath = addKeyPersonXpath;
	}

	public String getEditKeyPersonXpath() {
		return EditKeyPersonXpath;
	}

	public void setEditKeyPersonXpath(String editKeyPersonXpath) {
		EditKeyPersonXpath = editKeyPersonXpath;
	}

	public String getDelKeyPersonXpath() {
		return DelKeyPersonXpath;
	}

	public String getUSER_ACCOUNTXPATH() {
		System.out.println(USER_ACCOUNTXPATH);
		return USER_ACCOUNTXPATH;
	}

	public void setUSER_ACCOUNTXPATH(String uSER_ACCOUNTXPATH) {
		USER_ACCOUNTXPATH = uSER_ACCOUNTXPATH;
	}

	public String getSEARCHBTNXPATH() {
		return SEARCHBTNXPATH;
	}

	public void setSEARCHBTNXPATH(String sEARCHBTNXPATH) {
		SEARCHBTNXPATH = sEARCHBTNXPATH;
	}

	public String getKEYPERSONNAMEXPATH() {
		return KEYPERSONNAMEXPATH;
	}

	public void setKEYPERSONNAMEXPATH(String kEYPERSONNAMEXPATH) {
		KEYPERSONNAMEXPATH = kEYPERSONNAMEXPATH;
	}

	public String getKEYPERSONPHONEXPATH() {
		return KEYPERSONPHONEXPATH;
	}

	public void setKEYPERSONPHONEXPATH(String kEYPERSONPHONEXPATH) {
		KEYPERSONPHONEXPATH = kEYPERSONPHONEXPATH;
	}

	public String getSAVEBTNXPATH() {
		return SAVEBTNXPATH;
	}

	public void setSAVEBTNXPATH(String sAVEBTNXPATH) {
		SAVEBTNXPATH = sAVEBTNXPATH;
	}

	public void setDelKeyPersonXpath(String delKeyPersonXpath) {
		DelKeyPersonXpath = delKeyPersonXpath;
	}
	
}

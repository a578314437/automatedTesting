package cn.lixing.zqProject.keyPersonManage.Element;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;
public class KeyPersonManageElementXpathData {
	private String KeyPersonManageListXpath;
	private String AddKeyPersonXpath;
	private String EditKeyPersonXpath;
	private String DelKeyPersonXpath;
	private String ShowCustomerNameXpath;
	private String SelectCustomerNameXpath;
	private String KeyPersonNameXpath;
	private String ContactWayXpath;
	private String SaveBtnXpath;
	
	public KeyPersonManageElementXpathData() {
		KeyPersonManageListXpath=getData("KeyPersonManageListXpath", "\\TestDataFile\\KeyPersonManageXpath");
		AddKeyPersonXpath=getData("AddKeyPersonXpath", "\\TestDataFile\\KeyPersonManageXpath");
		EditKeyPersonXpath=getData("EditKeyPersonXpath", "\\TestDataFile\\KeyPersonManageXpath");
		DelKeyPersonXpath=getData("DelKeyPersonXpath", "\\TestDataFile\\KeyPersonManageXpath");
		SelectCustomerNameXpath=getData("SelectCustomerNameXpath", "\\TestDataFile\\KeyPersonManageXpath");
		KeyPersonNameXpath=getData("KeyPersonNameXpath", "\\TestDataFile\\KeyPersonManageXpath");
		ContactWayXpath=getData("ContactWayXpath", "\\TestDataFile\\KeyPersonManageXpath");
		SaveBtnXpath=getData("SaveBtnXpath", "\\TestDataFile\\KeyPersonManageXpath");
		ShowCustomerNameXpath=getData("ShowCustomerNameXpath",  "\\TestDataFile\\KeyPersonManageXpath");
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

	public void setDelKeyPersonXpath(String delKeyPersonXpath) {
		DelKeyPersonXpath = delKeyPersonXpath;
	}

	public String getShowCustomerNameXpath() {
		return ShowCustomerNameXpath;
	}

	public void setShowCustomerNameXpath(String showCustomerNameXpath) {
		ShowCustomerNameXpath = showCustomerNameXpath;
	}

	public String getSelectCustomerNameXpath() {
		return SelectCustomerNameXpath;
	}

	public void setSelectCustomerNameXpath(String selectCustomerNameXpath) {
		SelectCustomerNameXpath = selectCustomerNameXpath;
	}

	public String getKeyPersonNameXpath() {
		return KeyPersonNameXpath;
	}

	public void setKeyPersonNameXpath(String keyPersonNameXpath) {
		KeyPersonNameXpath = keyPersonNameXpath;
	}

	public String getContactWayXpath() {
		return ContactWayXpath;
	}

	public void setContactWayXpath(String contactWayXpath) {
		ContactWayXpath = contactWayXpath;
	}

	public String getSaveBtnXpath() {
		return SaveBtnXpath;
	}

	public void setSaveBtnXpath(String saveBtnXpath) {
		SaveBtnXpath = saveBtnXpath;
	}
	
	
}

package cn.lixing.zqProject.CustManage.Element;
import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;
public class CustManageElementXpathData {
	private String staffListXpath;
	private String custManageListXpath;
	private String addCustXpath;
	private String custNameXpath;
	private String custPhoneXpath;
	private String custSaveXpath;
	
	public CustManageElementXpathData() {
		staffListXpath=getData("staffListXpath", "\\TestDataFile\\custXpath");
		custManageListXpath=getData("custManageListXpath", "\\TestDataFile\\custXpath");
		addCustXpath=getData("addCustXpath", "\\TestDataFile\\custXpath");
		custNameXpath=getData("custNameXpath", "\\TestDataFile\\custXpath");
		custPhoneXpath=getData("custPhoneXpath", "\\TestDataFile\\custXpath");
		custSaveXpath=getData("custSaveXpath", "\\TestDataFile\\custXpath");
	}

	public String getStaffListXpath() {
		return staffListXpath;
	}

	public void setStaffListXpath(String staffListXpath) {
		this.staffListXpath = staffListXpath;
	}

	public String getCustManageListXpath() {
		return custManageListXpath;
	}

	public void setCustManageListXpath(String custManageListXpath) {
		this.custManageListXpath = custManageListXpath;
	}

	public String getAddCustXpath() {
		return addCustXpath;
	}

	public void setAddCustXpath(String addCustXpath) {
		this.addCustXpath = addCustXpath;
	}

	public String getCustNameXpath() {
		return custNameXpath;
	}

	public void setCustNameXpath(String custNameXpath) {
		this.custNameXpath = custNameXpath;
	}

	public String getCustPhoneXpath() {
		return custPhoneXpath;
	}

	public void setCustPhoneXpath(String custPhoneXpath) {
		this.custPhoneXpath = custPhoneXpath;
	}

	public String getCustSaveXpath() {
		return custSaveXpath;
	}

	public void setCustSaveXpath(String custSaveXpath) {
		this.custSaveXpath = custSaveXpath;
	}
}

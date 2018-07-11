package cn.lixing.zqProject.facility.Element;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.getData;

public class CourseElementXpathData {
	private String devicesListXpath;
	private String jcListXpath;
	private String insertDeviceJcBtnXpath;
	private String titleXpath;
	private String contentXpath;
	private String saveBtnXpath;
	private String editBtnXpath;
	private String getContentXpath;
	
	public CourseElementXpathData() {
		devicesListXpath=getData("devicesListXpath", "\\TestDataFile\\courseXpath");
		jcListXpath=getData("jcListXpath", "\\TestDataFile\\courseXpath");
		insertDeviceJcBtnXpath=getData("insertDeviceJcBtn", "\\TestDataFile\\courseXpath");
		titleXpath=getData("titleXpath", "\\TestDataFile\\courseXpath");
		contentXpath=getData("contentXpath", "\\TestDataFile\\courseXpath");
		saveBtnXpath=getData("saveBtn", "\\TestDataFile\\courseXpath");
		editBtnXpath=getData("editBtn", "\\TestDataFile\\courseXpath");
		getContentXpath=getData("getContentXpath", "\\TestDataFile\\courseXpath");
	}

	public String getEditBtnXpath() {
		return editBtnXpath;
	}

	public void setEditBtnXpath(String editBtnXpath) {
		this.editBtnXpath = editBtnXpath;
	}

	public String getDevicesListXpath() {
		return devicesListXpath;
	}

	public void setDevicesListXpath(String devicesListXpath) {
		this.devicesListXpath = devicesListXpath;
	}

	public String getJcListXpath() {
		return jcListXpath;
	}

	public void setJcListXpath(String jcListXpath) {
		this.jcListXpath = jcListXpath;
	}

	public String getInsertDeviceJcBtnXpath() {
		return insertDeviceJcBtnXpath;
	}

	public void setInsertDeviceJcBtnXpath(String insertDeviceJcBtnXpath) {
		this.insertDeviceJcBtnXpath = insertDeviceJcBtnXpath;
	}

	public String getTitleXpath() {
		return titleXpath;
	}

	public void setTitleXpath(String titleXpath) {
		this.titleXpath = titleXpath;
	}

	public String getContentXpath() {
		return contentXpath;
	}

	public void setContentXpath(String contentXpath) {
		this.contentXpath = contentXpath;
	}

	public String getSaveBtnXpath() {
		return saveBtnXpath;
	}

	public void setSaveBtnXpath(String saveBtnXpath) {
		this.saveBtnXpath = saveBtnXpath;
	}

	public String getGetContentXpath() {
		return getContentXpath;
	}

	public void setGetContentXpath(String getContentXpath) {
		this.getContentXpath = getContentXpath;
	}
	
}

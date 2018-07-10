package cn.lixing.zqProject.pushManage.Element;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;

public class PushElementXpathData {
	private String pushListXpath;
	private String AddPushBnt;
	private String titleXpath;
	private String abstrXpath;
	private String srcXPath;
	private String contextXpath;
	private String saveBtn;
	private String EditPushBnt;
	
	public PushElementXpathData() {
		pushListXpath=getData("pushListXpath", "\\TestDataFile\\pushXpath");
		AddPushBnt=getData("AddPushBnt", "\\TestDataFile\\pushXpath");
		titleXpath=getData("titleXpath", "\\TestDataFile\\pushXpath");
		abstrXpath=getData("abstrXpath", "\\TestDataFile\\pushXpath");
		srcXPath=getData("srcXPath", "\\TestDataFile\\pushXpath");
		contextXpath=getData("contextXpath", "\\TestDataFile\\pushXpath");
		saveBtn=getData("saveBtn", "\\TestDataFile\\pushXpath");
		EditPushBnt=getData("EditPushBnt", "\\TestDataFile\\pushXpath");
	}

	public String getPushListXpath() {
		return pushListXpath;
	}

	public void setPushListXpath(String pushListXpath) {
		this.pushListXpath = pushListXpath;
	}

	public String getTitleXpath() {
		return titleXpath;
	}

	public void setTitleXpath(String titleXpath) {
		this.titleXpath = titleXpath;
	}

	public String getAbstrXpath() {
		return abstrXpath;
	}

	public void setAbstrXpath(String abstrXpath) {
		this.abstrXpath = abstrXpath;
	}

	public String getSrcXPath() {
		return srcXPath;
	}

	public void setSrcXPath(String srcXPath) {
		this.srcXPath = srcXPath;
	}

	public String getContextXpath() {
		return contextXpath;
	}

	public void setContextXpath(String contextXpath) {
		this.contextXpath = contextXpath;
	}

	public String getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(String saveBtn) {
		this.saveBtn = saveBtn;
	}

	public String getAddPushBnt() {
		return AddPushBnt;
	}

	public void setAddPushBnt(String addPushBnt) {
		AddPushBnt = addPushBnt;
	}

	public String getEditPushBnt() {
		System.out.println(EditPushBnt);
		return EditPushBnt;
	}

	public void setEditPushBnt(String editPushBnt) {
		EditPushBnt = editPushBnt;
	}
}

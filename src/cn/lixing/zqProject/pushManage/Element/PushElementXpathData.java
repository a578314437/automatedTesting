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
	private String EditPushBtn;
	private String getContextXpth;
	
	private String PUSHBTNXPATH;
	private String COMPANYNAME;
	private String SEARCHBTN;
	private String PUSHALLBTN;
	private String SELECTCOMPANY;
	private String CONFIRMBTN;
	private String CONFIRMPUSHBTN;
	private String PUSHBTN;
	
	public PushElementXpathData() {
		pushListXpath=getData("pushListXpath", "\\TestDataFile\\pushXpath");
		AddPushBnt=getData("AddPushBnt", "\\TestDataFile\\pushXpath");
		titleXpath=getData("titleXpath", "\\TestDataFile\\pushXpath");
		abstrXpath=getData("abstrXpath", "\\TestDataFile\\pushXpath");
		srcXPath=getData("srcXPath", "\\TestDataFile\\pushXpath");
		contextXpath=getData("contextXpath", "\\TestDataFile\\pushXpath");
		saveBtn=getData("saveBtn", "\\TestDataFile\\pushXpath");
		EditPushBtn=getData("EditPushBtn", "\\TestDataFile\\pushXpath");
		getContextXpth=getData("getContextXpth", "\\TestDataFile\\pushXpath");
		
		PUSHBTNXPATH=getData("PUSHBTNXPATH", "\\TestDataFile\\pushXpath");
		COMPANYNAME=getData("COMPANYNAME", "\\TestDataFile\\pushXpath");
		SEARCHBTN=getData("SEARCHBTN", "\\TestDataFile\\pushXpath");
		PUSHALLBTN=getData("PUSHALLBTN", "\\TestDataFile\\pushXpath");
		SELECTCOMPANY=getData("SELECTCOMPANY", "\\TestDataFile\\pushXpath");
		CONFIRMBTN=getData("CONFIRMBTN", "\\TestDataFile\\pushXpath");
		PUSHBTN=getData("PUSHBTN", "\\TestDataFile\\pushXpath");
		CONFIRMPUSHBTN=getData("CONFIRMPUSHBTN", "\\TestDataFile\\pushXpath");
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
		return EditPushBtn;
	}

	public void setEditPushBnt(String editPushBnt) {
		EditPushBtn = editPushBnt;
	}

	public String getEditPushBtn() {
		return EditPushBtn;
	}

	public void setEditPushBtn(String editPushBtn) {
		EditPushBtn = editPushBtn;
	}

	public String getGetContextXpth() {
		return getContextXpth;
	}

	public void setGetContextXpth(String getContextXpth) {
		this.getContextXpth = getContextXpth;
	}

	public String getPUSHBTNXPATH() {
		return PUSHBTNXPATH;
	}

	public void setPUSHBTNXPATH(String pUSHBTNXPATH) {
		PUSHBTNXPATH = pUSHBTNXPATH;
	}

	public String getCOMPANYNAME() {
		return COMPANYNAME;
	}

	public void setCOMPANYNAME(String cOMPANYNAME) {
		COMPANYNAME = cOMPANYNAME;
	}

	public String getSEARCHBTN() {
		return SEARCHBTN;
	}

	public void setSEARCHBTN(String sEARCHBTN) {
		SEARCHBTN = sEARCHBTN;
	}

	public String getPUSHALLBTN() {
		return PUSHALLBTN;
	}

	public void setPUSHALLBTN(String pUSHALLBTN) {
		PUSHALLBTN = pUSHALLBTN;
	}

	public String getSELECTCOMPANY() {
		return SELECTCOMPANY;
	}

	public void setSELECTCOMPANY(String sELECTCOMPANY) {
		SELECTCOMPANY = sELECTCOMPANY;
	}

	public String getCONFIRMBTN() {
		return CONFIRMBTN;
	}

	public void setCONFIRMBTN(String cONFIRMBTN) {
		CONFIRMBTN = cONFIRMBTN;
	}

	public String getCONFIRMPUSHBTN() {
		return CONFIRMPUSHBTN;
	}

	public void setCONFIRMPUSHBTN(String cONFIRMPUSHBTN) {
		CONFIRMPUSHBTN = cONFIRMPUSHBTN;
	}

	public String getPUSHBTN() {
		return PUSHBTN;
	}

	public void setPUSHBTN(String pUSHBTN) {
		PUSHBTN = pUSHBTN;
	}
	
}

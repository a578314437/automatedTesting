package cn.lixing.zqProject.AssorderManage.Element;
import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;
public class AssorderElementXPathData {
	private String assorderListXpath;
	private String labelManageBtnXpath;
	private String AddlabelBtnXpath;
	private String labelContextXpath;
	private String labelStarsSelectXpath;
	private String StarsXpath;
	private String createBtnXpath;
	private String acceptBtnXpath;
	
	public AssorderElementXPathData() {
		assorderListXpath=getData("assorderListXpath", "\\TestDataFile\\assorderXpath");
		labelManageBtnXpath=getData("labelManageBtnXpath", "\\TestDataFile\\assorderXpath");
		AddlabelBtnXpath=getData("AddlabelBtnXpath", "\\TestDataFile\\assorderXpath");
		labelContextXpath=getData("labelContextXpath", "\\TestDataFile\\assorderXpath");
		labelStarsSelectXpath=getData("labelStarsSelectXpath", "\\TestDataFile\\assorderXpath");
		StarsXpath=getData("StarsXpath", "\\TestDataFile\\assorderXpath");
		createBtnXpath=getData("createBtnXpath", "\\TestDataFile\\assorderXpath");
		acceptBtnXpath=getData("acceptBtnXpath", "\\TestDataFile\\assorderXpath");
	}

	public String getAssorderListXpath() {
		return assorderListXpath;
	}

	public void setAssorderListXpath(String assorderListXpath) {
		this.assorderListXpath = assorderListXpath;
	}

	public String getLabelManageBtnXpath() {
		return labelManageBtnXpath;
	}

	public void setLabelManageBtnXpath(String labelManageBtnXpath) {
		this.labelManageBtnXpath = labelManageBtnXpath;
	}

	public String getAddlabelBtnXpath() {
		return AddlabelBtnXpath;
	}

	public void setAddlabelBtnXpath(String addlabelBtnXpath) {
		AddlabelBtnXpath = addlabelBtnXpath;
	}

	public String getLabelContextXpath() {
		return labelContextXpath;
	}

	public void setLabelContextXpath(String labelContextXpath) {
		this.labelContextXpath = labelContextXpath;
	}

	public String getLabelStarsSelectXpath() {
		return labelStarsSelectXpath;
	}

	public void setLabelStarsSelectXpath(String labelStarsSelectXpath) {
		this.labelStarsSelectXpath = labelStarsSelectXpath;
	}

	public String getStarsXpath() {
		return StarsXpath;
	}

	public void setStarsXpath(String starsXpath) {
		StarsXpath = starsXpath;
	}

	public String getCreateBtnXpath() {
		return createBtnXpath;
	}

	public void setCreateBtnXpath(String createBtnXpath) {
		this.createBtnXpath = createBtnXpath;
	}

	public String getAcceptBtnXpath() {
		return acceptBtnXpath;
	}

	public void setAcceptBtnXpath(String acceptBtnXpath) {
		this.acceptBtnXpath = acceptBtnXpath;
	}
	
	
}

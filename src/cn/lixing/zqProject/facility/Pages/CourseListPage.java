package cn.lixing.zqProject.facility.Pages;


import cn.lixing.zqProject.facility.Element.CourseElementObject;

public class CourseListPage {
	private static CourseElementObject elementObject;
	private static CourseListPage listPage=null;
	
	
	private CourseListPage() {
		elementObject=CourseElementObject.getInStanceBlock();
	}
	
    public static CourseListPage getInStanceBlock(){
        if(listPage==null)
            synchronized (CourseListPage.class) {
                if(listPage==null)
                	listPage = new CourseListPage();
            }
        return listPage;
    }
	public void openCourseListPage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementObject.getDevicesListElement().click();
		elementObject.getJcListElement().click();
	}

	public CourseElementObject getElementObject() {
		return elementObject;
	}

	public void setElementObject(CourseElementObject elementObject) {
		CourseListPage.elementObject = elementObject;
	}
}

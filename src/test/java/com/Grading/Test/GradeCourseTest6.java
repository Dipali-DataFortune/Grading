package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage6;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradeCourseTest6 extends TestBaseGrade{

GradeCoursePage4 gradeCoursePage5;
	
	public GradeCourseTest6()
	{
		super();
	}
	
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void VerifyNavigateTo() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.NavigateToDashboard();
	}
	
	@Test(priority = 2)
	public void VerifyGotoCourseTab() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.GotoCourseTab();
	}
	
	@Test(priority = 3, enabled=true)
	public void VerifyActivateCourse() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.activateCourse();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyclickOnCross() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.clickOnCross();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyattributesAfterActivate() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.attributesAfterActivate();
	}
	
}

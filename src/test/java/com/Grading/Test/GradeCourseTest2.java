package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.base.TestBaseGrade;

import com.Grading.Objects.GradeCoursePage2;
import com.Grading.Objects.LoginGrade;

public class GradeCourseTest2 extends TestBaseGrade
{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigateTo() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyGotoCourseTab()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.GotoCourseTab();
	}
	@Test(priority = 3)
	public void VerifySearchforUpdations()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.SearchforUpdations();
	}
	@Test(priority = 4)
	public void VerifyClickonUpdate()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ClickonUpdate();
	}
	@Test(priority = 5)
	public void VerifyClickonCourse()   throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ClickonCourse();
	}
	@Test(priority = 6)
	public void VerifyCheckforAttibutes()   throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.CheckforAttibutes();
	}
	@Test(priority = 7)
	public void VerifyAttributes2()   throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.Attributes2();
	}
	@Test(priority = 8)
	public void VerifyEmulateCourse()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.EmulateCourse();
	}
	@Test(priority = 9)
	public void VerifyAfterEmulation() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.AfterEmulation();
	}
    //@Test(priority = 10)
	public void VerifyAssingsGrade() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.AssingsGrade();
	}
	@Test(priority = 11)
	public void VerifyProceedFurher() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ProceedFurher();
	}
	@Test(priority = 12)
	public void VerifyClickOnAleart() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ClickOnAleart();
	}
	@Test(priority = 13)
	public void VerifyClickonCourse1()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ClickonCourse();
	}
	@Test(priority = 14)
	public void VerifyEmulateCourse1() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.EmulateCourse();
	}
	@Test(priority = 15)
	public void VerifyAfterEmulation2() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.AfterEmulation2();
	}
	@Test(priority = 16)
	public void VerifyAssignScores() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.AssignScores();
	}
	@Test(priority = 17)
	public void VerifyAssignAllGrade() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.AssignAllScore();
	}
	@Test(priority = 18) 
	public void VerifyAssignAllNotes() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.EnterNotes();
	}
	@Test(priority = 19) 
	public void VerifyGoBackSelectNo() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.GoBackSelectNo();
	}
	@Test(priority = 20) 
	public void VerifyGotoBack() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.GotoBack();
	}
	@Test(priority = 21) 
	public void VerifyAgainProceedGrades()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.AgainProceedGrades();
	}
	@Test(priority = 22) 
	public void VerifyGoBackSelectYes() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.GoBackSelectYes();
	}
	@Test(priority = 23) 
	public void VerifyClicktheCourse() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ClicktheCourse();
	}
	@Test(priority = 24) 
	public void VerifyCheckConformity()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.CheckConformity();
	}
	@Test(priority = 25) 
	public void VerifyDeactivateCourse() throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.DeactivateCourse();
	}
	@Test(priority = 26) 
	public void VerifyActivateCourse()  throws InterruptedException {
		GradeCoursePage2 Gr = PageFactory.initElements(driver,GradeCoursePage2.class);
		Gr.ActivateCourse();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

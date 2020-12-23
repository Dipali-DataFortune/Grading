 package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Grading.base.TestBaseGrade;

import com.Grading.Objects.GradeCoursePage3;
import com.Grading.Objects.LoginGrade;

public class GradeCourseTest3 extends TestBaseGrade

{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigateTo() throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyGotoCourseTab()  throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.GotoCourseTab();
	}
	@Test(priority = 3)
	public void VerifySearchforUpdations()  throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.SearchforUpdations();
	} 
	@Test(priority = 4)
	public void VerifyEnterCourse()  throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.EnterCourse();
	}
	@Test(priority = 5)
	public void VerifyEmulateCourse()  throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.EmulateCourse();
	}
	@Test(priority = 6)
	public void VerifyAfterEmulation2()  throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.AfterEmulation2();
	}
	
	@Test(priority = 7)
	public void VerifyPutAllGrades() throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.PutAllGrades();
	}
	@Test(priority = 8)
	public void VerifySelectConform() throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.SelectConform();
	}
	@Test(priority = 9)
	public void VerifyYesConform() throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.clickyes();
	}
   @Test(priority = 10)
	public void VerifyGotoCourseTab2() throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.GotoCourseTab2();
	}
	
 //   @Test(priority = 11)
	public void VerifyClickEthicsLaw() throws InterruptedException {
		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
		Gr.ClickEthicsLaw();
		
	}
  //  @Test(priority = 12)
   	public void VerifyGotoCourseTab3() throws InterruptedException {
   		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
   		Gr.GotoCourseTab3();
   		
   	}
  //  @Test(priority = 13)
   	public void VerifyClickonCourse2() throws InterruptedException {
   		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
   		Gr.ClickonCourse2();
   		  
   	}
  //  @Test(priority = 14)
   	public void VerifyClickEthicsLaw2() throws InterruptedException {
   		GradeCoursePage3 Gr = PageFactory.initElements(driver,GradeCoursePage3.class);
   		Gr.ClickEthicsLaw2();
   		
   	}
  
	

}

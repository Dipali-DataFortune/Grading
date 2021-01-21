/**
 * 
 */
package com.Grading.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage4A;
import com.Grading.Objects.GradeCoursePage5;
import com.Grading.Objects.GradeCoursePage6;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest6 extends TestBaseGrade{
	
	public GradeCourseTest6()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyNavigateToDashboardAndActivateCourse() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver, GradeCoursePage6.class);
		Gr.NavigateToDashboardAndActivateCourse("Adv Legal Research", "38884");
	}
	
	@Test(priority = 2, enabled = true)
	public void verifycourseAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver, GradeCoursePage6.class);
		Gr.courseAttributesVerification();
	}
	
	@Test(priority = 3, enabled=true)
	public void VerifyclickOnEmulation() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnEmulation();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyemulationAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.emulationAttributesVerification();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyclickOnAssignGrade() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnAssignGrade();
	}
	
	@Test(priority = 6, enabled=true)
	public void VerifyassignEditAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.assignEditAttributesVerification();
	}
	
	@Test(priority = 7, enabled=true)
	public void VerifyenterRawScore() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.enterRawScore();
	}
	
	@Test(priority = 8, enabled=true)
	public void VerifyproceedAttributeVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.proceedAttributeVerification();
	}
	
	@Test(priority = 9, enabled=true)
	public void VerifyclickOnSubmitInitialGrades() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnSubmitInitialGrades();
	}
	
	@Test(priority = 10, enabled=true)
	public void VerifyclickOnAlert() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnAlert();
	}
	
	@Test(priority = 11, enabled=true)
	public void VerifyclickOnBack() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnBack();
	}
	
	@Test(priority = 12, enabled=true)
	public void VerifyAssignAllScore() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.AssignAllScore();
	}
	
	@Test(priority = 13, enabled=true)
	public void VerifyEnterNotes() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.EnterNotes();
	}
	
	@Test(priority = 14, enabled=true)
	public void VerifycheckConfirmationModal() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.checkConfirmationModal();
	}
	
	@Test(priority = 15, enabled=true)
	public void VerifyclickOnNo() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnNo();
	}
	
	@Test(priority = 16, enabled=true)
	public void VerifyclickOnConfirmationAlert() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnConfirmationAlert();
	}
	
	@Test(priority = 17, enabled=true)
	public void VerifyinstructorHomePageAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.checkApprovalStatus();
	}
	
	@Test(priority = 18, enabled=true)
	public void VerifyclickOnCancelEmulation() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnCancelEmulation();
	}
	
	@Test(priority = 19, enabled=true)
	public void VerifysearchCourse() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		GradeCoursePage6 Gr1 = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.GotoCourseTab();
		Gr1.searchCourse();
	}
	
	@Test(priority = 20, enabled=true)
	public void VerifyclickOnCourse() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.clickOnCourse();
	}

	@Test(priority = 21, enabled=true)
	public void VerifyCheckConformityPageAttributes() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.CheckConformityPageAttributes();
	}
	
	@Test(priority = 22, enabled=true)
	public void VerifyrecentNoteAttributes1() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.recentNoteAttributes();
	}
	
	@Test(priority = 23, enabled=true)
	public void VerifyclickOnCheckConformity() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnCheckConformity();
	}
	
	@Test(priority = 24, enabled=true)
	public void VerifycourseDetailAttributes() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.courseDetailAttributes();
	}
	
	@Test(priority = 25, enabled=true)
	public void VerifyclickOnApproveFinalGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnApproveFinalGrades();
	}
	
	@Test(priority = 26, enabled=true)
	public void VerifyclickOnYes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnYes();
	}
	
	@Test(priority = 27, enabled=true)
	public void VerifysearchCourseAgain() throws InterruptedException {
		GradeCoursePage6 Gr1 = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr1.searchCourse();		
	}	
	
	@Test(priority = 28, enabled=true)
	public void VerifystatusOnCourseListingPage() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.statusOnCourseListingPage();
	}
	
	@Test(priority = 29, enabled=true)
	public void VerifyCheckConformity() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		VerifyclickOnCourse();
		VerifyclickOnCheckConformity();
	}
	
	@Test(priority = 30, enabled=true)
	public void VerifycheckAttributes() throws InterruptedException {
		GradeCoursePage6 Gr1 = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr1.checkAttributes();		
		VerifyclickOnBack();
	}
	
	@Test(priority = 31, enabled=true)
	public void VerifyclickOnEmulationLink() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnEmulationLink();						
	}
	
	@Test(priority = 32, enabled=true)
	public void VerifyemulationAttributesVerificationAgain() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.emulationAttributesVerificationAgain();
	}
	
	@Test(priority = 33, enabled=true)
	public void VerifyclickOnViewGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnViewGrades();
	}
	
	@Test(priority = 34, enabled=true)
	public void VerifyviewGradesAttributes() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.viewGradesAttributes();
		VerifyclickOnCheckConformity();
	}
}

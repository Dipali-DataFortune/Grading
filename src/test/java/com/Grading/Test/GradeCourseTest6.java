/**
 * 
 */
package com.Grading.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage5;
import com.Grading.Objects.GradeCoursePage6;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest6 extends TestBaseGrade{
	
	//LoginGrade login = new LoginGrade();

	public GradeCourseTest6()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1, enabled=true)
	public void VerifyNavigateToCourse() throws InterruptedException {
		LoginGrade login = new LoginGrade();
		login.NavigateToDashboardAndActivateCourse("Immigr Policy across Branches", "38897");
	}
	
	@Test(priority = 2, enabled=true)
	public void VerifycourseAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.courseAttributesVerification();
	}
	
	@Test(priority = 3, enabled=true)
	public void VerifyclickOnEmulation() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnEmulation();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyemulationAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.emulationAttributesVerification();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyclickOnAssignGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnAssignGrade();
	}
	
	@Test(priority = 6, enabled=true)
	public void VerifyassignEditAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.assignEditAttributesVerification();
	}
	
	@Test(priority = 7, enabled=true)
	public void VerifyenterRawScore() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.enterRawScore();
	}
	
	@Test(priority = 8, enabled=true)
	public void VerifyproceedAttributeVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.proceedAttributeVerification();
	}
	
	@Test(priority = 9, enabled=true)
	public void VerifyclickOnSubmitInitialGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnSubmitInitialGrades();
	}
	
	@Test(priority = 10, enabled=true)
	public void VerifyclickOnAlert() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnAlert();
	}
	
	@Test(priority = 11, enabled=true)
	public void VerifyclickOnBack() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
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
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.checkConfirmationModal();
	}
	
	@Test(priority = 15, enabled=true)
	public void VerifyclickOnNo() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnNo();
	}
	
	@Test(priority = 16, enabled=true)
	public void VerifyclickOnConfirmationAlert() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnConfirmationAlert();
	}
	
	@Test(priority = 17, enabled=true)
	public void VerifyConfirmationAlertYes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.ConfirmationAlertYes();
	}
	
	@Test(priority = 18, enabled=true)
	public void VerifyinstructorHomePageAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.instructorHomePageAttributes();
	}
}

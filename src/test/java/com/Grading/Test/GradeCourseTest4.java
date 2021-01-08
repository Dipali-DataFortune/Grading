/**
 * 
 */
package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest4 extends TestBaseGrade {

	// GradeCoursePage4 gradeCoursePage4;

	public GradeCourseTest4() {
		super();
	}

	@Test(priority = 0, enabled = true)
	public void LoginGrade1() throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver, LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"), prop.getProperty("password"));
	}

	/*
	 * @Test(priority = 1, enabled=true) public void VerifyNavigateTo() throws
	 * InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class);
	 * Gr.NavigateToDashboard(); }
	 * 
	 * @Test(priority = 2, enabled=true) public void VerifyGotoCourseTab() throws
	 * InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class); Gr.GotoCourseTab();
	 * //Gr.clickOnCustom(); }
	 * 
	 * @Test(priority = 3, enabled=true) public void VerifyclickOnCustom() throws
	 * InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class); Gr.clickOnCustom();
	 * }
	 * 
	 * @Test(priority = 4, enabled=true) public void VerifyActivateCourse() throws
	 * InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class); Gr.activateCourse();
	 * }
	 * 
	 * @Test(priority = 4, enabled=true) public void VerifyclickOnCross() throws
	 * InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class); Gr.clickOnCross(); }
	 * 
	 * @Test(priority = 5, enabled=true) public void VerifyattributesAfterActivate()
	 * throws InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class);
	 * Gr.attributesAfterActivate(); }
	 * 
	 * @Test(priority = 6, enabled=true) public void VerifyAttributeVerification()
	 * throws InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class);
	 * Gr.attributeVerification(); }
	 * 
	 * @Test(priority = 7, enabled=true) public void VerifyClickOnCourse() throws
	 * InterruptedException { GradeCoursePage4 Gr =
	 * PageFactory.initElements(driver,GradeCoursePage4.class); Gr.clickOnCourse();
	 * }
	 */
	@Test(priority = 1, enabled = true)
	public void verifyNavigateToDashboardAndActivateCourse() throws InterruptedException {
		LoginGrade login = new LoginGrade();
		login.NavigateToDashboardAndActivateCourse("Intro to Fed Income Tax", "35238");
	}

	@Test(priority = 2, enabled = true)
	public void VerifyCourseAttributesVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.courseAttributesVerification();
	}

	@Test(priority = 3, enabled = true)
	public void VerifyClickOnEmulation() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnEmulation();
	}

	@Test(priority = 4, enabled = true)
	public void VerifyEmulationAttributesVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.emulationAttributesVerification();
	}

	@Test(priority = 5, enabled = true)
	public void VerifyClickOnAssignGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnAssignGrade();
	}

	@Test(priority = 6, enabled = true)
	public void VerifyassignEditAttributesVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.assignEditAttributesVerification();
	}

	@Test(priority = 7, enabled = true)
	public void VerifyenterRawScore() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.enterRawScore();
	}

	@Test(priority = 8, enabled = true)
	public void VerifyproceedAttributeVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.proceedAttributeVerification();
	}

	@Test(priority = 9, enabled = true)
	public void VerifyclickOnSubmitInitialGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnSubmitInitialGrades();
	}

	@Test(priority = 10, enabled = true)
	public void VerifyclickOnAlert() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnAlert();
	}

	@Test(priority = 11, enabled = true)
	public void VerifyclickOnBack() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnBack();
	}

	@Test(priority = 12, enabled = true)
	public void VerifyAssignAllScore() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.AssignAllScore();
	}

	@Test(priority = 13, enabled = true)
	public void VerifyEnterNotes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.EnterNotes();
	}

	@Test(priority = 14, enabled = true)
	public void VerifycheckConfirmationModal() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.checkConfirmationModal();
	}

	@Test(priority = 15, enabled = true)
	public void VerifyclickOnNo() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnNo();
	}

	@Test(priority = 16, enabled = false)
	public void VerifycheckCourseConformity() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.checkCourseConformity();
	}

	@Test(priority = 17, enabled = true)
	public void VerifyclickOnConfirmationAlert() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickOnConfirmationAlert();
	}

	@Test(priority = 18, enabled = true)
	public void VerifyConfirmationAlertYes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.ConfirmationAlertYes();
	}

	@Test(priority = 19, enabled = true)
	public void VerifyinstructorHomePageAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.instructorHomePageAttributes();
	}

	@Test(priority = 20, enabled = true)
	public void VerifyfinalGradeAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		// Gr.clickOnAssignGrade();
		Gr.finalGradeAttributes();
	}

	@Test(priority = 21, enabled = true)
	public void VerifyfinalGradeAttributes1() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.finalGradeAttributes1();
	}

	@Test(priority = 22, enabled = true)
	public void VerifyselectFinalGradeForFirst() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.selectFinalGradeForFirst();
	}

	@Test(priority = 23, enabled = true)
	public void VerifycheckConformityFinalGradeAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.checkConformityFinalGradeAttributes();
	}

	@Test(priority = 24, enabled = true)
	public void VerifyclickonSubmitFinalGradeAgain() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickonSubmitFinalGrade();
		Gr.clickOnBack();
		// VerifyclickonSubmitFinalGrade();
	}

	@Test(priority = 25, enabled = false)
	public void VerifyselectFinalGradeForAll() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.selectFinalGradeForAll();
	}

	@Test(priority = 26, enabled = false)
	public void VerifyCheckConformityPageAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.CheckConformityPageAttributes();
	}

	@Test(priority = 27, enabled = false)
	public void VerifysubmitFinalGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.submitFinalGrade();
	}

	@Test(priority = 28, enabled = false)
	public void VerifyselectFinalGradesHighMean() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.selectFinalGradesHighMean();
	}

	@Test(priority = 29, enabled = false)
	public void VerifyhighMeanConformityAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.highMeanConformityAttributes();
		VerifyclickonSubmitFinalGradeAgain();
	}

	@Test(priority = 30, enabled = false)
	public void VerifyselectFinalGradesLowMean() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.selectFinalGradesLowMean();
	}

	@Test(priority = 31, enabled = false)
	public void VerifylowMeanConformityAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.highMeanConformityAttributes();
		VerifyclickonSubmitFinalGradeAgain();
	}

	@Test(priority = 32, enabled = true)
	public void VerifyupdateGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.updateGrades();
	}

	@Test(priority = 33, enabled = true)
	public void VerifyconformityErrorMessages() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.conformityErrorMessages();
	}

	@Test(priority = 34, enabled = true)
	public void VerifytableHeaderAttributesAgain() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.tableHeaderAttributes();
	}

	@Test(priority = 35, enabled = true)
	public void VerifytableDataRowAttributesAgain() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.tableDataRowAttributes();
		VerifyclickonSubmitFinalGradeAgain();
	}

	// course page 5 methods:

}

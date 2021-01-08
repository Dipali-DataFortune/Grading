/**
 * 
 */
package com.Grading.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage5;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest5 extends TestBaseGrade {

	GradeCourseTest4 GCT4 = PageFactory.initElements(driver, GradeCourseTest4.class);
	// LoginGrade login = new LoginGrade();

	@Test(priority = 0, enabled = true)
	public void verifyLogin() throws InterruptedException {
		GCT4.LoginGrade1();
	}

	@Test(priority = 1, enabled = true)
	public void verifyNavigateToDashboardAndActivateCourse() throws InterruptedException {
		LoginGrade login = new LoginGrade();
		login.NavigateToDashboardAndActivateCourse("Intro to Fed Income Tax", "35238");
	}

	@Test(priority = 2, enabled = true)
	public void verifyAllMethodsOfCourseTest4Two() throws InterruptedException {
		GCT4.VerifyCourseAttributesVerification();
		GCT4.VerifyClickOnEmulation();
		GCT4.VerifyEmulationAttributesVerification();
		GCT4.VerifyClickOnAssignGrade();
	}

	@Test(priority = 3, enabled = true)
	public void verifyAllMethodsOfCourseTest4Three() throws InterruptedException {
		GCT4.VerifyassignEditAttributesVerification();
		GCT4.VerifyenterRawScore();
		GCT4.VerifyproceedAttributeVerification();
		GCT4.VerifyclickOnSubmitInitialGrades();
		GCT4.VerifyclickOnAlert();
	}

	@Test(priority = 4, enabled = true)
	public void verifyAllMethodsOfCourseTest4Four() throws InterruptedException {
		GCT4.VerifyclickOnBack();
		GCT4.VerifyAssignAllScore();
		GCT4.VerifyEnterNotes(); 
		// GCT4.VerifycheckCourseConformity();
		GCT4.VerifyclickOnConfirmationAlert();
	}

	@Test(priority = 5, enabled = true)
	public void verifyAllMethodsOfCourseTest4Five() throws InterruptedException {
		GCT4.VerifyinstructorHomePageAttributes();
		GCT4.VerifyfinalGradeAttributes();
		GCT4.VerifyfinalGradeAttributes1();
		GCT4.VerifyselectFinalGradeForFirst();
		GCT4.VerifycheckConformityFinalGradeAttributes();
	}

	@Test(priority = 6, enabled = true)
	public void verifyAllMethodsOfCourseTest4Six() throws InterruptedException {
		GCT4.VerifyclickonSubmitFinalGradeAgain();
		GCT4.VerifyupdateGrades();
		GCT4.VerifyconformityErrorMessages();
		GCT4.VerifytableHeaderAttributesAgain();
		GCT4.VerifytableDataRowAttributesAgain();
	}

	@Test(priority = 7, enabled = true)
	public void VerifyselectBAndFGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.selectBAndFGrades();
	}

	@Test(priority = 8, enabled = true)
	public void VerifyErrorMessages() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.ErrorMessages();
	}

	@Test(priority = 9, enabled = true)
	public void VerifytableHeaderAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.tableHeaderAttributes();
	}

	@Test(priority = 10, enabled = true)
	public void VerifytableDataRowAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.tableDataRowAttributes();
	}

	@Test(priority = 11, enabled = true)
	public void VerifyclickonSubmitFinalGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.clickonSubmitFinalGrade();
		Gr.clickOnBack();
	}

	@Test(priority = 12, enabled = true)
	public void VerifyselectFinalGradesWithNote() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.selectFinalGradesWithNote();
	}

	@Test(priority = 13, enabled = true)
	public void VerifyfinalModal() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.finalModal();
	}

	@Test(priority = 14, enabled = true)
	public void VerifysaveNote() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.saveNote();
	}

	@Test(priority = 15, enabled = true)
	public void VerifycheckApprovalStatus() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.checkApprovalStatus();
	}

	@Test(priority = 16, enabled = true)
	public void VerifyclickOnCancelEmulation() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		// Gr.clickOnCancelEmulation();
		Gr.cancelEmul();
	}

	@Test(priority = 17, enabled = true)
	public void verifycourseTab() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		// VerifyGotoCourseTab();
		Gr.GotoCourseTab();
	}

	@Test(priority = 18, enabled = true)
	public void verifysearchCourse() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.searchCourse();
		Gr.clickOnCourse();
	}

	@Test(priority = 19, enabled = true)
	public void verifyfinalApprovalAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.finalApprovalAttributes();
	}

	@Test(priority = 20, enabled = true)
	public void verifytableAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		VerifytableHeaderAttributes();
		VerifytableDataRowAttributes();
		Gr.tableDataRowCountAndADistribution();
	}

	@Test(priority = 21, enabled = true)
	public void verifyrecentNoteAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		GradeCoursePage4 Gr1 = PageFactory.initElements(driver, GradeCoursePage4.class);
		Gr.recentNoteAttributes();
		Gr1.clickOnBack();
	}

	@Test(priority = 22, enabled = true)
	public void verifyclickOnRejectFinalGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnRejectFinalGrades();
	}

	@Test(priority = 23, enabled = true)
	public void verifyclickOnNoButton() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnNoButton();
	}

	@Test(priority = 24, enabled = true)
	public void verifyclickOnYes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnYes();
	}

	@Test(priority = 25, enabled = true)
	public void verifysearchCourseAgain() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		// GradeCoursePage4 Gr1 = PageFactory.initElements(driver,
		// GradeCoursePage4.class);
		Gr.searchCourseAgain();
		// Gr.clickOnCourse();
		// GCT4.VerifyClickOnEmulation();
	}

	@Test(priority = 26, enabled = true)
	public void verifyclickOnCourseAgain() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		// GradeCoursePage4 Gr1 = PageFactory.initElements(driver,
		// GradeCoursePage4.class);
		// Gr.searchCourseAgain();
		Gr.clickOnCourse();

	}

	@Test(priority = 27, enabled = true)
	public void verifyfinalEmulAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		GCT4.VerifyClickOnEmulation();
		Gr.finalEmulAttributes();
	}

	@Test(priority = 28, enabled = true)
	public void verifyclickOnAssignAndCheckAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnAssignAndCheckAttributes();
	}

	@Test(priority = 29, enabled = true)
	public void verifyassignEditGradesAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.assignEditGradesAttributes();
	}

	@Test(priority = 30, enabled = true)
	public void verifychangeGrade() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.changeGrade();
	}

	@Test(priority = 31, enabled = true)
	public void verifyattributesCheck() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.attributesCheck();
	}

	@Test(priority = 32, enabled = true)
	public void verifyclickOnResubmitFinalGrade() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnResubmitFinalGrade();
		// Gr.resubmitAttributes();
	}

	@Test(priority = 33, enabled = true)
	public void verifyCancelEmulation() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		VerifysaveNote();
		// VerifyclickOnCancelEmulation();
		Gr.cancelEmul();
	}

	@Test(priority = 34, enabled = true)
	public void verifySearchCourseAndClick() throws InterruptedException {
		verifycourseTab();
		verifysearchCourse();
		verifyfinalApprovalAttributes();
	}

	@Test(priority = 35, enabled = true)
	public void verifyCheckConformityAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.checkConformityPageAttributes();
	}

	@Test(priority = 36, enabled = true)
	public void verifyAllAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		verifytableAttributes();
		Gr.recentNoteAttributes();
	}

	@Test(priority = 37, enabled = true)
	public void verifyclickOnApproveFinalGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnApproveFinalGrades();
		Gr.saveNote();
	}

	@Test(priority = 38, enabled = true)
	public void verifySearchCourse() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		verifycourseTab();
		Gr.searchCourse();
	}

	@Test(priority = 39, enabled = true)
	public void verifystatusOnCourseListingPage() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.statusOnCourseListingPage();
		Gr.clickOnCourse();
	}

	@Test(priority = 40, enabled = true)
	public void verifygradingCourseDetailAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.gradingCourseDetailAttributes();
	}

	@Test(priority = 41, enabled = true)
	public void verifyclickOnCheckConformity() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnCheckConformity();
	}

	@Test(priority = 42, enabled = true)
	public void verifycheckAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.checkAttributes();
	}

	@Test(priority = 43, enabled = true)
	public void verifybannerUploadAttribute() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.bannerUploadAttribute();
		GCT4.VerifyclickOnBack();
	}

	@Test(priority = 44, enabled = true)
	public void verifyclickOnEmulationLink() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnEmulationLink();
	}

	@Test(priority = 45, enabled = true)
	public void verifycheckEmulationAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.checkEmulationAttributes();
	}

	@Test(priority = 46, enabled = true)
	public void verifyclickOnViewGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.clickOnViewGrades();
	}

	@Test(priority = 47, enabled = true)
	public void verifyviewGradesAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.viewGradesAttributes();
		verifyclickOnCheckConformity();
	}

	@Test(priority = 48, enabled = true)
	public void verifycheckConformityAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.checkConformityAttributes();
		Gr.bannerUploadAttribute();
	}

	@Test(priority = 49, enabled = true)
	public void verifyCancelEmulationAgain() throws InterruptedException {
		// GradeCourseTest4 Gr =
		// PageFactory.initElements(driver,GradeCourseTest4.class);
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		// VerifyclickOnCancelEmulation();
		Gr.cancelEmul();
	}

	@Test(priority = 50, enabled = true)
	public void verifyCourseSearch() throws InterruptedException {
		GradeCourseTest4 Gr = PageFactory.initElements(driver, GradeCourseTest4.class);
		verifycourseTab();
		// Gr.VerifyclickOnCustom();
		verifysearchCourse();
	}

	@Test(priority = 51, enabled = true)
	public void verifyDeactivateClick() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		verifyclickOnCheckConformity();
		Gr.DeactivateClick();
	}

	@Test(priority = 52, enabled = true)
	public void verifyDeactivateAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.DeactivateAttributes();
	}

	@Test(priority = 53, enabled = true)
	public void verifyClickOnNoAndProceed() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.ClickOnNoAndProceed();
	}

	@Test(priority = 54, enabled = true)
	public void verifyClickOnYesAndProceed() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.ClickOnYesAndProceed();
	}

	@Test(priority = 55, enabled = true)
	public void verifyCheckFinalStatus() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.checkFinalStatus();
	}
}

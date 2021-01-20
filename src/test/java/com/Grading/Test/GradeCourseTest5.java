/**
 * 
 */
package com.Grading.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage4A;
import com.Grading.Objects.GradeCoursePage5;
//import com.Grading.Objects.GradeCoursePage6;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest5 extends TestBaseGrade{
	
	//LoginGrade login = new LoginGrade();

	public GradeCourseTest5()
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
		//LoginGrade login = new LoginGrade();
		GradeCoursePage5 Gr = PageFactory.initElements(driver, GradeCoursePage5.class);
		Gr.NavigateToDashboardAndActivateCourse("Immigr Policy across Branches", "38897");
	}

	@Test(priority = 2, enabled=true)
	public void VerifycourseAttributesVerification() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.courseAttributesVerification();
	}
	
	@Test(priority = 3, enabled=true)
	public void VerifyclickOnEmulation() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnEmulation();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyemulationAttributesVerification() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.emulationAttributesVerification();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyclickOnAssignGrade() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnAssignGrade();
	}
	
	@Test(priority = 6, enabled=true)
	public void VerifyassignEditAttributesVerification() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.assignEditAttributesVerification();
	}
	
	@Test(priority = 7, enabled=true)
	public void VerifyenterRawScore() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.enterRawScore();
	}
	
	@Test(priority = 8, enabled=true)
	public void VerifyproceedAttributeVerification() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
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
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.AssignAllScore();
	}
	
	@Test(priority = 13, enabled=true)
	public void VerifyEnterNotes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
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
	public void VerifyConfirmationAlertYes() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.ConfirmationAlertYes();
	}
	
	@Test(priority = 18, enabled=true)
	public void VerifyinstructorHomePageAttributes() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.instructorHomePageAttributes();
	}
	
	@Test(priority = 19, enabled=true)
	public void VerifyassignEditAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.assignEditAttributes();
	}
	
	@Test(priority = 20, enabled=true)
	public void VerifyfinalGradeAttributes1() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.finalGradeAttributes1();
	}
	
	@Test(priority = 21, enabled=true)
	public void VerifyselectFinalGradeForFirst() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.selectFinalGradeForFirst();
	}
	
	@Test(priority = 22, enabled=true)
	public void VerifycheckConformityFinalGradeAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.checkConformityFinalGradeAttributes();
	}
	
	@Test(priority = 23, enabled=true)
	public void VerifyclickonSubmitFinalGrade() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickonSubmitFinalGrade();
		VerifyclickOnBack();
	}
	
	@Test(priority = 24, enabled=true)
	public void VerifyselectFinalGradeAForAll() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.selectFinalGradeAForAll();
	}
	
	@Test(priority = 25, enabled=true)
	public void VerifyCheckConformityPageAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.CheckConformityPageAttributes();
	}
	
	@Test(priority = 26, enabled=true)
	public void VerifyclickonSubmitFinalGradeAgain() throws InterruptedException {
		//GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		VerifyclickonSubmitFinalGrade();
	}
	
	@Test(priority = 27, enabled=true)
	public void VerifyselectFinalGradesDAndF() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.selectFinalGradesDAndF();
	}
	
	@Test(priority = 28, enabled=true)
	public void VerifyCheckConformityPageAttributes1() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.CheckConformityPageAttributes1();
	}
	
	@Test(priority = 29, enabled=true)
	public void VerifysubmitFinalGradeButtonClick() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		VerifyclickonSubmitFinalGrade();
	}
	
	@Test(priority = 30, enabled=true)
	public void VerifyselectFinalGradesTooManyA() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.selectFinalGradesTooManyA();
	}
	
	@Test(priority = 31, enabled=true)
	public void VerifyCheckConformityPageAttributes2() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.CheckConformityPageAttributes2();
	}
	
	@Test(priority = 32, enabled=true)
	public void VerifysubmitFinalGradeButtonClickAgain() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		VerifyclickonSubmitFinalGrade();
	}
	
	@Test(priority = 33, enabled=true)
	public void VerifyselectFinalGradesMeetConformity() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.selectFinalGradesMeetConformity();
	}
	
	@Test(priority = 34, enabled=true)
	public void VerifyCheckConformityPageAttributes3() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.CheckConformityPageAttributes3();
	}
	
	@Test(priority = 35, enabled=true)
	public void VerifytableHeaderAndDataRows() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.tableHeaderAndDataRows();
	}
	
	@Test(priority = 36, enabled=true)
	public void VerifyrecentNoteAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.recentNoteAttributes();
	}
	
	@Test(priority = 37, enabled=true)
	public void VerifysubmitFinalGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.submitFinalGrades();
		VerifycheckConfirmationModal();
	}
	
	@Test(priority = 38, enabled=true)
	public void VerifyclickOnConfirmationAlertAgain() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.saveNote();
	}
	
	@Test(priority = 39, enabled=true)
	public void VerifycheckApprovalStatus() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.checkApprovalStatus();
	}
	
	@Test(priority = 40, enabled=true)
	public void VerifyclickOnCancelEmulation() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnCancelEmulation();
	}
	
	@Test(priority = 41, enabled=true)
	public void VerifysearchCourse() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		GradeCoursePage5 Gr1 = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.GotoCourseTab();
		Gr1.searchCourse();
	}
	
	@Test(priority = 42, enabled=true)
	public void VerifyclickOnCourse() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnCourse();
	}
	
	@Test(priority = 43, enabled=true)
	public void VerifyCheckConformityPageAttributes4() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.CheckConformityPageAttributes4();
	}
	
	@Test(priority = 44, enabled=true)
	public void VerifyrecentNoteAttributes1() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.recentNoteAttributes1();
	}
	
	@Test(priority = 45, enabled=true)
	public void VerifyclickOnCheckConformity() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnCheckConformity();
	}
	
	@Test(priority = 46, enabled=true)
	public void VerifycourseDetailAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.courseDetailAttributes();
	}
	
	@Test(priority = 47, enabled=true)
	public void VerifytableHeaderAndDataRowsAgain() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.tableHeaderAndDataRows();
		Gr.recentNoteAttributes();
	}
	
	@Test(priority = 48, enabled=true)
	public void VerifyclickOnApproveFinalGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnApproveFinalGrades();
	}
	
	@Test(priority = 49, enabled=true)
	public void VerifyclickOnYes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnYes();
	}
	
	@Test(priority = 50, enabled=true)
	public void VerifysearchCourseAgain() throws InterruptedException {
		GradeCoursePage5 Gr1 = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr1.searchCourse();		
	}	
	
	@Test(priority = 51, enabled=true)
	public void VerifystatusOnCourseListingPage() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.statusOnCourseListingPage();		
	}
	
	@Test(priority = 52, enabled=true)
	public void VerifyclickOnCourseAgain() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnCourse();
	}
	
	@Test(priority = 53, enabled=true)
	public void VerifygradingCourseDetailAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.gradingCourseDetailAttributes();
		VerifyclickOnCheckConformity();
	}
	
	@Test(priority = 54, enabled=true)
	public void VerifycheckAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.checkAttributes();
	}
	
	@Test(priority = 55, enabled=true)
	public void VerifybannerUploadAttribute() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		GradeCoursePage4A Gr1 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		Gr.bannerUploadAttribute();
		Gr1.clickOnBack();
	}
	
	@Test(priority = 56, enabled=true)
	public void VerifyclickOnEmulationLink() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 Gr1 = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnEmulationLink();
		Gr1.checkEmulationAttributes();		
	}
	
	@Test(priority = 57, enabled=true)
	public void VerifyclickOnViewGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnViewGrades();
	}
	
	@Test(priority = 58, enabled=true)
	public void VerifyviewGradesAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.viewGradesAttributes();		
	}
	
	@Test(priority = 59, enabled=true)
	public void VerifycheckConformityAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		GradeCoursePage5 Gr1 = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnCheckConformity();
		Gr1.checkConformityAttributes();		
	}
	
	@Test(priority = 60, enabled=true)
	public void VerifycancelEmul() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.cancelEmul();		
	}
	
	@Test(priority = 61, enabled = true)
	public void verifyCourseSearch() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage5 Gr1 = PageFactory.initElements(driver,GradeCoursePage5.class);
		VerifysearchCourse();
		Gr1.clickOnCourse();
		VerifyclickOnCheckConformity();			
	}
	
	@Test(priority = 62, enabled = true)
	public void verifyDeactivateClickAndAttributes() throws InterruptedException {
		GradeCoursePage4 Gr1 = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr1.DeactivateClick();
		Gr1.DeactivateAttributes();		
	}
	
	@Test(priority = 63, enabled = true)
	public void verifyClickOnNoAndProceed() throws InterruptedException {
		GradeCoursePage4 Gr1 = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr1.ClickOnNoAndProceed();		
	}
	
	@Test(priority = 64, enabled = true)
	public void verifyClickOnYesAndProceed() throws InterruptedException {
		GradeCoursePage4 Gr1 = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr1.ClickOnYesAndProceed();		
	}
	
	@Test(priority = 65, enabled = true)
	public void verifycheckFinalStatus() throws InterruptedException {
		GradeCoursePage4 Gr1 = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr1.checkFinalStatus();		
	}
}

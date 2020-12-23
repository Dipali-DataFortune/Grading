/**
 * 
 */
package com.Grading.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage5;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest5 extends TestBaseGrade{
	
	GradeCourseTest4 GCT4 = PageFactory.initElements(driver, GradeCourseTest4.class);

	@Test(priority = 0, enabled=true)
	public void verifyAllMethodsOfCourseTest4One() throws InterruptedException
	{
		GCT4.LoginGrade1();
		GCT4.VerifyNavigateTo();
		GCT4.VerifyGotoCourseTab();
		GCT4.VerifyActivateCourse();
		GCT4.VerifyclickOnCross();
		GCT4.VerifyattributesAfterActivate();
		GCT4.VerifyAttributeVerification();		
	}
	
	@Test(priority = 1, enabled=true)
	public void verifyAllMethodsOfCourseTest4Two() throws InterruptedException {
		GCT4.VerifyClickOnCourse();
		GCT4.VerifyCourseAttributesVerification();
		GCT4.VerifyClickOnEmulation();
		GCT4.VerifyEmulationAttributesVerification();
		GCT4.VerifyClickOnAssignGrade();
	}
	
	@Test(priority = 2, enabled=true)
	public void verifyAllMethodsOfCourseTest4Three() throws InterruptedException {
		GCT4.VerifyassignEditAttributesVerification();
		GCT4.VerifyenterRawScore();
		GCT4.VerifyproceedAttributeVerification();
		GCT4.VerifyclickOnSubmitInitialGrades();
		GCT4.VerifyclickOnAlert();
	}
	
	@Test(priority = 3, enabled=true)
	public void verifyAllMethodsOfCourseTest4Four() throws InterruptedException {
		GCT4.VerifyclickOnBack();
		GCT4.VerifyAssignAllScore();
		GCT4.VerifyEnterNotes();
		//GCT4.VerifycheckCourseConformity();
		GCT4.VerifyclickOnConfirmationAlert();
	}
	
	@Test(priority = 4, enabled=true)
	public void verifyAllMethodsOfCourseTest4Five() throws InterruptedException {
		GCT4.VerifyinstructorHomePageAttributes();
		GCT4.VerifyfinalGradeAttributes();
		GCT4.VerifyfinalGradeAttributes1();
		GCT4.VerifyselectFinalGradeForFirst();
		GCT4.VerifycheckConformityFinalGradeAttributes();
	}
	
	@Test(priority = 5, enabled=true)
	public void verifyAllMethodsOfCourseTest4Six() throws InterruptedException {
		GCT4.VerifyclickonSubmitFinalGrade();
		GCT4.VerifyupdateGrades();
		GCT4.VerifyconformityErrorMessages();
		GCT4.VerifytableHeaderAttributes();
		GCT4.VerifytableDataRowAttributes();
	}
	
	@Test(priority = 6, enabled=true)
	public void VerifyselectBAndFGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.selectBAndFGrades();
	}
	
	@Test(priority = 7, enabled=true)
	public void VerifyErrorMessages() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.ErrorMessages();
	}
	
	@Test(priority = 8, enabled=true)
	public void VerifytableHeaderAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.tableHeaderAttributes();	
	}
	
	@Test(priority = 9, enabled=true)
	public void VerifytableDataRowAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.tableDataRowAttributes();		
	}
	
	@Test(priority = 10, enabled=true)
	public void VerifyclickonSubmitFinalGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickonSubmitFinalGrade();
		Gr.clickOnBack();
	}
	
	@Test(priority = 11, enabled=true)
	public void VerifyselectFinalGradesWithNote() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.selectFinalGradesWithNote();		
	}
	
	@Test(priority = 12, enabled=true)
	public void VerifyfinalModal() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.finalModal();		
	}
	
	@Test(priority = 13, enabled=true)
	public void VerifysaveNote() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.saveNote();		
	}
	
	@Test(priority = 14, enabled=true)
	public void VerifycheckApprovalStatus() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.checkApprovalStatus();		
	}
	
	@Test(priority = 15, enabled=true)
	public void VerifyclickOnCancelEmulation() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnCancelEmulation();		
	}
	
	@Test(priority = 16, enabled=true)
	public void verifycourseTab() throws InterruptedException {
		GradeCourseTest4 Gr = PageFactory.initElements(driver,GradeCourseTest4.class);
		Gr.VerifyGotoCourseTab();		
	}
	
	@Test(priority = 17, enabled=true)
	public void verifysearchCourse() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.searchCourse();		
	}
	
	@Test(priority = 18, enabled=true)
	public void verifyfinalApprovalAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.finalApprovalAttributes();		
	}
	
	@Test(priority = 19, enabled=true)
	public void verifytableAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		VerifytableHeaderAttributes();
		VerifytableDataRowAttributes();
		Gr.tableDataRowCountAndADistribution();		
	}
	
	@Test(priority = 20, enabled=true)
	public void verifyrecentNoteAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		GradeCoursePage4 Gr1 = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.recentNoteAttributes();
		Gr1.clickOnBack();
	}
	
	@Test(priority = 21, enabled=true)
	public void verifyclickOnRejectFinalGrades() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnRejectFinalGrades();		
	}
	
	@Test(priority = 22, enabled=true)
	public void verifyclickOnNo() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnNo();		
	}
	
	@Test(priority = 23, enabled=true)
	public void verifyclickOnYes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnYes();		
	}
	
	@Test(priority = 24, enabled=true)
	public void verifysearchCourseAgain() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.searchCourseAgain();		
		GCT4.VerifyClickOnEmulation();
	}
	
	@Test(priority = 25, enabled=true)
	public void verifyfinalEmulAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.finalEmulAttributes();		
	}
	
	@Test(priority = 26, enabled=true)
	public void verifyclickOnAssignAndCheckAttributes() throws InterruptedException {
		GradeCoursePage5 Gr = PageFactory.initElements(driver,GradeCoursePage5.class);
		Gr.clickOnAssignAndCheckAttributes();		
	}
}

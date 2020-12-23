/**
 * 
 */
package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.GradeCoursePage6;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest4 extends TestBaseGrade{
	
	//GradeCoursePage4 gradeCoursePage4;
	
	public GradeCourseTest4()
	{
		super();		
	}
	
	@Test(priority = 0, enabled=true)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1, enabled=true)
	public void VerifyNavigateTo() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.NavigateToDashboard();
	}
	
	@Test(priority = 2, enabled=true)
	public void VerifyGotoCourseTab() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.GotoCourseTab();
	}
	
	@Test(priority = 3, enabled=true)
	public void VerifyActivateCourse() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.activateCourse();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyclickOnCross() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnCross();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyattributesAfterActivate() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.attributesAfterActivate();
	}
	
	@Test(priority = 6, enabled=true)
	public void VerifyAttributeVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.attributeVerification();
	}
	
	@Test(priority = 7, enabled=true)
	public void VerifyClickOnCourse() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnCourse();
	}
	
	@Test(priority = 8, enabled=true)
	public void VerifyCourseAttributesVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.courseAttributesVerification();
	}
	
	@Test(priority = 9, enabled=true)
	public void VerifyClickOnEmulation() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnEmulation();
	}
	
	@Test(priority = 10, enabled=true)
	public void VerifyEmulationAttributesVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.emulationAttributesVerification();
	}
	
	@Test(priority = 11, enabled=true)
	public void VerifyClickOnAssignGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnAssignGrade();
	}	

	@Test(priority = 12, enabled=true)
	public void VerifyassignEditAttributesVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.assignEditAttributesVerification();
	}
	
	@Test(priority = 13, enabled=true)
	public void VerifyenterRawScore() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.enterRawScore();
	}
	
	@Test(priority = 14, enabled=true)
	public void VerifyproceedAttributeVerification() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.proceedAttributeVerification();
	}
	
	@Test(priority = 15, enabled=true)
	public void VerifyclickOnSubmitInitialGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnSubmitInitialGrades();
	}
	
	@Test(priority = 16, enabled=true)
	public void VerifyclickOnAlert() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnAlert();
	}
	
	@Test(priority = 17, enabled=true)
	public void VerifyclickOnBack() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnBack();
	}
	
	@Test(priority = 18, enabled=true)
	public void VerifyAssignAllScore() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.AssignAllScore();
	}
	
	@Test(priority = 19, enabled=true)
	public void VerifyEnterNotes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.EnterNotes();
	}
	
	@Test(priority = 20, enabled=true)
	public void VerifycheckConfirmationModal() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.checkConfirmationModal();
	}
	
	@Test(priority = 21, enabled=true)
	public void VerifyclickOnNo() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnNo();
	}
	
	@Test(priority = 22, enabled=false)
	public void VerifycheckCourseConformity() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.checkCourseConformity();
	}
	
	@Test(priority = 23, enabled=true)
	public void VerifyclickOnConfirmationAlert() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickOnConfirmationAlert();
	}
	
	@Test(priority = 24, enabled=true)
	public void VerifyinstructorHomePageAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.instructorHomePageAttributes();
	}
	
	@Test(priority = 25, enabled=true)
	public void VerifyfinalGradeAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		//Gr.clickOnAssignGrade();
		Gr.finalGradeAttributes();
	}
	
	@Test(priority = 26, enabled=true)
	public void VerifyfinalGradeAttributes1() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.finalGradeAttributes1();
	}
	
	@Test(priority = 27, enabled=true)
	public void VerifyselectFinalGradeForFirst() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.selectFinalGradeForFirst();
	}
	
	@Test(priority = 28, enabled=true)
	public void VerifycheckConformityFinalGradeAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.checkConformityFinalGradeAttributes();
	}
	
	@Test(priority = 29, enabled=true)
	public void VerifyclickonSubmitFinalGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.clickonSubmitFinalGrade();
		Gr.clickOnBack();
	}
	
	@Test(priority = 30, enabled=false)
	public void VerifyselectFinalGradeForAll() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.selectFinalGradeForAll();		
	}
	
	@Test(priority = 31, enabled=false)
	public void VerifyCheckConformityPageAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.CheckConformityPageAttributes();
	}
	
	@Test(priority = 32, enabled=false)
	public void VerifysubmitFinalGrade() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.submitFinalGrade();
	}	
	
	@Test(priority = 33, enabled=false)
	public void VerifyselectFinalGradesHighMean() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.selectFinalGradesHighMean();		
	}
	
	@Test(priority = 34, enabled=false)
	public void VerifyhighMeanConformityAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.highMeanConformityAttributes();		
		VerifyclickonSubmitFinalGrade();
	}
		
	@Test(priority = 35, enabled=false)
	public void VerifyselectFinalGradesLowMean() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.selectFinalGradesLowMean();		
	}
	
	@Test(priority = 36, enabled=false)
	public void VerifylowMeanConformityAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.highMeanConformityAttributes();		
		VerifyclickonSubmitFinalGrade();
	}
	
	@Test(priority = 37, enabled=true)
	public void VerifyupdateGrades() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.updateGrades();		
	}
	
	@Test(priority = 38, enabled=true)
	public void VerifyconformityErrorMessages() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.conformityErrorMessages();
	}
	
	@Test(priority = 39, enabled=true)
	public void VerifytableHeaderAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.tableHeaderAttributes();		
	}
	
	@Test(priority = 40, enabled=true)
	public void VerifytableDataRowAttributes() throws InterruptedException {
		GradeCoursePage4 Gr = PageFactory.initElements(driver,GradeCoursePage4.class);
		Gr.tableDataRowAttributes();		
		VerifyclickonSubmitFinalGrade();
	}	
}

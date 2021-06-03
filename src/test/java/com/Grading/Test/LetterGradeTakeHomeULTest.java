package com.Grading.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import com.Grading.Objects.CrossListedGradingPage;
import com.Grading.Objects.LetterGradeTakeHomeULPage;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class LetterGradeTakeHomeULTest extends TestBaseGrade
{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority = 1)
	public void VerifyNavigateTo() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyGotoCourseTab() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.GotoCourseTab3();
	}
	@Test(priority = 3)
	public void Verifydeactivatecoursefirst() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.deactivatecoursefirst();
	}
	@Test(priority = 4)
	public void VerifyActivateCourse() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.ActivateCourse();
	}
	@Test(priority = 5)
	public void VerifyCheckGradingStetus() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckGradingStetus();
	}
	@Test(priority = 6)
	public void VerifyCheckCourseLink() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckCourseLink();
	}
	@Test(priority = 7)
	public void VerifyAttributesVerification() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AttributesVerificationb();
	}
	@Test(priority = 8)
	public void VerifyCheckForAttribute2()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForAttribute2();
	}
	@Test(priority = 9)
	public void VerifyEmulateCourse()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr. EmulateCoursep();
	}
	@Test(priority = 10)
	public void VerifyCheckAllAttributeAfterEmulation()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckAllAttributeAfterEmulation();
	}
	@Test(priority = 11)
	public void VerifyPressAssignGradeButton()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.PressAssignGradeButton();
	}
	@Test(priority = 12)
	public void VerifyCheckForAttributesAtGradeAssingPage()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForAttributesAtGradeAssingPage();
	}
	@Test(priority = 13)
	public void VerifyEnterGradesForFirstStudent()   throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.EnterGradesForFirstStudent();
	}
	@Test(priority = 14)
	public void VerifyAssigningGradeToAllStudent1()   throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssigningGradeToAllStudent1();
	}
	@Test(priority = 15)
	public void VerifyAssigningGradeToAllStudent2()   throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssigningGradeToAllStudent2();
	}
	@Test(priority = 16)
	public void VerifyGotoProceed()   throws InterruptedException {
		LetterGradeTakeHomeULPage Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.GotoProceed();
	}
	@Test(priority = 17)
	public void VerifyPressAssignGradeButton2()   throws InterruptedException {
		LetterGradeTakeHomeULPage Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.PressAssignGradeButton2();
	}
	@Test(priority = 18)
	public void VerifyVerifyAllAttributesAfterAssignGrade()   throws InterruptedException {
		LetterGradeTakeHomeULPage Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.VerifyAllAttributesAfterAssignGrade();
	}
	@Test(priority = 19)
	public void VerifyCheckConformity()throws InterruptedException {
		LetterGradeTakeHomeULPage Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckConformity();
	}
	@Test(priority = 20)
	public void VerifyClickOnAleart()   throws InterruptedException {
		LetterGradeTakeHomeULPage Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.ClickOnAleart();
	}
	@Test(priority = 21)
	public void VerifyGoBack()   throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.GoBack5();
	}
	@Test(priority = 22)
	public void VerifyAssignLetterGrade() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssighLetterGrade();
	}
	@Test(priority = 23)
	public void VerifyAssighLetterGrade2() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssighLetterGrade2();
	}
	@Test(priority = 24)
	public void VerifySelectGrade() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SelectGrade();
	}
	@Test(priority = 25)
	public void VerifySelectGrades2() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SelectGrades2();
	}
	@Test(priority = 26)
	public void VerifySelectGrade3() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SelectGrade3();
	}
	@Test(priority = 27)
	public void VerifyAssighLetterGrade3() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssighLetterGrade3();
	}
	@Test(priority = 28)
	public void VerifyAssighLetterGrade4() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssighLetterGrade4();
	}
	@Test(priority = 29)
	public void VerifySelectConform() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SelectConform();
	}
	@Test(priority = 30)
	public void Verifyclickyes() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.clickyes();
	}
	@Test(priority = 31)
	public void VerifyAssignconformityreporttable() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AssignconformityreporttableALLDandF();
	}
	@Test(priority = 32)
	public void VerifySelectConform2() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SelectConform2();
	}
	@Test(priority= 33)
	public void VerifyCheckTheAttriutes() throws InterruptedException
	{
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckTheAttriutes();
	}
	//@Test(priority = 33)
	public void Verifyclickyes2() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.clickyes();
	}
	@Test(priority = 34)
	public void VerifyAssignconformityreporttable2() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.Assignconformityreporttable2();
	}
	@Test(priority = 35)
	public void VerifySelectConform3() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SelectConform3();
	}
	@Test(priority = 36)
	public void VerifyCheckTheAttriutesAfterApplyDifferentGrades() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckTheAttriutesAfterApplyDifferentGrades();
	}
	@Test(priority = 37)
	public void VerifyPrintGradeMassage() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr. PrintGradeMassage();
	}
	@Test(priority = 38)
	public void VerifyclickCancle() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.clickCancle();
	}
	@Test(priority = 39)
	public void VerifyClickonCriminaljusiceCourse() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.ClickonCriminaljusiceCourse();
	}
	@Test(priority = 40)
	public void VerifyEnterDifferentGrades() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.EnterDifferentGrades();
	}
	@Test(priority = 41)
	public void VerifyCheckTheAttriutesAfterApplyDifferentGradesAll() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckTheAttriutesAfterApplyDifferentGradesAll();
	}
	@Test(priority = 42)
	public void VerifyPrintGradeMassageGreen() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.PrintGradeMassageGreen();
	}
	@Test(priority = 43)
	public void VerifyCheckTableAtributesBeforeSumbitingGrades()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckTableAtributesBeforeSumbitingGrades();
	}
	@Test(priority = 44)
	public void VerifyGetTextFromAttributes() throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.GetTextFromAttributes();
	}
	@Test(priority = 45)
	public void VerifyPrintWholeTable()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.PrintWholeTable();
	}
	@Test(priority = 46)
	public void VerifySubmitGrades()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.SubmitGrades();
	}
	@Test(priority = 47)
	public void VerifyclickYeslink()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.clickYeslinky();
	}
	@Test(priority = 48)
	public void VerifyclickCanclelink()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.clickCanclelink();
	}
	@Test(priority = 49)
	public void VerifyGotoCourseTabAgain()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.GotoCourseTab();
	}
	@Test(priority = 50)
	public void VerifyCheckForCourse()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForCourse();
	}
	@Test(priority = 51)
	public void VerifyCheckCourseLink3()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckCourseLink();
	}
	@Test(priority = 52)
	public void VerifyCheckForConformity()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForConformity();
	}

	@Test(priority = 53)
	public void VerifyAttributesVerificationnew()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.AttributesVerification();
	}
	@Test(priority = 54)
	public void VerifyCheckForAttribute()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForAttribute2();
	}
	@Test(priority = 55)
	public void VerifyApprovedGrades()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.ApprovedGrades();
	}
	@Test(priority = 56)
	public void VerifyclickYeslinkAt()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.clickYeslink();
	}
	@Test(priority = 57)
	public void VerifyCheckForGradingSetus()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForGradingSetus();
	}
	@Test(priority = 58)
	public void VerifyCheckForConformity2()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.CheckForConformity2();
	}
	@Test(priority = 59)
	public void VerifyGotoBack()  throws InterruptedException {
		LetterGradeTakeHomeULPage   Gr = PageFactory.initElements(driver,LetterGradeTakeHomeULPage.class);
		Gr.GotoBack();
	}
	


		

	
}

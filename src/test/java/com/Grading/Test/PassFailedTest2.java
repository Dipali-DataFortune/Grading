package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.base.TestBaseGrade;
import com.Grading.Objects.LoginGrade;
import com.Grading.Objects.PassFailedPage;

public class PassFailedTest2 extends TestBaseGrade
{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigateTo()throws InterruptedException {
		PassFailedPage Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyGotoCourseTab()  throws InterruptedException {
		PassFailedPage Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.GotoCourseTab();
	}
	@Test(priority = 3)
	public void VerifyEnterCRN()throws InterruptedException {
		PassFailedPage Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.EnterCRN();
	}
	@Test(priority = 4)
	public void VerifyEnteronCourse()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.EnteronCourse();
	}
	@Test(priority = 5)
	public void VerifyEmulateCourse()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.EmulateCourse();
	}
	@Test(priority = 6)
	public void VerifyAttributesAfterEmulation()   throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.AttributesAfterEmulation();
	}
	@Test(priority = 7)
	public void VerifyAfterEmulation()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.AfterEmulation();
	}
	@Test(priority = 8)
	public void VerifyAssingScore()   throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.AssingScore();
	}
	@Test(priority = 9)
	public void VerifyProceedFurher()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.ProceedFurher();
	}
	@Test(priority = 10)
	public void VerifyClickOnAleart()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.ClickOnAleart();
	}
	@Test(priority = 11)
	public void VerifyAssignScores()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.AssignScores();
	}
	@Test(priority = 12)
	public void VerifyAssignAllScore()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.AssignAllScore();
	}
	@Test(priority = 13)
	public void VerifyEnterNotes()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.EnterNotes();
	}
	@Test(priority = 14)
	public void VerifyGoBackSelectNo()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.GoBackSelectNo();
	}
	@Test(priority = 15)
	public void VerifyGotoBack()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.GotoBack();
	}
	@Test(priority = 16)
	public void VerifyAgainProceedGrades()   throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.AgainProceedGrades();
	}
	@Test(priority = 17)
	public void VerifyGoBackSelectYes()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.GoBackSelectYes();
	}
	@Test(priority = 18)
	public void VerifyClicktheCourse()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.ClicktheCourse();
	}
	@Test(priority = 19)
	public void VerifyCheckConformity()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.CheckConformity();
	}
	@Test(priority = 20)
	public void VerifyDeactivateCourse()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.DeactivateCourse();
	}
	@Test(priority = 21)
	public void VerifyActivateCourse() throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.ActivateCourse() ;
	}
	
		 

}

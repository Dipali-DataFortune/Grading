package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.base.TestBaseGrade;
import com.Grading.Objects.GradeCoursePage1;
import com.Grading.Objects.LoginGrade;
import com.Grading.Objects.PassFailedPage;

public class PassFailedTest1 extends TestBaseGrade

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
	public void VerifyClickoncheckBox()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.ClickoncheckBox();
	}
	@Test(priority = 5)
	public void VerifySearchAgain()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.SearchAgain();
	}
	@Test(priority = 6)
	public void VerifyGradingStetus()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.GradingStetus();
	}
	@Test(priority = 7)
	public void VerifyEnteronCourse()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.EnteronCourse();
	}
	@Test(priority = 8)
	public void VerifyVerifyAttributes()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.VerifyAttributes() ;
	}
	@Test(priority = 9)
	public void VerifyAttributes2()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.Attributes2();
	}
	@Test(priority = 10)
	public void VerifyCourseStetus() throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.CourseStetus();
	}
	@Test(priority = 11)
	public void VerifyTearmsStetus()  throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.TearmsStetus();
	}
	@Test(priority = 12)
	public void VerifyBlindGradesStetus() throws InterruptedException {
		PassFailedPage  Gr = PageFactory.initElements(driver,PassFailedPage.class);
		Gr.BlindGradesStetus();
	}
		
	
	

}

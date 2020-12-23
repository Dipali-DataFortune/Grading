 package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Grading.Objects.GradingStudentPage;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradeStudentTest extends TestBaseGrade

{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void Navigateto() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.NavigateStudent();
	}
	@Test(priority = 2)
	public void VerifyAttribute1()  throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.EmulateStudent();
	}
	
	@Test(priority = 3)
	public void VerifyAttribute2()  throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.CheckAttributes();
	}
	
	@Test(priority = 4)
	public void VerifyCancle() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.CancleEmulation();
	}

	@Test(priority = 5)
	public void VerifySelectSecondStudent() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.SelectSecondStudent();
	}
	@Test(priority = 6)
	public void VerifyClickForEmulation()  throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.ClickForEmulation();
	}
	@Test(priority = 7)
	public void VerifyAttributeCheck() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.AttributeCheck();
	}
	
	@Test(priority = 8)
	public void VerifyCheckEnabled()  throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.CheckEnabled();
	}
	@Test(priority = 9)
	public void VerifyClickonConvert() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.ClickOnConvert();
	}
	@Test(priority = 10)
	public void VerifySelectGrade() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.SelectGrade();
	}
	@Test(priority = 11)
	public void VerifyRemove1() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.RemoveGrade();
	}
	@Test(priority = 12)
	public void VerifySelectGradeC() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.SelectGradeC();
	}
	@Test(priority = 13)
	public void VerifyRemove2() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.RemoveGrade2();
	}
	
	@Test(priority = 14)
	public void VerifySelectGradeB() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.SelectGradeC();
	}
	@Test(priority = 15)
	public void VerifyRemove3() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.RemoveGrade2();
	}
	
	@Test(priority = 16)
	public void VerifyCancleEmulation2() throws InterruptedException {
		GradingStudentPage Gr = PageFactory.initElements(driver,GradingStudentPage.class);
		Gr.CancleEmulation2();
	}
	
}

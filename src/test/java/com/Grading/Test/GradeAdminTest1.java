package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeAdminPage1;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradeAdminTest1 extends TestBaseGrade
{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigateTo() throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyClickOnStudentdropdown() throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.ClickOnStudentdropdown();
	}
	@Test(priority = 3)
	public void VerifyEditStudentPreference()  throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.EditStudentPreference();
	}
	@Test(priority = 4)
	public void VerifyEditStudentPreferenceGrading() throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.EditStudentPreferenceGrading();
	}
	
	
	
}

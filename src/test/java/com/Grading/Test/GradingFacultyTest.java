package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradingFacultyPage;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradingFacultyTest extends TestBaseGrade
{

	
	
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigateToFaculty() throws InterruptedException {
		GradingFacultyPage Gr = PageFactory.initElements(driver,GradingFacultyPage.class);
		Gr.NavigateToFaculty();
	}
	@Test(priority = 2)
	public void VerifyAttributes() throws InterruptedException {
		GradingFacultyPage Gr = PageFactory.initElements(driver,GradingFacultyPage.class);
		Gr.VerifyFacultyAttributes();
	}
	
}

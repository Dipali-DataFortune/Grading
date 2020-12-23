package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Grading.Objects.GradeAdminPage2;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradeAdminTest2 extends TestBaseGrade

{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigate() throws InterruptedException {
		GradeAdminPage2 Gr = PageFactory.initElements(driver,GradeAdminPage2.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyAttribute1()  throws InterruptedException {
		GradeAdminPage2 Gr = PageFactory.initElements(driver,GradeAdminPage2.class);
		Gr.AttributeStudent();
	}
	@Test(priority = 3)
	public void VerifySearchStudentByName()  throws InterruptedException {
		GradeAdminPage2 Gr = PageFactory.initElements(driver,GradeAdminPage2.class);
		Gr.SearchStudentByName();
	}
	@Test(priority = 4)
	public void VerifySearchStudentById()  throws InterruptedException {
		GradeAdminPage2 Gr = PageFactory.initElements(driver,GradeAdminPage2.class);
		Gr.SearchStudentById();
	}
	@Test(priority = 5)
	public void VerifyCreateList()  throws InterruptedException {
		GradeAdminPage2 Gr = PageFactory.initElements(driver,GradeAdminPage2.class);
		Gr.CreateList();
	}
	@Test(priority = 6)
	public void VerifyCheckForCreate() throws InterruptedException {
		GradeAdminPage2 Gr = PageFactory.initElements(driver,GradeAdminPage2.class);
		Gr.CheckForCreate();
	}
}

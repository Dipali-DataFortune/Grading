package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;


import org.testng.annotations.Test;

import com.Grading.Objects.GradeAdminPage1;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;


public class GradeAdminTest3 extends TestBaseGrade

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
	public void VerifyAttribute1()  throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.VerifyAllAttributes();
	}
	@Test(priority = 3)
	public void VerifyAttribute2()  throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.VerifyHonarSetting();
	}
	@Test(priority = 4)
	public void VerifydateUpdations()   throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.VerifydateUpdations() ;
	}
	@Test(priority = 5)
	public void VerifyUpdate()   throws InterruptedException {
		GradeAdminPage1 Gr = PageFactory.initElements(driver,GradeAdminPage1.class);
		Gr.UpdateDate();
	}
	
	
	
		
}

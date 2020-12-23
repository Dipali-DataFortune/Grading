package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Grading.Objects.GradeDashboardPage;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradeDashBoardTest extends TestBaseGrade

{
	
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority = 1)
	public void VerifyAttribute1()throws InterruptedException {
		GradeDashboardPage Gr = PageFactory.initElements(driver,GradeDashboardPage.class);
		Gr.Attribute1();
	}
	@Test(priority = 2)
	public void VerifyCreateSchedule() throws InterruptedException {
		GradeDashboardPage Gr = PageFactory.initElements(driver,GradeDashboardPage.class);
		Gr.CreateSchedule();
	}
	@Test(priority = 3)
	public void VerifyDelete2()  throws InterruptedException {
		GradeDashboardPage Gr = PageFactory.initElements(driver,GradeDashboardPage.class);
		Gr.Delete2();
	}
}

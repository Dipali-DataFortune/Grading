package com.Grading.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4;
import com.Grading.Objects.LoginGrade;
import com.Grading.Objects.PassFailNew;
import com.Grading.base.TestBaseGrade;

public class PassFailNewTest extends TestBaseGrade{
	
	public PassFailNewTest()
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
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.NavigateToDashboard();
	}
	
	@Test(priority = 2, enabled=true)
	public void VerifyGotoCourseTab() throws InterruptedException {
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.GotoCourseTab();
	}
	
	@Test(priority = 3, enabled=true)
	public void searchCourse() throws InterruptedException {
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.searchCourse();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyActivateCourse() throws InterruptedException {
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.activateCourse();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyClickOnCourse() throws InterruptedException {
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.clickOnCourse();
	}
	
	@Test(priority = 6, enabled=true)
	public void VerifyCourseAttributesVerification() throws InterruptedException {
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.courseAttributesVerification();
	}
	
	@Test(priority = 7, enabled=true)
	public void VerifyClickOnEmulation() throws InterruptedException {
		PassFailNew Gr = PageFactory.initElements(driver,PassFailNew.class);
		Gr.clickOnEmulation();
	}

}

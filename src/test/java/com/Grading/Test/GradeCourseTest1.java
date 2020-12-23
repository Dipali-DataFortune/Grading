package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Grading.base.TestBaseGrade;

import com.Grading.Objects.GradeCoursePage1;
import com.Grading.Objects.LoginGrade;

public class GradeCourseTest1 extends TestBaseGrade
{	
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyNavigateTo()throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr. NavigateToDashboard();
	}
	
	@Test(priority = 2)
	public void VerifyGotoCourseTab() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.GotoCourseTab();
	}
	
	@Test(priority = 3)
	public void VerifyAttributeverification() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.Attributeverification();
	}
	
	
	@Test(priority = 4)
	public void VerifySerchCourseByCRN() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.SerchCourseByCRN();
	}
	
	@Test(priority = 5)
	public void VerifySearchByCourseName() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.SearchByCourseName();
	}
	
	@Test(priority = 6)
	public void VerifySearchByCourseNumber() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr. SearchByCourseNumber();
	}
	
	
	@Test(priority = 7)
	public void VerifyCreateCustomTag() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.CreateCustomTag();
	}
	
	@Test(priority = 8)
	public void VerifyNewMethod() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.NewMethod();
	}
	@Test(priority = 9)
	public void VerifyCraeteTag2() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.CraeteTag2(); 
	}
	@Test(priority = 10)
	public void VerifyCheckTabAddRemove() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.CheckTabAddRemove();
	}
	@Test(priority = 11)
	public void VerifySelectCourse() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.SelectCourse();
	}
	@Test(priority = 12)
	public void VerifyCreateNewTag() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.CreateNewTag();
	}
	@Test(priority = 13)
	public void VerifyClickOnceCustom() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.ClickOnceCustom();
	}
	@Test(priority = 14)
	public void VerifyRemoveExsistingTag()  throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.RemoveExsistingTag();
	}
	@Test(priority = 15)
	public void VerifyAddTag() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.AddTag();
	}
	@Test(priority = 16)
	public void VerifyAllButtons() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.AllButtons();
	}
	@Test(priority = 17)
	public void VerifyClickRemove() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.ClickRemove();
	}
	@Test(priority = 18)
	public void VerifyClear()  throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.Clear() ;
	}
	@Test(priority = 19)
	public void VerifySeleCross() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.SeleCross();
	}
	@Test(priority = 20)
	public void VerifyCrossCustom() throws InterruptedException {
		GradeCoursePage1 Gr = PageFactory.initElements(driver,GradeCoursePage1.class);
		Gr.CrossCustom();
	}
	}
  
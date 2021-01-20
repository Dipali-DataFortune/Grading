/**
 * 
 */
package com.Grading.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeCoursePage4A;
import com.Grading.Objects.GradeCoursePage5;
import com.Grading.Objects.GradeCoursePage6;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCourseTest6 extends TestBaseGrade{
	
	public GradeCourseTest6()
	{
		super();
	}
	
	@Test(priority = 0, enabled=true)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyNavigateToDashboardAndActivateCourse() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver, GradeCoursePage6.class);
		Gr.NavigateToDashboardAndActivateCourse("Adv Legal Research", "38884");
	}
	
	@Test(priority = 2, enabled = true)
	public void verifycourseAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver, GradeCoursePage6.class);
		Gr.courseAttributesVerification();
	}
	
	@Test(priority = 3, enabled=true)
	public void VerifyclickOnEmulation() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnEmulation();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyemulationAttributesVerification() throws InterruptedException {
		GradeCoursePage6 Gr = PageFactory.initElements(driver,GradeCoursePage6.class);
		Gr.emulationAttributesVerification();
	}
	
	@Test(priority = 5, enabled=true)
	public void VerifyclickOnAssignGrade() throws InterruptedException {
		GradeCoursePage4A Gr = PageFactory.initElements(driver,GradeCoursePage4A.class);
		Gr.clickOnAssignGrade();
	}

}

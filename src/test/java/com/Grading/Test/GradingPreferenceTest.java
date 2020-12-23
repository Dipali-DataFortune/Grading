package com.Grading.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Grading.Objects.GradeAdminPage1;
import com.Grading.Objects.GradingPreferencePage;
import com.Grading.Objects.LoginGrade;
import com.Grading.base.TestBaseGrade;

public class GradingPreferenceTest extends TestBaseGrade
{
	@Test(priority = 0)
	public void LoginGrade1()throws InterruptedException {
		LoginGrade tr1 = PageFactory.initElements(driver,LoginGrade.class);
		tr1.LoginMethodGrade(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority = 1)
	public void VerifyNavigateToDashboard() throws InterruptedException {
		GradingPreferencePage Gr = PageFactory.initElements(driver,GradingPreferencePage.class);
		Gr.NavigateToDashboard();
	}
	@Test(priority = 2)
	public void VerifyClickPreference() throws InterruptedException {
		GradingPreferencePage Gr = PageFactory.initElements(driver,GradingPreferencePage.class);
		Gr.ClickPreference();
	}
	@Test(priority = 3)
	public void VerifySelectPreference()  throws InterruptedException {
		GradingPreferencePage Gr = PageFactory.initElements(driver,GradingPreferencePage.class);
		Gr.SelectPreference();
	}
	@Test(priority = 4)
	public void VerifySelectSecondStudent() throws InterruptedException {
		GradingPreferencePage Gr = PageFactory.initElements(driver,GradingPreferencePage.class);
		Gr.SelectSecondStudent();
	}
	@Test(priority = 5)
	public void VerifyClickForEmulation() throws InterruptedException {
		GradingPreferencePage Gr = PageFactory.initElements(driver,GradingPreferencePage.class);
		Gr.ClickForEmulation();
	}
	@Test(priority = 6)
	public void VerifyCancleEmulation() throws InterruptedException {
		GradingPreferencePage Gr = PageFactory.initElements(driver,GradingPreferencePage.class);
		Gr.CancleEmulation();
	}
}

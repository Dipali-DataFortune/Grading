/**
 * 
 */
package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCoursePage6 extends TestBaseGrade{
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@FindBy(xpath = "//span[contains(text(),'Adv Legal Research')]")
	WebElement CourseLink;
	
	@FindBy(xpath = "//h2[contains(text(),'Adv Legal Research')]")
	WebElement CourseName;
	
	@FindBy(xpath = "//span[contains(text(),'Martin Sampson')]")
	WebElement InstructorName;
	
	@FindBy(xpath = "//div[@class='d-inline-block']")
	WebElement emulInstructorName;
	
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement emulCourseTitle;
	
	@FindBy(xpath = "//td[contains(text(),' Upperclass - UP<=9 Class ')]")
	WebElement ClassLevel1;
	
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement IdName1;
	
	@FindBy(xpath = "(//div[@class='col-xs-12 col-sm-12 col-md-12 coursedetail'])[3]")
	WebElement StudentCount;
	
	@FindBy(xpath = "//strong[contains(text(),'(CANCEL)')]")
	WebElement CancelLink;
	
	
	public GradeCoursePage6(WebDriver driver)
	{
		this.driver = driver;
	}
		
	public void NavigateToDashboardAndActivateCourse(String courseName, String crn) throws InterruptedException {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.spring2020));
		GC4.spring2020.click();

		wait.until(ExpectedConditions.visibilityOf(GC4.GradingSchedule));
		GC4.GradingSchedule.click();

		wait.until(ExpectedConditions.visibilityOf(GC4.CourseTab));
		staleElementClick(6, GC4.CourseTab, 60);
		// CourseTab.click();
		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click()", CourseTab);
		 */

		wait.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);

		wait.until(ExpectedConditions.visibilityOf(GC4.searchBox));

		highLightElement(driver, GC4.searchBox);
		GC4.searchBox.sendKeys(courseName);

		wait.until(ExpectedConditions.visibilityOf(GC4.CourseCheckBox));

		highLightElement(driver, GC4.CourseCheckBox);
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		GC4.CourseCheckBox.click();

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click()", CourseCheckBox);
		 */

		wait.until(ExpectedConditions.visibilityOf(GC4.ActivateButton));
		// softAssert.assertEquals(ActivateButton.isEnabled(), true);
		highLightElement(driver, GC4.ActivateButton);
		GC4.ActivateButton.click();
		Thread.sleep(5000);

		// Cross.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.Cross);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		GC4.searchBox.sendKeys(crn);
		Thread.sleep(5000);

		softAssert.assertEquals(GC4.CourseStatus.isDisplayed(), true);
		String courseStatusNew = GC4.CourseStatus.getText();
		System.out.println(courseStatusNew);
		Assert.assertEquals(courseStatusNew, "Initial Grading Phase");
		softAssert.assertEquals(CourseLink.isEnabled(), true);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// CourseLink.click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", CourseLink);
	}
	
	public void courseAttributesVerification() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.ProceedButton.isEnabled(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.initialStatus.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmulationLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmailLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		scrollToElement(GC4.IdName);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isEnabled(), true);
		softAssert.assertEquals(GC4.Paper.isDisplayed(), true);
		softAssert.assertEquals(GC4.Publish.isDisplayed(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		
		scrollToElement(GC4.RecentNotes);
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), false);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), false);
		scrollToElement(GC4.InitialStatus);
		softAssert.assertEquals(GC4.InitialStatus.isDisplayed(), false);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), false);
		//softAssert.assertEquals(GC.BlindGradeNew.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All course attributes are verified");
	}
	
	public void emulationAttributesVerification() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage5 GC = PageFactory.initElements(driver, GradeCoursePage5.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.YourCourseLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.Title.isDisplayed(), true);
		softAssert.assertEquals(GC4.ClassLevel.isDisplayed(), true);
		softAssert.assertEquals(GC4.BlindGrade.isDisplayed(), true);
		softAssert.assertEquals(GC4.CurrentStatus.isDisplayed(), true);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(emulCourseTitle));
		softAssert.assertEquals(emulCourseTitle.isDisplayed(), true);
		softAssert.assertEquals(ClassLevel1.isDisplayed(), true);
		// softAssert.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert.assertEquals(GC.CurrentStatus1.isDisplayed(), true);
		// softAssert.assertEquals(GradingDueDate1.isDisplayed(), true);
		softAssert.assertEquals(GC4.AssignGradeButton.isEnabled(), true);

		System.out.println("All the emulation attributes are verified");
	}	

}


		
		

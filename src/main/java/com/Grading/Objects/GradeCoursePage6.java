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
	
	@FindBy(xpath="//span[contains(text(),'Immigr Policy across Branches')]")
	WebElement CourseLink;
	
	@FindBy(xpath = "//span[contains(text(),'Roger Koch')]")
	WebElement InstructorName;
	
	@FindBy(xpath = "//a[contains(text(),' IMPORTANT! You are currently impersonating KOCH, ROGER. ')]")
	WebElement emulInstructorName;
	
	@FindBy(xpath = "//h3[contains(text(),' Roger Koch ')]")
	WebElement proceedInstructorName;	
	
	@FindBy(xpath="//span[contains(text(),'Immigr Policy across Branches (LAWJ-1519-5) 38897 ')]")
	WebElement emulCourseTitle;
	
	@FindBy(xpath="//p[contains(text(),'(12) Students Enrolled')]")
	WebElement CourseTitle1;
	
	@FindBy(xpath="//td[contains(text(),' Upperclass - UP10-29 Class ')]")
	WebElement ClassLevel1;
	
	@FindBy(xpath="//td[contains(text(),' Yes ')]")
	WebElement BlindGrade1;
	
	@FindBy(xpath="//span[contains(text(),'Initial Grading Phase')]")
	WebElement CurrentStatus1;
	
	@FindBy(xpath="(//button[contains(text(),'Assign/Edit Grades')])[1]")	
	WebElement AssignGradeButton;
	
	@FindBy(xpath="//h2[contains(text(),'Immigr Policy across Branches (LAWJ-1519-5) 38897')]")
	WebElement CourseName;
	
	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement IdName1;
	
	@FindBy(xpath="(//div[@class='col-xs-12 col-sm-12 col-md-12 coursedetail'])[3]")
	WebElement StudentCount;
	
	
	public GradeCoursePage6(WebDriver driver)
	{
		this.driver=driver;
	}
		
	public void courseAttributesVerification()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
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
		
		softAssert.assertEquals(GC4.Paper1.isEnabled(), false);
		softAssert.assertEquals(GC4.Publish1.isEnabled(), false);
		
		scrollToElement(GC4.RecentNotes);
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), false);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), false);
		scrollToElement(GC4.InitialStatus);
		softAssert.assertEquals(GC4.InitialStatus.isDisplayed(), false);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), false);
		//softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
		
		System.out.println("All course attributes are verified");
	}
	
	public void emulationAttributesVerification()
	{	
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);	
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.YourCourseLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.Title.isDisplayed(), true);
		softAssert.assertEquals(GC4.ClassLevel.isDisplayed(), true);
		softAssert.assertEquals(GC4.BlindGrade.isDisplayed(), true);
		softAssert.assertEquals(GC4.CurrentStatus.isDisplayed(), true);
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 50);
		 * wait1.until(ExpectedConditions.visibilityOf(GC4.GradingDueDate));
		 * softAssert.assertEquals(GC4.GradingDueDate.isDisplayed(), true);
		 */
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(emulCourseTitle));
		softAssert.assertEquals(emulCourseTitle.isDisplayed(), true);
		softAssert.assertEquals(CourseTitle1.isDisplayed(), true);
		softAssert.assertEquals(ClassLevel1.isDisplayed(), true);
	//	softAssert.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert.assertEquals(CurrentStatus1.isDisplayed(), true);
	//	softAssert.assertEquals(GradingDueDate1.isDisplayed(), true);
		softAssert.assertEquals(GC4.AssignGradeButton.isEnabled(), true);	
		
		System.out.println("All the emulation attributes are verified");
	}
	
	public void assignEditAttributesVerification() {
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.ProceedButton.isEnabled(), true);
		softAssert.assertEquals(GC4.initialStatus.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradingDueDate2.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isDisplayed(), true);
		softAssert.assertEquals(GC4.BestExam.isDisplayed(), true);
		softAssert.assertEquals(GC4.PublishLibrary.isDisplayed(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(GC4.NotesInputBox1.isEnabled(), true);
		softAssert.assertEquals(GC4.ExamPaperCheckbox.isEnabled(), false);
		softAssert.assertEquals(GC4.PublishCheckbox.isEnabled(), false);
		System.out.println("All attributes are verified");

		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseStatus1.isDisplayed(), true);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
		System.out.println("All the recent notes and course details attributes are verified");
	}
	
	public void proceedAttributeVerification() {
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);

		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(GC4.SubmitInitialGrade));
		softAssert.assertEquals(GC4.SubmitInitialGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		highLightElement(driver, proceedInstructorName);
		softAssert.assertEquals(proceedInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.ConformityMessage.isDisplayed(), true);
		System.out.println(GC4.ConformityMessage.getCssValue("color"));
		softAssert.assertEquals(GC4.BlueBox.isDisplayed(), true);
		System.out.println(GC4.BlueBox.getCssValue("color"));
	}
	
	public void AssignAllScore() throws InterruptedException {
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox1));
		GC4.RawScoreInputBox1.clear();
		GC4.RawScoreInputBox1.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox2));
		GC4.RawScoreInputBox2.clear();
		GC4.RawScoreInputBox2.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox3));
		GC4.RawScoreInputBox3.clear();
		GC4.RawScoreInputBox3.sendKeys("70");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox4));
		GC4.RawScoreInputBox4.clear();
		GC4.RawScoreInputBox4.sendKeys("80");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox5));
		GC4.RawScoreInputBox5.clear();
		GC4.RawScoreInputBox5.sendKeys("40");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox6));
		GC4.RawScoreInputBox6.clear();
		GC4.RawScoreInputBox6.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox7));
		GC4.RawScoreInputBox7.clear();
		GC4.RawScoreInputBox7.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox8));
		GC4.RawScoreInputBox8.clear();
		GC4.RawScoreInputBox8.sendKeys("70");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox9));
		GC4.RawScoreInputBox9.clear();
		GC4.RawScoreInputBox9.sendKeys("40");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox10));
		GC4.RawScoreInputBox10.clear();
		GC4.RawScoreInputBox10.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox11));
		GC4.RawScoreInputBox11.clear();
		GC4.RawScoreInputBox11.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox12));
		GC4.RawScoreInputBox12.clear();
		GC4.RawScoreInputBox12.sendKeys("70");

		System.out.println("Raw score entered for all the students");
	}

	public void EnterNotes() throws InterruptedException {
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox1));
		GC4.NotesInputBox1.clear();
		GC4.NotesInputBox1.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox2));
		GC4.NotesInputBox2.clear();
		GC4.NotesInputBox2.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox3));
		GC4.NotesInputBox3.clear();
		GC4.NotesInputBox3.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox4));
		GC4.NotesInputBox4.clear();
		GC4.NotesInputBox4.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox5));
		GC4.NotesInputBox5.clear();
		GC4.NotesInputBox5.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox6));
		GC4.NotesInputBox6.clear();
		GC4.NotesInputBox6.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox7));
		GC4.NotesInputBox7.clear();
		GC4.NotesInputBox7.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox8));
		GC4.NotesInputBox8.clear();
		GC4.NotesInputBox8.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox9));
		GC4.NotesInputBox9.clear();
		GC4.NotesInputBox9.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox10));
		GC4.NotesInputBox10.clear();
		GC4.NotesInputBox10.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox11));
		GC4.NotesInputBox11.clear();
		GC4.NotesInputBox11.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(GC4.NotesInputBox12));
		GC4.NotesInputBox12.clear();
		GC4.NotesInputBox12.sendKeys("Pass");

		System.out.println("Notes are provided for all the students");

		scrollToElement(GC4.ProccedToFinal);
		wait1.until(ExpectedConditions.visibilityOf(GC4.ProccedToFinal));

		GC4.ProccedToFinal.click();
		
		/*
		 * wait1.until(ExpectedConditions.visibilityOf(Yes)); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click()", Yes);
		 */
		// Yes.click();
	}
	
}

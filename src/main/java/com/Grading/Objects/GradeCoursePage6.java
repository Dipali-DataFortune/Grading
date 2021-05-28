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
public class GradeCoursePage6 extends TestBaseGrade {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "//span[contains(text(),'Adv Legal Research')]")
	WebElement CourseLink;

	@FindBy(xpath = "//h2[contains(text(),'Adv Legal Research')]")
	WebElement CourseName;

	@FindBy(xpath = "//span[contains(text(),'Martin Sampson')]")
	WebElement InstructorName;

	@FindBy(xpath = "//h3[contains(text(),' Martin Sampson ')]")
	WebElement InstructorName1;

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

	@FindBy(xpath = "(//div[@class='coursedetail'])[4]")
	WebElement StudentCount1;

	@FindBy(xpath = "//strong[contains(text(),'(CANCEL)')]")
	WebElement CancelLink;

	@FindBy(xpath = "//h1[contains(text(),'Final grades pending approval')]")
	WebElement status;

	@FindBy(xpath = "(//div[@class='coursedetail'])[5]")
	WebElement classMean;

	@FindBy(xpath = "//h1[contains(text(),'Midassessment Released')]")
	WebElement gradingStatus;

	@FindBy(xpath = "//p[contains(text(),'Midassessment Released')]")
	WebElement gradingStatus1;
	
	@FindBy(xpath = "//span[contains(text(),'Midassessment Released')]")
	WebElement gradingStatus2;

	@FindBy(xpath = "//strong[contains(text(),'(MIDASSESSMENT RELEASED)')]")
	WebElement gradingStatus3;

	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement studTab;

	@FindBy(xpath = "//input[@placeholder='Search by name, netID, or GUID...']")
	WebElement searchBoxStud;

	@FindBy(xpath = "//div[contains(text(),' Bloomer, Frederick ')]")
	WebElement emulStudName;
	
	@FindBy(xpath = "//em[@class='fas fa-user mr-3' and @title='Emulate']")
	WebElement emulStud;

	@FindBy(xpath = "(//td[@class='col-4 col-md-4'])[6]")
	WebElement midAssesmentScore;

	@FindBy(xpath = "//span[contains(text(),'Midassessment Released')]")
	// @FindBy(xpath = "(//div[@class='disabled'])[2]")
	WebElement courseListingPageStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Yes')]")
	WebElement BlindGradeNew;

	public GradeCoursePage6(WebDriver driver) {
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
		// softAssert.assertEquals(GC.BlindGradeNew.isDisplayed(), true);
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

	public void assignEditAttributesVerification() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.ProceedButton.isEnabled(), true);
		softAssert.assertEquals(GC4.initialStatus.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradingDueDate2.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		scrollToElement(GC4.IdName);
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

		scrollToElement(GC4.RecentNotes);
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		scrollToElement(GC4.CourseStatus1);
		softAssert.assertEquals(GC4.CourseStatus1.isDisplayed(), true);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
		System.out.println("All the recent notes and course details attributes are verified");
	}

	public void proceedAttributeVerification() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);

		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(GC4.SubmitInitialGrade));
		softAssert.assertEquals(GC4.SubmitInitialGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		highLightElement(driver, InstructorName1);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC4.ConformityMessage.isDisplayed(), true);
		System.out.println(GC4.ConformityMessage.getCssValue("color"));
		softAssert.assertEquals(GC4.BlueBox.isDisplayed(), true);
		System.out.println(GC4.BlueBox.getCssValue("color"));
	}

	public void AssignAllScore() throws InterruptedException {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
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

		System.out.println("Raw score entered for all the students");
	}

	public void EnterNotes() throws InterruptedException {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
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

		System.out.println("Notes are provided for all the students");

		scrollToElement(GC4.ProccedToFinal);
		wait1.until(ExpectedConditions.visibilityOf(GC4.ProccedToFinal));

		GC4.ProccedToFinal.click();

	}

	public void searchCourse() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		GC4.searchBox.sendKeys("Adv Legal Research");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void clickOnCourse() {
		// CourseLink.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseLink));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", CourseLink);
	}

	public void CheckConformityPageAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage5 GC = PageFactory.initElements(driver, GradeCoursePage5.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.checkConformity.isEnabled(), true);
		softAssert.assertEquals(status.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmulationLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmailLink.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		scrollToElement(GC4.IdName);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isEnabled(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(GC.RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(GC.letter1.isDisplayed(), true);
		softAssert.assertEquals(GC.notes1.isDisplayed(), true);
		System.out.println("All attributes are verified");
	}

	public void recentNoteAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 GC6 = PageFactory.initElements(driver, GradeCoursePage5.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.RecentNotes));
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		scrollToElement(GC4.CourseDetails);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GC5.ApprovalStatus.isDisplayed(), true);
		softAssert.assertEquals(GC6.spring2020.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true); //it should be no so,
		// have commented this for now
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
	}

	public void courseDetailAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 GC6 = PageFactory.initElements(driver, GradeCoursePage5.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.approveFGrades.isEnabled(), true);
		softAssert.assertEquals(GC5.rejectFGrades.isEnabled(), true);
		softAssert.assertEquals(GC5.deactivateButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC6.greenMessage.isDisplayed(), true);
		System.out.println(GC6.greenMessage.getText());
		System.out.println(GC6.greenMessage.getCssValue("color"));

		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);

		softAssert.assertEquals(GC5.finalApprovalStatus2.isDisplayed(), true);

		highLightElement(driver, GC5.semSpring);
		softAssert.assertEquals(GC5.semSpring.isDisplayed(), true);
		softAssert.assertEquals(GC5.DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert.assertEquals(GC5.BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to
																		// check
		softAssert.assertEquals(GC5.studRegister.isDisplayed(), true);
		// softAssert.assertEquals(StudentCount1.isDisplayed(), true);
		softAssert.assertEquals(classMean.isDisplayed(), true);
	}

	public void statusOnCourseListingPage() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(courseListingPageStatus));

		highLightElement(driver, courseListingPageStatus);
		// Thread.sleep(3000);
		softAssert.assertEquals(courseListingPageStatus.isDisplayed(), true);
		System.out.println(courseListingPageStatus.getText());
	}

	public void gradingCourseDetailAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 GC = PageFactory.initElements(driver, GradeCoursePage5.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.checkconformity1.isEnabled(), true);
		highLightElement(driver, gradingStatus);
		softAssert.assertEquals(gradingStatus.isDisplayed(), true);

		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmulationLink.isEnabled(), true);
		softAssert.assertEquals(GC4.EmailLink.isEnabled(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		scrollToElement(GC4.IdName);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isEnabled(), true);

		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(GC.RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(GC.letter1.isDisplayed(), true);
		softAssert.assertEquals(GC.notes1.isDisplayed(), true);

		// softAssert.assertEquals(Paper1.isDisplayed(), false);
		// softAssert.assertEquals(Publish1.isDisplayed(), false);

		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		scrollToElement(GC4.CourseDetails);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		highLightElement(driver, gradingStatus1);
		softAssert.assertEquals(gradingStatus1.isDisplayed(), true);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		softAssert.assertEquals(BlindGradeNew.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All course final approval attributes are verified");
	}

	public void checkAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 GC = PageFactory.initElements(driver, GradeCoursePage5.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.deactivateButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC.greenMessage.isDisplayed(), true);
		System.out.println(GC.greenMessage.getText());
		System.out.println(GC.greenMessage.getCssValue("color"));

		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(gradingStatus3.isDisplayed(), true);

		scrollToElement(GC5.semSpring);
		highLightElement(driver, GC5.semSpring);
		softAssert.assertEquals(GC5.semSpring.isDisplayed(), true);
		softAssert.assertEquals(GC5.DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert.assertEquals(GC5.BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to
																		// check
		softAssert.assertEquals(GC5.studRegister.isDisplayed(), true);
		//softAssert.assertEquals(StudentCount1.isDisplayed(), true);
		softAssert.assertEquals(classMean.isDisplayed(), true);

		System.out.println("All attributes are verified");
	}

	public void emulationAttributesVerificationAgain() {
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
		softAssert.assertEquals(gradingStatus2.isDisplayed(), true);
		softAssert.assertEquals(GC4.AssignGradeButton.isEnabled(), true);

		System.out.println("All the emulation attributes are verified");
	}

	public void viewGradesAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 GC = PageFactory.initElements(driver, GradeCoursePage5.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.checkconformity1.isEnabled(), true);
		softAssert.assertEquals(gradingStatus.isDisplayed(), true);

		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);

		scrollToElement(GC4.DueDate);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		// softAssert.assertEquals(copyPasteImport.isDisplayed(), false);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isDisplayed(), true);

		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(GC.RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(GC.letter1.isDisplayed(), true);
		softAssert.assertEquals(GC.notes1.isDisplayed(), true);
		// softAssert.assertEquals(Paper1.isDisplayed(), false);
		// softAssert.assertEquals(Publish1.isDisplayed(), false);

		scrollToElement(GC4.RecentNotes);
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		scrollToElement(gradingStatus1);
		softAssert.assertEquals(gradingStatus1.isDisplayed(), true);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All view grade attributes are verified");
	}

	public void checkConformityAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GradeCoursePage5 GC = PageFactory.initElements(driver, GradeCoursePage5.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC.greenMessage.isDisplayed(), true);
		System.out.println(GC.greenMessage.getText());
		System.out.println(GC.greenMessage.getCssValue("color"));

		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(gradingStatus3.isDisplayed(), true);

		highLightElement(driver, GC5.semSpring);
		softAssert.assertEquals(GC5.semSpring.isDisplayed(), true);
		softAssert.assertEquals(GC5.DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert.assertEquals(GC5.BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to
																		// check

		softAssert.assertEquals(GC5.studRegister.isDisplayed(), true);
		//softAssert.assertEquals(StudentCount1.isDisplayed(), true);
		softAssert.assertEquals(classMean.isDisplayed(), true);

		System.out.println("All attributes are verified");
	}

	public void clickOnStudentsTab() throws InterruptedException {
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(studTab));
		studTab.click();
		Thread.sleep(5000);
		wait1.until(ExpectedConditions.visibilityOf(searchBoxStud));
		searchBoxStud.sendKeys("Bloomer");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		wait1.until(ExpectedConditions.visibilityOf(emulStudName));
		emulStud.click();
		wait1.until(ExpectedConditions.visibilityOf(midAssesmentScore));
		scrollToElement(midAssesmentScore);
		softAssert.assertEquals(midAssesmentScore.isDisplayed(), true);
		System.out.println(
				"Raw score displayed for Adv Legal Research, CRN 38884 matches with the raw score submitted by the Instructor");

		scrollToElement(GC5.cancelEmulation);
		wait1.until(ExpectedConditions.visibilityOf(GC5.cancelEmulation));
		highLightElement(driver, GC5.cancelEmulation);
		// cancelEmulation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC5.cancelEmulation);
	}

	public void checkFinalStatus() throws InterruptedException {

		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);

		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 90);
		wait1.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		GC4.searchBox.sendKeys("Adv Legal Research");

		wait1.until(ExpectedConditions.visibilityOf(GC5.notActivatedStatus));
		
		softAssert.assertEquals(GC5.notActivatedStatus.isDisplayed(), true);
		System.out.println(GC5.notActivatedStatus.getText());
	}

}

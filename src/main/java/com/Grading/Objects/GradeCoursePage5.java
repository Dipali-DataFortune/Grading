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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCoursePage5 extends TestBaseGrade {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "//span[contains(text(),'Immigr Policy across Branches')]")
	WebElement CourseLink;

	@FindBy(xpath = "//span[contains(text(),'Roger Koch')]")
	WebElement InstructorName;

	@FindBy(xpath = "//h3[contains(text(),'Roger Koch')]")
	WebElement InstructorName1;

	@FindBy(xpath = "//a[contains(text(),' IMPORTANT! You are currently impersonating KOCH, ROGER. ')]")
	WebElement emulInstructorName;

	@FindBy(xpath = "//h3[contains(text(),' Roger Koch ')]")
	WebElement proceedInstructorName;

	@FindBy(xpath = "//span[contains(text(),'Immigr Policy across Branches (LAWJ-1519-5) 38897 ')]")
	WebElement emulCourseTitle;

	@FindBy(xpath = "//p[contains(text(),'(12) Students Enrolled')]")
	WebElement CourseTitle1;

	@FindBy(xpath = "//td[contains(text(),' Upperclass - UP10-29 Class ')]")
	WebElement ClassLevel1;

	@FindBy(xpath = "//td[contains(text(),' Yes ')]")
	WebElement BlindGrade1;

	@FindBy(xpath = "//span[contains(text(),'Initial Grading Phase')]")
	WebElement CurrentStatus1;

	@FindBy(xpath = "(//button[contains(text(),'Assign/Edit Grades')])[1]")
	WebElement AssignGradeButton;

	@FindBy(xpath = "//h2[contains(text(),'Immigr Policy across Branches (LAWJ-1519-5) 38897')]")
	WebElement CourseName;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement IdName1;
	
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement RawScoreInputBox1;
	
	//@FindBy(xpath = "(//span[contains(text(),'A+')])[1]")
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[2]")
	WebElement letter1;	
		
	@FindBy(xpath = "(//p[contains(text(),'Pass')])[1]")
	WebElement notes1;	
	
	@FindBy(xpath = "(//div[@class='col-xs-12 col-sm-12 col-md-12 coursedetail'])[3]")
	WebElement StudentCount;

	@FindBy(xpath = "//li[contains(text(),'Class mean cannot exceed 3.80')]")
	WebElement message;

	@FindBy(xpath = "//li[contains(text(),'Class mean cannot be less than 3.57')]")
	WebElement message1;

	@FindBy(xpath = "//li[contains(text(),'No upper-level class, regardless of size or type, may have more than 2 A+ grades awarded.')]")
	WebElement message2;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement greenMessage;

	@FindBy(xpath = "//th[contains(text(),'# Enrolled Students')]")
	WebElement enrollStud;

	@FindBy(xpath = "//th[contains(text(),'Grade')]")
	WebElement grade;

	@FindBy(xpath = "(//th[contains(text(),'Count')])[1]")
	WebElement count;

	@FindBy(xpath = "(//th[contains(text(),'Count')])[2]")
	WebElement recDistCount;

	@FindBy(xpath = "//th[contains(text(),'Actual Distribution')]")
	WebElement actualDist;

	@FindBy(xpath = "//th[contains(text(),'Mandatory Ceiling (Max Mean Class GPA)')]")
	WebElement mandCeiling;

	@FindBy(xpath = "//th[contains(text(),'Actual Mean (Class GPA)')]")
	WebElement actualMean;

	@FindBy(xpath = "(//div[@class='alert alert-info distributionpercentage'])[1]")
	WebElement enrollStud1;

	@FindBy(xpath = "(//div[@class='alert alert-info distributionpercentage'])[3]")
	WebElement mandCeiling1;

	@FindBy(xpath = "(//div[@class='alert alert-info distributionpercentage'])[4]")
	WebElement actualMean1;

	// @FindBy(xpath="//strong[contains(text(),'A+')]")
	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[2]")
	WebElement gradeAPlus;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[3]")
	WebElement count1;

	@FindBy(xpath = "	(//td[@class='enddistributiongroup'])[4]")
	WebElement recDistCount1;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[5]")
	WebElement actualDist1;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[8]")
	WebElement gradeA;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[9]")
	WebElement count2;

	@FindBy(xpath = "	(//td[@class='enddistributiongroup'])[10]")
	WebElement recDistCount2;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[11]")
	WebElement actualDist2;

	@FindBy(xpath = "//strong[contains(text(),'A-')]")
	WebElement gradeAMinus;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[12]")
	WebElement count3;

	@FindBy(xpath = "	(//td[@class='enddistributiongroup'])[13]")
	WebElement recDistCount3;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[14]")
	WebElement actualDist3;

	@FindBy(xpath = "//strong[contains(text(),'B+')]")
	WebElement gradeBPlus;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[15]")
	WebElement count4;

	@FindBy(xpath = "	(//td[@class='enddistributiongroup'])[16]")
	WebElement recDistCount4;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[17]")
	WebElement actualDist4;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[18]")
	WebElement gradeB;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[19]")
	WebElement count5;

	@FindBy(xpath = "	(//td[@class='enddistributiongroup'])[20]")
	WebElement recDistCount5;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[21]")
	WebElement actualDist5;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[22]")
	WebElement gradeBMinusToF;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[23]")
	WebElement count6;

	@FindBy(xpath = "	(//td[@class='enddistributiongroup'])[24]")
	WebElement recDistCount6;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[25]")
	WebElement actualDist6;

	@FindBy(xpath = "//strong[contains(text(),'Course Details')]")
	WebElement courseDetail;

	@FindBy(xpath = "//strong[contains(text(),'(FINAL GRADING PHASE)')]")
	WebElement finalPhase;

	@FindBy(xpath = "(//div[@class='coursedetail'])[1]")
	WebElement courseDetail1;

	@FindBy(xpath = "(//div[@class='coursedetail'])[2]")
	WebElement courseDetail2;

	@FindBy(xpath = "(//div[@class='coursedetail'])[3]")
	WebElement courseDetail3;

	@FindBy(xpath = "(//div[@class='coursedetail'])[4]")
	WebElement courseDetail4;

	@FindBy(xpath = "(//div[@class='coursedetail'])[5]")
	WebElement courseDetail5;

	@FindBy(xpath = "(//div[@class='coursedetail'])[6]")
	WebElement courseDetail6;
	
	@FindBy(xpath = "(//div[@class='col-xs-12 col-sm-12 col-md-12 coursedetail'])[1]")
	WebElement spring2020;

	@FindBy(xpath = "//strong[contains(text(),'(FINAL GRADES - PENDING BANNER UPLOAD)')]")
	WebElement StatusBannerUpload;
	
	
	public GradeCoursePage5(WebDriver driver) {
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

		/*
		 * scrollToElement(customTag);
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(customTag)); customTag.click();
		 * wait.until(ExpectedConditions.visibilityOf(automatedTag));
		 * automatedTag.click();
		 */

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Cross.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.Cross);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		GC4.searchBox.sendKeys(crn);
		Thread.sleep(5000);

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
		 * wait1.until(ExpectedConditions.visibilityOf(CourseStatus));
		 */

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

	/*
	 * public void NavigateToDashboardAndActivateCourse(String courseName, String
	 * crn) throws InterruptedException { GradeCoursePage4 GC4 =
	 * PageFactory.initElements(driver, GradeCoursePage4.class); WebDriverWait wait
	 * = new WebDriverWait(driver, 60);
	 * wait.until(ExpectedConditions.visibilityOf(GC4.spring2020));
	 * GC4.spring2020.click();
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(GC4.GradingSchedule));
	 * GC4.GradingSchedule.click();
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(GC4.CourseTab));
	 * staleElementClick(6, GC4.CourseTab, 60); // CourseTab.click();
	 * 
	 * JavascriptExecutor js= (JavascriptExecutor)driver;
	 * js.executeAsyncScript("arguments[0].click()", CourseTab);
	 * 
	 * 
	 * 
	 * scrollToElement(customTag);
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(customTag)); customTag.click();
	 * wait.until(ExpectedConditions.visibilityOf(automatedTag));
	 * automatedTag.click();
	 * 
	 * 
	 * //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * wait.until(ExpectedConditions.visibilityOf(GC4.COURSE));
	 * //softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(GC4.searchBox));
	 * 
	 * highLightElement(driver, GC4.searchBox); GC4.searchBox.sendKeys(courseName);
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(GC4.CourseCheckBox));
	 * 
	 * highLightElement(driver, GC4.CourseCheckBox);
	 * driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
	 * Thread.sleep(5000); GC4.CourseCheckBox.click();
	 * 
	 * 
	 * JavascriptExecutor js= (JavascriptExecutor)driver;
	 * js.executeAsyncScript("arguments[0].click()", CourseCheckBox);
	 * 
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(GC4.ActivateButton)); //
	 * softAssert.assertEquals(ActivateButton.isEnabled(), true);
	 * highLightElement(driver, GC4.ActivateButton); GC4.ActivateButton.click();
	 * //Thread.sleep(5000);
	 * 
	 * 
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * //Cross.click(); JavascriptExecutor js= (JavascriptExecutor)driver;
	 * js.executeScript("arguments[0].click()", GC4.Cross);
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * GC4.searchBox.sendKeys(crn); Thread.sleep(5000);
	 * 
	 * //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * 
	 * 
	 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
	 * wait1.until(ExpectedConditions.visibilityOf(CourseStatus));
	 * 
	 * 
	 * softAssert.assertEquals(GC4.CourseStatus.isDisplayed(), true); String
	 * courseStatusNew = GC4.CourseStatus.getText();
	 * System.out.println(courseStatusNew); Assert.assertEquals(courseStatusNew,
	 * "Initial Grading Phase"); softAssert.assertEquals(CourseLink.isEnabled(),
	 * true);
	 * 
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //
	 * CourseLink.click();
	 * //wait.until(ExpectedConditions.visibilityOf(CourseLink));
	 * //JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("arguments[0].click()", CourseLink); }
	 */

	public void courseAttributesVerification() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
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
		// softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All course attributes are verified");
	}

	public void emulationAttributesVerification() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
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
		// softAssert.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert.assertEquals(CurrentStatus1.isDisplayed(), true);
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
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
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

	public void assignEditAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.checkConformity.isEnabled(), true);
		softAssert.assertEquals(GC4.finalPhase.isDisplayed(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradingDueDate2.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert.assertEquals(GC4.copyPasteImport.isEnabled(), true);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isDisplayed(), true);
		softAssert.assertEquals(GC4.BestExam.isDisplayed(), true);
		softAssert.assertEquals(GC4.PublishLibrary.isDisplayed(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		/*
		 * softAssert.assertEquals(GC4.RawScoreInputBox1.isEnabled(), true);
		 * softAssert.assertEquals(GC4.NotesInputBox1.isEnabled(), true);
		 * softAssert.assertEquals(GC4.ExamPaperCheckbox.isEnabled(), false);
		 * softAssert.assertEquals(GC4.PublishCheckbox.isEnabled(), false);
		 */
		System.out.println("All attributes are verified");

		/*
		 * softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		 * softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		 * softAssert.assertEquals(GC4.CourseStatus1.isDisplayed(), true);
		 * softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true); //
		 * softAssert.assertEquals(Blind.isDisplayed(), true);
		 * softAssert.assertEquals(StudentCount.isDisplayed(), true); System.out.
		 * println("All the recent notes and course details attributes are verified");
		 */
	}

	public void finalGradeAttributes1() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOf(GC4.RawScoreInputBox1final));
		softAssert.assertEquals(GC4.RawScoreInputBox1final.isDisplayed(), true);
		softAssert.assertEquals(GC4.letterGradeInputfinal.isEnabled(), true);
		softAssert.assertEquals(GC4.notesfinal.isDisplayed(), true);
		softAssert.assertEquals(GC4.bestExamfinal.isEnabled(), true);
		softAssert.assertEquals(GC4.publishfinal.isEnabled(), false);
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.RecentNotesDateFinalPhase.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeStatusFinal.isDisplayed(), true);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
	}

	public void checkConformityFinalGradeAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.CancelLink));
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.submitFinalGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC4.ConformityMessage1.isDisplayed(), true);
		System.out.println(GC4.ConformityMessage1.getText());
		System.out.println(GC4.ConformityMessage1.getCssValue("color"));
		System.out.println("Red message verified");
	}

	public void selectFinalGradeAForAll() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		Select sel1 = new Select(GC4.letterGradeFinal1);
		// sel1.selectByVisibleText("A");
		sel1.selectByIndex(2);

		Select sel2 = new Select(GC4.letterGradeFinal2);
		// sel2.selectByVisibleText("A");
		sel2.selectByIndex(2);

		Select sel3 = new Select(GC4.letterGradeFinal3);
		// sel3.selectByVisibleText("A");
		sel3.selectByIndex(2);

		Select sel4 = new Select(GC4.letterGradeFinal4);
		// sel4.selectByVisibleText("A");
		sel4.selectByIndex(2);

		Select sel5 = new Select(GC4.letterGradeFinal5);
		// sel5.selectByVisibleText("A");
		sel5.selectByIndex(2);

		Select sel6 = new Select(GC4.letterGradeFinal6);
		// sel6.selectByVisibleText("A");
		sel6.selectByIndex(2);

		Select sel7 = new Select(GC4.letterGradeFinal7);
		// sel7.selectByVisibleText("A");
		sel7.selectByIndex(2);

		Select sel8 = new Select(GC4.letterGradeFinal8);
		// sel8.selectByVisibleText("A");
		sel8.selectByIndex(2);

		Select sel9 = new Select(GC4.letterGradeFinal9);
		// sel9.selectByVisibleText("A");
		sel9.selectByIndex(2);

		Select sel10 = new Select(GC4.letterGradeFinal10);
		// sel10.selectByVisibleText("A");
		sel10.selectByIndex(2);

		Select sel11 = new Select(GC4.letterGradeFinal11);
		// sel11.selectByVisibleText("A");
		sel11.selectByIndex(2);

		Select sel12 = new Select(GC4.letterGradeFinal12);
		// sel12.selectByVisibleText("A");
		sel12.selectByIndex(2);

		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}

	public void CheckConformityPageAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.submitFinalGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC4.ConformityMessage1.isDisplayed(), true);
		System.out.println(GC4.ConformityMessage1.getText());
		System.out.println(GC4.ConformityMessage1.getCssValue("color"));
		softAssert.assertEquals(message.isDisplayed(), true);
		System.out.println("Red message verified");
		softAssert.assertEquals(GC4.yellowMessage.isDisplayed(), true);
		System.out.println(GC4.yellowMessage.getCssValue("color"));
	}

	public void selectFinalGradesDAndF() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		Select sel1 = new Select(GC4.letterGradeFinal1);
		// sel1.selectByVisibleText("D");
		sel1.selectByIndex(10);

		Select sel2 = new Select(GC4.letterGradeFinal2);
		// sel2.selectByVisibleText("F");
		sel2.selectByIndex(11);

		Select sel3 = new Select(GC4.letterGradeFinal3);
		// sel3.selectByVisibleText("D");
		sel3.selectByIndex(10);

		Select sel4 = new Select(GC4.letterGradeFinal4);
		// sel4.selectByVisibleText("F");
		sel4.selectByIndex(11);

		Select sel5 = new Select(GC4.letterGradeFinal5);
		// sel5.selectByVisibleText("D");
		sel5.selectByIndex(10);

		Select sel6 = new Select(GC4.letterGradeFinal6);
		// sel6.selectByVisibleText("F");
		sel6.selectByIndex(11);

		Select sel7 = new Select(GC4.letterGradeFinal7);
		// sel7.selectByVisibleText("D");
		sel7.selectByIndex(10);

		Select sel8 = new Select(GC4.letterGradeFinal8);
		// sel8.selectByVisibleText("F");
		sel8.selectByIndex(11);

		Select sel9 = new Select(GC4.letterGradeFinal9);
		// sel9.selectByVisibleText("D");
		sel9.selectByIndex(10);

		Select sel10 = new Select(GC4.letterGradeFinal10);
		// sel10.selectByVisibleText("F");
		sel10.selectByIndex(11);

		Select sel11 = new Select(GC4.letterGradeFinal11);
		// sel11.selectByVisibleText("D");
		sel11.selectByIndex(10);

		Select sel12 = new Select(GC4.letterGradeFinal12);
		// sel12.selectByVisibleText("F");
		sel12.selectByIndex(11);

		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}

	public void CheckConformityPageAttributes1() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.submitFinalGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC4.ConformityMessage1.isDisplayed(), true);
		System.out.println(GC4.ConformityMessage1.getText());
		System.out.println(GC4.ConformityMessage1.getCssValue("color"));
		softAssert.assertEquals(message1.isDisplayed(), true);
		System.out.println("Red message verified");
		softAssert.assertEquals(GC4.yellowMessage.isDisplayed(), true);
		System.out.println(GC4.yellowMessage.getCssValue("color"));
	}

	public void selectFinalGradesTooManyA() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		Select sel1 = new Select(GC4.letterGradeFinal1);
		// sel1.selectByVisibleText("A+");
		sel1.selectByIndex(1);

		Select sel2 = new Select(GC4.letterGradeFinal2);
		// sel2.selectByVisibleText("A+");
		sel2.selectByIndex(1);

		Select sel3 = new Select(GC4.letterGradeFinal3);
		// sel3.selectByVisibleText("A");
		sel3.selectByIndex(1);

		Select sel4 = new Select(GC4.letterGradeFinal4);
		// sel4.selectByVisibleText("A");
		sel4.selectByIndex(2);

		Select sel5 = new Select(GC4.letterGradeFinal5);
		// sel5.selectByVisibleText("A");
		sel5.selectByIndex(2);

		Select sel6 = new Select(GC4.letterGradeFinal6);
		// sel6.selectByVisibleText("A");
		sel6.selectByIndex(2);

		Select sel7 = new Select(GC4.letterGradeFinal7);
		// sel7.selectByVisibleText("A-");
		sel7.selectByIndex(4);

		Select sel8 = new Select(GC4.letterGradeFinal8);
		// sel8.selectByVisibleText("A-");
		sel8.selectByIndex(4);

		Select sel9 = new Select(GC4.letterGradeFinal9);
		// sel9.selectByVisibleText("A-");
		sel9.selectByIndex(4);

		Select sel10 = new Select(GC4.letterGradeFinal10);
		// sel10.selectByVisibleText("A-");
		sel10.selectByIndex(5);

		Select sel11 = new Select(GC4.letterGradeFinal11);
		// sel11.selectByVisibleText("A-");
		sel11.selectByIndex(5);

		Select sel12 = new Select(GC4.letterGradeFinal12);
		// sel12.selectByVisibleText("B+");
		sel12.selectByIndex(5);

		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}

	public void CheckConformityPageAttributes2() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.submitFinalGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC4.ConformityMessage1.isDisplayed(), true);
		System.out.println(GC4.ConformityMessage1.getText());
		System.out.println(GC4.ConformityMessage1.getCssValue("color"));
		softAssert.assertEquals(message2.isDisplayed(), true);
		System.out.println("Red message verified");
		softAssert.assertEquals(GC4.yellowMessage.isDisplayed(), true);
		System.out.println(GC4.yellowMessage.getCssValue("color"));
	}

	public void selectFinalGradesMeetConformity() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		Select sel1 = new Select(GC4.letterGradeFinal1);
		// sel1.selectByVisibleText("A+");
		sel1.selectByIndex(1);

		Select sel2 = new Select(GC4.letterGradeFinal2);
		// sel2.selectByVisibleText("A+");
		sel2.selectByIndex(1);

		Select sel3 = new Select(GC4.letterGradeFinal3);
		// sel3.selectByVisibleText("A");
		sel3.selectByIndex(2);

		Select sel4 = new Select(GC4.letterGradeFinal4);
		// sel4.selectByVisibleText("A");
		sel4.selectByIndex(2);

		Select sel5 = new Select(GC4.letterGradeFinal5);
		// sel5.selectByVisibleText("A");
		sel5.selectByIndex(2);

		Select sel6 = new Select(GC4.letterGradeFinal6);
		// sel6.selectByVisibleText("A");
		sel6.selectByIndex(3);

		Select sel7 = new Select(GC4.letterGradeFinal7);
		// sel7.selectByVisibleText("A-");
		sel7.selectByIndex(4);

		Select sel8 = new Select(GC4.letterGradeFinal8);
		// sel8.selectByVisibleText("A-");
		sel8.selectByIndex(4);

		Select sel9 = new Select(GC4.letterGradeFinal9);
		// sel9.selectByVisibleText("A-");
		sel9.selectByIndex(4);

		Select sel10 = new Select(GC4.letterGradeFinal10);
		// sel10.selectByVisibleText("A-");
		sel10.selectByIndex(5);

		Select sel11 = new Select(GC4.letterGradeFinal11);
		// sel11.selectByVisibleText("A-");
		sel11.selectByIndex(5);

		Select sel12 = new Select(GC4.letterGradeFinal12);
		// sel12.selectByVisibleText("B+");
		sel12.selectByIndex(5);

		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}

	public void CheckConformityPageAttributes3() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		// softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		// softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.submitFinalGrade.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(greenMessage.isDisplayed(), true);
		System.out.println(greenMessage.getText());
		System.out.println(greenMessage.getCssValue("color"));
		System.out.println("Green message verified");
	}

	public void tableHeaderAndDataRows() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(enrollStud));

		softAssert.assertEquals(enrollStud.isDisplayed(), true);
		softAssert.assertEquals(grade.isDisplayed(), true);
		softAssert.assertEquals(count.isDisplayed(), true);
		softAssert.assertEquals(recDistCount.isDisplayed(), true);
		softAssert.assertEquals(actualDist.isDisplayed(), true);
		softAssert.assertEquals(mandCeiling.isDisplayed(), true);
		softAssert.assertEquals(actualMean.isDisplayed(), true);
		softAssert.assertEquals(enrollStud1.isDisplayed(), true);
		softAssert.assertEquals(mandCeiling1.isDisplayed(), true);
		softAssert.assertEquals(actualMean1.isDisplayed(), true);
		softAssert.assertEquals(gradeAPlus.isDisplayed(), true);
		softAssert.assertEquals(count1.isDisplayed(), true);
		softAssert.assertEquals(recDistCount1.isDisplayed(), true);
		softAssert.assertEquals(actualDist1.isDisplayed(), true);
		softAssert.assertEquals(gradeA.isDisplayed(), true);
		softAssert.assertEquals(count2.isDisplayed(), true);
		softAssert.assertEquals(recDistCount2.isDisplayed(), true);
		softAssert.assertEquals(actualDist2.isDisplayed(), true);
		softAssert.assertEquals(gradeAMinus.isDisplayed(), true);
		softAssert.assertEquals(count3.isDisplayed(), true);
		softAssert.assertEquals(recDistCount3.isDisplayed(), true);
		softAssert.assertEquals(actualDist3.isDisplayed(), true);
		softAssert.assertEquals(gradeBPlus.isDisplayed(), true);
		softAssert.assertEquals(count4.isDisplayed(), true);
		softAssert.assertEquals(recDistCount4.isDisplayed(), true);
		softAssert.assertEquals(actualDist4.isDisplayed(), true);
		softAssert.assertEquals(gradeB.isDisplayed(), true);
		softAssert.assertEquals(count5.isDisplayed(), true);
		softAssert.assertEquals(recDistCount5.isDisplayed(), true);
		softAssert.assertEquals(actualDist5.isDisplayed(), true);
		softAssert.assertEquals(gradeBMinusToF.isDisplayed(), true);
		softAssert.assertEquals(count6.isDisplayed(), true);
		softAssert.assertEquals(recDistCount6.isDisplayed(), true);
		softAssert.assertEquals(actualDist6.isDisplayed(), true);

		System.out.println("All the table attributes are verified");
	}

	public void recentNoteAttributes() {
		softAssert.assertEquals(courseDetail.isDisplayed(), true);
		softAssert.assertEquals(courseDetail1.isDisplayed(), true);
		softAssert.assertEquals(courseDetail2.isDisplayed(), true);
		softAssert.assertEquals(courseDetail3.isDisplayed(), true);
		softAssert.assertEquals(courseDetail4.isDisplayed(), true);
		softAssert.assertEquals(courseDetail5.isDisplayed(), true);
		softAssert.assertEquals(courseDetail6.isDisplayed(), true);

		System.out.println("Course detail attributes are verified");
	}

	public void submitFinalGrades() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.submitFinalGrade));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.submitFinalGrade);
	}

	public void clickOnCancelEmulation() {
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC5.cancelEmulation));

		highLightElement(driver, GC5.cancelEmulation);
		// cancelEmulation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC5.cancelEmulation);
	}

	public void searchCourse() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.COURSE));
//		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		GC4.searchBox.sendKeys("Immigr Policy across Branches");
	}

	public void clickOnCourse() {
		//GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		// clickOnCourse();
		// CourseLink.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", CourseLink);
	}

	public void CheckConformityPageAttributes4() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.checkConformity.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmulationLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmailLink.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isEnabled(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(letter1.isDisplayed(), true);
		softAssert.assertEquals(notes1.isDisplayed(), true);
		System.out.println("All attributes are verified");
	}
	
	public void recentNoteAttributes1()
	{
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.RecentNotes));
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GC5.ApprovalStatus.isDisplayed(), true);
		softAssert.assertEquals(spring2020.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true); //it should be no so,
		// have commented this for now
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

	}
	
	public void courseDetailAttributes()
	{
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.approveFGrades.isEnabled(), true);
		softAssert.assertEquals(GC5.rejectFGrades.isEnabled(), true);
		softAssert.assertEquals(GC5.deactivateButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(greenMessage.isDisplayed(), true);
		System.out.println(greenMessage.getText());
		System.out.println(greenMessage.getCssValue("color"));
	}
	
	public void clickOnYes()
	{
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		  WebDriverWait wait2 = new WebDriverWait(driver, 60);
		  wait2.until(ExpectedConditions.visibilityOf(GC4.Yes));
		 
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js1.executeScript("arguments[0].click()", GC4.Yes);		 
	}
	
	public void gradingCourseDetailAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.checkconformity1.isEnabled(), true);
		highLightElement(driver, GC5.StatusBannerUpload3);
		softAssert.assertEquals(GC5.StatusBannerUpload3.isDisplayed(), true);

		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmulationLink.isEnabled(), true);
		softAssert.assertEquals(GC4.EmailLink.isEnabled(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isEnabled(), true);
		
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(letter1.isDisplayed(), true);
		softAssert.assertEquals(notes1.isDisplayed(), true);
		
		// softAssert.assertEquals(Paper1.isDisplayed(), false);
		// softAssert.assertEquals(Publish1.isDisplayed(), false);

		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		highLightElement(driver, GC5.StatusBannerUpload1);
		softAssert.assertEquals(GC5.StatusBannerUpload1.isDisplayed(), true);
		softAssert.assertEquals(spring2020.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true); 
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All course final approval attributes are verified");
	}
	
	public void checkAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.deactivateButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(greenMessage.isDisplayed(), true);
		System.out.println(greenMessage.getText());
		System.out.println(greenMessage.getCssValue("color"));
		System.out.println("All attributes are verified");
	}
	
	public void bannerUploadAttribute() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		//softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.CourseDetails));
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GC5.StatusBannerUpload2.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), false);
		scrollToElement(GC5.semSpring);
		softAssert.assertEquals(GC5.semSpring.isDisplayed(), true);
		softAssert.assertEquals(GC5.DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert.assertEquals(GC5.BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to
																		// check
		softAssert.assertEquals(GC5.studRegister.isDisplayed(), true);
		softAssert.assertEquals(GC5.studCountMean.isDisplayed(), true);
		softAssert.assertEquals(GC5.classMean.isDisplayed(), true);

		System.out.println("All final grade banner attributes are verified");
	}
	
	public void checkEmulationAttributes() {
		 
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
	
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.CancelLink));
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(emulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.YourCourseLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.Title.isDisplayed(), true);
		softAssert.assertEquals(GC4.ClassLevel.isDisplayed(), true);
		softAssert.assertEquals(GC4.BlindGrade.isDisplayed(), true);
		softAssert.assertEquals(GC4.CurrentStatus.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradingDueDate.isDisplayed(), true);

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
		 * wait1.until(ExpectedConditions.visibilityOf(emulCourseTitle));
		 */
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		softAssert.assertEquals(emulCourseTitle.isDisplayed(), true);
		softAssert.assertEquals(CourseTitle1.isDisplayed(), true);
		softAssert.assertEquals(ClassLevel1.isDisplayed(), true);
		softAssert.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert.assertEquals(GC5.StatusBannerUpload.isDisplayed(), true);
		softAssert.assertEquals(GC5.ViewGradeButton.isEnabled(), true);

		System.out.println("Emulation attributes are verified");
	}
	
	public void viewGradesAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC5.checkconformity1.isEnabled(), true);
		softAssert.assertEquals(GC5.StatusBannerUpload3.isDisplayed(), true);

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
		softAssert.assertEquals(RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(letter1.isDisplayed(), true);
		softAssert.assertEquals(notes1.isDisplayed(), true);

		// softAssert.assertEquals(Paper1.isDisplayed(), false);
		// softAssert.assertEquals(Publish1.isDisplayed(), false);

		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GC5.StatusBannerUpload1.isDisplayed(), true);
		softAssert.assertEquals(spring2020.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All view grade attributes are verified");
	}
	
	public void checkConformityAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName1.isDisplayed(), true);
		softAssert.assertEquals(GC5.CourseConformity.isDisplayed(), true);
		softAssert.assertEquals(GC5.conformityReportMessage.isDisplayed(), true);
		System.out.println(GC5.conformityReportMessage.getCssValue("color"));

		//softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(StatusBannerUpload.isDisplayed(), true);

		highLightElement(driver, GC5.semSpring);
		softAssert.assertEquals(GC5.semSpring.isDisplayed(), true);
		softAssert.assertEquals(GC5.DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert.assertEquals(GC5.BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to check
																		
		softAssert.assertEquals(GC5.studRegister.isDisplayed(), true);
		softAssert.assertEquals(GC5.studCountMean.isDisplayed(), true);
		softAssert.assertEquals(GC5.classMean.isDisplayed(), true);

		System.out.println("All attributes are verified");
	}
	
	public void checkFinalStatus() {

		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GradeCoursePage4 GC5 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 90);
		wait1.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		GC4.searchBox.sendKeys("Intro to Fed Income Tax");

		wait1.until(ExpectedConditions.visibilityOf(GC5.notActivatedStatus));
		softAssert.assertEquals(GC5.notActivatedStatus.isDisplayed(), true);
		System.out.println(GC5.notActivatedStatus.getText());
	}

}

/**
 * 
 */
package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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
public class GradeCoursePage4A extends TestBaseGrade {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	SoftAssert softAssert1 = new SoftAssert();

	@FindBy(xpath = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;

	@FindBy(xpath = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;

	@FindBy(xpath = "//a[contains(text(),'COURSES')]")
	WebElement CourseTab;

	@FindBy(xpath = "(//em[@class='fas fa-plus'])[7]")
	WebElement Customs;

	@FindBy(xpath = "//div[contains(text(),' AS DEMO ')]")
	WebElement DemoAs;

	@FindBy(xpath = "//input[@id='search']")
	// @FindBy(xpath="//input[@class='form-control']")
	WebElement searchBox;

	// @FindBy(xpath="//input[@id='check_tag_0']") WebElement CourseCheckBox;
	// @FindBy(xpath="//input[@id='check_tag_0' and @type='checkbox']")
	// @FindBy(xpath="//input[@id='check_tag_0']")
	@FindBy(xpath = "(//div[@class='checkbox'])[4]")
	// @FindBy(xpath = "//input[@id='checkbox_all']")
	WebElement CourseCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActivateButton;

	@FindBy(xpath = "//span[contains(text(),'Initial Grading Phase')]")
	WebElement CourseStatus;

	@FindBy(xpath = "//p[contains(text(),'Initial Grading Phase')]")
	WebElement CourseStatus1;

	@FindBy(xpath = "//span[contains(text(),'Intro to Fed Income Tax')]")
	WebElement CourseLink;

	@FindBy(xpath = "//div[contains(text(),'Courses')]")
	WebElement COURSE;

	@FindBy(xpath = "//div[contains(text(),'Course # / CRN')]")
	WebElement CRNLINK;

	@FindBy(xpath = "//div[contains(text(),'Grading Status')]")
	WebElement GRADESTETUS;

	@FindBy(xpath = "//div[contains(text(),'Exam Type')]")
	WebElement EXAMTYPE;

	@FindBy(xpath = "//div[contains(text(),'Due Date')]")
	WebElement DUEDATE;

	@FindBy(xpath = "//div[contains(text(),'Extension')]")
	WebElement EXTENTION;

	@FindBy(xpath = "//div[contains(text(),'1st Year Course')]")
	WebElement YEARCOURSE;

	@FindBy(xpath = "//div[contains(text(),'Blind Graded?')]")
	WebElement BLINDGRADE;

	@FindBy(xpath = "//input[@id=\"search\"]")
	WebElement Search;

	@FindBy(xpath = "//em[@class=\"fa fa-times clear_icon\"]")
	WebElement Cross;

	@FindBy(xpath = "//span[contains(text(),'Proceed to Final Grading')]")
	WebElement ProceedButton;

	@FindBy(xpath = "//a[contains(text(),'Back')]")
	WebElement BackButton;

	@FindBy(xpath = "//h2[contains(text(),'Intro to Fed Income Tax (LAWD-3012-10) 35238')]")
	WebElement CourseName;

	@FindBy(xpath = "//span[contains(text(),'Ashley Charles')]")
	WebElement InstructorName;

	@FindBy(xpath = "//em[@title='Emulate']")
	WebElement EmulationLink;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement EmulationLink1;

	@FindBy(xpath = "//button[@class='btn btn-primary ml-1']")
	WebElement EmailLink;

	@FindBy(xpath = "//p[@class='float-right']")
	WebElement DueDate;

	// @FindBy(xpath="//a[@id='ngb-tab-0']")
	@FindBy(xpath = "//a[contains(text(),' Grade')]")
	WebElement GradeTab;

	// @FindBy(xpath="//a[@id='ngb-tab-1']")
	@FindBy(xpath = "//a[contains(text(),' History')]")
	WebElement HistoryTab;

	@FindBy(xpath = "//th[contains(text(),'ID / Name')]")
	WebElement IdName;

	@FindBy(xpath = "//th[contains(text(),'Raw Score')]")
	WebElement RawScore;

	@FindBy(xpath = "//span[contains(text(),'Letter Grade')]")
	WebElement Letter1;

	@FindBy(xpath = "//th[contains(text(),'Notes')]")
	WebElement Notes;

	@FindBy(xpath = "//th[contains(text(),'Best Exam/Paper')]")
	WebElement Paper;

	@FindBy(xpath = "//th[contains(text(),'Publish to Library')]")
	WebElement Publish;

	@FindBy(xpath = "(//strong[contains(text(),'NOTSET-653235')])[1]")
	WebElement IdName1;

	@FindBy(xpath = "(//input[@class='btn-block' and @type='checkbox'])[1]")
	WebElement Paper1;

	@FindBy(xpath = "(//input[@class='btn-block' and @type='checkbox'])[2]")
	WebElement Publish1;

	@FindBy(xpath = "//a[contains(text(),'Grading Rules')]")
	WebElement GradingRule;

	@FindBy(xpath = "//strong[contains(text(),'(CANCEL)')]")
	WebElement CancelLink;

	@FindBy(xpath = "//a[contains(text(),'CHARLES, ASHLEY. ')]")
	WebElement conformEmulInstructorName;

	@FindBy(xpath = "//div[contains(text(),'YOUR COURSES')]")
	WebElement YourCourseLink;

	@FindBy(xpath = "//th[contains(text(),'Title')]")
	WebElement Title;

	@FindBy(xpath = "//th[contains(text(),'Class Level / Distribution Type')]")
	WebElement ClassLevel;

	@FindBy(xpath = "//th[contains(text(),'Blind Graded?')]")
	WebElement BlindGrade;

	@FindBy(xpath = "//th[contains(text(),'Current Status')]")
	WebElement CurrentStatus;

	// @FindBy(xpath="//th[contains(text(),'Grading Due Date')]")
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[3]")
	WebElement GradingDueDate;

	@FindBy(xpath = "//h2[contains(text(),'Intro to Fed Income Tax (LAWD-3012-10) 35238')]")
	WebElement CourseTitle;

	@FindBy(xpath = "//span[contains(text(),'Intro to Fed Income Tax (LAWD-3012-10) 35238')]")
	WebElement emulCourseTitle;

	@FindBy(xpath = "//p[contains(text(),'(20) Students Enrolled')]")
	WebElement CourseTitle1;

	@FindBy(xpath = "//td[contains(text(),' First Year - 1L<90 Class (Required Course) ')]")
	WebElement ClassLevel1;

	@FindBy(xpath = "//td[contains(text(),' No ')]")
	WebElement BlindGrade1;

	@FindBy(xpath = "//span[contains(text(),'Initial Grading Phase')]")
	WebElement CurrentStatus1;

	@FindBy(xpath = "//p[contains(text(),'Initial Grading Phase')]")
	WebElement InitialStatus;

	// @FindBy(xpath="//td[contains(text(),'05/11/2021 09:24 AM')]")
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[3]")
	WebElement GradingDueDate1;

	// @FindBy(xpath="//strong[contains(text(),'11 May 2021')]")
	@FindBy(xpath = "//p[@class='float-right']")
	// @FindBy(xpath="//strong[contains(text(),'09 May 2021')]")
	WebElement GradingDueDate2;

	// @FindBy(xpath="(//button[contains(text(),'Assign/Edit Grades')])[1]")
	// @FindBy(xpath="//td[@class='hidden-xs hideinmobile']//button[@class='btn
	// btn-primary activecoursebutton btn-block' and @role='button']")
	// @FindBy(xpath="(//td[@class='hidden-xs hideinmobile'])[4]")
	@FindBy(xpath = "(//button[contains(text(),'Assign/Edit Grades')])[1]")
	WebElement AssignGradeButton;

	@FindBy(xpath = "//span[contains(text(),'Ashley Charles')]")
	WebElement Instructor;

	@FindBy(xpath = "//h3[contains(text(),' Ashley Charles ')]")
	WebElement conformityInstructor;

	@FindBy(xpath = "//h3[contains(text(),'Ashley Charles')]")
	WebElement proceedInstructor;

	// a[contains(text(),'CHARLES, ASHLEY. ')]

	@FindBy(xpath = "//th[contains(text(),'Best Exam/Paper')]")
	WebElement BestExam;

	@FindBy(xpath = "//th[contains(text(),'Publish to Library')]")
	WebElement PublishLibrary;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]//input")
	WebElement RawScoreInputBox1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[2]")
	WebElement CalculatedGrade;

	@FindBy(xpath = "(//input[@class='btn-block'])[1]")
	WebElement NotesInputBox1;

	@FindBy(xpath = "(//input[@class='btn-block'])[2]")
	WebElement ExamPaperCheckbox;

	@FindBy(xpath = "(//input[@class='btn-block'])[2]")
	WebElement PublishCheckbox;

	@FindBy(xpath = "//strong[contains(text(),'Recent Notes')]")
	WebElement RecentNotes;

	@FindBy(xpath = "//strong[contains(text(),'Course Details')]")
	WebElement CourseDetails;

	@FindBy(xpath = "//p[contains(text(),'Initial Grading Phase')]")
	WebElement GradeStatus;

	@FindBy(xpath = "//div[contains(text(),'Spring 2020 ')]")
	WebElement TermSpring20;
	// strong[contains(text(),'Term:')]

	@FindBy(xpath = "//div[contains(text(),' No ')]")
	WebElement Blind;

	@FindBy(xpath = "//div[contains(text(),' 20 ')]")
	WebElement StudentCount;

	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-12 coursedetail']")
	WebElement StudentCount1;

	@FindBy(xpath = "//span[contains(text(),'Proceed to Final Grading')]")
	WebElement ProccedToFinal;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[5]//input")
	WebElement RawScoreInputBox2;

	@FindBy(xpath = "(//input[@class='btn-block'])[5]")
	WebElement NotesInputBox2;

	@FindBy(xpath = "//button[contains(text(),'Submit Initial Grades')]")
	WebElement SubmitInitialGrade;

	@FindBy(xpath = "//strong[contains(text(),'**A GRADE WAS NOT ASSIGNED FOR EACH STUDENT**')]")
	WebElement ConformityMessage;

	// @FindBy(xpath="//strong[contains(text(),'NOT IN CONFORMITY WITH REQUIRED
	// GRADING GUIDELINES')]")
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement ConformityMessage1;

	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement BlueBox;

	@FindBy(xpath = "(//div[@class='modal-content'])[2]")
	WebElement WarningBox;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement OkButton;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[9]//input")
	WebElement RawScoreInputBox3;

	@FindBy(xpath = "(//input[@class='btn-block'])[9]")
	WebElement NotesInputBox3;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[13]//input")
	WebElement RawScoreInputBox4;

	@FindBy(xpath = "(//input[@class='btn-block'])[13]")
	WebElement NotesInputBox4;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[17]//input")
	WebElement RawScoreInputBox5;

	@FindBy(xpath = "(//input[@class='btn-block'])[17]")
	WebElement NotesInputBox5;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[21]//input")
	WebElement RawScoreInputBox6;

	@FindBy(xpath = "(//input[@class='btn-block'])[21]")
	WebElement NotesInputBox6;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[25]//input")
	WebElement RawScoreInputBox7;

	@FindBy(xpath = "(//input[@class='btn-block'])[25]")
	WebElement NotesInputBox7;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[29]//input")
	WebElement RawScoreInputBox8;

	@FindBy(xpath = "(//input[@class='btn-block'])[29]")
	WebElement NotesInputBox8;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[33]//input")
	WebElement RawScoreInputBox9;

	@FindBy(xpath = "(//input[@class='btn-block'])[33]")
	WebElement NotesInputBox9;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[37]//input")
	WebElement RawScoreInputBox10;

	@FindBy(xpath = "(//input[@class='btn-block'])[37]")
	WebElement NotesInputBox10;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[41]//input")
	WebElement RawScoreInputBox11;

	@FindBy(xpath = "(//input[@class='btn-block'])[41]")
	WebElement NotesInputBox11;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[45]//input")
	WebElement RawScoreInputBox12;

	@FindBy(xpath = "(//input[@class='btn-block'])[45]")
	WebElement NotesInputBox12;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[49]//input")
	WebElement RawScoreInputBox13;

	@FindBy(xpath = "(//input[@class='btn-block'])[49]")
	WebElement NotesInputBox13;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[53]//input")
	WebElement RawScoreInputBox14;

	@FindBy(xpath = "(//input[@class='btn-block'])[53]")
	WebElement NotesInputBox14;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[57]//input")
	WebElement RawScoreInputBox15;

	@FindBy(xpath = "(//input[@class='btn-block'])[57]")
	WebElement NotesInputBox15;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[61]//input")
	WebElement RawScoreInputBox16;

	@FindBy(xpath = "(//input[@class='btn-block'])[61]")
	WebElement NotesInputBox16;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[65]//input")
	WebElement RawScoreInputBox17;

	@FindBy(xpath = "(//input[@class='btn-block'])[65]")
	WebElement NotesInputBox17;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[69]//input")
	WebElement RawScoreInputBox18;

	@FindBy(xpath = "(//input[@class='btn-block'])[69]")
	WebElement NotesInputBox18;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[73]//input")
	WebElement RawScoreInputBox19;

	@FindBy(xpath = "(//input[@class='btn-block'])[73]")
	WebElement NotesInputBox19;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[77]//input")
	WebElement RawScoreInputBox20;

	@FindBy(xpath = "(//input[@class='btn-block'])[77]")
	WebElement NotesInputBox20;

	//@FindBy(xpath = "//input[@type='button' and @value='Yes']")
	//@FindBy(xpath = "//input[@class='btn btn-primary btn-block']")	
//	@FindBy(xpath = "(//div[@class='col-xs-6'])[4]")	
	@FindBy(xpath = "//input[@class='btn btn-primary btn-block' and @type='button' and @value='Yes']")	
	WebElement Yes;

	@FindBy(xpath = "//span[contains(text(),'Final Grading Phase')]")
	WebElement CStatus;

	@FindBy(xpath = "//span[contains(text(),'Check Conformity')]")
	WebElement checkConformity;

	@FindBy(xpath = "//h1[contains(text(),'Final Grading Phase')]")
	WebElement finalPhase;

	@FindBy(xpath = "//button[contains(text(),'Show Copy/Paste Import Panel ')]")
	WebElement copyPasteImport;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement IDNameFinal;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement RawScoreFinal;

	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	WebElement letterGradeFinal1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[3]")
	WebElement NoteFinal;

	@FindBy(xpath = "(//input[@class='btn-block'])[1]")
	WebElement bestExamFinal;

	@FindBy(xpath = "(//input[@class='btn-block'])[2]")
	WebElement publishFinal;

	@FindBy(xpath = "(//button[contains(text(),'Submit Final Grades')])[1]")
	WebElement submitFinalGrade;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okFinalGrade;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelFinalGrade;

	@FindBy(xpath = "//strong[contains(text(),'You cannot proceed unless all required errors have been resolved.')]")
	WebElement alertMessage;

	@FindBy(xpath = "//h2[contains(text(),'Intro to Fed Income Tax (LAWD-3012-10) 35238')]")
	WebElement courseTitle;

	@FindBy(xpath = "//span[contains(text(),'Intro to Fed Income Tax (LAWD-3012-10) 35238')]")
	WebElement courseTitle1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement RawScoreInputBox1final;

	@FindBy(xpath = "(//div[@class='form-group'])[1]")
	WebElement letterGradeInputfinal;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[3]")
	WebElement notesfinal;

	@FindBy(xpath = "(//input[@class='btn-block' and @type='checkbox'])[1]")
	WebElement bestExamfinal;

	@FindBy(xpath = "(//input[@class='btn-block' and @type='checkbox'])[2]")
	WebElement publishfinal;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	WebElement RecentNotesDateFinalPhase;

	@FindBy(xpath = "//p[contains(text(),'Final Grading Phase')]")
	WebElement GradeStatusFinal;

	@FindBy(xpath = "//div[@class='alert alert-warning']")
	WebElement yellowMessage;

	@FindBy(xpath = "(//select[@class='form-control'])[3]")
	// @FindBy(xpath="(//div[@class='form-group'])[3]//select")
	WebElement letterGradeFinal2;

	@FindBy(xpath = "(//select[@class='form-control'])[5]")
	WebElement letterGradeFinal3;

	@FindBy(xpath = "(//select[@class='form-control'])[7]")
	WebElement letterGradeFinal4;

	@FindBy(xpath = "(//select[@class='form-control'])[9]")
	WebElement letterGradeFinal5;

	@FindBy(xpath = "(//select[@class='form-control'])[11]")
	WebElement letterGradeFinal6;

	@FindBy(xpath = "(//select[@class='form-control'])[13]")
	WebElement letterGradeFinal7;

	@FindBy(xpath = "(//select[@class='form-control'])[15]")
	WebElement letterGradeFinal8;

	@FindBy(xpath = "(//select[@class='form-control'])[17]")
	WebElement letterGradeFinal9;

	@FindBy(xpath = "(//select[@class='form-control'])[19]")
	WebElement letterGradeFinal10;

	@FindBy(xpath = "(//select[@class='form-control'])[21]")
	WebElement letterGradeFinal11;

	@FindBy(xpath = "(//select[@class='form-control'])[23]")
	WebElement letterGradeFinal12;

	@FindBy(xpath = "(//select[@class='form-control'])[25]")
	WebElement letterGradeFinal13;

	@FindBy(xpath = "(//select[@class='form-control'])[27]")
	WebElement letterGradeFinal14;

	@FindBy(xpath = "(//select[@class='form-control'])[29]")
	WebElement letterGradeFinal15;

	@FindBy(xpath = "(//select[@class='form-control'])[31]")
	WebElement letterGradeFinal16;

	@FindBy(xpath = "(//select[@class='form-control'])[33]")
	WebElement letterGradeFinal17;

	@FindBy(xpath = "(//select[@class='form-control'])[35]")
	WebElement letterGradeFinal18;

	@FindBy(xpath = "(//select[@class='form-control'])[37]")
	WebElement letterGradeFinal19;

	@FindBy(xpath = "(//select[@class='form-control'])[39]")
	WebElement letterGradeFinal20;

	@FindBy(xpath = "//li[contains(text(),'Mean for a Required Course must be in range 3.25 - 3.35')]")
	WebElement redMessage1;

	@FindBy(xpath = "//li[contains(text(),'A+ expected to be less than 2%')]")
	WebElement redMessage2;

	@FindBy(xpath = "//li[contains(text(),'A grades are expected to be between 17% and 19%')]")
	WebElement redMessage3;

	@FindBy(xpath = "//li[contains(text(),'A- grades are expected to be between 19% and 21%')]")
	WebElement redMessage4;

	@FindBy(xpath = "//li[contains(text(),'B+ grades are expected to be between 39% and 43%')]")
	WebElement redMessage5;

	@FindBy(xpath = "//li[contains(text(),'B expected be at least 15%')]")
	WebElement redMessage6;

	@FindBy(xpath = "//th[contains(text(),'Grade')]")
	WebElement grade;

	// @FindBy(xpath="//th[contains(text(),'Count')]")
	@FindBy(xpath = "(//th[contains(text(),'Count')])[1]")
	WebElement count;

	// @FindBy(xpath="//th[contains(text(),'Recommended Distribution / Count')]")
	// @FindBy(xpath="(//th[@class='guideline'])[1]")
	@FindBy(xpath = "//th[contains(text(),'Recommended Distribution')]")
	WebElement recDisCount;

	// @FindBy(xpath="//th[contains(text(),'Mandatory Distribution / Count')]")
	// @FindBy(xpath="(//th[@class='guideline'])[2]")
	@FindBy(xpath = "//th[contains(text(),'Mandatory Distribution')]")
	WebElement manDisCount;

	@FindBy(xpath = "//th[contains(text(),'Actual Distribution')]")
	WebElement actualDis;

	// @FindBy(xpath="//strong[contains(text(),'A+')]")
	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[1]")
	WebElement gradeAPlus;

	@FindBy(xpath = "(//strong[contains(text(),'A')])[4]")
	WebElement gradeA;

	@FindBy(xpath = "//strong[contains(text(),'A-')]")
	WebElement gradeAMinus;

	@FindBy(xpath = "//strong[contains(text(),'B+')]")
	WebElement gradeBPlus;

	@FindBy(xpath = "(//strong[contains(text(),'B')])[2]")
	WebElement gradeB;

	@FindBy(xpath = "//strong[contains(text(),'B- to F')]")
	WebElement gradeBMinusToF;

	@FindBy(xpath = "//span[contains(text(),'1% / 0')]")
	WebElement recomDist1;

	@FindBy(xpath = "//span[contains(text(),'17% / 3')]")
	WebElement recomDist2;

	@FindBy(xpath = "//span[contains(text(),'20% / 4')]")
	WebElement recomDist3;

	@FindBy(xpath = "//span[contains(text(),'39% / 8')]")
	WebElement recomDist4;

	@FindBy(xpath = "//span[contains(text(),'23% / 5')]")
	WebElement recomDist5;

	@FindBy(xpath = "//span[contains(text(),'NA')]")
	WebElement recomDist6;

	@FindBy(xpath = "//div[contains(text(),'0-2%')]")
	WebElement manDist1;

	@FindBy(xpath = "//div[contains(text(),'17-19%')]")
	WebElement manDist2;

	@FindBy(xpath = "//div[contains(text(),'19-21%')]")
	WebElement manDist3;

	@FindBy(xpath = "//div[contains(text(),'39-43%')]")
	WebElement manDist4;

	@FindBy(xpath = "//div[contains(text(),'15-25%')]")
	WebElement manDist5;

	@FindBy(xpath = "//div[contains(text(),'0-5%')]")
	WebElement manDist6;

	// @FindBy(xpath="//a[contains(text(),'CHARLES, ASHLEY.')]")
	@FindBy(xpath = "//a[contains(text(),' IMPORTANT! You are currently impersonating CHARLES, ASHLEY. ')]")
	WebElement EmulInstructorName;

	@FindBy(xpath = "//button[contains(text(),'Submit Final Grades')]")
	WebElement submitFinalGradeNew;

	@FindBy(xpath = "//h3[contains(text(),'Ashley Charles')]")
	WebElement InstructorNew;

	@FindBy(xpath = "//strong[contains(text(),'NOT IN CONFORMITY WITH REQUIRED GRADING GUIDELINES')]")
	WebElement ConformityMessageNew1;

	@FindBy(xpath = "//button[contains(text(),'No')]")
	WebElement NoButton;

	// @FindBy(xpath="//textarea[@id='txtNotes']")
	@FindBy(id = "txtNotes")
	WebElement textNotes;

	@FindBy(xpath = "(//em[@class='fas fa-plus'])[8]")
	// @FindBy(xpath="(//strong[contains(text(),'CUSTOM')]//preceding-sibling::em)[8]")
	WebElement customTag;

	@FindBy(xpath = "//div[contains(text(),' GRADING AUTOMATED TESTING ')]")
	WebElement automatedTag;

	@FindBy(xpath = "//h1[contains(text(),'Initial Grading Phase')]")
	WebElement initialStatus;
	
	@FindBy(xpath = "//button[contains(text(),'Deactivate')]")
	WebElement deactivateButton;

	// course page 5 page factory:

	public GradeCoursePage4A(WebDriver driver) {
		// PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void NavigateToDashboardAndActivateCourse(String courseName, String crn) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(spring2020));
		spring2020.click();

		wait.until(ExpectedConditions.visibilityOf(GradingSchedule));
		GradingSchedule.click();

		wait.until(ExpectedConditions.visibilityOf(CourseTab));
		staleElementClick(6, CourseTab, 60);
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

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(COURSE));
		softAssert.assertEquals(COURSE.isDisplayed(), true);

		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		searchBox.sendKeys(courseName);

		wait.until(ExpectedConditions.visibilityOf(CourseCheckBox));

		highLightElement(driver, CourseCheckBox);
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		CourseCheckBox.click();

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click()", CourseCheckBox);
		 */

		wait.until(ExpectedConditions.visibilityOf(ActivateButton));
		// softAssert.assertEquals(ActivateButton.isEnabled(), true);
		highLightElement(driver, ActivateButton);
		ActivateButton.click();
		Thread.sleep(5000);

		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Cross.click();
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", Cross);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		searchBox.sendKeys(crn);
		Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
		 * wait1.until(ExpectedConditions.visibilityOf(CourseStatus));
		 */
		 
		softAssert.assertEquals(CourseStatus.isDisplayed(), true);
		String courseStatusNew = CourseStatus.getText();
		System.out.println(courseStatusNew);
		Assert.assertEquals(courseStatusNew, "Initial Grading Phase");
		softAssert.assertEquals(CourseLink.isEnabled(), true);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// CourseLink.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", CourseLink);
	}
	
	public void NavigateToDashboard() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(spring2020));
		spring2020.click();

		wait1.until(ExpectedConditions.visibilityOf(GradingSchedule));
		GradingSchedule.click();
	}

	public void GotoCourseTab() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		staleElementClick(5, CourseTab, 60);
		// CourseTab.click();

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click()", CourseTab);
		 */

	}

	public void clickOnCustom() {
		scrollToElement(customTag);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(customTag));
		customTag.click();
		wait.until(ExpectedConditions.visibilityOf(automatedTag));
		automatedTag.click();
	}

	public void activateCourse() throws InterruptedException {

		softAssert.assertEquals(COURSE.isDisplayed(), true);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		searchBox.sendKeys("Intro to Fed Income Tax");

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseCheckBox));

		highLightElement(driver, CourseCheckBox);
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		CourseCheckBox.click();

		// JavascriptExecutor js= (JavascriptExecutor)driver;
		// js.executeAsyncScript("arguments[0].click()", CourseCheckBox);

		wait1.until(ExpectedConditions.visibilityOf(ActivateButton));
		// softAssert.assertEquals(ActivateButton.isEnabled(), true);
		highLightElement(driver, ActivateButton);
		ActivateButton.click();
		Thread.sleep(5000);
	}

	public void clickOnCross() throws InterruptedException {
		Cross.click();
		searchBox.sendKeys("35238");
		Thread.sleep(5000);
	}

	public void attributesAfterActivate() {

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseStatus));

		softAssert.assertEquals(CourseStatus.isDisplayed(), true);
		String courseStatusNew = CourseStatus.getText();
		System.out.println(courseStatusNew);
		Assert.assertEquals(courseStatusNew, "Initial Grading Phase");
		softAssert.assertEquals(CourseLink.isEnabled(), true);
	}

	public void attributeVerification() {
		softAssert.assertEquals(COURSE.isDisplayed(), true);
		softAssert.assertEquals(CRNLINK.isDisplayed(), true);
		softAssert.assertEquals(GRADESTETUS.isDisplayed(), true);
		softAssert.assertEquals(EXAMTYPE.isDisplayed(), true);
		softAssert.assertEquals(DUEDATE.isDisplayed(), true);
		softAssert.assertEquals(EXTENTION.isDisplayed(), true);
		// softAssert.assertEquals(BLINDGRADE.isDisplayed(), true);
		softAssert.assertEquals(YEARCOURSE.isDisplayed(), true);
		System.out.println("All attributes are verified");
	}

	/*
	 * public void clickOnCourse() { //CourseLink.click(); JavascriptExecutor
	 * js=(JavascriptExecutor)driver; js.executeScript("arguments[0].click()",
	 * CourseLink); }
	 */

	public void courseAttributesVerification() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(ProceedButton));
		softAssert.assertEquals(ProceedButton.isEnabled(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(initialStatus.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(EmulationLink.isDisplayed(), true);
		softAssert.assertEquals(EmailLink.isDisplayed(), true);
		softAssert.assertEquals(DueDate.isDisplayed(), true);
		softAssert.assertEquals(GradeTab.isEnabled(), true);
		softAssert.assertEquals(HistoryTab.isEnabled(), true);
		softAssert.assertEquals(IdName.isDisplayed(), true);
		softAssert.assertEquals(RawScore.isDisplayed(), true);
		softAssert.assertEquals(Letter1.isDisplayed(), true);
		softAssert.assertEquals(Notes.isDisplayed(), true);
		softAssert.assertEquals(Paper.isDisplayed(), true);
		softAssert.assertEquals(Publish.isDisplayed(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);

		softAssert.assertEquals(Paper1.isEnabled(), true);
		softAssert.assertEquals(Publish1.isEnabled(), true);

		softAssert.assertEquals(RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(InitialStatus.isDisplayed(), true);
		softAssert.assertEquals(TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All course attributes are verified");
	}

	public void clickOnEmulation() {
		scrollToElement(EmulationLink);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(EmulationLink));
		
		//EmulationLink.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", EmulationLink);
	}

	public void emulationAttributesVerification() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(CancelLink));
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(YourCourseLink.isDisplayed(), true);
		softAssert.assertEquals(Title.isDisplayed(), true);
		softAssert.assertEquals(ClassLevel.isDisplayed(), true);
		// softAssert.assertEquals(BlindGrade.isDisplayed(), true);
		softAssert.assertEquals(CurrentStatus.isDisplayed(), true);
		//WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOf(GradingDueDate));
		softAssert.assertEquals(GradingDueDate.isDisplayed(), true);
		// WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOf(emulCourseTitle));
		softAssert.assertEquals(emulCourseTitle.isDisplayed(), true);
		softAssert.assertEquals(CourseTitle1.isDisplayed(), true);
		softAssert.assertEquals(ClassLevel1.isDisplayed(), true);
		// softAssert.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert.assertEquals(CurrentStatus1.isDisplayed(), true);
		softAssert.assertEquals(GradingDueDate1.isDisplayed(), true);
		softAssert.assertEquals(AssignGradeButton.isEnabled(), true);

		System.out.println("All the emulation attributes are verified");
	}

	public void clickOnAssignGrade() {
		// AssignGradeButton.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(AssignGradeButton));

		highLightElement(driver, AssignGradeButton);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", AssignGradeButton);
	}

	public void assignEditAttributesVerification() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(CancelLink));
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(ProceedButton.isEnabled(), true);
		softAssert.assertEquals(initialStatus.isEnabled(), true);
		softAssert.assertEquals(courseTitle.isDisplayed(), true);
		softAssert.assertEquals(Instructor.isDisplayed(), true);
		softAssert.assertEquals(GradingDueDate2.isDisplayed(), true);
		softAssert.assertEquals(GradeTab.isEnabled(), true);
		softAssert.assertEquals(HistoryTab.isEnabled(), true);
		softAssert.assertEquals(IdName.isDisplayed(), true);
		softAssert.assertEquals(RawScore.isDisplayed(), true);
		softAssert.assertEquals(Letter1.isDisplayed(), true);
		softAssert.assertEquals(Notes.isDisplayed(), true);
		softAssert.assertEquals(BestExam.isDisplayed(), true);
		softAssert.assertEquals(PublishLibrary.isDisplayed(), true);
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		softAssert.assertEquals(RawScoreInputBox1.isEnabled(), true);
		softAssert.assertEquals(NotesInputBox1.isEnabled(), true);
		softAssert.assertEquals(ExamPaperCheckbox.isEnabled(), false);
		softAssert.assertEquals(PublishCheckbox.isEnabled(), false);
		System.out.println("All attributes are verified");

		softAssert.assertEquals(RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(CourseStatus1.isDisplayed(), true);
		softAssert.assertEquals(TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
		System.out.println("All the recent notes and course details attributes are verified");
	}

	public void enterRawScore() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox1));
		RawScoreInputBox1.clear();
		RawScoreInputBox1.sendKeys("50");

		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.visibilityOf(NotesInputBox1));
		NotesInputBox1.clear();
		NotesInputBox1.sendKeys("pass");

		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.visibilityOf(RawScoreInputBox2));
		softAssert.assertEquals(RawScoreInputBox2.isEnabled(), true);
		RawScoreInputBox2.clear();
		RawScoreInputBox2.sendKeys("60P");

		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.visibilityOf(NotesInputBox2));
		softAssert.assertEquals(NotesInputBox2.isEnabled(), true);
		NotesInputBox2.clear();
		NotesInputBox2.sendKeys("Pass");

		WebDriverWait wait5 = new WebDriverWait(driver, 60);
		wait5.until(ExpectedConditions.visibilityOf(ProccedToFinal));
		// ProccedToFinal.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ProccedToFinal);
	}

	public void proceedAttributeVerification() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(CancelLink));
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);

		softAssert.assertEquals(BackButton.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(SubmitInitialGrade));
		softAssert.assertEquals(SubmitInitialGrade.isEnabled(), true);
		softAssert.assertEquals(CourseTitle.isDisplayed(), true);
		softAssert.assertEquals(proceedInstructor.isDisplayed(), true);
		softAssert.assertEquals(ConformityMessage.isDisplayed(), true);
		System.out.println(ConformityMessage.getText());
		System.out.println(ConformityMessage.getCssValue("color"));
		softAssert.assertEquals(BlueBox.isDisplayed(), true);
		System.out.println(BlueBox.getCssValue("color"));
	}

	public void clickOnSubmitInitialGrades() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(SubmitInitialGrade));
		// SubmitInitialGrade.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", SubmitInitialGrade);

		softAssert.assertEquals(WarningBox.isDisplayed(), true);
		softAssert.assertEquals(OkButton.isEnabled(), true);
	}

	public void clickOnAlert() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(OkButton));

		//OkButton.click();
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()", OkButton);
		 
	}

	public void clickOnBack() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(BackButton));
		// BackButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", BackButton);
	}

	public void AssignAllScore() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox1));
		RawScoreInputBox1.clear();
		RawScoreInputBox1.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox2));
		RawScoreInputBox2.clear();
		RawScoreInputBox2.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox3));
		RawScoreInputBox3.clear();
		RawScoreInputBox3.sendKeys("70");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox4));
		RawScoreInputBox4.clear();
		RawScoreInputBox4.sendKeys("80");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox5));
		RawScoreInputBox5.clear();
		RawScoreInputBox5.sendKeys("40");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox6));
		RawScoreInputBox6.clear();
		RawScoreInputBox6.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox7));
		RawScoreInputBox7.clear();
		RawScoreInputBox7.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox8));
		RawScoreInputBox8.clear();
		RawScoreInputBox8.sendKeys("70");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox9));
		RawScoreInputBox9.clear();
		RawScoreInputBox9.sendKeys("40");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox10));
		RawScoreInputBox10.clear();
		RawScoreInputBox10.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox11));
		RawScoreInputBox11.clear();
		RawScoreInputBox11.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox12));
		RawScoreInputBox12.clear();
		RawScoreInputBox12.sendKeys("70");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox13));
		RawScoreInputBox13.clear();
		RawScoreInputBox13.sendKeys("80");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox14));
		RawScoreInputBox14.clear();
		RawScoreInputBox14.sendKeys("90");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox15));
		RawScoreInputBox15.clear();
		RawScoreInputBox15.sendKeys("40");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox16));
		RawScoreInputBox16.clear();
		RawScoreInputBox16.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox17));
		RawScoreInputBox17.clear();
		RawScoreInputBox17.sendKeys("60");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox18));
		RawScoreInputBox18.clear();
		RawScoreInputBox18.sendKeys("70");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox19));
		RawScoreInputBox19.clear();
		RawScoreInputBox19.sendKeys("80");

		wait1.until(ExpectedConditions.visibilityOf(RawScoreInputBox20));
		RawScoreInputBox20.clear();
		RawScoreInputBox20.sendKeys("90");

		System.out.println("Raw score entered for all the students");
	}

	public void EnterNotes() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox1));
		NotesInputBox1.clear();
		NotesInputBox1.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox2));
		NotesInputBox2.clear();
		NotesInputBox2.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox3));
		NotesInputBox3.clear();
		NotesInputBox3.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox4));
		NotesInputBox4.clear();
		NotesInputBox4.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox5));
		NotesInputBox5.clear();
		NotesInputBox5.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox6));
		NotesInputBox6.clear();
		NotesInputBox6.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox7));
		NotesInputBox7.clear();
		NotesInputBox7.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox8));
		NotesInputBox8.clear();
		NotesInputBox8.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox9));
		NotesInputBox9.clear();
		NotesInputBox9.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox10));
		NotesInputBox10.clear();
		NotesInputBox10.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox11));
		NotesInputBox11.clear();
		NotesInputBox11.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox12));
		NotesInputBox12.clear();
		NotesInputBox12.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox13));
		NotesInputBox13.clear();
		NotesInputBox13.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox14));
		NotesInputBox14.clear();
		NotesInputBox14.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox15));
		NotesInputBox15.clear();
		NotesInputBox15.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox16));
		NotesInputBox16.clear();
		NotesInputBox16.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox17));
		NotesInputBox17.clear();
		NotesInputBox17.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox18));
		NotesInputBox18.clear();
		NotesInputBox18.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox19));
		NotesInputBox19.clear();
		NotesInputBox19.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(NotesInputBox20));
		NotesInputBox20.clear();
		NotesInputBox20.sendKeys("Pass");

		System.out.println("Notes are provided for all the students");

		scrollToElement(ProccedToFinal);
		wait1.until(ExpectedConditions.visibilityOf(ProccedToFinal));

		ProccedToFinal.click();
		
		/*
		 * wait1.until(ExpectedConditions.visibilityOf(Yes)); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click()", Yes);
		 */
		// Yes.click();
	}

	public void checkCourseConformity() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(conformEmulInstructorName.isDisplayed(), true);
		// softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(SubmitInitialGrade.isEnabled(), true);
		softAssert.assertEquals(courseTitle1.isDisplayed(), true);
		// softAssert.assertEquals(Instructor.isDisplayed(), true);
		softAssert.assertEquals(ConformityMessage1.isDisplayed(), true);
		System.out.println(ConformityMessage.getCssValue("color"));
		System.out.println("Green message verified");
		softAssert.assertEquals(BlueBox.isDisplayed(), true);
		System.out.println(BlueBox.getCssValue("color"));
	}

	public void checkConfirmationModal() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(textNotes));
		softAssert.assertEquals(textNotes.isDisplayed(), true);
		softAssert.assertEquals(NoButton.isEnabled(), true);
		softAssert.assertEquals(Yes.isEnabled(), true);
	}

	public void clickOnNo() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(textNotes));
		textNotes.sendKeys("Ok");
		NoButton.click();
	}

	public void clickOnConfirmationAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(SubmitInitialGrade));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", SubmitInitialGrade);
		// SubmitInitialGrade.click();
		textNotes.sendKeys("Ok proceed");		
		
		  highLightElement(driver, Yes); JavascriptExecutor js1 = (JavascriptExecutor)driver; 
		  js1.executeScript("arguments[0].click()", Yes);
	}

	public void ConfirmationAlertYes() {
		
		/*
		 * Alert objalert= driver.switchTo().alert(); objalert.accept();
		 */
		
		 WebDriverWait wait = new WebDriverWait(driver, 60);
		  wait.until(ExpectedConditions.visibilityOf(Yes));
		 
		 
		// Yes.click();
		//staleElementClick(5, Yes, 60);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		  highLightElement(driver, Yes); JavascriptExecutor js1 = (JavascriptExecutor)
		  driver; js1.executeScript("arguments[0].click()", Yes);
		 
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		 
	}

	public void instructorHomePageAttributes() {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOf(CStatus));
		highLightElement(driver, CStatus);
		softAssert.assertEquals(CStatus.isDisplayed(), true);
		
		 wait.until(ExpectedConditions.visibilityOf(AssignGradeButton));
		 
		softAssert.assertEquals(AssignGradeButton.isEnabled(), true);
		// AssignGradeButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", AssignGradeButton);
	}

	public void finalGradeAttributes() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(CancelLink));
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(checkConformity.isEnabled(), true);
		softAssert.assertEquals(finalPhase.isDisplayed(), true);
		softAssert.assertEquals(CourseTitle.isDisplayed(), true);
		softAssert.assertEquals(Instructor.isDisplayed(), true);
		softAssert.assertEquals(GradingDueDate2.isDisplayed(), true);
		softAssert.assertEquals(GradeTab.isEnabled(), true);
		softAssert.assertEquals(HistoryTab.isEnabled(), true);
		softAssert.assertEquals(copyPasteImport.isEnabled(), true);
		softAssert.assertEquals(IdName.isDisplayed(), true);
		softAssert.assertEquals(RawScore.isDisplayed(), true);
		softAssert.assertEquals(Letter1.isDisplayed(), true);
		softAssert.assertEquals(Notes.isDisplayed(), true);
		softAssert.assertEquals(BestExam.isDisplayed(), true);
		softAssert.assertEquals(PublishLibrary.isDisplayed(), true);
		System.out.println("Grade table header row attributes are verified");

		softAssert.assertEquals(IDNameFinal.isDisplayed(), true);
		softAssert.assertEquals(RawScoreFinal.isDisplayed(), true);
		softAssert.assertEquals(letterGradeFinal1.isEnabled(), true);
		softAssert.assertEquals(NoteFinal.isDisplayed(), true);
		softAssert.assertEquals(bestExamFinal.isEnabled(), true);
		softAssert.assertEquals(publishFinal.isEnabled(), false);
		System.out.println("Grade table data row attributes are verified");
	}

	// Need to add one more attributes verification method here

	public void finalGradeAttributes1() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(RawScoreInputBox1final));
		softAssert.assertEquals(RawScoreInputBox1final.isDisplayed(), true);
		softAssert.assertEquals(letterGradeInputfinal.isEnabled(), true);
		softAssert.assertEquals(notesfinal.isDisplayed(), true);
		softAssert.assertEquals(bestExamfinal.isEnabled(), true);
		softAssert.assertEquals(publishfinal.isEnabled(), false);
		softAssert.assertEquals(RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(RecentNotesDateFinalPhase.isDisplayed(), true);
		softAssert.assertEquals(CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(GradeStatusFinal.isDisplayed(), true);
		softAssert.assertEquals(TermSpring20.isDisplayed(), true);
		// softAssert.assertEquals(Blind.isDisplayed(), true);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);
	}

	public void selectFinalGradeForFirst() {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOf(letterGradeFinal1));
		Select sel = new Select(letterGradeFinal1);
		sel.selectByVisibleText("F");

		scrollToElement(checkConformity);

		checkConformity.click();
	}

	public void checkConformityFinalGradeAttributes() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(CancelLink));
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(submitFinalGrade.isEnabled(), true);
		softAssert.assertEquals(CourseTitle.isDisplayed(), true);
		softAssert.assertEquals(conformityInstructor.isDisplayed(), true);
		softAssert.assertEquals(ConformityMessage1.isDisplayed(), true);
		System.out.println(ConformityMessage1.getText());
		System.out.println(ConformityMessage1.getCssValue("color"));
		System.out.println("Red message verified");
		// Need to add yellow message here instead of blue message
		softAssert.assertEquals(yellowMessage.isDisplayed(), true);
		System.out.println(yellowMessage.getCssValue("color"));
	}

	public void clickonSubmitFinalGrade() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(submitFinalGrade));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", submitFinalGrade);
		// submitFinalGrade.click();

		softAssert.assertEquals(alertMessage.isDisplayed(), true);
		softAssert.assertEquals(okFinalGrade.isEnabled(), true);

		// okFinalGrade.click();
		// JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", okFinalGrade);
	}

	// As per the updated test case document below 3 functions are not useful for
	// current tests:

	public void selectFinalGradeForAll() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(letterGradeFinal1));
		Select sel1 = new Select(letterGradeFinal1);
		sel1.selectByVisibleText("A");

		Select sel2 = new Select(letterGradeFinal2);
		sel2.selectByVisibleText("A");

		Select sel3 = new Select(letterGradeFinal3);
		sel3.selectByVisibleText("A");

		Select sel4 = new Select(letterGradeFinal4);
		sel4.selectByVisibleText("A");

		Select sel5 = new Select(letterGradeFinal5);
		sel5.selectByVisibleText("A");

		Select sel6 = new Select(letterGradeFinal6);
		sel6.selectByVisibleText("A");

		Select sel7 = new Select(letterGradeFinal7);
		sel7.selectByVisibleText("A");

		Select sel8 = new Select(letterGradeFinal8);
		sel8.selectByVisibleText("A");

		Select sel9 = new Select(letterGradeFinal9);
		sel9.selectByVisibleText("A");

		Select sel10 = new Select(letterGradeFinal10);
		sel10.selectByVisibleText("A");

		Select sel11 = new Select(letterGradeFinal11);
		sel11.selectByVisibleText("A");

		Select sel12 = new Select(letterGradeFinal12);
		sel12.selectByVisibleText("A");

		Select sel13 = new Select(letterGradeFinal13);
		sel13.selectByVisibleText("A");

		Select sel14 = new Select(letterGradeFinal14);
		sel14.selectByVisibleText("A");

		Select sel15 = new Select(letterGradeFinal15);
		sel15.selectByVisibleText("A");

		Select sel16 = new Select(letterGradeFinal16);
		sel16.selectByVisibleText("A");

		Select sel17 = new Select(letterGradeFinal17);
		sel17.selectByVisibleText("A");

		Select sel18 = new Select(letterGradeFinal18);
		sel18.selectByVisibleText("A");

		Select sel19 = new Select(letterGradeFinal19);
		sel19.selectByVisibleText("A");

		Select sel20 = new Select(letterGradeFinal20);
		sel20.selectByVisibleText("A");

		scrollToElement(checkConformity);

		checkConformity.click();
	}

	public void CheckConformityPageAttributes() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GradingRule));
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(SubmitInitialGrade.isEnabled(), true);
		softAssert.assertEquals(CourseTitle.isDisplayed(), true);
		softAssert.assertEquals(Instructor.isDisplayed(), true);
		softAssert.assertEquals(ConformityMessage1.isDisplayed(), true);
		System.out.println(ConformityMessage1.getText());
		System.out.println(ConformityMessage1.getCssValue("color"));
		System.out.println("Green message verified");
		softAssert.assertEquals(BlueBox.isDisplayed(), true);
		System.out.println(BlueBox.getCssValue("color"));
	}

	public void submitFinalGrade() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(submitFinalGrade));
		submitFinalGrade.click();
		// softAssert.assertEquals(NoteText.isEnabled(), true);
		softAssert.assertEquals(okFinalGrade.isEnabled(), true);
		softAssert.assertEquals(cancelFinalGrade.isEnabled(), true);
		cancelFinalGrade.click();
	}

	// Page 5: //As per the updated test case document below 3 methods are not
	// useful for current tests:
	public void selectFinalGradesHighMean() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(letterGradeFinal1));
		Select sel1 = new Select(letterGradeFinal1);
		// sel1.deselectByVisibleText("F");
		// sel1.selectByVisibleText("A+");
		sel1.selectByIndex(1);

		Select sel2 = new Select(letterGradeFinal2);
		// sel2.selectByVisibleText("A");
		sel2.selectByIndex(2);

		Select sel3 = new Select(letterGradeFinal3);
		// sel3.selectByVisibleText("A-");
		sel3.selectByIndex(3);

		Select sel4 = new Select(letterGradeFinal4);
		// sel4.selectByVisibleText("A+");
		sel4.selectByIndex(1);

		Select sel5 = new Select(letterGradeFinal5);
		// sel5.selectByVisibleText("A");
		sel5.selectByIndex(2);

		Select sel6 = new Select(letterGradeFinal6);
		// sel6.selectByVisibleText("A-");
		sel6.selectByIndex(3);

		Select sel7 = new Select(letterGradeFinal7);
		// sel7.selectByVisibleText("A+");
		sel7.selectByIndex(1);

		Select sel8 = new Select(letterGradeFinal8);
		// sel8.selectByVisibleText("A");
		sel8.selectByIndex(2);

		Select sel9 = new Select(letterGradeFinal9);
		// sel9.selectByVisibleText("A-");
		sel9.selectByIndex(3);

		Select sel10 = new Select(letterGradeFinal10);
		// sel10.selectByVisibleText("A+");
		sel10.selectByIndex(1);

		Select sel11 = new Select(letterGradeFinal11);
		// sel11.selectByVisibleText("A");
		sel11.selectByIndex(2);

		Select sel12 = new Select(letterGradeFinal12);
		// sel12.selectByVisibleText("A-");
		sel12.selectByIndex(3);

		Select sel13 = new Select(letterGradeFinal13);
		// sel13.selectByVisibleText("A+");
		sel13.selectByIndex(1);

		Select sel14 = new Select(letterGradeFinal14);
		// sel14.selectByVisibleText("A");
		sel14.selectByIndex(2);

		Select sel15 = new Select(letterGradeFinal15);
		// sel15.selectByVisibleText("A-");
		sel15.selectByIndex(3);

		Select sel16 = new Select(letterGradeFinal16);
		// sel16.selectByVisibleText("A+");
		sel16.selectByIndex(1);

		Select sel17 = new Select(letterGradeFinal17);
		// sel17.selectByVisibleText("A");
		sel17.selectByIndex(2);

		Select sel18 = new Select(letterGradeFinal18);
		// sel18.selectByVisibleText("A-");
		sel18.selectByIndex(3);

		Select sel19 = new Select(letterGradeFinal19);
		// sel19.selectByVisibleText("A+");
		sel19.selectByIndex(1);

		Select sel20 = new Select(letterGradeFinal20);
		// sel20.selectByVisibleText("A");
		sel20.selectByIndex(2);

		scrollToElement(checkConformity);

		checkConformity.click();
	}

	public void highMeanConformityAttributes() {
		softAssert.assertEquals(GradingRule.isEnabled(), true);
		softAssert.assertEquals(CancelLink.isEnabled(), true);
		softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(submitFinalGrade));
		softAssert.assertEquals(submitFinalGradeNew.isEnabled(), true);
		softAssert.assertEquals(CourseTitle.isDisplayed(), true);
		softAssert.assertEquals(InstructorNew.isDisplayed(), true);
		softAssert.assertEquals(ConformityMessageNew1.isDisplayed(), true);
		softAssert.assertEquals(redMessage1.isDisplayed(), true);
		softAssert.assertEquals(yellowMessage.isDisplayed(), true);
		System.out.println(yellowMessage.getCssValue("color"));
		System.out.println("Yellow message verified");
	}

	public void selectFinalGradesLowMean() {
		Select sel1 = new Select(letterGradeFinal1);
		// sel1.selectByVisibleText("D");
		sel1.selectByIndex(10);

		Select sel2 = new Select(letterGradeFinal2);
		// sel2.selectByVisibleText("F");
		sel2.selectByIndex(11);

		Select sel3 = new Select(letterGradeFinal3);
		// sel3.selectByVisibleText("D");
		sel3.selectByIndex(10);

		Select sel4 = new Select(letterGradeFinal4);
		// sel4.selectByVisibleText("F");
		sel4.selectByIndex(11);

		Select sel5 = new Select(letterGradeFinal5);
		// sel5.selectByVisibleText("D");
		sel5.selectByIndex(10);

		Select sel6 = new Select(letterGradeFinal6);
		// sel6.selectByVisibleText("F");
		sel6.selectByIndex(11);

		Select sel7 = new Select(letterGradeFinal7);
		// sel7.selectByVisibleText("D");
		sel7.selectByIndex(10);

		Select sel8 = new Select(letterGradeFinal8);
		// sel8.selectByVisibleText("F");
		sel8.selectByIndex(11);

		Select sel9 = new Select(letterGradeFinal9);
		// sel9.selectByVisibleText("D");
		sel9.selectByIndex(10);

		Select sel10 = new Select(letterGradeFinal10);
		// sel10.selectByVisibleText("F");
		sel10.selectByIndex(11);

		Select sel11 = new Select(letterGradeFinal11);
		// sel11.selectByVisibleText("D");
		sel11.selectByIndex(10);

		Select sel12 = new Select(letterGradeFinal12);
		// sel12.selectByVisibleText("F");
		sel12.selectByIndex(11);

		Select sel13 = new Select(letterGradeFinal13);
		// sel13.selectByVisibleText("D");
		sel13.selectByIndex(10);

		Select sel14 = new Select(letterGradeFinal14);
		// sel14.selectByVisibleText("F");
		sel14.selectByIndex(11);

		Select sel15 = new Select(letterGradeFinal15);
		// sel15.selectByVisibleText("D");
		sel15.selectByIndex(10);

		Select sel16 = new Select(letterGradeFinal16);
		// sel16.selectByVisibleText("F");
		sel16.selectByIndex(11);

		Select sel17 = new Select(letterGradeFinal17);
		// sel17.selectByVisibleText("D");
		sel17.selectByIndex(10);

		Select sel18 = new Select(letterGradeFinal18);
		// sel18.selectByVisibleText("F");
		sel18.selectByIndex(11);

		Select sel19 = new Select(letterGradeFinal19);
		// sel19.selectByVisibleText("D");
		sel19.selectByIndex(10);

		Select sel20 = new Select(letterGradeFinal20);
		// sel20.selectByVisibleText("F");
		sel20.selectByIndex(11);

		scrollToElement(checkConformity);

		checkConformity.click();
	}

	public void updateGrades() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(letterGradeFinal1));
		Select sel1 = new Select(letterGradeFinal1);
		// sel1.selectByVisibleText("A+");
		sel1.selectByIndex(1);

		Select sel2 = new Select(letterGradeFinal2);
		// sel2.selectByVisibleText("A+");
		sel2.selectByIndex(1);

		Select sel3 = new Select(letterGradeFinal3);
		// sel3.selectByVisibleText("A");
		sel3.selectByIndex(2);

		Select sel4 = new Select(letterGradeFinal4);
		// sel4.selectByVisibleText("A");
		sel4.selectByIndex(2);

		Select sel5 = new Select(letterGradeFinal5);
		// sel5.selectByVisibleText("A");
		sel5.selectByIndex(2);

		Select sel6 = new Select(letterGradeFinal6);
		// sel6.selectByVisibleText("A");
		sel6.selectByIndex(2);

		Select sel7 = new Select(letterGradeFinal7);
		// sel7.selectByVisibleText("A-");
		sel7.selectByIndex(3);

		Select sel8 = new Select(letterGradeFinal8);
		// sel8.selectByVisibleText("A-");
		sel8.selectByIndex(3);

		Select sel9 = new Select(letterGradeFinal9);
		// sel9.selectByVisibleText("A-");
		sel9.selectByIndex(3);

		Select sel10 = new Select(letterGradeFinal10);
		// sel10.selectByVisibleText("A-");
		sel10.selectByIndex(3);

		Select sel11 = new Select(letterGradeFinal11);
		// sel11.selectByVisibleText("A-");
		sel11.selectByIndex(3);

		Select sel12 = new Select(letterGradeFinal12);
		// sel12.selectByVisibleText("B+");
		sel12.selectByIndex(4);

		Select sel13 = new Select(letterGradeFinal13);
		// sel13.selectByVisibleText("B+");
		sel13.selectByIndex(4);

		Select sel14 = new Select(letterGradeFinal14);
		// sel14.selectByVisibleText("B+");
		sel14.selectByIndex(4);

		Select sel15 = new Select(letterGradeFinal15);
		// sel15.selectByVisibleText("B+");
		sel15.selectByIndex(4);

		Select sel16 = new Select(letterGradeFinal16);
		// sel16.selectByVisibleText("B+");
		sel16.selectByIndex(4);

		Select sel17 = new Select(letterGradeFinal17);
		// sel17.selectByVisibleText("B+");
		sel17.selectByIndex(4);

		Select sel18 = new Select(letterGradeFinal18);
		// sel18.selectByVisibleText("B+");
		sel18.selectByIndex(4);

		Select sel19 = new Select(letterGradeFinal19);
		// sel19.selectByVisibleText("B+");
		sel19.selectByIndex(4);

		Select sel20 = new Select(letterGradeFinal20);
		// sel20.selectByVisibleText("B+");
		sel20.selectByIndex(4);

		scrollToElement(checkConformity);

		checkConformity.click();
	}

	public void conformityErrorMessages() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(redMessage2));
		// softAssert.assertEquals(redMessage1.isDisplayed(), true);
		softAssert.assertEquals(redMessage2.isDisplayed(), true);
		// softAssert.assertEquals(redMessage3.isDisplayed(), true);
		// softAssert.assertEquals(redMessage4.isDisplayed(), true);
		softAssert.assertEquals(redMessage5.isDisplayed(), true);
		softAssert.assertEquals(redMessage6.isDisplayed(), true);
		System.out.println("All error messages have been verified");
	}

	public void tableHeaderAttributes() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(grade));
		softAssert.assertEquals(grade.isDisplayed(), true);
		softAssert.assertEquals(count.isDisplayed(), true);
		softAssert.assertEquals(recDisCount.isDisplayed(), true);
		softAssert.assertEquals(manDisCount.isDisplayed(), true);
		softAssert.assertEquals(actualDis.isDisplayed(), true);
	}

	public void tableDataRowAttributes() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(gradeAPlus));
		softAssert.assertEquals(gradeAPlus.isDisplayed(), true);
		softAssert.assertEquals(gradeA.isDisplayed(), true);
		softAssert.assertEquals(gradeAMinus.isDisplayed(), true);
		softAssert.assertEquals(gradeBPlus.isDisplayed(), true);
		softAssert.assertEquals(gradeB.isDisplayed(), true);
		softAssert.assertEquals(gradeBMinusToF.isDisplayed(), true);
		softAssert.assertEquals(recomDist1.isDisplayed(), true);
		softAssert.assertEquals(recomDist2.isDisplayed(), true);
		softAssert.assertEquals(recomDist3.isDisplayed(), true);
		softAssert.assertEquals(recomDist4.isDisplayed(), true);
		softAssert.assertEquals(recomDist5.isDisplayed(), true);
		softAssert.assertEquals(recomDist6.isDisplayed(), true);
		softAssert.assertEquals(manDist1.isDisplayed(), true);
		softAssert.assertEquals(manDist2.isDisplayed(), true);
		softAssert.assertEquals(manDist3.isDisplayed(), true);
		softAssert.assertEquals(manDist4.isDisplayed(), true);
		softAssert.assertEquals(manDist5.isDisplayed(), true);
		softAssert.assertEquals(manDist6.isDisplayed(), true);
	}
	
	//extra method added for deactivate course: 
	
	/*
	 * 1. click on check conformity 2. click on submit final grade 3. click on ok 4.
	 * click on back 5. click on cancel emulation 
	 */
	
	public void deactivateCourse() throws InterruptedException
	{
		checkConformity.click();
		
		clickonSubmitFinalGrade();
		
		clickOnBack();
		
		CancelLink.click();
		
		GotoCourseTab();
		softAssert.assertEquals(COURSE.isDisplayed(), true);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(searchBox));

		highLightElement(driver, searchBox);
		searchBox.sendKeys("Intro to Fed Income Tax");
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", CourseLink);
		
		checkConformity.click();
		
		deactivateButton.click();
		
		textNotes.sendKeys("Ok proceed");		
		
		  highLightElement(driver, Yes); JavascriptExecutor js1 = (JavascriptExecutor)driver; 
		  js1.executeScript("arguments[0].click()", Yes);

	}

}

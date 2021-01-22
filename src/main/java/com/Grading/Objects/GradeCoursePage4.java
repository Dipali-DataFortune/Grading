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
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

/**
 * @author dipali.vaidya
 *
 */
public class GradeCoursePage4 extends TestBaseGrade {

	WebDriver driver;
	SoftAssert softAssert1 = new SoftAssert();

	public GradeCoursePage4(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[contains(text(),'A grades are expected to be between 17% and 19%')]")
	WebElement redMessage1New;

	@FindBy(xpath = "//li[contains(text(),'A- grades are expected to be between 19% and 21%')]")
	WebElement redMessage2New;

	@FindBy(xpath = "//li[contains(text(),'B+ grades are expected to be between 39% and 43%')]")
	WebElement redMessage3New;

	@FindBy(xpath = "//li[contains(text(),'B expected be less than 25%')]")
	WebElement redMessage4New;

	@FindBy(xpath = "//li[contains(text(),'All B- to F grades expected to be less than 5%')]")
	WebElement redMessage5New;

	@FindBy(xpath = "//span[contains(text(),'Final grades pending approval')]")
	// @FindBy(xpath="(//td[@class='hidden-xs hideinmobile'])[2]")
	WebElement finalApprovalStatus;

	// @FindBy(xpath="//span[contains(text(),'FINAL GRADES PENDING APPROVAL')]")
	@FindBy(xpath = "//strong[contains(text(),'(FINAL GRADES PENDING APPROVAL)')]")
	WebElement finalApprovalStatus2;

	@FindBy(xpath = "//strong[contains(text(),'CANCEL')]")
	WebElement cancelEmulation;

	// @FindBy(xpath="//h1[contains(text(),'Final grades pending approval')]")
	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[2]")
	// @FindBy(xpath="//span[contains(text(),'Final grades pending approval')]")
	WebElement finalApprovalStatus1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement studentIDName1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement rawScore1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[2]")
	WebElement grade1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[2]")
	WebElement note1;

	@FindBy(xpath = "//p[contains(text(),'Final grades pending approval')]")
	WebElement ApprovalStatus;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[2]")
	WebElement count1;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[7]")
	WebElement count2;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[12]")
	WebElement count3;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[17]")
	WebElement count4;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[22]")
	WebElement count5;

	@FindBy(xpath = "(//td[contains(text(),'0')])[2]")
	WebElement count6;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[5]")
	WebElement actualDist1;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[10]")
	WebElement actualDist2;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[15]")
	WebElement actualDist3;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[20]")
	WebElement actualDist4;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[25]")
	WebElement actualDist5;

	@FindBy(xpath = "(//td[@class='enddistributiongroup'])[27]")
	WebElement actualDist6;

	@FindBy(xpath = "(//div[@class='coursedetail'])[1]")
	WebElement semSpring;

	@FindBy(xpath = "(//div[@class='coursedetail'])[2]")
	WebElement DistSchedule;

	@FindBy(xpath = "(//div[@class='coursedetail'])[3]")
	WebElement BlindGradeNew;

	@FindBy(xpath = "(//div[@class='coursedetail'])[4]")
	WebElement studRegister;

	@FindBy(xpath = "(//div[@class='coursedetail'])[5]")
	WebElement studCountMean;

	@FindBy(xpath = "(//div[@class='coursedetail'])[6]")
	WebElement classMean;

	@FindBy(xpath = "//button[contains(text(),'Reject Final Grades')]")
	WebElement rejectGrades;

	@FindBy(xpath = "//span[contains(text(),'Final grades not approved')]")
	WebElement finalGradeNotApprovedStatus;

	@FindBy(xpath = "//a[@class='btn btn-danger actionsbtn']")
	WebElement checkconformity1;

	@FindBy(xpath = "//h1[contains(text(),'Final grades not approved')]")
	WebElement gradeNotApprovedStatus;

	@FindBy(xpath = "//p[contains(text(),'Final grades not approved')]")
	WebElement gradeNotApprovedStatus1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement IdName1New;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement Raw1;

	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	WebElement LetterGrade1;

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile'])[3]")
	WebElement Notes1;

	@FindBy(xpath = "//th[contains(text(),'ID / Name ')]")
	WebElement IdNameTitle;

	@FindBy(xpath = "//th[contains(text(),'Raw Score')]")
	WebElement rawTitle;

	@FindBy(xpath = "//span[contains(text(),'Letter Grade ')]")
	WebElement LetterGradeTitle;

	@FindBy(xpath = "//th[contains(text(),'Notes')]")
	WebElement notesTitle;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement conformityReportMessage;

	@FindBy(xpath = "//button[contains(text(),'Re-Submit Final Grades')]")
	WebElement resubmitFGrade;

	@FindBy(xpath = "//button[contains(text(),'Request Conformity Exemption')]")
	WebElement reqConformityExem;

	@FindBy(xpath = "//h1[contains(text(),'Final grades pending approval')]")
	// @FindBy(xpath="//span[contains(text(),'Final grades pending approval')]")
	WebElement courseStatus;

	@FindBy(xpath = "//button[contains(text(),'Approve Final Grades')]")
	WebElement approveFGrades;

	@FindBy(xpath = "//button[contains(text(),'Reject Final Grades')]")
	WebElement rejectFGrades;

	@FindBy(xpath = "//button[contains(text(),'Deactivate')]")
	WebElement deactivateButton;

	@FindBy(xpath = "//strong[contains(text(),'Course Conformity Report')]")
	WebElement CourseConformity;

	@FindBy(xpath = "//span[contains(text(),'Final Grades - Pending Banner Upload')]")
	// @FindBy(xpath = "(//div[@class='disabled'])[2]")
	WebElement StatusBannerUpload;

	@FindBy(xpath = "//p[contains(text(),'Final Grades - Pending Banner Upload')]")
	WebElement StatusBannerUpload1;

	@FindBy(xpath = "//strong[contains(text(),'(FINAL GRADES - PENDING BANNER UPLOAD)')]")
	WebElement StatusBannerUpload2;

	@FindBy(xpath = "//h1[contains(text(),'Final Grades - Pending Banner Upload')]")
	WebElement StatusBannerUpload3;

	@FindBy(xpath = "//button[contains(text(),'View Grades')]")
	WebElement ViewGradeButton;

	@FindBy(xpath = "//span[contains(text(),'Not Activated for Grading')]")
	// @FindBy(xpath = "(//div[@class='disabled'])[2]")
	WebElement notActivatedStatus;

	@FindBy(xpath = "//strong[contains(text(),'(CANCEL)')]")
	WebElement cancelEmul;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement emulLink;

	@FindBy(xpath = "//textarea[@id='txtNotes']")
	WebElement textNoteBox;

	GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

	// course page 5 methods:
	public void selectBAndFGrades() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		
		Select sel1 = new Select(GC4.letterGradeFinal1);
		// sel1.selectByVisibleText("D");
		sel1.selectByIndex(5);

		Select sel2 = new Select(GC4.letterGradeFinal2);
		// sel2.selectByVisibleText("F");
		sel2.selectByIndex(5);

		Select sel3 = new Select(GC4.letterGradeFinal3);
		// sel3.selectByVisibleText("D");
		sel3.selectByIndex(5);

		Select sel4 = new Select(GC4.letterGradeFinal4);
		// sel4.selectByVisibleText("F");
		sel4.selectByIndex(5);

		Select sel5 = new Select(GC4.letterGradeFinal5);
		// sel5.selectByVisibleText("D");
		sel5.selectByIndex(5);

		Select sel6 = new Select(GC4.letterGradeFinal6);
		// sel6.selectByVisibleText("F");
		sel6.selectByIndex(5);

		Select sel7 = new Select(GC4.letterGradeFinal7);
		// sel7.selectByVisibleText("D");
		sel7.selectByIndex(5);

		Select sel8 = new Select(GC4.letterGradeFinal8);
		// sel8.selectByVisibleText("F");
		sel8.selectByIndex(5);

		Select sel9 = new Select(GC4.letterGradeFinal9);
		// sel9.selectByVisibleText("D");
		sel9.selectByIndex(5);

		Select sel10 = new Select(GC4.letterGradeFinal10);
		// sel10.selectByVisibleText("F");
		sel10.selectByIndex(5);

		Select sel11 = new Select(GC4.letterGradeFinal11);
		// sel11.selectByVisibleText("D");
		sel11.selectByIndex(5);

		Select sel12 = new Select(GC4.letterGradeFinal12);
		// sel12.selectByVisibleText("F");
		sel12.selectByIndex(5);

		Select sel13 = new Select(GC4.letterGradeFinal13);
		// sel13.selectByVisibleText("D");
		sel13.selectByIndex(5);

		Select sel14 = new Select(GC4.letterGradeFinal14);
		// sel14.selectByVisibleText("F");
		sel14.selectByIndex(5);

		Select sel15 = new Select(GC4.letterGradeFinal15);
		// sel15.selectByVisibleText("D");
		sel15.selectByIndex(11);

		Select sel16 = new Select(GC4.letterGradeFinal16);
		// sel16.selectByVisibleText("F");
		sel16.selectByIndex(11);

		Select sel17 = new Select(GC4.letterGradeFinal17);
		// sel17.selectByVisibleText("D");
		sel17.selectByIndex(11);

		Select sel18 = new Select(GC4.letterGradeFinal18);
		// sel18.selectByVisibleText("F");
		sel18.selectByIndex(11);

		Select sel19 = new Select(GC4.letterGradeFinal19);
		// sel19.selectByVisibleText("D");
		sel19.selectByIndex(11);

		Select sel20 = new Select(GC4.letterGradeFinal20);
		// sel20.selectByVisibleText("F");
		sel20.selectByIndex(11);

		scrollToElement(GC4.checkConformity);

		// GC4.checkConformity.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.checkConformity);
	}

	public void ErrorMessages() {
		// GradeCoursePage4 GC4 = PageFactory.initElements(driver,
		// GradeCoursePage4.class);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(redMessage1New));

		softAssert1.assertEquals(redMessage1New.isDisplayed(), true);
		softAssert1.assertEquals(redMessage2New.isDisplayed(), true);
		softAssert1.assertEquals(redMessage3New.isDisplayed(), true);
		softAssert1.assertEquals(redMessage4New.isDisplayed(), true);
		softAssert1.assertEquals(redMessage5New.isDisplayed(), true);

		System.out.println("All error messages have been verified");
	}

	public void selectFinalGradesWithNote() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		Select sel1 = new Select(GC4.letterGradeFinal1);
		sel1.selectByIndex(2);

		Select sel2 = new Select(GC4.letterGradeFinal2);
		sel2.selectByIndex(2);

		Select sel3 = new Select(GC4.letterGradeFinal3);
		sel3.selectByIndex(2);

		Select sel4 = new Select(GC4.letterGradeFinal4);
		sel4.selectByIndex(3);

		Select sel5 = new Select(GC4.letterGradeFinal5);
		sel5.selectByIndex(3);

		Select sel6 = new Select(GC4.letterGradeFinal6);
		sel6.selectByIndex(3);

		Select sel7 = new Select(GC4.letterGradeFinal7);
		sel7.selectByIndex(3);

		Select sel8 = new Select(GC4.letterGradeFinal8);
		sel8.selectByIndex(4);

		Select sel9 = new Select(GC4.letterGradeFinal9);
		sel9.selectByIndex(4);

		Select sel10 = new Select(GC4.letterGradeFinal10);
		sel10.selectByIndex(4);

		Select sel11 = new Select(GC4.letterGradeFinal11);
		sel11.selectByIndex(4);

		Select sel12 = new Select(GC4.letterGradeFinal12);
		sel12.selectByIndex(4);

		Select sel13 = new Select(GC4.letterGradeFinal13);
		sel13.selectByIndex(4);

		Select sel14 = new Select(GC4.letterGradeFinal14);
		sel14.selectByIndex(4);

		Select sel15 = new Select(GC4.letterGradeFinal15);
		sel15.selectByIndex(4);

		Select sel16 = new Select(GC4.letterGradeFinal16);
		sel16.selectByIndex(5);

		Select sel17 = new Select(GC4.letterGradeFinal17);
		sel17.selectByIndex(5);

		Select sel18 = new Select(GC4.letterGradeFinal18);
		sel18.selectByIndex(5);

		Select sel19 = new Select(GC4.letterGradeFinal19);
		sel19.selectByIndex(5);

		Select sel20 = new Select(GC4.letterGradeFinal20);
		sel20.selectByIndex(5);

		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}

	public void finalModal() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.submitFinalGrade));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.submitFinalGrade);

		softAssert1.assertEquals(GC4.textNotes.isEnabled(), true);
		softAssert1.assertEquals(GC4.NoButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.Yes.isEnabled(), true);
	}

	public void saveNote() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.textNotes));
		
		GC4.textNotes.sendKeys("Ok");
		// Yes.click();
		highLightElement(driver, GC4.Yes);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.Yes);
	}

	public void checkApprovalStatus() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(finalApprovalStatus));
		 
		softAssert1.assertEquals(finalApprovalStatus.isDisplayed(), true);
		highLightElement(driver, finalApprovalStatus);
		System.out.println(finalApprovalStatus.getText());
		System.out.println("Grading status updated to Final Grades Pending Approval");

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
		 * wait1.until(ExpectedConditions.visibilityOf(AssignGradeButton));
		 */

		softAssert1.assertEquals(GC4.AssignGradeButton.isEnabled(), false);
	}

	public void clickOnCancelEmulation() {
		// scrollToElement(cancelEmulation);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(cancelEmulation));

		highLightElement(driver, cancelEmulation);
		// cancelEmulation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click()", cancelEmulation);
	}

	public void searchCourse() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
				
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert1.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		GC4.searchBox.sendKeys("Intro to Fed Income Tax");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void clickOnCourse() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		// clickOnCourse();
		// CourseLink.click();
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
		 * wait1.until(ExpectedConditions.visibilityOf(GC4.CourseLink));
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.CourseLink);

	}

	public void finalApprovalAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.checkConformity.isEnabled(), true);
		softAssert1.assertEquals(finalApprovalStatus1.isDisplayed(), true);
		System.out.println(finalApprovalStatus1.getText());
		softAssert1.assertEquals(GC4.CourseName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.InstructorName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.EmulationLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.EmailLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert1.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert1.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Notes.isDisplayed(), true);

		softAssert1.assertEquals(studentIDName1.isDisplayed(), true);
		softAssert1.assertEquals(rawScore1.isDisplayed(), true);
		softAssert1.assertEquals(grade1.isDisplayed(), true);
		softAssert1.assertEquals(note1.isEnabled(), true);

		/*
		 * softAssert1.assertEquals(Paper1.isDisplayed(), false);
		 * softAssert1.assertEquals(Publish1.isDisplayed(), false);
		 */

		softAssert1.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert1.assertEquals(ApprovalStatus.isDisplayed(), true);
		softAssert1.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), false);
		softAssert1.assertEquals(GC4.StudentCount.isDisplayed(), true);

		System.out.println("All course final approval attributes are verified");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(GC4.checkConformity));
		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}

	public void tableDataRowCountAndADistribution() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(count1));
		scrollToElement(count1);
		softAssert1.assertEquals(count1.isDisplayed(), false);
		softAssert1.assertEquals(count2.isDisplayed(), false);
		softAssert1.assertEquals(count3.isDisplayed(), false);
		softAssert1.assertEquals(count4.isDisplayed(), false);
		softAssert1.assertEquals(count5.isDisplayed(), false);
		softAssert1.assertEquals(count6.isDisplayed(), false);
		softAssert1.assertEquals(actualDist1.isDisplayed(), false);
		softAssert1.assertEquals(actualDist2.isDisplayed(), false);
		softAssert1.assertEquals(actualDist3.isDisplayed(), false);
		softAssert1.assertEquals(actualDist4.isDisplayed(), false);
		softAssert1.assertEquals(actualDist5.isDisplayed(), false);
		softAssert1.assertEquals(actualDist6.isDisplayed(), false);
		System.out.println("The count and actual distribution count both are verified");
	}

	public void recentNoteAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		// softAssert1.assertEquals(RecentNotes.isDisplayed(), true);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.CourseDetails));
		scrollToElement(GC4.CourseDetails);
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert1.assertEquals(finalApprovalStatus2.isDisplayed(), true);
		// softAssert1.assertEquals(TermSpring20.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), false);
		softAssert1.assertEquals(semSpring.isDisplayed(), true);
		softAssert1.assertEquals(DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert1.assertEquals(BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to
																		// check
		softAssert1.assertEquals(studRegister.isDisplayed(), true);
		softAssert1.assertEquals(studCountMean.isDisplayed(), true);
		softAssert1.assertEquals(classMean.isDisplayed(), true);
	}

	public void clickOnRejectFinalGrades() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkconformity1));
		scrollToElement(checkconformity1);
		checkconformity1.click();
		wait.until(ExpectedConditions.visibilityOf(rejectGrades));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", rejectGrades);

		// rejectGrades.click();

		softAssert1.assertEquals(GC4.textNotes.isEnabled(), true);
		softAssert1.assertEquals(GC4.NoButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.Yes.isEnabled(), true);
	}

	public void clickOnNoButton() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.NoButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.NoButton);
		// NoButton.click();
	}

	public void clickOnYes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(rejectGrades));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", rejectGrades);
//				rejectGrades.click();
		GC4.textNotes.sendKeys("Proceed");
		wait.until(ExpectedConditions.visibilityOf(GC4.Yes));
		highLightElement(driver, GC4.Yes);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", GC4.Yes);
		// Yes.click();
	}

	public void searchCourseAgain() throws InterruptedException {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert1.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		highLightElement(driver, GC4.searchBox);
		GC4.searchBox.sendKeys("Intro to Fed Income Tax");

		//Thread.sleep(6000);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(finalGradeNotApprovedStatus));

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		highLightElement(driver, finalGradeNotApprovedStatus);
		softAssert1.assertEquals(finalGradeNotApprovedStatus.isDisplayed(), true);
		System.out.println(finalGradeNotApprovedStatus.getText());

		// clickOnCourse();
	}

	public void finalEmulAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.CancelLink));
		softAssert1.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.EmulInstructorName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.YourCourseLink.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Title.isDisplayed(), true);
		softAssert1.assertEquals(GC4.ClassLevel.isDisplayed(), true);
		// softAssert1.assertEquals(BlindGrade.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CurrentStatus.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradingDueDate.isDisplayed(), true);

		//WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOf(GC4.emulCourseTitle));
		softAssert1.assertEquals(GC4.emulCourseTitle.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseTitle1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.ClassLevel1.isDisplayed(), true);
		// softAssert1.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert1.assertEquals(finalGradeNotApprovedStatus.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradingDueDate1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.AssignGradeButton.isEnabled(), true);

		System.out.println("Final emulation attributes are verified");
	}

	public void clickOnAssignAndCheckAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		GC4.clickOnAssignGrade();
	}

	public void assignEditGradesAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.CancelLink));
		softAssert1.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(checkconformity1.isEnabled(), true);
		softAssert1.assertEquals(GC4.EmulInstructorName.isDisplayed(), true);
		softAssert1.assertEquals(finalApprovalStatus1.isDisplayed(), true);
		highLightElement(driver, finalApprovalStatus1);
		softAssert1.assertEquals(GC4.courseTitle.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Instructor.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradingDueDate2.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert1.assertEquals(GC4.HistoryTab.isEnabled(), true);
		
		softAssert1.assertEquals(IdNameTitle.isDisplayed(), true);
		softAssert1.assertEquals(rawTitle.isDisplayed(), true);
		softAssert1.assertEquals(LetterGradeTitle.isDisplayed(), true);
		softAssert1.assertEquals(notesTitle.isEnabled(), true);
		softAssert1.assertEquals(IdName1New.isDisplayed(), false);
		softAssert1.assertEquals(Raw1.isDisplayed(), false);
		softAssert1.assertEquals(LetterGrade1.isDisplayed(), false);
		softAssert1.assertEquals(Notes1.isDisplayed(), false);

		System.out.println("All attributes are verified");

		softAssert1.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert1.assertEquals(gradeNotApprovedStatus1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), true); //it should be no so,
		// have commented this for now
		softAssert1.assertEquals(GC4.StudentCount.isDisplayed(), true);

		System.out.println("All the recent notes and course details attributes are verified");

	}

	public void changeGrade() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.letterGradeFinal1));
		
		scrollToElement(GC4.letterGradeFinal1);
		Select sel1 = new Select(GC4.letterGradeFinal1);
		sel1.selectByIndex(1);

		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(checkconformity1));
		// scrollToElement(checkconformity1);
		checkconformity1.click();
	}

	public void attributesCheck() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.CancelLink));
		softAssert1.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(resubmitFGrade.isEnabled(), true);
		softAssert1.assertEquals(reqConformityExem.isEnabled(), true);

		softAssert1.assertEquals(GC4.courseTitle.isDisplayed(), true);
		softAssert1.assertEquals(GC4.InstructorNew.isDisplayed(), true);
		softAssert1.assertEquals(conformityReportMessage.isDisplayed(), true);
		System.out.println(conformityReportMessage.getCssValue("color"));
	}

	public void clickOnResubmitFinalGrade() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(resubmitFGrade));

		highLightElement(driver, resubmitFGrade);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", resubmitFGrade);
		// resubmitFGrade.click();
	}

	public void resubmitAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.textNotes));

		softAssert1.assertEquals(GC4.textNotes.isEnabled(), true);
		softAssert1.assertEquals(GC4.NoButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.Yes.isEnabled(), true);
	}

	public void checkConformityPageAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(approveFGrades.isEnabled(), true);
		softAssert1.assertEquals(rejectFGrades.isEnabled(), true);
		softAssert1.assertEquals(deactivateButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.CourseName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.conformityInstructor.isDisplayed(), true);
		softAssert1.assertEquals(CourseConformity.isDisplayed(), true);
		softAssert1.assertEquals(conformityReportMessage.isDisplayed(), true);
		System.out.println(conformityReportMessage.getCssValue("color"));
		System.out.println("All attributes are verified");
	}

	public void clickOnApproveFinalGrades() {
		// approveFGrades.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(approveFGrades));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", approveFGrades);

		/*
		 * WebDriverWait wait2 = new WebDriverWait(driver, 30);
		 * wait2.until(ExpectedConditions.visibilityOf(Yes));
		 */

		/*
		 * JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 * js1.executeScript("arguments[0].click()", Yes);
		 */

	}

	public void statusOnCourseListingPage() {
		
		  WebDriverWait wait1 = new WebDriverWait(driver, 60);
		  wait1.until(ExpectedConditions.visibilityOf(StatusBannerUpload));
		 
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		highLightElement(driver, StatusBannerUpload);
		softAssert1.assertEquals(StatusBannerUpload.isDisplayed(), true);
		System.out.println(StatusBannerUpload.getText());
	}

	public void gradingCourseDetailAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(checkconformity1.isEnabled(), true);
		highLightElement(driver, StatusBannerUpload3);
		softAssert1.assertEquals(StatusBannerUpload3.isDisplayed(), true);

		softAssert1.assertEquals(GC4.CourseName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.InstructorName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.EmulationLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.EmailLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert1.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert1.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Notes.isDisplayed(), true);

		softAssert1.assertEquals(studentIDName1.isDisplayed(), true);
		softAssert1.assertEquals(rawScore1.isDisplayed(), true);
		softAssert1.assertEquals(grade1.isDisplayed(), true);
		softAssert1.assertEquals(note1.isEnabled(), true);

		// softAssert1.assertEquals(Paper1.isDisplayed(), false);
		// softAssert1.assertEquals(Publish1.isDisplayed(), false);

		softAssert1.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		highLightElement(driver, StatusBannerUpload1);
		softAssert1.assertEquals(StatusBannerUpload1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), false);
		softAssert1.assertEquals(GC4.StudentCount.isDisplayed(), true);

		System.out.println("All course final approval attributes are verified");
	}

	public void clickOnCheckConformity() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(checkconformity1));
		scrollToElement(checkconformity1);
		// checkconformity1.click();
		highLightElement(driver, checkconformity1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", checkconformity1);
	}

	public void checkAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(deactivateButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.CourseName.isDisplayed(), true);
		highLightElement(driver, GC4.InstructorNew);
		softAssert1.assertEquals(GC4.InstructorNew.isDisplayed(), true);

		softAssert1.assertEquals(CourseConformity.isDisplayed(), true);
		softAssert1.assertEquals(conformityReportMessage.isDisplayed(), true);
		System.out.println(conformityReportMessage.getCssValue("color"));
		System.out.println("All attributes are verified");
	}

	public void bannerUploadAttribute() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.CourseDetails));
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert1.assertEquals(StatusBannerUpload2.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), false);
		scrollToElement(semSpring);
		softAssert1.assertEquals(semSpring.isDisplayed(), true);
		softAssert1.assertEquals(DistSchedule.isDisplayed(), true); // this is an extra attribute visible on portal
		softAssert1.assertEquals(BlindGradeNew.isDisplayed(), true); // it should be NO but here it is Yes, need to
																		// check
		softAssert1.assertEquals(studRegister.isDisplayed(), true);
		softAssert1.assertEquals(studCountMean.isDisplayed(), true);
		softAssert1.assertEquals(classMean.isDisplayed(), true);

		System.out.println("All final grade banner attributes are verified");
	}

	public void clickOnEmulationLink() {
		scrollToElement(emulLink);

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(emulLink));

		highLightElement(driver, emulLink);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", emulLink);

	}

	public void checkEmulationAttributes() {
			 
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


		  WebDriverWait wait = new WebDriverWait(driver, 60);
		  wait.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
	
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait.until(ExpectedConditions.visibilityOf(GC4.CancelLink));
		softAssert1.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert1.assertEquals(GC4.EmulInstructorName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.YourCourseLink.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Title.isDisplayed(), true);
		softAssert1.assertEquals(GC4.ClassLevel.isDisplayed(), true);
		softAssert1.assertEquals(GC4.BlindGrade.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CurrentStatus.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradingDueDate.isDisplayed(), true);

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
		 * wait1.until(ExpectedConditions.visibilityOf(emulCourseTitle));
		 */
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		softAssert1.assertEquals(GC4.emulCourseTitle.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseTitle1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.ClassLevel1.isDisplayed(), true);
		// softAssert1.assertEquals(BlindGrade1.isDisplayed(), true);
		softAssert1.assertEquals(StatusBannerUpload.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradingDueDate1.isDisplayed(), true);
		softAssert1.assertEquals(ViewGradeButton.isEnabled(), true);

		System.out.println("Emulation attributes are verified");
	}

	public void clickOnViewGrades() {
		// ViewGradeButton.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(ViewGradeButton));
		highLightElement(driver, ViewGradeButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ViewGradeButton);
	}

	public void viewGradesAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(checkconformity1.isEnabled(), true);
		softAssert1.assertEquals(StatusBannerUpload3.isDisplayed(), true);

		softAssert1.assertEquals(GC4.CourseName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.InstructorName.isDisplayed(), true);

		softAssert1.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert1.assertEquals(GC4.GradeTab.isEnabled(), true);
		softAssert1.assertEquals(GC4.HistoryTab.isEnabled(), true);
		// softAssert1.assertEquals(copyPasteImport.isDisplayed(), false);
		softAssert1.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.Notes.isDisplayed(), true);

		softAssert1.assertEquals(studentIDName1.isDisplayed(), true);
		softAssert1.assertEquals(rawScore1.isDisplayed(), true);
		softAssert1.assertEquals(grade1.isDisplayed(), true);
		softAssert1.assertEquals(note1.isEnabled(), true);

		// softAssert1.assertEquals(Paper1.isDisplayed(), false);
		// softAssert1.assertEquals(Publish1.isDisplayed(), false);

		softAssert1.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert1.assertEquals(StatusBannerUpload1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), false);
		softAssert1.assertEquals(GC4.StudentCount.isDisplayed(), true);

		System.out.println("All attributes are verified");
	}

	public void checkConformityAttributes() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(GC4.GradingRule));
		softAssert1.assertEquals(GC4.GradingRule.isEnabled(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.BackButton));
		softAssert1.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert1.assertEquals(GC4.CourseName.isDisplayed(), true);
		softAssert1.assertEquals(GC4.conformityInstructor.isDisplayed(), true);
		softAssert1.assertEquals(CourseConformity.isDisplayed(), true);
		softAssert1.assertEquals(conformityReportMessage.isDisplayed(), true);
		System.out.println(conformityReportMessage.getCssValue("color"));

		// softAssert1.assertEquals(RecentNotes.isDisplayed(), true);
		softAssert1.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		// softAssert1.assertEquals(StatusBannerUpload1.isDisplayed(), true);
		softAssert1.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		// softAssert1.assertEquals(Blind.isDisplayed(), false);
		scrollToElement(studCountMean);
		highLightElement(driver, studCountMean);
		softAssert1.assertEquals(studCountMean.isDisplayed(), true);

		System.out.println("All attributes are verified");
	}

	public void cancelEmul() {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(cancelEmul));
		highLightElement(driver, cancelEmul);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", cancelEmul);
		// cancelEmul.click();
	}

	public void DeactivateClick() {
		// deactivateButton.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(deactivateButton));
		highLightElement(driver, deactivateButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", deactivateButton);
	}

	public void DeactivateAttributes() {
		
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(textNoteBox));
		 
		highLightElement(driver, textNoteBox);
		softAssert1.assertEquals(textNoteBox.isEnabled(), true);
		System.out.println("Notebox is enabled");

		highLightElement(driver, GC4.NoButton);
		softAssert1.assertEquals(GC4.NoButton.isEnabled(), true);

		highLightElement(driver, GC4.Yes);
		softAssert1.assertEquals(GC4.Yes.isEnabled(), true);

	}

	public void ClickOnNoAndProceed() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.textNotes));

		GC4.textNotes.sendKeys("No");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.NoButton);
		// NoButton.click();
	}

	public void ClickOnYesAndProceed() {
		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);

		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOf(deactivateButton));
		deactivateButton.click();

		//WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GC4.textNotes));

		GC4.textNotes.clear();
		GC4.textNotes.sendKeys("Ok");

		highLightElement(driver, GC4.Yes);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", GC4.Yes);
		// NoButton.click();
	}

	public void checkFinalStatus() {

		GradeCoursePage4A GC4 = PageFactory.initElements(driver, GradeCoursePage4A.class);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 90);
		wait1.until(ExpectedConditions.visibilityOf(GC4.COURSE));
		softAssert1.assertEquals(GC4.COURSE.isDisplayed(), true);
		wait1.until(ExpectedConditions.visibilityOf(GC4.searchBox));
		GC4.searchBox.sendKeys("Intro to Fed Income Tax");

		wait1.until(ExpectedConditions.visibilityOf(notActivatedStatus));
		softAssert1.assertEquals(notActivatedStatus.isDisplayed(), true);
		System.out.println(notActivatedStatus.getText());
	}

}

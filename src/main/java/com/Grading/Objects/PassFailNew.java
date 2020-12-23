package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

public class PassFailNew extends TestBaseGrade {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

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
	WebElement searchBox;

	// @FindBy(xpath="//input[@id='check_tag_0']")
	//@FindBy(xpath = "(//label[@class='m-b-15'])[4]")
	@FindBy(xpath="//input[@id='check_tag_0']")
	WebElement CourseCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActivateButton;

	@FindBy(xpath = "//span[contains(text(),'Final Grading Phase')]")
	WebElement CourseStatus;

	@FindBy(xpath = "//div[contains(text(),'Courses')]")
	WebElement COURSE;

	@FindBy(xpath = "//span[contains(text(),'Negotiations Sem')]")
	WebElement CourseLink;

	@FindBy(xpath = "//span[contains(text(),'Proceed to Final Grading')]")
	WebElement ProceedButton;

	@FindBy(xpath = "//a[contains(text(),'Back')]")
	WebElement BackButton;

	@FindBy(xpath = "//h1[contains(text(),'Final Grading Phase')]")
	WebElement CourseName;

	@FindBy(xpath = "//span[contains(text(),'Frank Bombard')]")
	WebElement InstructorName;

	@FindBy(xpath = "//em[@title='Emulate']")
	WebElement EmulationLink;

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

	@FindBy(xpath = "(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement IdName1;
	
	@FindBy(xpath = "(//input[@class='btn-block' and @type='checkbox'])[1]")
	WebElement Paper1;

	@FindBy(xpath = "(//input[@class='btn-block' and @type='checkbox'])[2]")
	WebElement Publish1;

	@FindBy(xpath = "//a[contains(text(),'Grading Rules')]")
	WebElement GradingRule;

	@FindBy(xpath = "//strong[contains(text(),'(CANCEL)')]")
	WebElement CancelLink;

	@FindBy(xpath = "//strong[contains(text(),'Recent Notes')]")
	WebElement RecentNotes;

	@FindBy(xpath = "//strong[contains(text(),'Course Details')]")
	WebElement CourseDetails;

	@FindBy(xpath = "//p[contains(text(),'Final Grading Phase')]")
	WebElement GradeStatusFinal;

	@FindBy(xpath = "//div[contains(text(),'Spring 2020 ')]")
	WebElement TermSpring20;
	
	@FindBy(xpath = "//div[contains(text(),' No ')]")
	WebElement Blind;

	@FindBy(xpath = "//div[contains(text(),' 3 ')]")
	WebElement StudentCount;

	public PassFailNew(WebDriver driver) {
				this.driver = driver;
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
		staleElementClick(5, CourseTab, 30);
		CourseTab.click();
	}

	public void searchCourse() {
		softAssert.assertEquals(COURSE.isDisplayed(), true);
		//searchBox.sendKeys("Negotiations Sem");
		searchBox.sendKeys("17871");
	}

	public void activateCourse() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
		wait1.until(ExpectedConditions.visibilityOf(CourseCheckBox));
		highLightElement(driver, CourseCheckBox);

		//staleElementClick(6, CourseCheckBox, 30);
		CourseCheckBox.click();
		Thread.sleep(50000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait1.until(ExpectedConditions.visibilityOf(ActivateButton));
		ActivateButton.click();
	}

	public void courseStatus() {
		softAssert.assertEquals(CourseStatus.isDisplayed(), true);
		String CS = CourseStatus.getText();
		System.out.println("Grade status is: " + CS);
	}

	public void clickOnCourse() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", CourseLink);
	}

	public void courseAttributesVerification() {
		softAssert.assertEquals(ProceedButton.isEnabled(), true);
		softAssert.assertEquals(BackButton.isEnabled(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(EmulationLink.isDisplayed(), true);
		softAssert.assertEquals(EmailLink.isDisplayed(), true);
		softAssert.assertEquals(DueDate.isDisplayed(), true);
		softAssert.assertEquals(GradeTab.isDisplayed(), true);
		softAssert.assertEquals(HistoryTab.isDisplayed(), true);
		softAssert.assertEquals(IdName.isDisplayed(), true);
		softAssert.assertEquals(RawScore.isDisplayed(), true);
		softAssert.assertEquals(Letter1.isDisplayed(), true);
		softAssert.assertEquals(Notes.isDisplayed(), true);		
		softAssert.assertEquals(IdName1.isDisplayed(), true);
		//softAssert.assertEquals(Paper1.isEnabled(), false);
		//softAssert.assertEquals(Publish1.isEnabled(), false);

		softAssert.assertEquals(RecentNotes.isDisplayed(), false);
		softAssert.assertEquals(CourseDetails.isDisplayed(), false);
		softAssert.assertEquals(GradeStatusFinal.isDisplayed(), false);
		softAssert.assertEquals(TermSpring20.isDisplayed(), false);
		softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(StudentCount.isDisplayed(), true);

		System.out.println("All course attributes are verified");
	}

	
	 public void clickOnEmulation() 
	 { 
		 EmulationLink.click(); 
	 }
	 /* 
	 * public void emulationAttributesVerification() {
	 * softAssert.assertEquals(GradingRule.isEnabled(), true);
	 * softAssert.assertEquals(CancelLink.isEnabled(), true);
	 * softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
	 * softAssert.assertEquals(YourCourseLink.isDisplayed(), true);
	 * softAssert.assertEquals(Title.isDisplayed(), true);
	 * softAssert.assertEquals(ClassLevel.isDisplayed(), true);
	 * softAssert.assertEquals(BlindGrade.isDisplayed(), true);
	 * softAssert.assertEquals(CurrentStatus.isDisplayed(), true);
	 * softAssert.assertEquals(GradingDueDate.isDisplayed(), true); WebDriverWait
	 * wait1 = new WebDriverWait(driver, 50);
	 * wait1.until(ExpectedConditions.visibilityOf(emulCourseTitle));
	 * softAssert.assertEquals(emulCourseTitle.isDisplayed(), true);
	 * softAssert.assertEquals(CourseTitle1.isDisplayed(), true);
	 * softAssert.assertEquals(ClassLevel1.isDisplayed(), true);
	 * softAssert.assertEquals(BlindGrade1.isDisplayed(), true);
	 * softAssert.assertEquals(CurrentStatus1.isDisplayed(), true);
	 * softAssert.assertEquals(GradingDueDate1.isDisplayed(), true);
	 * softAssert.assertEquals(AssignGradeButton.isEnabled(), true);
	 * 
	 * System.out.println("All the emulation attributes are verified"); }
	 */
}

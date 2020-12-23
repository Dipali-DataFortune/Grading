/**
 * 
 */
package com.Grading.Objects;

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
public class GradeCoursePage5 extends TestBaseGrade{
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeCoursePage5(WebDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[contains(text(),'A grades are expected to be between 17% and 19%')]")
	WebElement redMessage1;
	
	@FindBy(xpath="//li[contains(text(),'A- grades are expected to be between 19% and 21%')]")
	WebElement redMessage2;
	
	@FindBy(xpath="//li[contains(text(),'B+ grades are expected to be between 39% and 43%')]")
	WebElement redMessage3;
	
	@FindBy(xpath="//li[contains(text(),'B expected be less than 25%')]")
	WebElement redMessage4;
	
	@FindBy(xpath="//li[contains(text(),'All B- to F grades expected to be less than 5%')]")
	WebElement redMessage5;
	
	@FindBy(xpath="//span[contains(text(),'Final grades pending approval')]")
	WebElement finalApprovalStatus;
	
	@FindBy(xpath="//span[contains(text(),'FINAL GRADES PENDING APPROVAL')]")
	WebElement finalApprovalStatus2;
		
	@FindBy(xpath="//strong[contains(text(),'CANCEL')]")
	WebElement cancelEmulation;
	
	//@FindBy(xpath="//h1[contains(text(),'Final grades pending approval')]")
	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile'])[2]")	
	//@FindBy(xpath="//span[contains(text(),'Final grades pending approval')]")
	WebElement finalApprovalStatus1;
	
	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile tabletext'])[1]")
	WebElement studentIDName1;
	
	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile'])[1]")
	WebElement rawScore1;

	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile tabletext'])[2]")
	WebElement grade1;
	
	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile'])[2]")
	WebElement note1;
	
	@FindBy(xpath="//p[contains(text(),'Final grades pending approval')]")
	WebElement ApprovalStatus;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[2]")
	WebElement count1;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[7]")
	WebElement count2;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[12]")
	WebElement count3;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[17]")
	WebElement count4;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[22]")
	WebElement count5;
	
	@FindBy(xpath="(//td[contains(text(),'0')])[2]")
	WebElement count6;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[5]")
	WebElement actualDist1;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[10]")
	WebElement actualDist2;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[15]")
	WebElement actualDist3;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[20]")
	WebElement actualDist4;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[25]")
	WebElement actualDist5;
	
	@FindBy(xpath="(//td[@class='enddistributiongroup'])[27]")
	WebElement actualDist6;
	
	@FindBy(xpath="(//div[@class='coursedetail'])[1]")
	WebElement semSpring;
	
	@FindBy(xpath="(//div[@class='coursedetail'])[2]")
	WebElement DistSchedule;
	
	@FindBy(xpath="(//div[@class='coursedetail'])[3]")
	WebElement BlindGrade;
	
	@FindBy(xpath="(//div[@class='coursedetail'])[4]")
	WebElement studRegister;
	
	@FindBy(xpath="(//div[@class='coursedetail'])[5]")
	WebElement studCountMean;
	
	@FindBy(xpath="(//div[@class='coursedetail'])[6]")
	WebElement classMean;

	@FindBy(xpath="//button[contains(text(),'Reject Final Grades')]")
	WebElement rejectGrades;
	
	@FindBy(xpath="//span[contains(text(),'Final grades not approved')]")
	WebElement finalGradeNotApprovedStatus;
	
		
	GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
	public void selectBAndFGrades()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		Select sel1=new Select(GC4.letterGradeFinal1);
		//sel1.selectByVisibleText("D");
		sel1.selectByIndex(5);
		
		Select sel2=new Select(GC4.letterGradeFinal2);
		//sel2.selectByVisibleText("F");
		sel2.selectByIndex(5);
		
		Select sel3=new Select(GC4.letterGradeFinal3);
		//sel3.selectByVisibleText("D");
		sel3.selectByIndex(5);
		
		Select sel4=new Select(GC4.letterGradeFinal4);
		//sel4.selectByVisibleText("F");
		sel4.selectByIndex(5);
		
		Select sel5=new Select(GC4.letterGradeFinal5);
		//sel5.selectByVisibleText("D");
		sel5.selectByIndex(5);
		
		Select sel6=new Select(GC4.letterGradeFinal6);
		//sel6.selectByVisibleText("F");
		sel6.selectByIndex(5);
		
		Select sel7=new Select(GC4.letterGradeFinal7);
		//sel7.selectByVisibleText("D");
		sel7.selectByIndex(5);
		
		Select sel8=new Select(GC4.letterGradeFinal8);
		//sel8.selectByVisibleText("F");
		sel8.selectByIndex(5);
		
		Select sel9=new Select(GC4.letterGradeFinal9);
		//sel9.selectByVisibleText("D");
		sel9.selectByIndex(5);
		
		Select sel10=new Select(GC4.letterGradeFinal10);
		//sel10.selectByVisibleText("F");
		sel10.selectByIndex(5);
		
		Select sel11=new Select(GC4.letterGradeFinal11);
		//sel11.selectByVisibleText("D");
		sel11.selectByIndex(5);
		
		Select sel12=new Select(GC4.letterGradeFinal12);
		//sel12.selectByVisibleText("F");
		sel12.selectByIndex(5);
		
		Select sel13=new Select(GC4.letterGradeFinal13);
		//sel13.selectByVisibleText("D");
		sel13.selectByIndex(5);
		
		Select sel14=new Select(GC4.letterGradeFinal14);
		//sel14.selectByVisibleText("F");
		sel14.selectByIndex(5);
		
		Select sel15=new Select(GC4.letterGradeFinal15);
		//sel15.selectByVisibleText("D");
		sel15.selectByIndex(11);
		
		Select sel16=new Select(GC4.letterGradeFinal16);
		//sel16.selectByVisibleText("F");
		sel16.selectByIndex(11);
		
		Select sel17=new Select(GC4.letterGradeFinal17);
		//sel17.selectByVisibleText("D");
		sel17.selectByIndex(11);
		
		Select sel18=new Select(GC4.letterGradeFinal18);
		//sel18.selectByVisibleText("F");
		sel18.selectByIndex(11);
		
		Select sel19=new Select(GC4.letterGradeFinal19);
		//sel19.selectByVisibleText("D");
		sel19.selectByIndex(11);
		
		Select sel20=new Select(GC4.letterGradeFinal20);
		//sel20.selectByVisibleText("F");
		sel20.selectByIndex(11);
		
		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}
	
	public void ErrorMessages()
	{
		//GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		softAssert.assertEquals(redMessage1.isDisplayed(), true);
		softAssert.assertEquals(redMessage2.isDisplayed(), true);
		softAssert.assertEquals(redMessage3.isDisplayed(), true);
		softAssert.assertEquals(redMessage4.isDisplayed(), true);
		softAssert.assertEquals(redMessage5.isDisplayed(), true);
		
		System.out.println("All error messages have been verified");
	}
	
	public void selectFinalGradesWithNote()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		Select sel1=new Select(GC4.letterGradeFinal1);
		sel1.selectByIndex(2);
		
		Select sel2=new Select(GC4.letterGradeFinal2);
		sel2.selectByIndex(2);
		
		Select sel3=new Select(GC4.letterGradeFinal3);
		sel3.selectByIndex(2);
		
		Select sel4=new Select(GC4.letterGradeFinal4);
		sel4.selectByIndex(3);
		
		Select sel5=new Select(GC4.letterGradeFinal5);
		sel5.selectByIndex(3);
		
		Select sel6=new Select(GC4.letterGradeFinal6);
		sel6.selectByIndex(3);
		
		Select sel7=new Select(GC4.letterGradeFinal7);
		sel7.selectByIndex(3);
		
		Select sel8=new Select(GC4.letterGradeFinal8);
		sel8.selectByIndex(4);
		
		Select sel9=new Select(GC4.letterGradeFinal9);
		sel9.selectByIndex(4);
		
		Select sel10=new Select(GC4.letterGradeFinal10);
		sel10.selectByIndex(4);
		
		Select sel11=new Select(GC4.letterGradeFinal11);
		sel11.selectByIndex(4);
		
		Select sel12=new Select(GC4.letterGradeFinal12);
		sel12.selectByIndex(4);
		
		Select sel13=new Select(GC4.letterGradeFinal13);
		sel13.selectByIndex(4);
		
		Select sel14=new Select(GC4.letterGradeFinal14);
		sel14.selectByIndex(4);
		
		Select sel15=new Select(GC4.letterGradeFinal15);
		sel15.selectByIndex(4);
		
		Select sel16=new Select(GC4.letterGradeFinal16);
		sel16.selectByIndex(5);
		
		Select sel17=new Select(GC4.letterGradeFinal17);
		sel17.selectByIndex(5);
		
		Select sel18=new Select(GC4.letterGradeFinal18);
		sel18.selectByIndex(5);
		
		Select sel19=new Select(GC4.letterGradeFinal19);
		sel19.selectByIndex(5);
		
		Select sel20=new Select(GC4.letterGradeFinal20);
		sel20.selectByIndex(5);
		
		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}
	
	public void finalModal()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(GC4.submitFinalGrade));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", GC4.submitFinalGrade);
		
		softAssert.assertEquals(GC4.textNotes.isEnabled(), true);
		softAssert.assertEquals(GC4.NoButton.isEnabled(), true);
		softAssert.assertEquals(GC4.Yes.isEnabled(), true);
	}
	
	public void saveNote()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		
		GC4.textNotes.sendKeys("Ok");
		GC4.Yes.click();		
	}
	
	public void checkApprovalStatus()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(finalApprovalStatus.isDisplayed(), true);
		System.out.println(finalApprovalStatus.getText());
		System.out.println("Grading status updated to Final Grades Pending Approval");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(GC4.AssignGradeButton));
		softAssert.assertEquals(GC4.AssignGradeButton.isEnabled(), false);		
	}
	
	public void clickOnCancelEmulation()
	{
		cancelEmulation.click();
	}
	
	public void searchCourse()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
		GC4.searchBox.sendKeys("Intro to Fed Income Tax");
		
		GC4.clickOnCourse();
	}
	
	public void finalApprovalAttributes()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.BackButton.isEnabled(), true);
		softAssert.assertEquals(GC4.checkConformity.isEnabled(), true);
		softAssert.assertEquals(finalApprovalStatus1.isDisplayed(), true);
		System.out.println(finalApprovalStatus1.getText());
		softAssert.assertEquals(GC4.CourseName.isDisplayed(), true);
		softAssert.assertEquals(GC4.InstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmulationLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.EmailLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.DueDate.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradeTab.isDisplayed(), true);
		softAssert.assertEquals(GC4.HistoryTab.isEnabled(), true);
		softAssert.assertEquals(GC4.IdName.isDisplayed(), true);
		softAssert.assertEquals(GC4.RawScore.isDisplayed(), true);
		softAssert.assertEquals(GC4.Letter1.isDisplayed(), true);
		softAssert.assertEquals(GC4.Notes.isDisplayed(), true);
		
		softAssert.assertEquals(studentIDName1.isDisplayed(), true);
		softAssert.assertEquals(rawScore1.isDisplayed(), true);
		softAssert.assertEquals(grade1.isDisplayed(), true);
		softAssert.assertEquals(note1.isDisplayed(), true);
		  
		/*
		 * softAssert.assertEquals(GC4.Paper1.isEnabled(), false);
		 * softAssert.assertEquals(GC4.Publish1.isEnabled(), false);
		 */
		 		
		softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(ApprovalStatus.isDisplayed(), true);
		softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		//softAssert.assertEquals(Blind.isDisplayed(), false);
		softAssert.assertEquals(GC4.StudentCount.isDisplayed(), true);
		
		System.out.println("All course final approval attributes are verified");
		
		scrollToElement(GC4.checkConformity);

		GC4.checkConformity.click();
	}
	
	public void tableDataRowCountAndADistribution()
	{
		softAssert.assertEquals(count1.isDisplayed(), false);
		softAssert.assertEquals(count2.isDisplayed(), false);
		softAssert.assertEquals(count3.isDisplayed(), false);
		softAssert.assertEquals(count4.isDisplayed(), false);
		softAssert.assertEquals(count5.isDisplayed(), false);
		softAssert.assertEquals(count6.isDisplayed(), false);
		softAssert.assertEquals(actualDist1.isDisplayed(), false);
		softAssert.assertEquals(actualDist2.isDisplayed(), false);
		softAssert.assertEquals(actualDist3.isDisplayed(), false);
		softAssert.assertEquals(actualDist4.isDisplayed(), false);
		softAssert.assertEquals(actualDist5.isDisplayed(), false);
		softAssert.assertEquals(actualDist6.isDisplayed(), false);
		System.out.println("The count and actual distribution count bothe are verified");
	}
	
	public void recentNoteAttributes()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		//softAssert.assertEquals(GC4.RecentNotes.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseDetails.isDisplayed(), true);
		softAssert.assertEquals(finalApprovalStatus2.isDisplayed(), true);
		//softAssert.assertEquals(GC4.TermSpring20.isDisplayed(), true);
		//softAssert.assertEquals(GC4.Blind.isDisplayed(), false);
		softAssert.assertEquals(semSpring.isDisplayed(), true);
		softAssert.assertEquals(DistSchedule.isDisplayed(), true); //this is an extra attribute visible on portal
		softAssert.assertEquals(BlindGrade.isDisplayed(), true); //it should be NO but here it is Yes, need to check
		softAssert.assertEquals(studRegister.isDisplayed(), true);
		softAssert.assertEquals(studCountMean.isDisplayed(), true);
		softAssert.assertEquals(classMean.isDisplayed(), true);
	}
	
	public void clickOnRejectFinalGrades()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		scrollToElement(GC4.checkConformity);
		GC4.checkConformity.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(rejectGrades));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rejectGrades);
		 
		//rejectGrades.click();
		
		softAssert.assertEquals(GC4.textNotes.isEnabled(), true);
		softAssert.assertEquals(GC4.NoButton.isEnabled(), true);
		softAssert.assertEquals(GC4.Yes.isEnabled(), true);
	}
	
	public void clickOnNo()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", GC4.NoButton);
		//GC4.NoButton.click();
	}
	
	public void clickOnYes()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(rejectGrades));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rejectGrades);
//		rejectGrades.click();
		GC4.textNotes.sendKeys("Proceed");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", GC4.Yes);
		//GC4.Yes.click();
	}
	
	public void searchCourseAgain()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.COURSE.isDisplayed(), true);
		GC4.searchBox.sendKeys("Intro to Fed Income Tax");
		
		softAssert.assertEquals(finalGradeNotApprovedStatus.isDisplayed(), true);
		System.out.println(finalGradeNotApprovedStatus.getText());
		
		GC4.clickOnCourse();		
	}
	
	public void finalEmulAttributes()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		softAssert.assertEquals(GC4.GradingRule.isEnabled(), true);
		softAssert.assertEquals(GC4.CancelLink.isEnabled(), true);
		softAssert.assertEquals(GC4.EmulInstructorName.isDisplayed(), true);
		softAssert.assertEquals(GC4.YourCourseLink.isDisplayed(), true);
		softAssert.assertEquals(GC4.Title.isDisplayed(), true);
		softAssert.assertEquals(GC4.ClassLevel.isDisplayed(), true);
	//	softAssert.assertEquals(GC4.BlindGrade.isDisplayed(), true);
		softAssert.assertEquals(GC4.CurrentStatus.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradingDueDate.isDisplayed(), true);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOf(GC4.emulCourseTitle));
		softAssert.assertEquals(GC4.emulCourseTitle.isDisplayed(), true);
		softAssert.assertEquals(GC4.CourseTitle1.isDisplayed(), true);
		softAssert.assertEquals(GC4.ClassLevel1.isDisplayed(), true);
	//	softAssert.assertEquals(GC4.BlindGrade1.isDisplayed(), true);
		softAssert.assertEquals(finalGradeNotApprovedStatus.isDisplayed(), true);
		softAssert.assertEquals(GC4.GradingDueDate1.isDisplayed(), true);
		softAssert.assertEquals(GC4.AssignGradeButton.isEnabled(), true);	
		
		System.out.println("Final emulation attributes are verified");
	}
	
	public void clickOnAssignAndCheckAttributes()
	{
		GradeCoursePage4 GC4 = PageFactory.initElements(driver, GradeCoursePage4.class);
		GC4.clickOnAssignGrade();
		
		/*
		 * public void assignEditAttributesVerification() {
		 * softAssert.assertEquals(GradingRule.isEnabled(), true);
		 * softAssert.assertEquals(CancelLink.isEnabled(), true);
		 * softAssert.assertEquals(EmulInstructorName.isDisplayed(), true);
		 * softAssert.assertEquals(BackButton.isEnabled(), true);
		 * softAssert.assertEquals(ProceedButton.isEnabled(), true);
		 * softAssert.assertEquals(courseTitle.isDisplayed(), true);
		 * softAssert.assertEquals(Instructor.isDisplayed(), true);
		 * softAssert.assertEquals(GradingDueDate2.isDisplayed(), true);
		 * softAssert.assertEquals(GradeTab.isDisplayed(), true);
		 * softAssert.assertEquals(HistoryTab.isDisplayed(), true);
		 * softAssert.assertEquals(IdName.isDisplayed(), true);
		 * softAssert.assertEquals(RawScore.isDisplayed(), true);
		 * softAssert.assertEquals(Letter1.isDisplayed(), true);
		 * softAssert.assertEquals(Notes.isDisplayed(), true);
		 * softAssert.assertEquals(BestExam.isDisplayed(), true);
		 * softAssert.assertEquals(PublishLibrary.isDisplayed(), true);
		 * softAssert.assertEquals(IdName1.isDisplayed(), true);
		 * softAssert.assertEquals(RawScoreInputBox1.isEnabled(), true);
		 * softAssert.assertEquals(NotesInputBox1.isEnabled(), true);
		 * softAssert.assertEquals(ExamPaperCheckbox.isEnabled(), false);
		 * softAssert.assertEquals(PublishCheckbox.isEnabled(), false);
		 * System.out.println("All attributes are verified");
		 * 
		 * softAssert.assertEquals(RecentNotes.isDisplayed(), true);
		 * softAssert.assertEquals(CourseDetails.isDisplayed(), true);
		 * softAssert.assertEquals(CourseStatus1.isDisplayed(), true);
		 * softAssert.assertEquals(TermSpring20.isDisplayed(), true); //
		 * softAssert.assertEquals(Blind.isDisplayed(), true);
		 * softAssert.assertEquals(StudentCount.isDisplayed(), true); System.out.
		 * println("All the recent notes and course details attributes are verified"); }
		 */
	}

}

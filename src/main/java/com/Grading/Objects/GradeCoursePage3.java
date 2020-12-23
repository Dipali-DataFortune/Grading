package com.Grading.Objects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

public class GradeCoursePage3 extends TestBaseGrade

{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeCoursePage3(WebDriver driver)
	{

		this.driver = driver;
	}


	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-dashboard/div/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement spring2020;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;

	//@FindBy(xpath="(//a[@routerlinkactive=\"router_link_active\"])[5]")
	@FindBy(xpath="/html/body/app-root/app-schedule-details-home/div/div[2]/app-exam-schedule-menu/ul/li[5]/a")
	WebElement CourseTab;

	@FindBy(xpath="//*[@id=\"control\"]/div/div/div[15]/div[4]")
	WebElement DemoAs;

	@FindBy(xpath="//*[@id=\"control\"]/div/div/em[7]")
	WebElement Customs ;

	@FindBy(xpath="//em[@class=\"detailheader fas fa-user\" and @title=\"Emulate\"]")
	WebElement emulation;


	@FindBy(xpath="//strong[contains(text(),'(CANCEL)')]")
	WebElement Cancle ;

	//@FindBy(xpath="(//button[@class=\"btn btn-primary activecoursebutton btn-block\" and contains(text(),'Assign/Edit Grades')])[3]")
	//@FindBy(xpath="/html/body/app-root/app-faculty-emulate/div/div[4]/app-course-listing-faculty/div[1]/form/div/div[1]/div/div/table/tbody[2]/tr[1]/td[6]/button")
	
	//@FindBy(xpath="//body[1]/app-root[1]/app-faculty-emulate[1]/div[1]/div[4]/app-course-listing-faculty[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[2]/tr[1]/td[6]/button[1]")
	//@FindBy(xpath="(//button[contains(text(),'Assign/Edit Grades')])[1]")
	//@FindBy(xpath="(//button[@class='btn btn-primary activecoursebutton btn-block' and @role='button'])[1]")	
	@FindBy(xpath="(//td[@class='hidden-xs hideinmobile']//button[@class='btn btn-primary activecoursebutton btn-block' and @role='button'])[1]")
	WebElement Assign2;

	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/select[1]")
	WebElement LetterGrade1;	


	@FindBy(xpath="//tbody/tr[2]/td[3]/div[1]/select[1]")
	WebElement LetterGrade2;	


	@FindBy(xpath="//tbody/tr[3]/td[3]/div[1]/select[1]")
	WebElement LetterGrade3;	


	@FindBy(xpath="//tbody/tr[4]/td[3]/div[1]/select[1]")
	WebElement LetterGrade4;	

	@FindBy(xpath="//tbody/tr[5]/td[3]/div[1]/select[1]")
	WebElement LetterGrade5;	

	@FindBy(xpath="//tbody/tr[6]/td[3]/div[1]/select[1]")
	WebElement LetterGrade6;	

	@FindBy(xpath="//a[@class=\"btn btn-danger actionsbtn\"]//span[contains(text(),'Check Conformity')]")
	WebElement CheckC;

	//@FindBy(xpath="//span[contains(text(),'Ethics in Tax Law')]")
	//@FindBy(xpath="//div[@class=\"course-name\"]//div//a//span[contains(text(),'Ethics in Tax Law')]")
	@FindBy(css="div.schedule-detail-home:nth-child(1) div.clear-fix:nth-child(2) ngb-accordion.accordion div.card:nth-child(1) div.collapse.show div.card-body div.clear-fix:nth-child(1) div.container-fluid.m-b-10.pl-0.pr-0.m-r-10 div.container-fluid.pl-0.pr-0 div.row div.col-md-12.pl-0.pr-0.ml-0.mr-0 div.container-fluid div.table-responsive.mt-2 div.col-md-12 div.row.mt-3:nth-child(2) div.col-md-12.schedule-grid table.table tbody.table-body:nth-child(2) div:nth-child(1) div.course-name div:nth-child(1) a:nth-child(1) > span:nth-child(1)")
	WebElement EthicsCourse;

    @FindBy(xpath="//button[@class=\"btn btn-danger actionsbtn\" and contains(text(),'Reject Final Grades')]")
    WebElement RejectFinalTab;
    
    
    
    @FindBy(xpath="/html/body/app-root/app-faculty-emulate/app-view-assign-edit-grade/div/div/app-conformity/div[1]/div[1]/div/span/button[1]")
    WebElement ResubmitFinalGrade;

//	@FindBy(xpath="//input[@class=\"btn btn-primary btn-block\" and @value=\"Yes\"]")
//	@FindBy(xpath="//*[@id=\"confirmModal55\"]/div/div/div[3]/div[2]/input[@value=\"Yes\"]")
//    @FindBy(css="#confirmModal55 > div > div > div.modal-footer > div:nth-child(2) > input")
    @FindBy(xpath="//div[@class=\"modal-footer\"]//input[@value=\"Yes\"]")
    WebElement Yes;

	public void NavigateToDashboard() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(spring2020));
		spring2020.click();
		Thread.sleep(3000);
		wait1.until(ExpectedConditions.visibilityOf(GradingSchedule));
		GradingSchedule.click();
		Thread.sleep(2000);


	}
	public void GotoCourseTab() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		staleElementClick(5,CourseTab,30);
		CourseTab.click();
		Thread.sleep(6000);
	}


	public void SearchforUpdations() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Customs));
		
		Customs.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(DemoAs));
		DemoAs.click();
		Thread.sleep(3000);

	}
	public void EnterCourse() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(EthicsCourse));

		//staleElementClick(3,EthicsCourse,30);

		EthicsCourse.click();

		Thread.sleep(2000);
	}


	public void EmulateCourse() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(emulation));

		//staleElementClick(5,emulation,30);
		Thread.sleep(1000);
		emulation.click();
		Thread.sleep(2000);
	}
	public void AfterEmulation2() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Assign2));
		//staleElementClick(5,Assign2,30);
		Assign2.click();
		//Thread.sleep(2000);
	}
	public void PutAllGrades() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(LetterGrade1));


		Select s1 = new Select(LetterGrade1);
		s1.selectByIndex(1);
		
		//Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(LetterGrade2));

		Select s2 = new Select(LetterGrade2);
		s2.selectByIndex(1);
		
		//Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(LetterGrade3));

		Select s3 = new Select(LetterGrade3);
		s3.selectByIndex(2);
		
		//Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(LetterGrade4));

		Select s4 = new Select(LetterGrade4);
		s4.selectByIndex(1);
		
		//Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(LetterGrade5));

		Select s5 = new Select(LetterGrade5);
		s5.selectByIndex(3);
         
		//Thread.sleep(2000);

		wait1.until(ExpectedConditions.visibilityOf(LetterGrade6));

		Select s6 = new Select(LetterGrade6);
		s6.selectByIndex(4);
		
		//Thread.sleep(2000);
	}
	public void SelectConform() throws InterruptedException 
	{
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CheckC));
		scrollToElement(CheckC);
		CheckC.click();
		
		//Thread.sleep(2000);
		
		
		wait1.until(ExpectedConditions.visibilityOf(ResubmitFinalGrade));
		staleElementClick(5,ResubmitFinalGrade,30);
		ResubmitFinalGrade.click();
		Thread.sleep(2000);
	}
	public void clickyes() throws InterruptedException {
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Yes));
		Yes.click();
		
		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		staleElementClick(5,Cancle,30);
		Cancle.click();
		
		Thread.sleep(3000);
	}
	public void GotoCourseTab2() throws InterruptedException 
	{
 
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		
		staleElementClick(5,CourseTab,30);
		CourseTab.click();
		Thread.sleep(6000);
	}
	public void ClickonCourse() throws InterruptedException 
	{
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Customs));
        Customs.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(DemoAs));
		staleElementClick(5,DemoAs,30);
		DemoAs.click();
		Thread.sleep(1000);
	}
	public void ClickEthicsLaw() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(EthicsCourse));

		staleElementClick(7,EthicsCourse,30);

		EthicsCourse.click();

		Thread.sleep(2000);
		
		wait1.until(ExpectedConditions.visibilityOf(CheckC));

		staleElementClick(5,CheckC,30);
         CheckC.click();
         
         Thread.sleep(2000);
         
         wait1.until(ExpectedConditions.visibilityOf(RejectFinalTab));
         
         staleElementClick(5,RejectFinalTab,30);
         RejectFinalTab.click();
         
         Thread.sleep(2000);
		
	}
	public void GotoCourseTab3() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		
		staleElementClick(5,CourseTab,30);
		CourseTab.click();
		Thread.sleep(4000);
	}
	public void ClickonCourse2() throws InterruptedException 
	{
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Customs));
        Customs.click();
		Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOf(DemoAs));
		staleElementClick(5,DemoAs,30);
		DemoAs.click();
		Thread.sleep(1000);
	}
	public void ClickEthicsLaw2() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(EthicsCourse));

		staleElementClick(7,EthicsCourse,30);

		EthicsCourse.click();

		Thread.sleep(2000);
		
		wait1.until(ExpectedConditions.visibilityOf(CheckC));

		staleElementClick(5,CheckC,30);
         CheckC.click();
         
         Thread.sleep(2000);
         
         staleElementClick(5,RejectFinalTab,30);
         wait1.until(ExpectedConditions.visibilityOf(RejectFinalTab));
         RejectFinalTab.click();
         
         Thread.sleep(2000);
		
	}
	





















}

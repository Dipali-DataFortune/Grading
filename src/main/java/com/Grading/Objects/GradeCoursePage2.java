package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

public class GradeCoursePage2 extends TestBaseGrade
{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeCoursePage2(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-dashboard/div/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement spring2020;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;
	
	@FindBy(xpath="(//a[@routerlinkactive=\"router_link_active\"])[5]")
	WebElement CourseTab;
	
	@FindBy(xpath="//input[@id=\"search\"]")
	WebElement Search;
	
	//@FindBy(xpath="//tbody/tr[1]/td[1]/div[@class=\"checkbox\"]")
	
	//@FindBy(xpath="//div[@class=\"checkbox\"]//input[@id=\"checkbox_all\"]")
	
	
	//@FindBy(xpath="//*[@id=\"check_tag_0\"]")
	//@FindBy(id="check_tag_0")
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/thead/th[1]/div")
	WebElement EthiksCheckbox;
	
	@FindBy(xpath="//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActiveUpdate;
	
	//@FindBy(xpath="//button[@style=\"font-size:10pt\"]")
	//WebElement ImpersonateButton;
	
	//@FindBy(xpath="//button[@style=\"display:inline-block;font-size:10pt\"]")
	//WebElement EmailButton;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to Final Grading')]")
	WebElement ProceedButton;
	
	@FindBy(xpath="//a[contains(text(),'Back')]")
	WebElement BackButton;
	
	@FindBy(xpath="//div[@class=\"alert alert-warning\"]//b")
	WebElement CalenderUpdates;
	
	@FindBy(xpath="//div[@class=\"col-xs-12 col-sm-12 col-md-12 alert alert-info\"]")
	WebElement  GradingPhase;
	
	@FindBy(xpath="//span[contains(text(),'Frances Craig')]")
	WebElement InstructorName;
	
	@FindBy(xpath="//p[@class=\"float-right\"]")
	WebElement DueDate;
	
	@FindBy(xpath="//a[@id=\"ngb-tab-0\"]")
	WebElement GradeTab ;
	
	@FindBy(xpath="//a[@id=\"ngb-tab-1\"]")
	WebElement HistoryTab;
	
	@FindBy(xpath="//th[contains(text(),'ID / Name')]")
	WebElement IdName;
	
	@FindBy(xpath="//th[contains(text(),'Raw Score')]")
	WebElement RawScore;
	
	
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	WebElement RawScore0;
	
	@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
	WebElement RawScore2;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/input[1]")
	WebElement Notes2;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/input[1]")
	WebElement Notes3;
	
	@FindBy(xpath="//th[contains(text(),'Letter Grade')]")
	WebElement Letter1;
	
	@FindBy(xpath="//th[contains(text(),'Notes')]")
	WebElement Notes;
	
	//@FindBy(xpath="//th[contains(text(),'Best Exam/Paper')]")
	//WebElement Paper;
	
	@FindBy(xpath="//th[contains(text(),'Publish to Library')]")
	WebElement Publish;
	
	//@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr")
	
	@FindBy(xpath="//span[contains(text(),'Ethics in Tax Law')]")
	WebElement EthicsCourse;
	
	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement stu;
	
	@FindBy(xpath="//*[@id=\"control\"]/div/div/div[15]/div[4]")
	WebElement DemoAs;
	
	@FindBy(xpath="/html/body/app-root/app-schedule-details-home/div/div[2]/app-course-accordion-container/ngb-accordion/div[1]/div[2]/div/app-course-exam-list/div/div/div[1]/app-filter/div/div[2]/div/div/em[7]")
	WebElement Customs ;
	
	@FindBy(xpath="//em[@class=\"detailheader fas fa-user\" and @title=\"Emulate\"]")
	WebElement emulation;
	
	
	@FindBy(xpath="//strong[contains(text(),'(CANCEL)')]")
	WebElement Cancle ;
	
	@FindBy(xpath="(//button[@class=\"btn btn-primary activecoursebutton btn-block\" and contains(text(),'Assign/Edit Grades')])[1]")
	WebElement Assign;
	
	@FindBy(xpath="(//button[@class=\"btn btn-primary activecoursebutton btn-block\" and contains(text(),'Assign/Edit Grades')])[3]")
	WebElement Assign2;
	
	@FindBy(css="div.bodypanelcontainer div.clearfix div.col-xs-12.col-sm-12.col-md-7.col-lg-9.gdpanel:nth-child(1) div.col-12 div.tab-content div.tab-pane.active:nth-child(1) form.ng-untouched.ng-pristine.ng-valid table.table.table-striped2x2 tbody:nth-child(2) tr:nth-child(1) td.hidden-xs.hideinmobile:nth-child(2) > input:nth-child(1)")
	WebElement RawScore1;
	
	@FindBy(xpath="(//input[@type=\"text\"])[1]")
	WebElement Notes1;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to Final Grading')]")
	WebElement Proceed;
	
	@FindBy(xpath="//button[contains(text(),'Submit Initial Grades')]")
	WebElement Submit;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement OK;
	
	@FindBy(xpath="//tbody/tr[4]/td[2]/input[1]")
	WebElement RawScore3;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]")
	WebElement RawScore4;
	
	@FindBy(xpath="//tbody/tr[6]/td[2]/input[1]")
	WebElement RawScore5;
	
	
	@FindBy(xpath="//tbody/tr[4]/td[4]/input[1]")
	WebElement Note3;
	
	
	@FindBy(xpath="//tbody/tr[5]/td[4]/input[1]")
	WebElement Note4;
	
	
	@FindBy(xpath="//tbody/tr[6]/td[4]/input[1]")
	WebElement Note5;
	
	
	@FindBy(xpath="//input[@class=\"btn btn-primary btn-block\" and @value=\"Yes\"]")
	WebElement Yes;
	
	@FindBy(xpath="//a[@class=\"btn btn-danger actionsbtn\"]//span[contains(text(),'Check Conformity')]")
	WebElement CheckConformity;
	
	@FindBy(xpath="//select[@class=\"form-control\"]")
	WebElement DropDownList;
	
	@FindBy(xpath="/html/body/app-root/app-faculty-emulate/app-view-assign-edit-grade/div/div/app-conformity/div[1]/div[1]/div/span/button")
	WebElement Submit2;
	
	
	@FindBy(xpath="//*[@id=\"confirmModal56\"]/div/div/div[3]/div/button")
    WebElement OK2;	
	
	
	//@FindBy(xpath="//button[@class=\"btn btn-primary btn-block\" and @type=\"button\" and contains(text(),'No')]")
	@FindBy(xpath="//*[@id=\"confirmModal55\"]/div/div/div[3]/div[1]/button")
	WebElement No;
	
	
	@FindBy(xpath="//a[contains(text(),'Back')]")
	WebElement Back;
	
	@FindBy(xpath="//button[contains(text(),'Deactivate')]")
	WebElement Deactivate;
	
	@FindBy(xpath="//*[@id=\"check_tag_5\"]")
	WebElement NewCheckbox;
	
	@FindBy(xpath="//*[@class=\"btn btn-primary ml-3\" and contains(text(),'Activate/Update Selected')]")
    WebElement Activ;
	
	@FindBy(xpath="//div[@class=\"checkbox\"]//input[@id=\"checkbox_all\"]")
	WebElement EthiksCheckbox2;
	
	
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
		CourseTab.click();
		Thread.sleep(6000);
	}

	
	public void SearchforUpdations() throws InterruptedException 
	{
		
    		Customs.click();
    		Thread.sleep(3000);
			
	       DemoAs.click();
	       Thread.sleep(1000);
			
	}
	public void ClickonUpdate() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
    	wait1.until(ExpectedConditions.visibilityOf(EthiksCheckbox));
	
    	
    	staleElementClick(6,EthiksCheckbox,30);
	     EthiksCheckbox.click();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     wait1.until(ExpectedConditions.visibilityOf(ActiveUpdate));
		 ActiveUpdate.click();
		 Thread.sleep(2000);
	     
	}
	public void ClickonCourse() throws InterruptedException 
	{
		
		 
		stu.click();
		Thread.sleep(4000);
			
		CourseTab.click();
		Thread.sleep(4000);
		

       Customs.click();
       Thread.sleep(4000);
		
       
       DemoAs.click();
       Thread.sleep(4000);
       
    WebDriverWait wait1 = new WebDriverWait(driver,60);
   	wait1.until(ExpectedConditions.visibilityOf(EthicsCourse));
	
       staleElementClick(7,EthicsCourse,30);
		
		EthicsCourse.click();
		
		Thread.sleep(2000);
	}
	public void CheckforAttibutes() 
	{
		//softAssert.assertEquals(ProceedButton.isDisplayed(), true);
		softAssert.assertEquals(BackButton.isDisplayed(), true);
		softAssert.assertEquals(IdName.isDisplayed(), true);
		softAssert.assertEquals(Notes.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(DueDate.isDisplayed(), true);
	    System.out.println("All the attributes are display");
	}
	public void Attributes2() 
	{
		  
		softAssert.assertEquals(RawScore.isDisplayed(), true);
		softAssert.assertEquals(Publish.isDisplayed(), true);
		softAssert.assertEquals(Letter1.isDisplayed(), true);
		softAssert.assertEquals(CalenderUpdates.isDisplayed(), true);
		softAssert.assertEquals(HistoryTab.isDisplayed(), true);
		System.out.println("All the attributes are display");

	}
	public void EmulateCourse() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(emulation));

		Thread.sleep(1000);
		emulation.click();
		Thread.sleep(2000);
	}
	public void AfterEmulation() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Assign));

		Assign.click();
		Thread.sleep(2000);
	}
	public void AssingsGrade() 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(RawScore));

    	
    	//scrollToElement(RawScore);
		RawScore.sendKeys("50");
		
		wait1.until(ExpectedConditions.visibilityOf(Notes));
		scrollToElement(Notes);
		Notes.sendKeys("Pass");
		
		System.out.println("All Grades Are Already Present");
		
	}
	public void ProceedFurher() 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Proceed));

		Proceed.click();
		
		wait1.until(ExpectedConditions.visibilityOf(Submit));
		Submit.click();
		
		System.out.println("AlertBox is Visible");
		
	}
	
	public void SubmitFurher() 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	
		
		wait1.until(ExpectedConditions.visibilityOf(Submit2));
		Submit2.click();
		
		System.out.println("AlertBox is Visible");
		
	}
	public void ClickOnAleart() throws InterruptedException 
	{
		if(OK.isEnabled()) 
		{
			System.out.println("OK is Enabled");
		}
		else 
		{
			System.out.println("OK is  not Enabled");
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(OK));

		OK.click();
		
		Thread.sleep(1000);
		
		
		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		Cancle.click();
		
		Thread.sleep(3000);
		
	}
	public void ClickOnAleart2() throws InterruptedException 
	{
		if(OK2.isEnabled()) 
		{
			System.out.println("OK is Enabled");
		}
		else 
		{
			System.out.println("OK is  not Enabled");
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(OK));

		OK2.click();
		
		Thread.sleep(1000);
		
		
		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		Cancle.click();
		
		Thread.sleep(3000);
		
	}
	public void AfterEmulation2() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Assign2));

		Assign2.click();
		Thread.sleep(2000);
	}
	public void AssignScores() throws InterruptedException
	{
		

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(RawScore1));
    	
    	RawScore1.sendKeys("79");
    	
    	wait1.until(ExpectedConditions.visibilityOf(Notes1));
    	Notes1.sendKeys("pass");
    wait1.until(ExpectedConditions.visibilityOf(RawScore0));
		RawScore0.sendKeys("56");
	wait1.until(ExpectedConditions.visibilityOf(RawScore2));
		RawScore2.sendKeys("37");
		wait1.until(ExpectedConditions.visibilityOf(Notes2));
		Notes2.sendKeys("Pass");
		wait1.until(ExpectedConditions.visibilityOf(Notes3));
		Notes3.sendKeys("Failed");
		Thread.sleep(2000);
		
		System.out.println("All Grades Are Applied Already");
	}
	public void AssignAllScore() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(RawScore3));

		RawScore3.sendKeys("78");
		
		wait1.until(ExpectedConditions.visibilityOf(RawScore4));

		RawScore4.sendKeys("89");
		
		wait1.until(ExpectedConditions.visibilityOf(RawScore5));
		
		RawScore5.sendKeys("98");
		
		Thread.sleep(2000);
		
		System.out.println("All Grades Are Applied Already");
		
	}
	public void EnterNotes() throws InterruptedException
	{
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Note3));
    	
    	Note3.sendKeys("Pass");
    	
    	wait1.until(ExpectedConditions.visibilityOf(Note4));
    	
    	Note4.sendKeys("Pass");
    	
    	wait1.until(ExpectedConditions.visibilityOf(Note5));
    	
    	Note5.sendKeys("Pass");
    	
    	Thread.sleep(2000);
    	
    	System.out.println("All Notes Are Applied Already");
    	
    	scrollToElement(ProceedButton);
    	wait1.until(ExpectedConditions.visibilityOf(ProceedButton));
    	
    	ProceedButton.click();
		
	}
	
	public void GoBackSelectNo() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,30);
    	wait1.until(ExpectedConditions.visibilityOf(No));
    	
    	No.click();
    	
    	Thread.sleep(2000);
    	
    	
    	
	}
	
	public void GotoBack() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Back));
    	
    	Back.click();
    	
    	Thread.sleep(2000);
    	
	}
	public void AgainProceedGrades() throws InterruptedException
	{
       
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(ProceedButton));
    	
    	ProceedButton.click();
    	
    	Thread.sleep(2000);
	}
	
	public void GoBackSelectYes() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Yes));
    	
    	Yes.click();
    	
    	Thread.sleep(2000);
    	

		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		Cancle.click();
		
		Thread.sleep(3000);
		
    	
	}
	public void ClicktheCourse() throws InterruptedException 
	{
		stu.click();
		Thread.sleep(4000);
			
		CourseTab.click();
		Thread.sleep(4000);
		

       Customs.click();
       Thread.sleep(4000);
		
       
       DemoAs.click();
       Thread.sleep(4000);
       
    WebDriverWait wait1 = new WebDriverWait(driver,60);
   	wait1.until(ExpectedConditions.visibilityOf(EthicsCourse));
	
       staleElementClick(7,EthicsCourse,30);
		
		EthicsCourse.click();
		
		Thread.sleep(2000);
		
		
	
	}
	public void CheckConformity() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(CheckConformity));
    	
    	scrollToElement(CheckConformity);
    	CheckConformity.click();
    	
    	Thread.sleep(2000);
	}
	public void DeactivateCourse() throws InterruptedException
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Deactivate));
    	
    	Deactivate.click();
    	
    	Thread.sleep(2000);
    	
    	
    	wait1.until(ExpectedConditions.visibilityOf(Yes));
    	Yes.click();
	}

	public void ActivateCourse() throws InterruptedException 
	{
		
		
		stu.click();
		Thread.sleep(4000);
			
		CourseTab.click();
		Thread.sleep(4000);
		
		Customs.click();
		Thread.sleep(3000);
		
       DemoAs.click();
       Thread.sleep(1000);
       
       
       
       WebDriverWait wait1 = new WebDriverWait(driver,60);
   	wait1.until(ExpectedConditions.visibilityOf(EthiksCheckbox));
	
   	
   	staleElementClick(6,EthiksCheckbox,30);
	     EthiksCheckbox.click();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     wait1.until(ExpectedConditions.visibilityOf(ActiveUpdate));
		 ActiveUpdate.click();
		 Thread.sleep(2000);
	
		 
		 
		 
		
		
	}

}

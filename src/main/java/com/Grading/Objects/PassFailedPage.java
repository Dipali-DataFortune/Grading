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

public class PassFailedPage extends TestBaseGrade
{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public PassFailedPage(WebDriver driver)
	{

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;

	@FindBy(xpath="(//a[@routerlinkactive=\"router_link_active\"])[5]")
	WebElement CourseTab;

	@FindBy(xpath="//input[@id=\"search\"]")
	WebElement Search;

	@FindBy(xpath="//em[@class=\"fa fa-times clear_icon\"]")
	WebElement Cross;

	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/thead/th[1]/div")
	WebElement EthiksCheckbox;

	@FindBy(xpath="//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActiveUpdate;

	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr/td[4]/div/div/div/div/a/span")
	WebElement Grades;

	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement stu;

	@FindBy(xpath="//span[contains(text(),'Negotiations Sem')]")
	WebElement NegotiationCourse;


	@FindBy(xpath="//span[contains(text(),'Proceed to Final Grading')]")
	WebElement ProceedButton;

	@FindBy(xpath="//a[contains(text(),'Back')]")
	WebElement BackButton;

	@FindBy(xpath="//div[@class=\"alert alert-warning\"]//b")
	WebElement CalenderUpdates;

	@FindBy(xpath="//div[@class=\"col-xs-12 col-sm-12 col-md-12 alert alert-info\"]")
	WebElement  GradingPhase;

	@FindBy(xpath="//span[@class=\"ml-2\" and contains(text(),'Frank Bombard')]")
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

	@FindBy(xpath="//body/app-root[1]/app-schedule-details-home[1]/div[1]/div[2]/app-course-accordion-container[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/app-course-exam-list[1]/app-course-detail[1]/div[1]/div[1]/div[2]/app-view-assign-edit-grade[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]")
	WebElement CourseDetails;

	@FindBy(xpath="//body/app-root[1]/app-schedule-details-home[1]/div[1]/div[2]/app-course-accordion-container[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/app-course-exam-list[1]/app-course-detail[1]/div[1]/div[1]/div[2]/app-view-assign-edit-grade[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]")
	WebElement Terms;


	@FindBy(xpath="//body/app-root[1]/app-schedule-details-home[1]/div[1]/div[2]/app-course-accordion-container[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/app-course-exam-list[1]/app-course-detail[1]/div[1]/div[1]/div[2]/app-view-assign-edit-grade[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]")
	WebElement BlindGrades;

	@FindBy(xpath="//em[@title=\"Emulate\"]")
	WebElement Emulation;

	@FindBy(xpath="//strong[contains(text(),'(CANCEL)')]")
	WebElement Cancle;

	@FindBy(xpath="(//button[@class=\"btn btn-primary activecoursebutton btn-block\" and contains(text(),'Assign/Edit Grades')])[5]")
	WebElement AssingButton;

	@FindBy(xpath="//tbody[1]/tr[1]/td[1]")
	WebElement CourseName;

	@FindBy(xpath="//a[contains(text(),'Back')]")
	WebElement Back;

	@FindBy(xpath="//span[contains(text(),'Proceed to Final Grading')]")
	WebElement Proceed;

	@FindBy(xpath="//strong[contains(text(),'11 May 2021')]")
	WebElement DueDate1;

	@FindBy(xpath="//tbody/tr[1]/td[2]/input[1]")
	WebElement Input1 ;

	@FindBy(xpath="//tbody/tr[1]/td[4]/input[1]")
	WebElement Notes1;

	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	WebElement Input2;

	@FindBy(xpath="//tbody/tr[2]/td[4]/input[1]")
	WebElement Notes2;

	@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
	WebElement Input3;

	@FindBy(xpath="//tbody/tr[3]/td[4]/input[1]")
	WebElement Notes3;

	@FindBy(xpath="//tbody/tr[4]/td[2]/input[1]")
	WebElement Input4;

	@FindBy(xpath="//tbody/tr[4]/td[4]/input[1]")
	WebElement Notes4;


	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]")
	WebElement Input5;

	@FindBy(xpath="//tbody/tr[5]/td[4]/input[1]")
	WebElement Notes5;


	@FindBy(xpath="//tbody/tr[6]/td[2]/input[1]")
	WebElement Input6;

	@FindBy(xpath="//tbody/tr[6]/td[4]/input[1]")
	WebElement Notes6;

	@FindBy(xpath="/html/body/app-root/app-faculty-emulate/app-view-assign-edit-grade/div/div/app-conformity/div[1]/div[1]/div/span/button")
	WebElement Submit2;

	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement OK;

	@FindBy(xpath="//*[@id=\"confirmModal55\"]/div/div/div[3]/div[1]/button")
	WebElement No;
	
	@FindBy(xpath="//input[@class=\"btn btn-primary btn-block\" and @value=\"Yes\"]")
	WebElement Yes;

	@FindBy(xpath="//a[@class=\"btn btn-danger actionsbtn\"]//span[contains(text(),'Check Conformity')]")
	WebElement CheckConformity;

	@FindBy(xpath="//button[contains(text(),'Deactivate')]")
	WebElement Deactivate;
	
	@FindBy(xpath="//div[@class=\"checkbox\"]//input[@id=\"checkbox_all\"]")
	WebElement NegosiationCheckbox2;


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
	public void GotoCourseTab() 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	public void EnterCRN() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("17871");
		Thread.sleep(2000);

	}
	public void ClickoncheckBox() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(EthiksCheckbox));
		EthiksCheckbox.click();
		Thread.sleep(2000);
		wait1.until(ExpectedConditions.visibilityOf(ActiveUpdate));
		ActiveUpdate.click();
		Thread.sleep(4000);
	}
	public void SearchAgain() throws InterruptedException 

	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(stu));
		stu.click();
		Thread.sleep(2000);
		wait1.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("17871");
		Thread.sleep(4000);
	}
	public void GradingStetus() throws InterruptedException
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Grades));
		String R1 = Grades.getText();
		System.out.println("The Grade Stetus =  "+R1);
		Thread.sleep(1000);
	}
	public void EnteronCourse() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(NegotiationCourse));
		NegotiationCourse.click();
		Thread.sleep(1000);
	}
	public void VerifyAttributes() 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(BackButton));
		softAssert.assertEquals(BackButton.isDisplayed(), true);
		softAssert.assertEquals(IdName.isDisplayed(), true);
		softAssert.assertEquals(InstructorName.isDisplayed(), true);
		softAssert.assertEquals(DueDate.isDisplayed(), true);
		System.out.println("All the attributes are display");

	}
	public void Attributes2() 
	{

		softAssert.assertEquals(RawScore.isDisplayed(), true);
		softAssert.assertEquals(CalenderUpdates.isDisplayed(), true);
		softAssert.assertEquals(HistoryTab.isDisplayed(), true);
		System.out.println("All the attributes are display");

	}
	public void CourseStetus() throws InterruptedException
	{
		scrollToElement(CourseDetails);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(CourseDetails));

		String R1 = CourseDetails.getText();
		System.out.println("The Grade Stetus =  "+R1);
		Thread.sleep(1000);

		softAssert.assertEquals(CourseDetails.isDisplayed(), true);
	}
	public void TearmsStetus() throws InterruptedException
	{
		scrollToElement(Terms);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Terms));

		String R1 = Terms.getText();
		System.out.println("The Terms Stetus =  "+R1);
		Thread.sleep(1000);

		softAssert.assertEquals(Terms.isDisplayed(), true);
	}
	public void  BlindGradesStetus() throws InterruptedException
	{

		scrollToElement(BlindGrades);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(BlindGrades));

		String R1 = BlindGrades.getText();
		System.out.println("The BlindGrade Stetus =  "+R1);
		Thread.sleep(1000);

		softAssert.assertEquals(BlindGrades.isDisplayed(), true);
	}
	public void EmulateCourse() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Emulation));
		Emulation.click();
		Thread.sleep(2000);
	}
	public void AttributesAfterEmulation() 
	{

		softAssert.assertEquals(Back.isDisplayed(), true);
		softAssert.assertEquals(ProceedButton.isDisplayed(), true);
		softAssert.assertEquals(DueDate1.isDisplayed(), true);
		softAssert.assertEquals(AssingButton.isDisplayed(), true);
		softAssert.assertEquals(CourseName.isDisplayed(), true);
		softAssert.assertEquals(Cancle.isDisplayed(), true);
		System.out.println("All the attributes are display");

	}
	public void AfterEmulation() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(AssingButton));
		scrollToElement(AssingButton);
		AssingButton.click();
		Thread.sleep(2000);
	}
	public void AssingScore() 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Input1));

		Input1.sendKeys("50");

		wait1.until(ExpectedConditions.visibilityOf(Notes1));
		scrollToElement(Notes1);
		Notes1.sendKeys("Pass");

		System.out.println("All Grades Are Already Present");
	}
	public void ProceedFurher() 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Proceed));

		Proceed.click();

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
	public void AssignScores() throws InterruptedException
	{


		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Input1));
        Input1.sendKeys("79");
		wait1.until(ExpectedConditions.visibilityOf(Notes1));
		Notes1.sendKeys("pass");
		
		wait1.until(ExpectedConditions.visibilityOf(Input2));
		Input2.sendKeys("56");
		wait1.until(ExpectedConditions.visibilityOf(Notes2));
		Notes2.sendKeys("pass");
		
		
		wait1.until(ExpectedConditions.visibilityOf(Input3));
		Input3.sendKeys("37");
		wait1.until(ExpectedConditions.visibilityOf(Notes3));
		Notes3.sendKeys("Pass");
		
		
		wait1.until(ExpectedConditions.visibilityOf(Input4));
		Input4.sendKeys("78");
		wait1.until(ExpectedConditions.visibilityOf(Notes4));
		Notes4.sendKeys("Failed");
		Thread.sleep(2000);

		System.out.println("All Grades Are Applied Already");
	}
	public void AssignAllScore() throws InterruptedException 
	{

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Input5));

		Input5.sendKeys("89");

		wait1.until(ExpectedConditions.visibilityOf(Input6));

		Input6.sendKeys("98");

		Thread.sleep(2000);

		System.out.println("All Grades Are Applied Already");

	}
	public void EnterNotes() throws InterruptedException
	{


		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Notes5));

		Notes5.sendKeys("Pass");

		wait1.until(ExpectedConditions.visibilityOf(Notes6));

		Notes6.sendKeys("Pass");

		
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
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("17871");
		Thread.sleep(2000);
		
		NegotiationCourse.click();
      
       
    
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
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys("17871");
		Thread.sleep(2000);
       
       
      
   	wait1.until(ExpectedConditions.visibilityOf(NegosiationCheckbox2));
	
   	
   	staleElementClick(6,NegosiationCheckbox2,30);
	     NegosiationCheckbox2 .click();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     wait1.until(ExpectedConditions.visibilityOf(ActiveUpdate));
		 ActiveUpdate.click();
		 Thread.sleep(2000);
	
		 
		 
		 
		
		
	}
















}

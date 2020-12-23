package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

public class GradeCoursePage1 extends TestBaseGrade
{

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeCoursePage1(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-dashboard/div/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement spring2020;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;
	
	@FindBy(xpath="(//a[@routerlinkactive=\"router_link_active\"])[5]")
	WebElement CourseTab;
	
	@FindBy(xpath="//div[contains(text(),'Courses')]")
	WebElement Course1;
	
	@FindBy(xpath="//div[contains(text(),'Course # / CRN')]")
	WebElement CRNLINK;
	
	@FindBy(xpath="//div[contains(text(),'Grading Status')]")
	WebElement GRADESTETUS;
	
	@FindBy(xpath="//div[contains(text(),'Exam Type')]")
	WebElement EXAMTYPE;
	
	@FindBy(xpath="//div[contains(text(),'Due Date')]")
	WebElement DUEDATE;
	
	@FindBy(xpath="//div[contains(text(),'Extension')]")
	WebElement EXTENTION ;
	
	@FindBy(xpath="//div[contains(text(),'1st Year Course')]")
	WebElement YEARCOURSE;
	
	@FindBy(xpath="//div[contains(text(),'Blind Graded?')]")
	WebElement BLINDGRADE ;
	
	@FindBy(xpath="//input[@id=\"search\"]")
	WebElement Search;
	
	@FindBy(xpath="//em[@class=\"fa fa-times clear_icon\"]")
	WebElement Cross;
	
	//@FindBy(xpath="//tbody[@class=\"table-body\"]/tr/td/div/input[1]")
	//@FindBy(xpath="//*[@id=\"check_tag_3\"]")
	//@FindBy(xpath="/html/body/app-root/app-schedule-details-home/div/div[2]/app-course-accordion-container/ngb-accordion/div[1]/div[2]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[7]/td[1]/div/input")
	//WebElement Ch1;
	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]/div")
	WebElement Tags;
	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[2]/td[1]/div")
	WebElement Checkbox1;
	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[3]/td[1]/div")
	WebElement Checkbox2;

	

	//@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create')]")
	
	@FindBy(xpath="/html/body/app-root/app-schedule-details-home/div/div[2]/app-course-accordion-container/ngb-accordion/div[1]/div[2]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[1]/div/div/div[2]/button[1]")
	WebElement Create;
	
	@FindBy(how = How.XPATH, using = "//input[@id='createTag']")
	WebElement EnterTag;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	WebElement Cancle;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary mr-3']")
	WebElement NewTag;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary ml-3']")
	WebElement AddRemoveTab;
	
	
	@FindBy(xpath="/html/body/app-root/app-schedule-details-home/div/div[2]/app-exam-schedule-menu/ul/li[4]/a")
	WebElement Students;
	
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[2]/td[1]/div")
	WebElement  Course11;
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[3]/td[1]/div")
	WebElement  Course2;
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[4]/td[1]/div")
	WebElement  Course3;
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[5]/td[1]/div")
	WebElement  Course4;
	
	
	@FindBy(xpath="//body/app-root[1]/app-schedule-details-home[1]/div[1]/div[2]/app-course-accordion-container[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/app-course-exam-list[1]/div[1]/div[1]/div[1]/app-filter[1]/div[1]/div[2]/div[1]/div[1]/div[15]/div[3]")
	WebElement AllType;
	
	//@FindBy(xpath="//*[@id=\"control\"]/div/div/em[9]")
	@FindBy(xpath="//*[@id=\"control\"]/div/div/em[7]")
	WebElement Customs ;
	
	@FindBy(xpath="//span[contains(text(),'Community Development Seminar')]")
	WebElement CourseClick;
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/app-course-detail/div/div/div[2]/app-view-assign-edit-grade/div/div[1]/div/div/a[1]")
    WebElement Back;	
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Remove')]")
	WebElement Remove;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement Add;
	
	@FindBy(xpath="(//div[@class=\"checkbox\"])[10]")
	WebElement Checknew ;
	
	
	//@FindBy(xpath="((//div[@class=\"checkbox\"]))[14]")
	
	@FindBy(xpath="//*[@id=\"panelOne\"]/div/app-course-exam-list/div/div/div[2]/div[2]/div/div/app-advance-grid/div/div/div/div[2]/div/table/tbody/tr[3]/td[1]/div")
    WebElement Checknewbox22;	

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
	public void Attributeverification()
	{
		softAssert.assertEquals(Course1.isDisplayed(), true);
		softAssert.assertEquals(CRNLINK.isDisplayed(), true);
		softAssert.assertEquals(GRADESTETUS.isDisplayed(), true);
		softAssert.assertEquals(EXAMTYPE.isDisplayed(), true);
		softAssert.assertEquals(DUEDATE.isDisplayed(), true);
		softAssert.assertEquals(EXTENTION.isDisplayed(), true);
		softAssert.assertEquals(BLINDGRADE.isDisplayed(), true);
		softAssert.assertEquals(YEARCOURSE.isDisplayed(), true);
	    System.out.println("All the attributes are display");
	}
	public void SerchCourseByCRN() throws InterruptedException 
	{
		    WebDriverWait wait1 = new WebDriverWait(driver, 60);
	    	wait1.until(ExpectedConditions.visibilityOf(Search));
			Search.click();
			Search.sendKeys("17598");
			Thread.sleep(2000);
			Cross.click();
			Thread.sleep(2000);
	}
	public void SearchByCourseName() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.click();
		Search.sendKeys("Casework");
		Thread.sleep(2000);
		Cross.click();
		Thread.sleep(2000);
	}
	public void SearchByCourseNumber() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
    	wait1.until(ExpectedConditions.visibilityOf(Search));
		Search.click();
		Search.sendKeys("LAW");
		Thread.sleep(2000);
		Cross.click();
		Thread.sleep(2000);
		Students.click();
		Thread.sleep(2000);
		CourseTab.click();
		Thread.sleep(3000);
		
	}
	public void CreateCustomTag() throws InterruptedException {

		
	   WebDriverWait wait1 = new WebDriverWait(driver,120);
       wait1.until(ExpectedConditions.visibilityOf(Tags));
       
       
	   Tags.click();
	   Thread.sleep(2000);
	}
	public void NewMethod() throws InterruptedException {
		
		NewTag.click();
		Thread.sleep(1000);
		System.out.println("We select the all checkbox");
		softAssert.assertEquals(EnterTag.isDisplayed(), true);
		System.out.println("The create Tab is Disabled");
		softAssert.assertEquals(Cancle.isDisplayed(), true);
		System.out.println("All Element are Visible");
		Thread.sleep(1000);
		Cancle.click();
		Thread.sleep(1000);
	}
	public void CraeteTag2() throws InterruptedException {

		
		
		Checkbox1.click();
		Thread.sleep(2000);
		
		Checkbox2.click();
		Thread.sleep(2000);
		
		NewTag.click();
		Thread.sleep(1000);
		EnterTag.sendKeys("All Couses File");
		softAssert.assertEquals(Create.isDisplayed(), true);
		System.out.println("The create Tab is Enabled now");
		Thread.sleep(1000);
		Cancle.click();
	}
	public void CheckTabAddRemove() throws InterruptedException {
		
		Thread.sleep(1000);
		Tags.click();
		if (AddRemoveTab.isEnabled()) {
			System.out.println("The Tab Of ADDREMOVE is Display");
		} else {

			System.out.println("The Tab Of ADDREMOVE is Not Display");

		}

	}
	public void SelectCourse() throws InterruptedException 
	{
		Course11.click();
		Thread.sleep(1000);
		Course2.click();
		Thread.sleep(1000);
		Course3.click();
		Thread.sleep(1000);
		Course4.click();
		Thread.sleep(1000);
	}
	public void CreateNewTag() throws InterruptedException 
	{
		NewTag.click();
		Thread.sleep(1000);
		EnterTag.sendKeys("All Type");
		softAssert.assertEquals(Create.isDisplayed(), true);
		System.out.println("The create Tab is Enabled now");
		staleElementClick(5,Create,30);
	    Create.click();
	    Thread.sleep(2000);
		
	}
	public void ClickOnceCustom() throws InterruptedException 
	{
		
		
		Students.click();
		Thread.sleep(2000);
		CourseTab.click();
		Thread.sleep(3000);
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
	       wait1.until(ExpectedConditions.visibilityOf(Customs));
	       
	       scrollToElement(Customs);
			Thread.sleep(1000);
			for (int i = 0; i <= 3; i++) {
				try {
					Customs.click();
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		Thread.sleep(1000);
		
		
	}
	public void Lateclick() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
	    wait1.until(ExpectedConditions.visibilityOf(AllType));
	   
	       
		staleElementClick(5,AllType,30);
		AllType.click();
		Thread.sleep(3000);
		
		scrollToElement(Students);
		Students.click();
		Thread.sleep(2000);
		CourseTab.click();
		Thread.sleep(3000);

	}
	public void RemoveExsistingTag() throws InterruptedException {
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,120);
    	wait1.until(ExpectedConditions.visibilityOf(Checknewbox22));
	
		//scrollToElement(Checkbox2);
		Thread.sleep(1000);
		Checknewbox22.click();
		Thread.sleep(1000);
		scrollToElement(NewTag);
		NewTag.click();
		Thread.sleep(1000);
		EnterTag.sendKeys("All Couses File to");
		Thread.sleep(1000);
		Create.click();
		Thread.sleep(5000);
		System.out.println("New Tag is Created");
		Students.click();
		Thread.sleep(1000);
		CourseTab.click();
		Thread.sleep(4000);
		
	}

	public void AddTag() throws InterruptedException {
		
		Checkbox2.click();
		Thread.sleep(3000);
		
		Checkbox1.click();
		Thread.sleep(3000);
		
		staleElementClick(5,AddRemoveTab,30);
		AddRemoveTab.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select n1 = new Select(driver.findElement(By.xpath("//*[@id=\"customTag\"]")));
		n1.selectByIndex(0);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		
		staleElementClick(5,Add,30);
		Add.click();
		Thread.sleep(1000);
		System.out.println("New Tag is Added");
	}

	public void AllButtons() throws InterruptedException {
		Thread.sleep(1000);
		Students.click();
		Thread.sleep(1000);
		CourseTab.click();
		Thread.sleep(3000);
		Checkbox1.click();
		Thread.sleep(1000);
		Checkbox2.click();
		Thread.sleep(3000);
		AddRemoveTab.click();
		Thread.sleep(1000);
		Select n1 = new Select(driver.findElement(By.id("customTag")));
		n1.selectByIndex(0);
		softAssert.assertEquals(Add.isEnabled(), true);
		softAssert.assertEquals(Remove.isDisplayed(), true);
		softAssert.assertEquals(Cancle.isDisplayed(), true);
		Cancle.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Students.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		CourseTab.click();
		Thread.sleep(3000);
		System.out.println(" All Buttons Are Visible now");
	}

	public void ClickRemove() throws InterruptedException {
		Checkbox2.click();
		Thread.sleep(2000);
		Checkbox1.click();
		Thread.sleep(2000);
	   
		AddRemoveTab.click();
		Thread.sleep(2000);
		Select n1 = new Select(driver.findElement(By.id("customTag")));
		n1.selectByIndex(0);
		softAssert.assertEquals(Add.isEnabled(), true);
		softAssert.assertEquals(Remove.isDisplayed(), true);
		softAssert.assertEquals(Cancle.isDisplayed(), true);
		Remove.click();
		Thread.sleep(1000);
		System.out.println("Click on ADD Remove Tab");
	}

	public void Clear() throws InterruptedException {

		scrollToElement(Customs);
		Thread.sleep(1000);
		for (int i = 0; i <= 3; i++) {
			try {
				Customs.click();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Filter Select");
		Thread.sleep(2000);
		for (int i = 0; i <= 3; i++) {
			try {
				AllType.click();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Toggal Select");
		Thread.sleep(1000);

	}

	public void SeleCross() throws InterruptedException {
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Students));
		
		Students.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(CourseTab));
		CourseTab.click();
		Thread.sleep(3000);

	}

	public void CrossCustom() throws InterruptedException {

		System.out.println("Again at Filter");
	}

	public void ADDfordemo() throws InterruptedException {
		Checkbox2.click();
		Thread.sleep(1000);
		NewTag.click();
		Thread.sleep(1000);
		EnterTag.sendKeys("For Demo");
		Thread.sleep(1000);
		Create.click();
		Thread.sleep(5000);
		System.out.println("Again Create New Tab FOR DEMO");
	}

	public void NavigatetoStudent() throws InterruptedException {
		Thread.sleep(1000);
		Students.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		CourseTab.click();
		Thread.sleep(3000);

	}

	public void clickoncourse() throws InterruptedException {
		Thread.sleep(2000);
		CourseClick.click();
		Thread.sleep(2000);
		System.out.println("Select any one course ");
	}

	public void selectExam() throws InterruptedException {
		Select r2 = new Select(driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-schedule-details-home[1]/div[1]/div[2]/app-course-accordion-container[1]/ngb-accordion[1]/div[1]/div[2]/div[1]/app-course-exam-list[1]/app-course-detail[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/select[1]")));
		r2.selectByIndex(0);
		Thread.sleep(3000);
	}

	public void removedata() throws InterruptedException {

		Thread.sleep(1000);
		Students.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		CourseTab.click();
		Thread.sleep(3000);

		scrollToElement(Checkbox1);
		Checkbox1.click();
		Thread.sleep(3000);
		scrollToElement(AddRemoveTab);
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(AddRemoveTab));

		for (int i = 0; i <= 2; i++) {
			try {
				AddRemoveTab.click();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		Thread.sleep(5000);
		Select r1 = new Select(driver.findElement(By.id("customTag")));
		r1.selectByIndex(0);
		Thread.sleep(5000);
		Remove.click();
	}

	public void Check() throws InterruptedException {

		scrollToElement(Customs);
		Thread.sleep(1000);
		Customs.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("All course are up to date");
	}

  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

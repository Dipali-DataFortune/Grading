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

public class ActivateCoursePage extends TestBaseGrade {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;

	@FindBy(xpath = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;

	@FindBy(xpath = "//a[contains(text(),'COURSES')]")
	WebElement CourseTab;

	@FindBy(xpath = "(//button[contains(text(),'Assign/Edit Grades')])[1]")
	WebElement AssignGradeButton;

	@FindBy(xpath = "//div[contains(text(),'Courses')]")
	WebElement COURSE;

	@FindBy(xpath = "//input[@id='search']")
	WebElement searchBox;

	// @FindBy(xpath="//input[@id='check_tag_0' and @type='checkbox']")
	// @FindBy(xpath="//input[@id='check_tag_0']")
	@FindBy(xpath = "(//div[@class='checkbox'])[4]")	
	//@FindBy(xpath = "//input[@id='checkbox_all']")
	WebElement CourseCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActivateButton;

	//@FindBy(xpath = "//em[@class=\"fa fa-times clear_icon\"]")
	@FindBy(xpath = "//em[@class='fa fa-times clear_icon']")	
	WebElement Cross;

	@FindBy(xpath = "//span[contains(text(),'Initial Grading Phase')]")
	//@FindBy(xpath = "(//div[@class='disabled'])[2]")	
	WebElement CourseStatus;

	@FindBy(xpath = "//span[contains(text(),'Intro to Fed Income Tax')]")
	WebElement CourseLink;

	public ActivateCoursePage(WebDriver driver) {
		// PageFactory.initElements(driver, this);
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

	public void activateCourse() throws InterruptedException {
		
		softAssert.assertEquals(COURSE.isDisplayed(), true);
		searchBox.sendKeys("Intro to Fed Income Tax");

		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(CourseCheckBox));		
		  
		highLightElement(driver, CourseCheckBox);
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		Thread.sleep(5000);
		CourseCheckBox.click();
		  
		 // JavascriptExecutor js= (JavascriptExecutor)driver;
		 //js.executeAsyncScript("arguments[0].click()", CourseCheckBox);
		  		  
		  wait1.until(ExpectedConditions.visibilityOf(ActivateButton)); 
		  //softAssert.assertEquals(ActivateButton.isEnabled(), true);
		  highLightElement(driver, ActivateButton); 
		  ActivateButton.click();		  
		  Thread.sleep(5000);				
	}	
	
	public void clickOnCross() throws InterruptedException
	{
		Cross.click();
		searchBox.sendKeys("35238");
		Thread.sleep(5000);
	}
	
	public void attributesAfterActivate()
	{
		
		  WebDriverWait wait1 = new WebDriverWait(driver, 60);
		  wait1.until(ExpectedConditions.visibilityOf(CourseStatus));
		 
		  softAssert.assertEquals(CourseStatus.isDisplayed(), true);
		  String courseStatusNew = CourseStatus.getText();
		  System.out.println(courseStatusNew);
		  Assert.assertEquals(courseStatusNew, "Initial Grading Phase");
		  softAssert.assertEquals(CourseLink.isEnabled(), true);		 
	}	

}

 package com.Grading.Objects;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import com.Grading.base.TestBaseGrade;

public class GradeAdminPage1 extends TestBaseGrade

{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeAdminPage1(WebDriver driver)
	{
		
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement NewSchedule;
	
	@FindBy(xpath="//input[@name=\"examPeriodStartDate\"]")
	WebElement StartDate;

	@FindBy(xpath="//input[@name=\"periodEndDate\"]")
	WebElement EndDate;

	@FindBy(xpath="//input[@placeholder='Preference Start Date']")
	WebElement Placeholder ;

	@FindBy(xpath="//input[@placeholder='Preference End Date']")
	WebElement Placeholder2 ;

	@FindBy(xpath="//button[@class='btn btn-primary w-100']")
	WebElement Update;

	@FindBy(xpath="//div[@id='panelFour-header']//button[@class='btn w_100 collapsed']")
	WebElement EmailTemplate;

	@FindBy(xpath="//div[@id='panelFive-header']//button[@class='btn w_100 collapsed']")
	WebElement DataSyncronised ;
	
	@FindBy(xpath="//td[contains(text(),'Grading')]")
	WebElement N1;
	
	@FindBy(xpath="(//span[@class=\"owl-dt-calendar-cell-content\"])[25]")
	WebElement Date1;
	
	@FindBy(xpath="(//span[@class=\"owl-dt-calendar-cell-content\"])[26]")
	WebElement Date2;
	
	@FindBy(xpath="//span[@class=\"owl-dt-control-content owl-dt-control-button-content\" and contains(text(),'Set')]")
	WebElement SetStartdate;
	
	@FindBy(xpath="//span[@class=\"owl-dt-control-content owl-dt-control-button-content\" and contains(text(),'Set')]")
	WebElement SetEndDate;
	
	@FindBy(xpath="//select[@id=\"filter\"]")
	WebElement Configuration;
	
	@FindBy(xpath="(//th[@scope=\"col\"])[2]")
	WebElement Settingvalue;
	
	@FindBy(xpath="//*[@id=\"panelFour\"]/div/app-settings/div/div[2]/table/tbody")
	WebElement TargetAddress;
	
	@FindBy(xpath="//*[@id=\"panelOne-header\"]/div/button/strong")
	WebElement ScheduleDate;
	
	@FindBy(xpath="(//em[@class=\"fa fa-edit mr-1\"])[3]")
	WebElement edit1;
	
	@FindBy(xpath="//*[@class=\"w-100 setting_textarea ng-pristine ng-valid ng-touched\"]")
	WebElement NameInput;
	
	@FindBy(xpath="//div[@class=\"ql-editor\"]")
	WebElement NameInput2;
	
	@FindBy(xpath="//button[@type=\"button\" and contains(text(),'Save')]")
	WebElement Save;
	
	//@FindBy(xpath="//*[@id=\"panelFour\"]/div/app-settings/div/div[2]/table/tbody/tr[3]/td[3]/em")
	@FindBy(xpath="(//em[@class=\"fa fa-edit mr-1\"])[4]")
	WebElement edit2;
	
	@FindBy(xpath="//a[@href=\"/3/schedule/19/setup\"]")
	WebElement Setup;
	
	
	public void NavigateToDashboard() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		spring2020.click();
		Thread.sleep(3000);
		NewSchedule.click();
		Thread.sleep(2000);
		Setup.click();
		Thread.sleep(2000);
	}
	public void VerifyAllAttributes()
	{
		softAssert.assertEquals(Placeholder.isDisplayed(), true);
		softAssert.assertEquals(Placeholder2.isDisplayed(), true);
		softAssert.assertEquals(Update.isDisplayed(), true);
		softAssert.assertEquals(EmailTemplate.isDisplayed(), true);
		softAssert.assertEquals(DataSyncronised.isDisplayed(), true);
	    System.out.println("All the attributes are display");
	}
	
	public void VerifyHonarSetting() throws InterruptedException 
	{		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(Setup));
		
		Setup.click();
		Thread.sleep(2000);
		
		wait1.until(ExpectedConditions.visibilityOf(EmailTemplate));
				
		    EmailTemplate.click();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    softAssert.assertEquals(Configuration.isDisplayed(), true);
			softAssert.assertEquals(Settingvalue.isDisplayed(), true);
			softAssert.assertEquals(TargetAddress.isDisplayed(), true);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ScheduleDate.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("All the attributes are display");
	}
	
	public void VerifySchedule() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		N1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
	public void VerifydateUpdations() throws InterruptedException 
	{
		Placeholder.click();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Placeholder2.click();
		Thread.sleep(3000);		
	}
	
    public void UpdateDate() 
    {
    	WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(Update));
    	Update.click();
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
    }	
    
    public void ClickOnStudentdropdown() throws InterruptedException 
    {    	
    	WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
    	Thread.sleep(1000);
    	wait1.until(ExpectedConditions.visibilityOf(EmailTemplate));
        
    	EmailTemplate.click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	Thread.sleep(3000);
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='filter' and @class=\"form-control\"]")));
		
		s1.selectByIndex(12); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
    }
    
    public void EditStudentPreference() 
    {    	
    	scrollToElement(edit1);
    	WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(edit1));
		
    	edit1.click();
    	
	    wait1.until(ExpectedConditions.visibilityOf(Save));
        Save.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    	
    }
    
    public void EditStudentPreferenceGrading() 
    {    	
    	scrollToElement(edit2);
    	WebDriverWait wait1 = new WebDriverWait(driver, 60);
//		wait1.until(ExpectedConditions.visibilityOf(edit2));
//    	edit2.click();
    	
    	staleElementClick(3, edit2, 30);
    	
//		wait1.until(ExpectedConditions.visibilityOf(NameInput2));
//		
//        NameInput2.click();
//        staleElementClick(3, NameInput2, 30);
       
        wait1.until(ExpectedConditions.visibilityOf(NameInput2));
        NameInput2.sendKeys("New Student Preference for greading");
        wait1.until(ExpectedConditions.visibilityOf(Save));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Save);
       // Save.click();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    	
    }

}

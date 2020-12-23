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

public class GradingPreferencePage extends TestBaseGrade
{
	
	
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradingPreferencePage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement NewSchedule;
	
	@FindBy(xpath="//div[@id='panelFour-header']//button[@class='btn w_100 collapsed']")
	WebElement EmailTemplate;
	
	@FindBy(xpath="(//em[@class=\"fa fa-edit mr-1\"])[4]")
	WebElement edit1;
	
	@FindBy(xpath="//a[@href=\"/3/schedule/19/setup\"]")
	WebElement Setup;
	
	@FindBy(xpath="//button[@type=\"button\" and contains(text(),'Save')]")
	WebElement Save;
	
	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement stu;
	
	@FindBy(xpath="//div[@class=\"d-inline-block\"]//strong[contains(text(),'CANCEL')]")
    WebElement Cancle;
	
	//@FindBy(xpath="(//em[@title=\"Emulate\"])[4]")
	@FindBy(xpath="(//em[@title=\"Emulate\"])[3]")
	WebElement Emulation2;
	
	@FindBy(how = How.XPATH, using = "//input[@id='search']")
	WebElement Inputbox;
	
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
	public void ClickPreference() throws InterruptedException 
	{
       
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		
    	Thread.sleep(1000);
    	wait1.until(ExpectedConditions.visibilityOf(EmailTemplate));
        
    	EmailTemplate.click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	Thread.sleep(3000);
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='filter' and @class=\"form-control\"]")));
		
		s1.selectByIndex(3); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public void SelectPreference() 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(edit1));
		scrollToElement(edit1);
		edit1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Save.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	public void SelectSecondStudent() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(stu));
		stu.click();
		Thread.sleep(4000);
		wait1.until(ExpectedConditions.visibilityOf(Inputbox));
		Inputbox.sendKeys("Chri");
		Thread.sleep(5000);
	}
	public void ClickForEmulation() 
	{
		scrollToElement(Emulation2);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Emulation2.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	public void CancleEmulation() 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		Cancle.click();
	}
}

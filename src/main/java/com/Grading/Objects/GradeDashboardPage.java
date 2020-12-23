package com.Grading.Objects;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;


import com.Grading.base.TestBaseGrade;

public class GradeDashboardPage extends TestBaseGrade
{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeDashboardPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;
	
	@FindBy(xpath="//td[contains(text(),'New Schedule')]")
	WebElement NewSchedule;
	
	@FindBy(xpath="//tr[2]//td[3]")
	WebElement StartingDate;
	
	@FindBy(xpath="//tr[2]//td[4]")
	WebElement EndDate;
	
	@FindBy(xpath="//button[@class='btn btn-primary f-right m-t-10']")
	WebElement Create;

	@FindBy(how = How.XPATH, using = "//span[@class='navbar_text text_color mr-3']")
	WebElement Username;

	@FindBy(how = How.XPATH, using = "//em[@class='fas fa-question-circle']")
	WebElement helpmenu;
	
	@FindBy(how = How.XPATH, using = "//em[@class='far fa-calendar-alt icon-size']")
	WebElement Calender;
	

	@FindBy(how = How.XPATH, using = "//tr[3]//td[5]//em[1]")
	WebElement Delete2;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
	WebElement Yes;

	
	public void Attribute1() throws InterruptedException 
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		spring2020.click();
		Thread.sleep(3000);
		softAssert.assertEquals(Username.isDisplayed(), true);
		//softAssert.assertEquals(helpmenu.isDisplayed(), true);
		softAssert.assertEquals(Create.isDisplayed(), true);
		softAssert.assertEquals(StartingDate.isDisplayed(), true);
		softAssert.assertEquals(EndDate.isDisplayed(), true);
		softAssert.assertEquals(Calender.isDisplayed(), true);


	}
	public void CreateSchedule() 
	{
		Create.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void Delete2() 
	{
		Delete2.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Yes.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	
	
}

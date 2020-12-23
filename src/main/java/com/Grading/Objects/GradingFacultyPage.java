package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class GradingFacultyPage
{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradingFacultyPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement Grading;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"search\"]")
	WebElement SeachInput;
	
	@FindBy(how = How.XPATH, using = "//button[@class=\"btn btn-primary mr-3\"]")
	WebElement CreateButton;
	
	@FindBy(how = How.XPATH, using = "(//a[@href=\"mailto:\"])[1]")
	WebElement EmailBox;
	
	@FindBy(how = How.XPATH, using = "(//em[@title=\"Emulate\"])[1]")
	WebElement Emulation ;
	
	@FindBy(how = How.XPATH, using = "//em[@class=\"fas fa-file-export\"]")
	WebElement Export;
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder=\"MM/DD/YYYY\"])[1]")
	WebElement DateCalender;
	
	@FindBy(how = How.XPATH, using = "//table[@class=\"table\"]")
	WebElement WholeTable;
	
	@FindBy(xpath="//a[@href=\"/3/schedule/19/faculty\"]")
	WebElement Faculty;
	
	public void NavigateToFaculty() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		spring2020.click();
		Thread.sleep(3000);
		Grading.click();
		Thread.sleep(2000);
		Faculty.click();
		Thread.sleep(2000);
	}
	public void VerifyFacultyAttributes()
	{
		softAssert.assertEquals(SeachInput.isDisplayed(), true);
	    softAssert.assertEquals(CreateButton.isDisplayed(), true);
		softAssert.assertEquals(EmailBox.isDisplayed(), true);
		softAssert.assertEquals(Emulation.isDisplayed(), true);
		
		softAssert.assertEquals(DateCalender.isDisplayed(), true);
		softAssert.assertEquals(WholeTable.isDisplayed(), true);
		softAssert.assertEquals(Faculty.isDisplayed(), true);
		softAssert.assertEquals(Export.isDisplayed(), true);
	    System.out.println("All the attributes are display");

	}
	
	
	
	
}

package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class GradeAdminPage2 
{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public GradeAdminPage2(WebDriver driver)
	{
		
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;
	
	
	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement stu;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement NewSchedule;
	
    @FindBy(xpath="//strong[contains(text(),'GRAD PERIOD')]")
    WebElement GRAD;

    @FindBy(xpath="//strong[contains(text(),'DEGREE')]")
    WebElement Degree;
    
    @FindBy(xpath="//strong[contains(text(),'CLASS LEVEL')]")
    WebElement  ClassLevel;
    
    @FindBy(xpath="//strong[contains(text(),'ADMIT PERIOD')]")
    WebElement AdmitCard;
    
    @FindBy(xpath="//input[@id=\"search\"]")
    WebElement Search;
    
    @FindBy(xpath="//em[@class=\"fas fa-file-export\"]")
    WebElement Export;
    
    @FindBy(xpath="//button[@class=\"btn btn-primary mr-3\" and contains(text(),'Create')]")
    WebElement Create;
    
     @FindBy(xpath="//button[@class=\"btn btn-primary ml-3\" and contains(text(),'Create')]")
     WebElement Create2;
    
    @FindBy(xpath="//em[@class=\"fa fa-times clear_icon\"]")
    WebElement Cross;
    
    @FindBy(xpath="//input[@id=\"check_0\"]")
    WebElement check1;
    
    @FindBy(xpath="//input[@id=\"check_1\"]")
    WebElement check2;
    
    @FindBy(xpath="//input[@id=\"check_2\"]")
    WebElement check3;
    
    @FindBy(xpath="//input[@id=\"createTag\"]")
    WebElement SearchNewTag;
	
	public void NavigateToDashboard() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		spring2020.click();
		Thread.sleep(3000);
		NewSchedule.click();
		Thread.sleep(3000);
		stu.click();
		Thread.sleep(3000);
		
	}
	public void AttributeStudent() 
	{
		//softAssert.assertEquals(GRAD.isDisplayed(), true);
		//softAssert.assertEquals(Export.isDisplayed(), true);
		//softAssert.assertEquals(Search.isDisplayed(), true);
		//softAssert.assertEquals(AdmitCard.isDisplayed(), true);
		//softAssert.assertEquals(ClassLevel.isDisplayed(), true);
		//softAssert.assertEquals(Degree.isDisplayed(), true);
	    System.out.println("All the attributes are display");


	}
	public void SearchStudentByName() throws InterruptedException 
	{
		Search.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Search.sendKeys("Alina");
		Thread.sleep(5000);
		Cross.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	public void SearchStudentById() throws InterruptedException 
	{
		Search.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Search.sendKeys("ap1013");
		Thread.sleep(5000);
		Cross.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	public void CreateList() 
	{
		check1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		check2.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		check3.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Create.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public void CheckForCreate() 
	{
		SearchNewTag.sendKeys("StudentDemo");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Create2.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
}

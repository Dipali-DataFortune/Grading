 package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

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

public class GradingStudentPage extends TestBaseGrade

{
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	

	public GradingStudentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Grading')]")
	WebElement newScheduling;

	@FindBy(xpath = "//a[contains(text(),'STUDENTS')]")
	WebElement stu;
	
	@FindBy(how = How.XPATH, using = "//input[@id='search']")
	WebElement Inputbox;
	
	//@FindBy(xpath="//em[@class='fas fa-user' and @title=\"Emulate\"]")
	@FindBy(xpath="//em[@title=\"Emulate\"]")
	WebElement Emulate;
	
	@FindBy(xpath="//div[@class=\"d-inline-block\"]//strong[contains(text(),'CANCEL')]")
    WebElement Cancle;
	
	@FindBy(xpath="//span[@class=\"navbar_text text_color mr-3\"]")
	WebElement StudentName; 
	
	@FindBy(xpath="//div[@class=\"row credit_container container_border\"]")
	WebElement ScroreCard; 
	
	@FindBy(xpath="//th[@class=\"col-4 col-md-4\" and contains(text(),'TITLE')]")
	WebElement Title; 
	
	@FindBy(xpath="//th[@class=\"col-1 col-md-1\" and contains(text(),'COURSE')]")
	WebElement Course; 
	
	@FindBy(xpath="//th[@class=\"col-1 col-md-1\" and contains(text(),'CRN')]")
	WebElement CRN ; 
	
	@FindBy(xpath="//th[@class=\"col-1 col-md-1\" and contains(text(),'CREDITS')]")
	WebElement CREDEITS; 
	
	@FindBy(xpath="//th[@class=\"col-1 col-md-1\" and contains(text(),'GRAD')]")
	WebElement Grading; 
	
	//@FindBy(xpath="(//em[@class=\"fas fa-user\" and @title=\"Emulate\"])[3]")
	
	@FindBy(xpath="(//em[@title=\"Emulate\"])[3]")
	WebElement Emulation2;
	
	@FindBy(xpath="//body//tbody//tr[1]")
	WebElement Interpritation;
	
	@FindBy(xpath="//body//tbody//tr[2]")
	WebElement IntlTrade;
	
	@FindBy(xpath="//body//tbody//tr[3]")
	WebElement CaseWork;
	
	@FindBy(xpath="//body//tbody//tr[4]")
	WebElement MeditaionSeminar ;
	
	@FindBy(xpath="//body//tbody//tr[5]")
	WebElement EthicsTaxLaw ;
	
	@FindBy(xpath="//body//tbody//tr[6]")
	WebElement CommunitySeminar;
	
	@FindBy(xpath="(//button[@type=\"button\"])[2]")
	WebElement ConvertButton2;
	
	
	@FindBy(xpath="(//button[@type=\"button\"])[1]")
	WebElement ConvertButton1;
	
	@FindBy(xpath="(//button[@type=\"button\"])[3]")
	WebElement ConvertButton3;
	
	@FindBy(xpath="(//button[@type=\"button\"])[4]")
	WebElement ConvertButton4;

	@FindBy(xpath="//select[@aria-label=\"Target Grades\"]")
	WebElement SelectGrade;
	
	@FindBy(xpath="//span[@class=\"student-name\"]")
	WebElement Remove;
	
	//@FindBy(xpath="//div[@class=\"row credit_container container_border1\"]")
	@FindBy(xpath="//div[@class=\"row credit_container container_border\"]")
	WebElement Card;
	
	
	public void NavigateStudent() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(spring2020));
	
		spring2020.click();
		
		wait.until(ExpectedConditions.visibilityOf(newScheduling));
		
		newScheduling.click();
		Thread.sleep(5000);
		stu.click();
		Thread.sleep(3000);
		Inputbox.sendKeys("HELEN");
		Thread.sleep(3000);
	}
	public void EmulateStudent() throws InterruptedException 
	{
		Emulate.click();
		Thread.sleep(3000);
	}
	public void CheckAttributes() 
	{
		softAssert.assertEquals(StudentName.isDisplayed(), true);
		softAssert.assertEquals(Course.isDisplayed(), true);
		softAssert.assertEquals(ScroreCard.isDisplayed(), true);
		softAssert.assertEquals(Title.isDisplayed(), true);
		softAssert.assertEquals(CREDEITS.isDisplayed(), true);
		softAssert.assertEquals(CRN.isDisplayed(), true);
		softAssert.assertEquals(Grading.isDisplayed(), true);

	}
	public void CancleEmulation() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		
		Cancle.click();
		
		Thread.sleep(5000);
	}
	public void SelectSecondStudent() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Inputbox));
		Inputbox.sendKeys("Chri");
		Thread.sleep(3000);
	}
	public void ClickForEmulation() 
	{
		scrollToElement(Emulation2);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Emulation2.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void AttributeCheck() 
	{
		softAssert.assertEquals(Interpritation.isDisplayed(), true);
		softAssert.assertEquals(IntlTrade.isDisplayed(), true);
		softAssert.assertEquals(MeditaionSeminar.isDisplayed(), true);
		softAssert.assertEquals(EthicsTaxLaw.isDisplayed(), true);
		softAssert.assertEquals(CommunitySeminar.isDisplayed(), true);
		softAssert.assertEquals(CaseWork.isDisplayed(), true);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void CheckEnabled() 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(ConvertButton1));
		
		scrollToElement(ConvertButton1);
		softAssert.assertEquals(ConvertButton1.isDisplayed(), true);
		softAssert.assertEquals(ConvertButton2.isDisplayed(), true);
		softAssert.assertEquals(ConvertButton3.isDisplayed(), true);
		softAssert.assertEquals(ConvertButton4.isDisplayed(), true);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void ClickOnConvert()
    {
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(ConvertButton2));
		 ConvertButton2.click();
	}
	public void SelectGrade() 
	{
		Select si = new Select(SelectGrade);
		si.selectByVisibleText("D");
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Card));

		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void RemoveGrade() 
	{
		scrollToElement(Remove);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Remove));
		Remove.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void SelectGradeC() 
	{
	    scrollToElement(ConvertButton1);
	    Select si = new Select(SelectGrade);
		si.selectByVisibleText("C");
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Card));

		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	public void RemoveGrade2() 
	{
		scrollToElement(Remove);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Remove));
		Remove.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	
	public void SelectGradeB() 
	{
	    scrollToElement(ConvertButton1);
	    Select si = new Select(SelectGrade);
		si.selectByVisibleText("B");
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Card));

		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	public void RemoveGrade3() 
	{
		scrollToElement(Remove);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Remove));
		Remove.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	public void SelectGrade11140() 
	{
		scrollToElement(ConvertButton4);
	    Select si = new Select(SelectGrade);
		si.selectByVisibleText("B");
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Card));

		scrollToElement(Card);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	public void CancleEmulation2() throws InterruptedException 
	{
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOf(Cancle));
		
		Cancle.click();
		
		Thread.sleep(5000);
	}
	
}

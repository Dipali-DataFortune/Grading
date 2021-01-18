package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Grading.base.TestBaseGrade;

public class LoginGrade extends TestBaseGrade {

	@FindBy(how = How.CSS, using = "body.zdbody div.homediv div.row:nth-child(4) div.container div.col-xs-12.col-sm-6:nth-child(1) div.col-xs-12 > a.btn.btn-primary.btn-block:nth-child(3)")
	WebElement office;

	@FindBy(how = How.XPATH, using = "//*[@id=\"i0116\"]")
	WebElement emailnam;

	@FindBy(how = How.ID, using = "idSIButton9")
	WebElement emailNext;

	@FindBy(how = How.ID, using = "i0118")
	WebElement password13;

	@FindBy(how = How.ID, using = "idSubmit_ProofUp_Redirect")
	WebElement Next;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	WebElement staySignIn;

	@FindBy(how = How.ID, using = "CancelLinkButton")
	WebElement Cancle;

	@FindBy(how = How.XPATH, using = "//input[@id=\"idSIButton9\"]")
	WebElement Yes;

	@FindBy(how = How.XPATH, using = "//input[@id=\"i0118\"]")
	WebElement passsign;

	SoftAssert softAssert = new SoftAssert();

	@FindBy(xpath = "//div[contains(text(),'Courses')]")
	WebElement COURSE;

	@FindBy(xpath = "//input[@id='search']")
	// @FindBy(xpath="//input[@class='form-control']")
	WebElement searchBox;

	@FindBy(xpath = "(//div[@class='checkbox'])[4]")
	// @FindBy(xpath = "//input[@id='checkbox_all']")
	WebElement CourseCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Activate/Update Selected')]")
	WebElement ActivateButton;

	@FindBy(xpath = "//em[@class=\"fa fa-times clear_icon\"]")
	WebElement Cross;

	@FindBy(xpath = "//div[@class='course-name']")
	WebElement CourseLink;

	@FindBy(xpath = "//td[contains(text(),'Spring 2020')]")
	WebElement spring2020;

	@FindBy(xpath = "//td[contains(text(),'Grading')]")
	WebElement GradingSchedule;

	@FindBy(xpath = "//a[contains(text(),'COURSES')]")
	WebElement CourseTab;

	/*
	 * @FindBy(xpath = "(//em[@class='fas fa-plus'])[7]") WebElement Customs;
	 */

	@FindBy(xpath = "(//em[@class='fas fa-plus'])[7]")
	// @FindBy(xpath="(//strong[contains(text(),'CUSTOM')]//preceding-sibling::em)[8]")
	WebElement customTag;

	@FindBy(xpath = "//div[contains(text(),' GRADING AUTOMATED TESTING ')]")
	WebElement automatedTag;

	@FindBy(xpath = "//span[contains(text(),'Initial Grading Phase')]")
	WebElement CourseStatus;

	public LoginGrade() {
		PageFactory.initElements(driver, this);
	}

	public void LoginMethodGrade(String ur1, String pass1) throws InterruptedException {
		WebDriverWait wai1 = new WebDriverWait(driver, 30);
		wai1.until(ExpectedConditions.visibilityOf(emailnam));
		emailnam.sendKeys(ur1);
		emailNext.click();

		WebDriverWait w1 = new WebDriverWait(driver, 100);
		// w1.until(ExpectedConditions.visibilityOf(password13));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		password13.sendKeys(pass1);

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", staySignIn);

		/*
		 * for (int i = 0; i <= 5; i++) { try {
		 * driver.findElement(By.cssSelector("#idSIButton9")).click();
		 * 
		 * break; } catch (Exception e) { System.out.println(e.getMessage()); } }
		 * 
		 * Thread.sleep(1000); //---------comment for student user-------
		 * w1.until(ExpectedConditions.visibilityOf(Next));
		 * 
		 * Next.click();
		 * 
		 * Thread.sleep(1000); w1.until(ExpectedConditions.visibilityOf(Cancle));
		 * 
		 * Cancle.click(); Thread.sleep(1000);
		 * w1.until(ExpectedConditions.visibilityOf(Yes));
		 */

		// ---------comment for student user-------end-------

		w1.until(ExpectedConditions.visibilityOf(Yes));
		Yes.click();
		Thread.sleep(3000);

	}

	/*
	 * public void NavigateToDashboardAndActivateCourse(String courseName, String
	 * crn) throws InterruptedException { WebDriverWait wait = new
	 * WebDriverWait(driver, 60);
	 * wait.until(ExpectedConditions.visibilityOf(spring2020)); spring2020.click();
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(GradingSchedule));
	 * GradingSchedule.click();
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(CourseTab)); staleElementClick(5,
	 * CourseTab, 60); // CourseTab.click();
	 * 
	 * JavascriptExecutor js= (JavascriptExecutor)driver;
	 * js.executeAsyncScript("arguments[0].click()", CourseTab);
	 * 
	 * 
	 * 
	 * scrollToElement(customTag);
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(customTag)); customTag.click();
	 * wait.until(ExpectedConditions.visibilityOf(automatedTag));
	 * automatedTag.click();
	 * 
	 * 
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * softAssert.assertEquals(COURSE.isDisplayed(), true);
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(searchBox));
	 * 
	 * highLightElement(driver, searchBox); searchBox.sendKeys(courseName);
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(CourseCheckBox));
	 * 
	 * highLightElement(driver, CourseCheckBox);
	 * driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
	 * Thread.sleep(5000); CourseCheckBox.click();
	 * 
	 * 
	 * JavascriptExecutor js= (JavascriptExecutor)driver;
	 * js.executeAsyncScript("arguments[0].click()", CourseCheckBox);
	 * 
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(ActivateButton)); //
	 * softAssert.assertEquals(ActivateButton.isEnabled(), true);
	 * highLightElement(driver, ActivateButton); ActivateButton.click();
	 * //Thread.sleep(5000);
	 * 
	 * 
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * Cross.click(); searchBox.sendKeys(crn); //Thread.sleep(5000);
	 * 
	 * //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * 
	 * WebDriverWait wait1 = new WebDriverWait(driver, 60);
	 * wait1.until(ExpectedConditions.visibilityOf(CourseStatus));
	 * 
	 * softAssert.assertEquals(CourseStatus.isDisplayed(), true); String
	 * courseStatusNew = CourseStatus.getText();
	 * System.out.println(courseStatusNew); Assert.assertEquals(courseStatusNew,
	 * "Initial Grading Phase"); softAssert.assertEquals(CourseLink.isEnabled(),
	 * true);
	 * 
	 * 
	 * // CourseLink.click(); JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("arguments[0].click()", CourseLink); }
	 */

}

package com.Grading.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Grading.base.TestBaseGrade;

public class LoginGrade extends TestBaseGrade
{
	
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

	@FindBy(how = How.XPATH, using ="//input[@id=\"idSIButton9\"]")
	WebElement Yes;

	@FindBy(how = How.XPATH, using = "//input[@id=\"i0118\"]")
	WebElement passsign;


	
	
	public LoginGrade() {
		PageFactory.initElements(driver, this);
	}
	public void LoginMethodGrade(String ur1, String pass1) throws InterruptedException {
		WebDriverWait wai1 = new WebDriverWait(driver, 30);
		wai1.until(ExpectedConditions.visibilityOf(emailnam));
		emailnam.sendKeys(ur1);
		emailNext.click();

		WebDriverWait w1 = new WebDriverWait(driver,100);
		w1.until(ExpectedConditions.visibilityOf(password13));

		password13.sendKeys(pass1);

		Thread.sleep(5000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", staySignIn);
		
		/*for (int i = 0; i <= 5; i++) {
			try {
				driver.findElement(By.cssSelector("#idSIButton9")).click();
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		Thread.sleep(1000);
		//---------comment for student user-------
		w1.until(ExpectedConditions.visibilityOf(Next));

		Next.click();

		Thread.sleep(1000);
		w1.until(ExpectedConditions.visibilityOf(Cancle));

		Cancle.click();
		Thread.sleep(1000);
		w1.until(ExpectedConditions.visibilityOf(Yes));*/
		
		//---------comment for student user-------end-------

		w1.until(ExpectedConditions.visibilityOf(Yes));
		Yes.click();
		Thread.sleep(3000);
		

	}



}

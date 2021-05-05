package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

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
		WebDriverWait wai1 = new WebDriverWait(driver, 90);
		wai1.until(ExpectedConditions.visibilityOf(emailnam));
		emailnam.sendKeys(ur1);
		wai1.until(ExpectedConditions.visibilityOf(emailNext));
		emailNext.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait w1 = new WebDriverWait(driver,100);
		//		w1.until(ExpectedConditions.visibilityOf(password13));
		//		password13.sendKeys(pass1);
		staleElementInput(3, password13, 30, pass1);		//Dnyanesh 05-05-2021



		Thread.sleep(5000);
		//		for (int i = 0; i <= 5; i++) {
		//			try {
		WebElement P1 =	driver.findElement(By.cssSelector("#idSIButton9"));
		//				break;
		//			} catch (Exception e) {
		//				System.out.println(e.getMessage());
		//			}
		//		}
		staleElementClick(6,P1,30);  //Dnyanesh 05-05-2021
		Thread.sleep(1000);
		//---------comment for student user-------
		//		w1.until(ExpectedConditions.visibilityOf(Next));
		//
		//		Next.click();
		//
		//		Thread.sleep(1000);
		//		w1.until(ExpectedConditions.visibilityOf(Cancle));
		//
		//		Cancle.click();
		//		Thread.sleep(1000);
		//		w1.until(ExpectedConditions.visibilityOf(Yes));

		//---------comment for student user-------end-------

		w1.until(ExpectedConditions.visibilityOf(Yes));
		Yes.click();
		Thread.sleep(3000);
	}

}

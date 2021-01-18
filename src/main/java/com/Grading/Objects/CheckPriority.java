package com.Grading.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckPriority {

	public void priorityCheck() {
		System.setProperty("webdriver.chrome.driver", "C:\\New project Softwares\\new softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://172.30.1.130:8002/login");
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		 WebElement Email = driver.findElement(By.id("mat-input-0"));
         WebElement Password = driver.findElement(By.id("mat-input-1"));
         WebElement LOGIN = driver.findElement(By.xpath(
                 "/html/body/app/horizontal-layout-1/div/div/div/div/content/login/div/div/div/form/button"));
         Email.sendKeys("Admin1@admin.com");
         Password.sendKeys("Test@123");
         LOGIN.click();
        // Thread.sleep(20000);
         driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
         
         Actions actions = new Actions(driver);
         WebElement ApplicationSetting = driver.findElement(By.xpath("(//span[contains(text(),'Application setting')])[1]"));
         //actions.moveToElement(ApplicationSetting);
         //actions.click().build().perform();
         ApplicationSetting.click();
         
         WebElement Priority = driver.findElement(By.xpath("(//span[contains(text(),'Priority')])[1]"));
         actions.moveToElement(Priority).click().build().perform();
         driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
         
         WebElement ADDNEW = driver.findElement(By.xpath("//span[contains(text(),'ADD NEW')]"));
         actions.moveToElement(ADDNEW).click().build().perform();
         
         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         
         
         WebElement drop = driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapperr']"));
         //actions.moveToElement(drop).click().build().perform();
         //drop.click();
         
         highLightElement(driver, drop);
         
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js1.executeScript("arguments[0].click()", drop);
          
           driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
              
      WebElement drop1 = driver.findElement(By.xpath("//span[contains(text(),'High')]"));
       actions.moveToElement(drop1).click().build().perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        

	}
	
	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

}

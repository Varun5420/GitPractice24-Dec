package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExcelFbCreate extends BaseClass{
	
	public static void main(String[] args) {
		browserLaunch("chrome");
		navigateUrl("https://www.facebook.com/");
		maximizeWindow();
		implicitWait(10);
		
		//Create Account button
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clickFunction(create);
		
		
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendKeys(fName, "Varun");
		
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		sendKeys(lName, "Nandhu");
		
		WebElement eMail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		sendKeys(eMail, "varunkiran95@gmail.com");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		sendKeys(pswd, "123456789");
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(4);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("4");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1995");
		
		
	}

}

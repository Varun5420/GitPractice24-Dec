package org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends BaseClass{
	
	public static void main(String[] args) throws Exception{
		
		browserLaunch("zedge");
		getUrl("https://www.facebook.com/");
		maximizeWindow();
		implicitWait(10);
		
		WebElement name = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		executeScriptInsert(name, "Varun");
		String insrtname = executeScriptGetInsertedValue(name);
		System.out.println("The Inserted name: "+insrtname);
		
		
		WebElement pswd = driver.findElement(By.xpath(" //input[@class='inputtext _55r1 _6luy _9npi']"));
		executeScriptInsert(pswd, "1234567");
		String insrtpswd = executeScriptGetInsertedValue(pswd);
		System.out.println("The Inserted pswd: "+insrtpswd);
		
		WebElement clkbtn = driver.findElement(By.xpath(" //a[text()='Create New Account']"));
		executeScriptClick(clkbtn);
		
		threadSleep(5000);
		
		screenshot("D:\\Varun\\Maven Projects\\MavenProj\\src\\test\\resources\\Snapshot\\","Facebook Login3");
	
	}
	

}

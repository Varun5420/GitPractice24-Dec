package org.pom;


import org.test.BaseClass;

public class Test extends BaseClass{
	
	public static void main(String[] args) throws Exception{
		
		browserLaunch("chrome");
		getUrl("https://www.facebook.com/");
		maximizeWindow();
		implicitWait(10);
		
		
//		WebElement name = driver.findElement(By.id("email"));
//		WebElement pass = driver.findElement(By.id("pass"));
		
		FacebookLoginPOM flp=new FacebookLoginPOM();
		sendKeys(flp.getTxtUserName(), "Varun");
		sendKeys(flp.getTxtUserPass(), "1234567");
		
		refreshWebPage();
		
		sendKeys(flp.getTxtUserName(), "Nandhu");
		sendKeys(flp.getTxtUserPass(), "123");
		
	
	}
	

}

package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartProduct extends BaseClass{
	@Before
	private void beforeTest() {
		browserLaunch("chrome");
		getUrl("https://www.flipkart.com/");
		maximizeWindow();
		implicitWait(10);
	}
	@Test
	public void productName() throws AWTException {
	//To skip Login
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//To enter values in Search
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13");
	//To click Enter button
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	//To get the Mobile Name and Price
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	//To store the name and price in Map
		Map<String,String> mp=new LinkedHashMap<>();
		int count=0;
		for(WebElement we: phones) {
			mp.put(we.getText(), prices.get(count).getText());
			count++;
		}
	//To print the values stored in Map
		int serial=1;
		Set<Entry<String, String>> entry = mp.entrySet();
		for (Entry<String, String> st:entry) {
			System.out.println(serial+"-> Mobile Name: "+st.getKey()+"\t\t"+"Mobile price: "+st.getValue());
			serial++;
		}	
	}
	@After
	private void afterTest() {
		System.out.println("All Mobiles printed with Prices");
		driver.quit();
	}
}

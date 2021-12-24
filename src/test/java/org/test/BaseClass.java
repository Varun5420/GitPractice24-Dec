package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	//Browser Launch---------------------------------------------1
	public static WebDriver browserLaunch(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		case "mozilla":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "explorer":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		return driver;
	}


	//URL Launch (get)----------------------------------------------2
	public static void getUrl(String url) {
		driver.get(url);

	}

	//URL Launch (navigate)-----------------------------------------3
	public static void navigateUrl(String url) {
		driver.navigate().to(url);

	}

	//Window Maximize-----------------------------------------------4
	public static void maximizeWindow() {
		driver.manage().window().maximize();


	}

	//Implicit Wait-------------------------------------------------5
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	//Current URL---------------------------------------------------6
	public static String currentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	//Title----------------------------------------------------------7
	public static String getTitle() {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		return title;

	}

	//Page Source-----------------------------------------------------8
	public static String pageSource() {
		// TODO Auto-generated method stub
		String pageSource = driver.getPageSource();
		return pageSource;

	}

	//Click------------------------------------------------------------9
	public static void clickFunction(WebElement we) {
		// TODO Auto-generated method stub
		we.click();

	}

	//Send Keys-------------------------------------------------------10
	public static void sendKeys(WebElement we, String value) {
		// TODO Auto-generated method stub
		we.sendKeys(value);
	}

	//Is Displayed----------------------------------------------------11
	public static boolean isDisplayed(WebElement we) {
		// TODO Auto-generated method stub
		boolean value = we.isDisplayed();
		return value;

	}

	//Is Selected----------------------------------------------------12
	public static boolean isSelected(WebElement we) {
		// TODO Auto-generated method stub
		boolean value = we.isSelected();
		return value;
	}

	//Is Enabled----------------------------------------------------13
	public static boolean isEnabled(WebElement we) {
		// TODO Auto-generated method stub
		boolean value = we.isEnabled();
		return value;
	}

	//Clear---------------------------------------------------------14
	public static void clearFunction(WebElement we) {
		// TODO Auto-generated method stub
		we.clear();

	}

	//Get Attribute Value-------------------------------------------------15
	public static String getAttributeValue(WebElement we) {
		// TODO Auto-generated method stub
		String attribute = we.getAttribute("value");
		return attribute;

	}

	//Web ELement Get Text()----------------------------------------16
	public static String getText(WebElement we) {
		// TODO Auto-generated method stub
		String text = we.getText();
		return text;

	}

	//Web ELement Get TagName()-------------------------------------17
	public static String getTagName(WebElement we) {
		// TODO Auto-generated method stub
		String tagName = we.getTagName();
		return tagName;

	}

	//Web ELement Get Size()----------------------------------------18
	public static Dimension getSize(WebElement we) {
		// TODO Auto-generated method stub
		Dimension size = we.getSize();
		return size;
	}

	//Thread Sleep--------------------------------------------------19
	public static void threadSleep(int sec) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(sec);

	}

	//Refresh WebPage-----------------------------------------------20
	public static void refreshWebPage() {
		// TODO Auto-generated method stub
		driver.navigate().refresh();

	}

	//Forward WebPage-----------------------------------------------21
	public static void forwardWebPage() {
		// TODO Auto-generated method stub
		driver.navigate().forward();

	}

	//Back WebPage--------------------------------------------------22
	public static void backWebPage() {
		// TODO Auto-generated method stub
		driver.navigate().back();

	}

	//Actions MouseHovering-----------------------------------------23
	public static void mouseHover(WebElement target) {
		// TODO Auto-generated method stub
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}

	//Actions Mouse Click-------------------------------------------24
	public static void mouseClick(WebElement target) {
		// TODO Auto-generated method stub
		Actions act=new Actions(driver);
		act.click(target).perform();
	}

	//Actions ClickAndHold------------------------------------------25
	public static void clickAndHold(WebElement from,WebElement to) {
		// TODO Auto-generated method stub
		Actions act=new Actions(driver);
		act.clickAndHold(from).release(to).perform();
	}

	//Actions DragAndDrop-------------------------------------------26
	public static void dragAndDrop(WebElement from,WebElement to) {
		// TODO Auto-generated method stub
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).perform();
	}

	//Actions DoubleClick-------------------------------------------27
	public static void doubleClick(WebElement target) {
		// TODO Auto-generated method stub
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
	}

	//Actions ContextClick------------------------------------------28
	public static void CcontextClick(WebElement target) {
		// TODO Auto-generated method stub
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
	}

	//Driver Close--------------------------------------------------29
	public static void driverClose() {
		// TODO Auto-generated method stub
		driver.close();

	}

	//Driver Quit---------------------------------------------------30
	public static void driverQuit() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	//DropDown SelectByIndex----------------------------------------31
	public static void selectByIndex(WebElement we,int value) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.selectByIndex(value);
	}

	//DropDown SelectByValue----------------------------------------32
	public static void selectByValue(WebElement we,String value) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.selectByValue(value);
	}

	//DropDown SelectByVisibleText----------------------------------33
	public static void selectByVisibleText(WebElement we,String value) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.selectByVisibleText(value);
	}

	//DropDown IsMultiple-------------------------------------------34
	public static boolean isMultiple(WebElement we) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		boolean value = option.isMultiple();
		return value;
	}


	//DropDown SendKeys---------------------------------------------
//	public static void selectSendKeys(WebElement we,String value) {
//		// TODO Auto-generated method stub
//		Select option=new Select(we);
//		option.sendkeys(value);
//
//	}

	//Fetch DropDown values-----------------------------------------35
	public static List<WebElement> dropDownValues(WebElement we) {
		// TODO Auto-generated method stub
		Select sel=new Select(we);
		List<WebElement> opts = sel.getOptions();
		return opts;
	}

	//DropDown AllSelectedOptions-----------------------------------36
	public static List<WebElement> allSelectedOptions(WebElement we) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		List<WebElement> opts = option.getAllSelectedOptions();
		return opts;
	}

	//DropDown FirstSelectedOption----------------------------------37
	public static WebElement firstSelectedOption(WebElement we) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		WebElement firstOpt = option.getFirstSelectedOption();
		return firstOpt;
	}

	//DropDown DeselectByIndex--------------------------------------38
	public static void deselectByIndex(WebElement we,int value) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.deselectByIndex(value);
	}

	//DropDown deselectByValue--------------------------------------39
	public static void deselectByValue(WebElement we,String value) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.deselectByValue(value);
	}

	//DropDown deselectByVisibleText--------------------------------40
	public static void deselectByVisibleText(WebElement we,String value) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.deselectByVisibleText(value);
	}

	//DropDown DeselectAll------------------------------------------41
	public static void deselectAll(WebElement we) {
		// TODO Auto-generated method stub
		Select option=new Select(we);
		option.deselectAll();
	}

	//DropDown Select All values ByIndex----------------------------42
	public static void selectByIndexAll(WebElement we) {
		// TODO Auto-generated method stub
		Select sel=new Select(we);
		List<WebElement> options = sel.getOptions();
		for(int i=0; i<options.size();i++) {
			sel.selectByIndex(i);
		}
	}

	//DropDown Select All values ByValue----------------------------43
	public static void selectByValueAll(WebElement we) {
		// TODO Auto-generated method stub
		Select sel=new Select(we);
		List<WebElement> options = sel.getOptions();
		for(int i=0; i<options.size();i++) {
			String value = options.get(i).getAttribute("value");
			sel.selectByValue(value);
		}
	}

	//DropDown Select All values ByVisibleText----------------------44
	public static void selectByVisibleTextAll(WebElement we) {
		// TODO Auto-generated method stub
		Select sel=new Select(we);
		List<WebElement> options = sel.getOptions();
		for(WebElement web:options) {
			String text = web.getText();
			sel.selectByVisibleText(text);
		}
	}

	//Screenshot----------------------------------------------------45
	public static void screenshot(String path,String photoName) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot tk= (TakesScreenshot)driver;
		File screenShot = tk.getScreenshotAs(OutputType.FILE);
		File target=new File(path+photoName+".png");
		FileUtils.copyFile(screenShot, target);

	}

	//JavaSciptExecutor Insert--------------------------------------46
	public static void executeScriptInsert(WebElement we, String ip) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+ip+"')", we);

	}

	//JavaSciptExecutor Click---------------------------------------47
	public static void executeScriptClick(WebElement we) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", we);

	}

	//JavaSciptExecutor getInsertedValue----------------------------48
	public static String executeScriptGetInsertedValue(WebElement we) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object value = js.executeScript("return arguments[0].getAttribute('value')", we);
		String st=value.toString();
		return st;

	}

	//JavaSciptExecutor ScrollDown----------------------------------49
	public static void executeScriptScrollDown(WebElement we) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", we);

	}

	//JavaSciptExecutor ScrollUp------------------------------------50
	public static void executeScriptScrollUp(WebElement we) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", we);

	}
	
	//Get Attribute Inner Text-------------------------------------------------51
	public static String getAttributeInnerText(WebElement we) {
		// TODO Auto-generated method stub
		String attribute = we.getAttribute("innerText");
		return attribute;
	}


}

package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	// BROWSER LAUNCH
	public static WebDriver driver;
	
	public static WebDriver  browserLaunch() {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();

	}
	// URL LAUNCH
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	// CURRENT URL
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	
	}
	
	// GET TITLE
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}
	// ACTIONS
	public static  void moveToElement(WebElement e) {
		Actions a =new Actions(driver);
		a.moveToElement(e).build().perform();

	}
	 public static void dragAndDrop(WebElement src,WebElement des)
	 {
		 Actions a =new Actions(driver);
		 a.dragAndDrop(src, des).build().perform();
	 }
	 
	 public static void contextClick(WebElement e)
	 {
		 Actions a=new Actions(driver);
		 a.contextClick(e);
	 }
	 
	 public static void doubleclick(WebElement e)
	 {
		 Actions a=new Actions(driver);
		 a.doubleClick();
	 }
	 
	 public static void clickAndHold(WebElement e)
	 {
		 Actions a=new Actions(driver);
		 a.clickAndHold(e);
	 }
	 
	 public static void release(WebElement e)
	 {
		 Actions a=new Actions(driver);
		 a.release(e);
	 }
	 //QUIT
	 public static void quit() {
		 driver.quit();
	 }
	 //CLOSE
	 public static void close() {
		 driver.close();
	 }
	 //CLEAR
	 public static void clear(WebElement e)
	 {
		e.clear(); 
	 }
	 // SEND KEYS
	public static void sendkeys(WebElement e, String name) {
		e.sendKeys(name);

	}
	//CLICK
	public static void click(WebElement e) {
		e.click();
	}
	//SELECT
	public static void selectByIndex(WebElement e,int index) {
		Select s1=new Select(e);
		s1.selectByIndex(index);

	}
	
	public static void selectByValue(WebElement e,String s) {
		Select s1=new Select(e);
		s1.selectByValue(s);

	}
	 
	public static void SelectByVisisbleText(WebElement e,String s)
	{
		Select s1=new Select(e);
		s1.selectByVisibleText(s);
	}

	public static void getOptions(WebElement e,String s)
	{
	Select s1=new Select(e);
	s1.getOptions();
	}
	
	public static void deselectByIndex(WebElement e,int index) {
		Select s1=new Select(e);
		s1.deselectByIndex(index);

	}
	
	public static void deselectByValue(WebElement e,String s) {
		Select s1=new Select(e);
		s1.deselectByValue(s);

	}
	 
	public static void deSelectByVisisbleText(WebElement e,String s)
	{
		Select s1=new Select(e);
		s1.deselectByVisibleText(s);
	}
	
	public static boolean isMultiple(WebElement e) {
		Select s1=new Select(e);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		return multiple;
	}
	
	// ALERT
	public static void alertAccept()
	{
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void alertDismiss()
	{
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public static void promptAccept(String name) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(name);
		a.accept();
	}
	
	// NAVIGATION
	
	public static void naviBack() {
		driver.navigate().back();
	}
	
	public static void naviForward() {
		driver.navigate().forward();
	}
	
	public static void naviRefresh() {
		driver.navigate().refresh();
	}
	
	public static void naviTo(String url) {
		driver.navigate().to(url);
	}
	
	//FRAMES
	
	public static void indexFrame(int i) {
		driver.switchTo().frame(i);
	}
	
	public static void idFrame(String name) {
		driver.switchTo().frame(name);
	}
	
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}
	
	//WINDOW HANDLE
	
	public static String windowHandle() {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		return handle;
		
	}
	}


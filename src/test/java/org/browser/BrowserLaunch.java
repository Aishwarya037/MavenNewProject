package org.browser;

import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends Baseclass  {
public static void main(String[] args) {
	browserLaunch();
//	driver.get("https://www.facebook.com/");
//	driver.manage().window().maximize();

	urlLaunch("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
<<<<<<< HEAD
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("PANDI PANDI PANDI");
=======
	System.out.println("Test1");
	System.out.println("Test2");
	WebElement txtUser = driver.findElement(By.name("email"));
	txtUser.sendKeys("pandipandis");
>>>>>>> b92b8f7b07a239972eb1ae08c0e3724182cacc3f
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("KAVIN");
	WebElement btn = driver.findElement(By.name("login"));
	btn.click();
<<<<<<< HEAD
	System.out.println("TEXT 1");
	System.out.println("TEXT 2");
	
System.out.println("TEXT 3");
=======
	System.out.println("Rammohan");
>>>>>>> b92b8f7b07a239972eb1ae08c0e3724182cacc3f
}
}

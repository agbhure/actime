package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LogInPage;

public class BaseClass {
		
	public static WebDriver driver;
	
	@BeforeClass

	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
	}
	@AfterClass
	public void clouseBrowser() {
		Reporter.log("clouseBrowser",true);
		driver.close();
		
	}
	@BeforeMethod
	public void LogIn() throws IOException {
		Reporter.log("LogIn",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String us = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		LogInPage l=new LogInPage(driver);
		l.setLogInPage(us, pwd);
		
		
	}
	@AfterMethod
	public void LogOut() {
		Reporter.log("LogOut",true);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.SetTaskPage();
		}
	
	

}

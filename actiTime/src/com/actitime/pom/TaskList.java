package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnnew;


	
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
	private WebElement cnametbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement dctbx;
	@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
	private WebElement seltbx;
	@FindBy(xpath="//div[text()='Big Bang Company'and@class='itemRow cpItemRow ']")
	private WebElement itemtbx;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createtbx;
	
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 

}

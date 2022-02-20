package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.Genericmethods;

public class HeaderPage {

	public WebDriver driver;
	
	public HeaderPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	
	public void LogoutVisibility()
		
	{
		//logout.isDisplayed();
		Genericmethods.checkdisplay(driver, logout);
	}
	
	
	
}

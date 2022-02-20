package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.Genericmethods;

public class HomePage extends HeaderPage {

	public WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='currentTab']")
	WebElement home;
	
	public void VerifyHomePage()
	{
		//home.isDisplayed();
		Genericmethods.checkdisplay(driver, home);
	}
	
}

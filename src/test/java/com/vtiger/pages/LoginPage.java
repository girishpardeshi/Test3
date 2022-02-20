package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.Genericmethods;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//strong[text()='User Log-in']")
	WebElement userlogin;
	
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='Login']")
	WebElement login;
	
	
	
	public void varifyLoginPage()
	{
		//userlogin.isDisplayed();
		Genericmethods.checkdisplay(driver, userlogin);
	}
	
	public void EnterLoginCredential(String usename,String pwd)
	{
		//username.sendKeys("admin");
		//password.sendKeys("admin");
		Genericmethods.entervalue(driver, username, usename);
		Genericmethods.entervalue(driver, password, pwd);
		
	}
	
	public void ClickonLogin()
	{
		//login.click();
		Genericmethods.clickable(driver, login);
	}
	
	
}

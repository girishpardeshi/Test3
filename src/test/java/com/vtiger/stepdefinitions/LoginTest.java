package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest{

	
	public LoginPage lp;
	public HomePage hp;

	@Given("^user navigate to url \"([^\"]*)\" on chrome$")
	public void user_navigate_to_url_on_chrome(String url) throws Throwable {
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.get(url);
		launchApp();
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	}


	@Then("^Login page should be appear$")
	public void login_page_should_be_appear() throws Throwable {

		lp.varifyLoginPage();
	}

	@When("^user enters valid userid and password$")
	public void user_enters_valid_userid_and_password() throws Throwable {	

		lp.EnterLoginCredential("admin", "admin");
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {

		lp.ClickonLogin();

	}

	@Then("^user should be landed on homepage$")
	public void user_should_be_landed_on_homepage() throws Throwable {
		hp.VerifyHomePage();
	}

	@Then("^Logout link should be appear$")
	public void logout_link_should_be_appear() throws Throwable {
		hp.LogoutVisibility();

	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		CloseApp();

	}


}

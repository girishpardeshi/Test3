package com.vtiger.common;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Genericmethods {

	public static WebDriver driver;
	public static WebElement elm;


	public static void entervalue(WebDriver driver, WebElement elm, String data)
	{
		try {

			WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(elm));
			elm.clear();
			elm.sendKeys(data);


		}

		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static void clickable(WebDriver driver, WebElement elm)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.invisibilityOf(elm));
			elm.click(); 
		}

		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void checkdisplay (WebDriver driver, WebElement elm)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.invisibilityOf(elm));
			elm.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static String getscreenshot(WebDriver driver) 
	{
		DateFormat f = new SimpleDateFormat("yyyyMMddhhmmss");
		Date d = new Date();
		String str = f.format(d);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/src/test/java/com/vtiger/reports/screenshots/image"+str+".png";
		//Move image file to new destination
		File DestFile=new File(path);
		//Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
	}

}


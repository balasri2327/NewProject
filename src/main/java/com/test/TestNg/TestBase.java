package com.test.TestNg;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public static WebDriver getDriver(String url) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\Sample\\driver\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get(url);
		return driver;
		
		
	}
	public static void scrollDown(WebDriver driver,WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
		public void takeScreenShot(WebDriver driver,String filename) throws IOException {
			// TODO Auto-generated method stub
			    TakesScreenshot ts=(TakesScreenshot)driver;
			    java.io.File srcFile=ts.getScreenshotAs(OutputType.FILE);
			    java.io.File dest=new java.io.File("D:\\testing_output\\"+filename+".png");
			    FileUtils.copyFile(srcFile, dest);
			   
		}
		
		public static void setText(WebElement element,String name) {
			// TODO Auto-generated method stub
			element.sendKeys(name);
		}
		public static void btnClick(WebElement element) {
			// TODO Auto-generated method stub
			element.click();
		}
		public static void btnSubmit(WebElement element) {
			// TODO Auto-generated method stub
			element.click();
		}
				

}

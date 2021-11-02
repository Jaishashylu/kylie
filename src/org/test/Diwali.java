package org.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diwali {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shylu\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\Diwali\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement w = driver.findElement(By.name("q"));
		js.executeScript("arguments[0].setAttribute('value','diwali gift offers')", w);
		WebElement a= driver.findElement(By.name("btnK"));
		js.executeScript("arguments[0].click();",a);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\shylu\\OneDrive\\Pictures\\diwa.png");
		FileUtils.copyFile(src, des);
	}

}

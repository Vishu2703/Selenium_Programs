package com.DemoDriver.WebDriverManager;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Screenshot2 {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement logo = driver.findElement(By.id("pass"));
	File f = logo.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new
	File("C:\\projectScreenshots\\logoScreeshot.png"));
	driver.quit();
}
}

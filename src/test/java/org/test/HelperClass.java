package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HelperClass {
	public static WebDriver driver;
	public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\PageModel\\driver\\chromedriver79.exe");
	driver = new ChromeDriver();
	return driver;
	}
	public void loadUrl(String url) {
	driver.get(url);
	}
	public void send(WebElement we,String name) {
		we.sendKeys(name);
	}
	public void clickBtn(WebElement clk) {
		clk.click();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void getAttribute(WebElement e ) {
		String attribute = e.getAttribute("value");
		System.out.println(attribute);
	}
	public void winmax() {
		driver.manage().window().maximize();
	}
	public void mouseOverAction(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		}
    public void urlnavigate(String url) {
		driver.navigate().to(url);
	}
     public void screenShot(String name) throws IOException {
 		TakesScreenshot t = (TakesScreenshot)driver;
 		File src = t.getScreenshotAs(OutputType.FILE);
 		File dest = new File("D:\\Abi New Files\\Screenshts\\" +name);
 		FileUtils.copyFile(src, dest);
 	}
 	public void pageDown(WebElement e) {
 		JavascriptExecutor j= (JavascriptExecutor)driver;
 		j.executeScript("arguments[0].ScrollIntoView[false]", e);
 	}
	public void parId() {
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> chiId = driver.getWindowHandles();
		for (String s : chiId) {
			if(!(parId==s))
			{
				driver.switchTo().window(s);
			}
		}
	}
	public void getUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	}

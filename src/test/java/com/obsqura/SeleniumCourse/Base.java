package com.obsqura.SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public WebDriver driver;
	public void InitalizeBrowser() {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 driver.get("https://www.amazon.in");
	}
	
	public void BrowserTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void BrowserClose() {
		driver.close();
	}
	public void BrowserQuit() {
		driver.quit();
	}
	public void BrowserUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public void getPageSource() {
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}
	 
 public static void main(String []args) {
	 Base object = new Base();
	 object.InitalizeBrowser();
	 object.BrowserTitle();
	// object.BrowserClose();
	 object.BrowserUrl();
	 object.getPageSource();
	 object.BrowserQuit();
	
	 
 }
}

  


















 
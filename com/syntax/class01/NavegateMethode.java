package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavegateMethode {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
//		driver.navigate().to("http://facebook.com");
		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
//		driver.manage().window().maximize(); // open full screen // method chaining
		driver.close();
//		driver.quit();
	
		
		
		
	}

}

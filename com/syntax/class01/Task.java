package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	/*
	 * 1. launch the chrome browser
	 * 2. navigate to amazon.com
	 * 3. print out the title and the url in the console
	 */
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//System.out.println(driver.getCurrentUrl());
		
		String titel = driver.getTitle();
		System.out.println(titel);
		//System.out.println(driver.getTitel());
		
		
		
	}

}

package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com"); // launch browser
		String url = driver.getCurrentUrl();
	    System.out.println(url); // printing in console the address
		String title = driver.getTitle();
		System.out.println(title); //printing name of the browser
		
		/*
		 * 1. launch the chrome browser
		 * 2. navigate to amazon.com
		 * 3. print out the title and the url in the console
		 */
		
	
		
		
		
		
		
		
	}

}
